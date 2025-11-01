package NewsPortal.FacadePattern;

import NewsPortal.model.Article;
import NewsPortal.model.Notification.NotificationType;
import NewsPortal.NewsAgency;
import NewsPortal.Subscriber.Subscriber;
import NewsPortal.StrategyPattern.NotificationStrategy;
import NewsPortal.StrategyPattern.SmsNotification;
import NewsPortal.StrategyPattern.PushNotification;
import NewsPortal.StrategyPattern.EmailNotification;
import NewsPortal.BuildetPattern.ArticleBuilder;




public class NP {
    private NewsAgency newsAgency;

    public NP(){
        this.newsAgency=new NewsAgency();
    }
    public void addSubscriber(String name,String contactInfo,NotificationType notificationType){
        Subscriber subscriber= new Subscriber(name, contactInfo);
        NotificationStrategy strategy = getStrategyByType(notificationType);
        newsAgency.registerObserver(subscriber);
        System.out.println(name +"subscribed successfully!");
    }
    public void publishArtcile(String title,String content,String category,String author){
        Article article = new ArticleBuilder()
                .title(title)
                .content(content)
                .category(category)
                .author(author)
                .build();
        newsAgency.publishArticle(article);
        System.out.println("Article has published"+article);
    }
    public void changeSubscriberNotificationStrategy(String subscriberName, NotificationType newType) {
        for (Subscriber subscriber : newsAgency.getSubscribers()) {
            if (subscriber.getName().equals(subscriberName)) {
                NotificationStrategy strategy = getStrategyByType(newType);
                subscriber.setNotificationStrategy(strategy);
                System.out.println("✓ " + subscriberName + "'s notification strategy changed to: " + newType);
                return;
            }
        }
        System.out.println("✗ Subscriber not found: " + subscriberName);
    }


    public void removeSubscriber(String subscriberName) {
        for (Subscriber subscriber : newsAgency.getSubscribers()) {
            if (subscriber.getName().equals(subscriberName)) {
                newsAgency.removeObserver(subscriber);
                System.out.println("✓ " + subscriberName + " unsubscribed successfully!");
                return;
            }
        }
        System.out.println("✗ Subscriber not found: " + subscriberName);
    }

    private NotificationStrategy getStrategyByType(NotificationType type) {
        switch (type) {
            case EMAIL:
                return new EmailNotification();
            case SMS:
                return new SmsNotification();
            case PUSH:
                return new PushNotification();
            default:
                return new EmailNotification();
        }
    }

    /**
     * Get the underlying news agency for advanced operations
     */
    public NewsAgency getNewsAgency() {
        return newsAgency;
    }

    public void publishArticle(String testTitle, String testContent, String test, String system) {
    }
}
