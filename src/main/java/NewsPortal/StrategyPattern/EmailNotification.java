package NewsPortal.StrategyPattern;
import NewsPortal.model.Notification;

public class EmailNotification implements NotificationStrategy {
        @Override
        public void sendNotification(Notification notification) {
            System.out.println("EMAIL NOTIFICATION");
            System.out.println("To: " + notification.getRecipient());
            System.out.println("Subject: " + notification.getTitle());
            System.out.println("Body: " + notification.getMessage());
            System.out.println("Email sent successfully!");
            System.out.println("-------------------");
        }

        @Override
        public String getStrategyName() {
            return "Email";
        }
    }

