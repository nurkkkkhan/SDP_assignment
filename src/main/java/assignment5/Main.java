package assignment5;

import assignment5.FacadePattern.SmartHomeFacade;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SmartHomeFacade home = new SmartHomeFacade();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Smart Home Control Panel1");
        System.out.println("Commands: 1 = Turn ON / Start | 0 = Turn OFF / Stop | 9 = Exit");

        while (true) {
            System.out.println("\nSelect device to control:");
            System.out.println("1. Light ");
            System.out.println("2. Music System ");
            System.out.println("3. Security Camera ");
            System.out.println("4. Thermostat");
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
                case 4: {
                    System.out.println("\n Welcome to the Thermostat Panel");
                    System.out.println("Change to desired C:");
                    int temperature = scanner.nextInt();
                    System.out.println("Are you sure? (1=Yes / 0=No)");
                    int cmd = scanner.nextInt();
                    while (cmd ==0){
                        System.out.println("Make proper decision");
                        System.out.println("Change to comfy C: ");
                        temperature = scanner.nextInt();
                        System.out.println("Are you sure? (1=Yes/2=No)");
                        cmd = scanner.nextInt();
                    }
                    System.out.println("Thermostat set to " + temperature + " C");
                    System.out.println("Now you are ready to do your stuff :)");

                    temperature = scanner.nextInt();
                    System.out.println("Reenter the temperature: ");
                    if (cmd == 0){
                        break;
                    }
                    else{
                        System.out.println("You've finally changed the temperature");
                    }
                    break;
                }

                default:
                    System.out.println(" Invalid choice, please try again.");
            }
        }

        scanner.close();
    }
}

