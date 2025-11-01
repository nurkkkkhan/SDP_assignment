package NewsPortal.model;

public class Notification {
    private String recipient;
    private String title;
    private String message;
    private NotificationType type;

public Notification(String recipient,String title,String message,NotificationType type){
    this.recipient = recipient;
    this.title=title;
    this.message=message;
    this.type = type;
}

public String getRecipient() {
    return recipient;
}

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage(){
    return message;
    }
    public void setMessage(){
        this.message=message;
    }

    public NotificationType getType() {
        return type;
    }

    public void setType(NotificationType type) {
        this.type = type;
    }

    public enum NotificationType{
        EMAIL,SMS,PUSH
    }

    @Override
    public String toString(){
        return "Notification{" + "recipient=' " + recipient + '\'' + ", title=' " + title + '\'' + ", type= " + type +'}';
    }


}
