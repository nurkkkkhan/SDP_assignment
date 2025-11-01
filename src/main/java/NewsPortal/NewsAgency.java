package NewsPortal;
import NewsPortal.ObserverPattern.Observer;
import NewsPortal.ObserverPattern.subject;
import NewsPortal.model.Article;
import NewsPortal.Subscriber.Subscriber;
import java.util.ArrayList;
import java.util.List;


public class NewsAgency implements subject{
    private List<Observer> observers;
    private String agencyName;
    public NewsAgency(){
        this.observers=new ArrayList<>();
        this.agencyName="ASTANA TODAY";
    }
    public NewsAgency(String agencyName){
        this.observers=new ArrayList<>();
        this.agencyName=agencyName;
    }
    @Override
    public void registerObserver(Observer observer){
        if (!observers.contains(observer)){
            observers.add(observer);
        }
    }
    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    @Override
    public void notifyObservers(String articleTitle,String articleContent){
        System.out.println("\n"+agencyName+"notifies all subs...\n");
        for(Observer observer:observers){
            observer.update(articleTitle, articleContent);
        }
    }
    public void publishArticle(Article article) {
        System.out.println("\n NEW ARTICLE PUBLISHED");
        System.out.println("================================");
        System.out.println("Title: " + article.getTitle());
        System.out.println("Category: " + article.getCategory());
        System.out.println("Author: " + article.getAuthor());
        System.out.println("Content Preview: " + article.getContent().substring(0,
                Math.min(50, article.getContent().length())) + "...");
        System.out.println("================================");

        notifyObservers(article.getTitle(), article.getContent());
    }

    public List<Subscriber> getSubscribers() {
        List<Subscriber> subscribers = new ArrayList<>();
        for (Observer observer : observers) {
            if (observer instanceof Subscriber) {
                subscribers.add((Subscriber) observer);
            }
        }
        return subscribers;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }
}
