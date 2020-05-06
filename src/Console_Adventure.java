import java.util.Scanner;

public class Console_Adventure {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        askUser();

        askUserName();

    }
    // Ask if the user is ready to start. If they type in "yes", start the game.
    public static void askUser() {
        Scanner sc1 = new Scanner(System.in);

        while(true) {
            System.out.println("Do you want to start the game? [y/n]");
            String userInput = sc1.nextLine();

            if (userInput.toLowerCase().equals("y")) {
                break;
            } else {
                System.out.println("Okay, good bye!");
            }
        }
    }

    // Ask the user for their name. Store this as a variable to personalize the adventure.
    public static void askUserName() {
        Scanner sc2 = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = sc2.nextLine();
        System.out.println("userName: " + userName);

    }

}
