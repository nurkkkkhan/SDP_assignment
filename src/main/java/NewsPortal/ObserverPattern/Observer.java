package NewsPortal.ObserverPattern;

import NewsPortal.StrategyPattern.NotificationStrategy;

public interface Observer {
    void update (String articleTitle,String articleContent);

    void setNotificationStrategy(NotificationStrategy strategy);
}
