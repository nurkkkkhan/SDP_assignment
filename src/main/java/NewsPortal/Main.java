package NewsPortal;
import NewsPortal.FacadePattern.NP;
import NewsPortal.model.Article;
import NewsPortal.model.Notification.NotificationType;
import NewsPortal.BuildetPattern.ArticleBuilder;
import NewsPortal.NewsAgency;
import NewsPortal.Subscriber.Subscriber;
import NewsPortal.StrategyPattern.EmailNotification;
import NewsPortal.StrategyPattern.PushNotification;
import NewsPortal.StrategyPattern.SmsNotification;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        String separator =repeatString( "=",80);
        System.out.println(separator);
        System.out.println("NEWS PORTAL");
        System.out.println("Implementation of Observer,Strategy,Facade and Builder Patterns");
        System.out.println(separator);

        System.out.println("\n\n[Interactive notification system]");
        System.out.println("you can choose how to send notifications \n");
        NP facade = new NP();
        System.out.println("===Add Subs===");
        boolean addMoreSubscribers = true;
        while (addMoreSubscribers){
            System.out.println("Enter sub name(or 'done' to finish):  ");
            String name = scanner.nextLine().trim();
            if(name.equalsIgnoreCase("done")){
                addMoreSubscribers=false;
                break;
            }
            System.out.println("enter contact(email/phone/name): ");
            String contact = scanner.nextLine().trim();

            NotificationType notificationType = getNotificationTypeFromUser();

            facade.addSubscriber(name,contact,notificationType);
            System.out.println();
        }

        System.out.println("\n===Publish Articles===");
        boolean publishMoreArticles = true;
        while(publishMoreArticles){
            System.out.println("Enter Article Title(or 'done' to finish): ");
            String title = scanner.nextLine().trim();

            if(title.equalsIgnoreCase("done")){
                publishMoreArticles=false;
                break;
            }

            System.out.println("ENTER ARTICLE CONTENT: ");
            String content = scanner.nextLine().trim();

            System.out.println("Enter category: ");
            String category = scanner.nextLine().trim();

            System.out.println("Enter author name: ");
            String author = scanner.nextLine().trim();
            facade.publishArtcile(title,content,category,author);
            System.out.println();
        }

        System.out.println("\n===Change Notification Method===");
        System.out.println("Enter subscriber name to change notification method(or 'skip'): ");
        String subscriberName = scanner.nextLine().trim();


        if(!subscriberName.equalsIgnoreCase("skip")){
            NotificationType newType = getNotificationTypeFromUser();
            facade.changeSubscriberNotificationStrategy(subscriberName,newType);

            System.out.print("\nPublish a test article? (yes/no): ");
            String publishTest = scanner.nextLine().trim();
            if (publishTest.equalsIgnoreCase("yes")) {
                System.out.print("Enter test article title: ");
                String testTitle = scanner.nextLine().trim();
                System.out.print("Enter test article content: ");
                String testContent = scanner.nextLine().trim();
                facade.publishArticle(testTitle, testContent, "Test", "System");
            }
        }

        System.out.println("\n\n"+separator);
        System.out.println("Direct Pattern Usage Demonstration");
        System.out.println(separator);

        demonstrateDirectPatternUsage();

        System.out.println("\n\n"+separator);
        System.out.println("Builder Pattern Usage Demonstration");
        System.out.println(separator);
        demonstrateBuilderPattern();

        System.out.println("\n\n" + separator);
        System.out.println("   STRATEGY PATTERN - Multiple Strategies");
        System.out.println(separator);
        demonstrateStrategyPattern();

        System.out.println("\n\n" + separator);
        System.out.println("   DEMONSTRATION COMPLETE");
        System.out.println(separator);

        scanner.close();
    }

    private static NotificationType getNotificationTypeFromUser(){
        NotificationType type = null;
        while(type==null){
            System.out.println("\n Choose notification method: ");
            System.out.println("1.Email");
            System.out.println("2.SMS");
            System.out.println("3.Push");
            System.out.println("Enter choice (1-3): ");
            String choice = scanner.nextLine().trim();

            switch (choice){
                case "1":
                    type = NotificationType.EMAIL;
                    break;
                case "2":
                    type = NotificationType.SMS;
                    break;
                case "3":
                    type = NotificationType.PUSH;
                    break;
                default:
                    System.out.println("Invalid choice!Please enter 1,2 or 3.");
            }
        }
        return type;
    }
    private static void demonstrateDirectPatternUsage(){
        NewsAgency agency = new NewsAgency("Astana Today");

        Subscriber subscriber1 = new Subscriber("Alan Walker","walker001@gmial.com");
        subscriber1.setNotificationStrategy(new EmailNotification());

        Subscriber subscriber2 = new Subscriber("Johnathan Ta","999-555");
        subscriber2.setNotificationStrategy(new SmsNotification());

        Subscriber subscriber3 = new Subscriber("Kairat Nurtas","Almatynyn tunderi ai");
        subscriber3.setNotificationStrategy(new PushNotification());

        agency.registerObserver(subscriber1);
        agency.registerObserver(subscriber2);
        agency.registerObserver(subscriber3);

        Article article = new Article(
                "old gen music fest",
                "The concert gonna be in ALA,November 18",
                "Party",
                "PartyFinder"
        );
          agency.publishArticle(article);
    }
    private static void demonstrateBuilderPattern() {
        System.out.println("\nUsing ArticleBuilder to create articles with a fluent interface:\n");

        Article article1 = new ArticleBuilder()
                .title("Sports: World Cup Finals")
                .content("The World Cup Finals took place last night with an exciting match...")
                .category("Sports")
                .author("Sports Reporter")
                .build();

        System.out.println("Article 1 Created: " + article1);

        Article article2 = new ArticleBuilder()
                .title("Business: Tech Giants Merge")
                .content("Two major tech companies announced their merger today...")
                .category("Business")
                .author("Business Analyst")
                .build();

        System.out.println("Article 2 Created: " + article2);

        System.out.println("\n✓ Builder pattern allows for flexible and readable object construction");
    }

    private static void demonstrateStrategyPattern() {
        NewsAgency agency = new NewsAgency("Multi-Strategy News");

        Subscriber dynamicSubscriber = new Subscriber("Dynamic User", "dynamic@example.com");
        dynamicSubscriber.setNotificationStrategy(new EmailNotification());

        agency.registerObserver(dynamicSubscriber);

        Article article = new ArticleBuilder()
                .title("Strategy Demo Article 1")
                .content("This notification was sent via Email")
                .category("Demo")
                .author("Demo Author")
                .build();

        agency.publishArticle(article);

        dynamicSubscriber.setNotificationStrategy(new SmsNotification());

        article = new ArticleBuilder()
                .title("Strategy Demo Article 2")
                .content("This notification was sent via SMS")
                .category("Demo")
                .author("Demo Author")
                .build();

        agency.publishArticle(article);

        dynamicSubscriber.setNotificationStrategy(new PushNotification());

        article = new ArticleBuilder()
                .title("Strategy Demo Article 3")
                .content("This notification was sent via Push")
                .category("Demo")
                .author("Demo Author")
                .build();

        agency.publishArticle(article);

        System.out.println("\n Strategy pattern allows runtime switching between notification methods");
    }

    private static String repeatString(String str, int times) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
