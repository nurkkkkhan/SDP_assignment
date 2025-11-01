package NewsPortal.Subscriber;

import NewsPortal.ObserverPattern.Observer;
import NewsPortal.StrategyPattern.NotificationStrategy;
import NewsPortal.model.Notification;
import NewsPortal.model.Notification.NotificationType;
import NewsPortal.BuildetPattern.NotificationBuilder;





public class Subscriber implements Observer {
    private String name;
    private String contactInfo;
    private NotificationStrategy notificationStrategy;
    private NotificationType determineNotificationType;

    public Subscriber(String name,String contactInfo){
        this.name=name;
        this.contactInfo=contactInfo;
    }
    @Override
    public void update(String articleTitle,String articleContent) {
        System.out.println("\n Notification for: " + name);
        System.out.println("Contact Information: " + contactInfo);

        Notification notification = new NotificationBuilder()
                .recipient(contactInfo)
                .title("New Article" + articleTitle)
                .message(articleContent)
                .type(determineNotificationType)
                .build();
        if (notificationStrategy != null) {
            notificationStrategy.sendNotification(notification);
        }
    }

    @Override
    public void setNotificationStrategy(NotificationStrategy strategy) {

    }

    public void sendNotificationStrategy(NotificationStrategy notificationStrategy){
        this.notificationStrategy=notificationStrategy;
        System.out.println(name+" switched to "+notificationStrategy.getStrategyName());
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getContactInfo(){
        return contactInfo;
    }
    public void setContactInfo(String contactInfo){
        this.contactInfo=contactInfo;
    }
    public NotificationStrategy getNotificationStrategy(){
        return notificationStrategy;
    }
    public NotificationType determineNotificationType() {
        if (notificationStrategy instanceof NewsPortal.StrategyPattern.EmailNotification) {
            return NotificationType.EMAIL;
        }
        else if(notificationStrategy instanceof NewsPortal.StrategyPattern.PushNotification){
            return NotificationType.PUSH;
        }
        else if(notificationStrategy instanceof  NewsPortal.StrategyPattern.SmsNotification){
            return NotificationType.SMS;
        }
        return NotificationType.EMAIL;
    }
}
