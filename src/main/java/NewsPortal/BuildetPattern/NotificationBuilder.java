package NewsPortal.BuildetPattern;
import NewsPortal.model.Notification;
import NewsPortal.model.Notification.NotificationType;

public class NotificationBuilder {
    private String recipient;
    private String title;
    private String message;
    private NotificationType type;

    public NotificationBuilder(){

    }
    public NotificationBuilder recipient(String recipient){
        this.recipient=recipient;
        return this;
    }
    public NotificationBuilder title(String title){
        this.title=title;
        return this;
    }
    public NotificationBuilder message(String message){
        this.message=message;
        return this;
    }
    public NotificationBuilder type(NotificationType type){
        this.type=type;
        return this;
    }
    public Notification build(){
        validateNotifiaction();
        return new Notification(recipient,title,message,type);
    }
    private void validateNotifiaction(){
        if (recipient==null || recipient.isEmpty()){
            throw new IllegalArgumentException("Notification recipient cannot be null or empty");
        }
        if(title == null || title.isEmpty()){
            throw  new IllegalArgumentException("Notification title cannot be null or empty");
        }
        if (message == null || message.isEmpty()){
            throw new IllegalArgumentException("Notification message cannot be null or empty");
        }
        if (type == null){
            throw new IllegalArgumentException("Notification type cannot be null");
        }
    }
}
