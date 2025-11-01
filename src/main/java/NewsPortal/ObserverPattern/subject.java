package NewsPortal.ObserverPattern;


public interface subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String articleTitle,String articleContent);

}
