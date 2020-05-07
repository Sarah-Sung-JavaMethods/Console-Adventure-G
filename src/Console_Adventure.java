import java.util.Scanner;

public class Console_Adventure {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        keepAskingUser();

    }
    // Ask if the user is ready to start. If they type in "yes", start the game.
    public static void keepAskingUser() {
        Scanner sc1 = new Scanner(System.in);
        do {
            System.out.println("Do you want to start the game? [y/n]");
            String userInput = sc1.nextLine();
            if (!userInput.toLowerCase().equals("y")) {
                System.out.println("Okay, goodbye!");
                break;
            } else {
                System.out.println("What is your name?");
                String userName = sc1.nextLine();
                System.out.println("username: " + userName);
                System.out.println("Hello, " + userName + "!");
            }
        } while (false);
//        while(true) {
//            System.out.println("Do you want to start the game? [y/n]");
//            String userInput = sc1.nextLine();
//
//            if (!userInput.toLowerCase().equals("y")) {
//                System.out.println("Okay, goodbye!");
//                break;
//            } else {
//                askUserName(sc1);
//            }
//        }
    }

    // Ask the user for their name. Store this as a variable to personalize the adventure.
//    public static void askUserName(Scanner scan) {
//
//        do {
//            System.out.println("What is your name?");
//            String userName = scan.nextLine();
//            System.out.println("username: " + userName);
//            System.out.println("Hello, " + userName + "!");
//        } while
//    }


}
