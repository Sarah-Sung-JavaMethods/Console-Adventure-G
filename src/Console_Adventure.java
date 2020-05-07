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

    // A classic RPG will have the hero going through different scenarios and battling their enemies.
    // Choose your hero (1,2,3) iron man black widow captain america
    // when user select the hero, Health, AttachPoints will be given by default
    // enemy (Thanos?)
    // Health of enemy can be more than hero but attach points will be less than hero.
    // int range = XXX - 1 + 1; Use for range of XXX
    // int attackingPower = ((int)(Math.random() *range) + 1);

    // Drink potion
    // it will be preSetted value +20 etc
    // Scanner
    // if (userInput == 1,2,3,) {
        // add, subtract etc
    // }

    // Potion Drinking
    public static int Addition(int health, int potion) {
        return health + potion;
    }
    // Attacking
    public static int Subtraction(int health, int attackingPower) {
        // int range = XXX - 1 + 1; Use for range of XXX
        // int attackingPower = ((int)(Math.random() *range) + 1);
        return health - attackingPower;
    }

}
