package NewsPortal.StrategyPattern;

import NewsPortal.model.Notification;

public class PushNotification implements NotificationStrategy {
    @Override
    public void sendNotification(Notification notification) {
        System.out.println("PUSH NOTIFICATION");
        System.out.println("To: " + notification.getRecipient());
        System.out.println("Title: " + notification.getTitle());
        System.out.println("Body: " + notification.getMessage());
        System.out.println("Push notification sent successfully!");
        System.out.println("-------------------");
    }

    @Override
    public String getStrategyName() {
        return "Push";
    }
}


