import java.util.Random;
import java.util.Scanner;

public class Console_Adventure {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        keepAskingUser();
        Random random = new Random();

        //Heroes
        int heroHealth = 100;
        int attackPoints = 40;
        int quantityPotions = 10;
        int potionPoints = 35;


        //Enemies
        int enemyHealth = 80;
        int enemyAttackPoints = 30;



    }
    // Ask if the user is ready to start. If they type in "yes", start the game.
    public static void keepAskingUser() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Do you want to start the game? [y/n]");

        while(true) {
//            System.out.println("Do you want to start the game? [y/n]");
            String userInput = sc1.nextLine();

            if (userInput.toLowerCase().equals("y")) {
                askUserName();
                showDescription();
                pickHero();
                startBattle();
            } else {
                System.out.println("Okay, goodbye!");
                break;
            }

        }

    }

    // Ask the user for their name. Store this as a variable to personalize the adventure.
    public static void askUserName() {
        Scanner sc2 = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = sc2.nextLine();
//        System.out.println("username: " + userName);
        System.out.println("Hello " + userName + ", welcome to Malexandria!");


    }

    public static void showDescription() {
        System.out.println("The crown princess, Carnet, has been abducted by a mysterious man with a tail.");
        System.out.println("Your mission is to rescue her and bring her back to Malexandria.");
        System.out.println("You will encounter enemies along the way. Be prepared to fight!");
        System.out.println("Carnet is kind of useless (although she *supposedly* has magical powers),");
        System.out.println("so you alone will have to bury the burden in battle.");
    }

    public static void pickHero() {
        System.out.println("Choose your hero:");
        System.out.println("1. Thief");
        System.out.println("2. Soldier");
        System.out.println("3. Black Mage");
        System.out.println("4. Healer");

    }

    public static void startBattle() {
        System.out.println("You've encountered an enemy!");
    }

}
