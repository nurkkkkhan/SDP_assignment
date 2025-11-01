package NewsPortal.StrategyPattern;

import NewsPortal.model.Notification;

public interface NotificationStrategy {
    void sendNotification(Notification notification);
    String getStrategyName();
}
