package NewsPortal.StrategyPattern;
import NewsPortal.model.Notification;
public class SmsNotification implements NotificationStrategy{
        @Override
        public void sendNotification(Notification notification) {
            System.out.println("SMS NOTIFICATION");
            System.out.println("To: " + notification.getRecipient());
            System.out.println("Title: " + notification.getTitle());
            System.out.println("Body: " + notification.getMessage());
            System.out.println("SMS notification sent successfully!");
            System.out.println("-------------------");
        }

        @Override
        public String getStrategyName() {
            return "SMS";
        }
    }



