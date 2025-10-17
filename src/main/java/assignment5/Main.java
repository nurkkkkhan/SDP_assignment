package assignment5;

import assignment5.FacadePattern.SmartHomeFacade;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SmartHomeFacade home = new SmartHomeFacade();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Smart Home Control Panel");
        System.out.println("Commands: 1 = Turn ON / Start | 0 = Turn OFF / Stop | 9 = Exit");

        while (true) {
            System.out.println("\nSelect device to control:");
            System.out.println("1. Light ");
            System.out.println("2. Music System ");
            System.out.println("3. Security Camera ");
            System.out.println("9. Exit ");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 9) {
                System.out.println(" Exiting Smart Home System. Goodbye!");
                break;
            }

            switch (choice) {
                case 1: {
                    System.out.print("Enter command (1 = ON / 0 = OFF): ");
                    int cmd = scanner.nextInt();
                    home.controlLight(cmd);
                    break;
                }

                case 2: {
                    System.out.println("\n Welcome to the Music Search Panel ");
                    System.out.print("Enter your favorite song: ");
                    String song = scanner.nextLine();
                    System.out.print("Enter command (1 = Play / 0 = Stop): ");
                    int cmd = scanner.nextInt();
                    scanner.nextLine();
                    home.searchAndControlMusic(song, cmd);
                    break;
                }

                case 3: {
                    System.out.print("Enter command (1 = Start Recording / 0 = Stop Recording): ");
                    int cmd = scanner.nextInt();
                    home.controlCamera(cmd);
                    break;
                }

                default:
                    System.out.println(" Invalid choice, please try again.");
            }
        }

        scanner.close();
    }
}

