import java.util.Random;
import java.util.Scanner;

public class Console_Adventure {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        keepAskingUser();
//        Random random = new Random();

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
                quit();
                System.out.println("Hope you enjoyed the game!");
                break;
            } else {
                quit();
                break;
            }

        }

    }

    // Ask the user for their name. Store this as a variable to personalize the adventure.
    public static void askUserName() {
        Scanner sc2 = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = sc2.nextLine();
        System.out.println("Hello " + userName + ", welcome to Malexandria!");

    }

    public static void showDescription() {
        proceed();

        if (true) {
              System.out.println("The crown princess, Carnet, has been abducted by a mysterious man with a tail.");
              System.out.println("Your mission is to rescue her and bring her back to Malexandria.");
              System.out.println("You will encounter enemies along the way. Be prepared to fight!");
              System.out.println("Carnet is kind of useless (although she *supposedly* has magical powers),");
              System.out.println("so you alone will have to carry the burden in battle.");
        }
        proceed();
    }


    public static void pickHero() {
        Scanner sc4 = new Scanner(System.in);
            System.out.println("Choose your hero:");
            System.out.println("1. Thief");
            System.out.println("2. Soldier");
            System.out.println("3. Black Mage");
            System.out.println("4. Healer");


            String input = sc4.nextLine();
            if (input.equals("1")) {
                System.out.println("Awesome! You have picked *RIDANE*.");
                System.out.println("Ridane is a Master Thief whose specialty is stealing dollas while attacking an enemy.");
            } else if (input.equals("2")) {
                System.out.println("Splendid, you have selected *BEINER*.");
                System.out.println("Beiner is the Captain of the elite Malexandrian Guards.");
            } else if (input.equals("3")) {
                System.out.println("Witchin'! You have chosen *GIGI*.");
                System.out.println("Gigi is a powerful wizard who conjures up advanced black magic!");
            } else if (input.equals("4")) {
                System.out.println("You have enlisted the services of *EINO*.");
                System.out.println("Eino is a white mage whose possesses healing powers.");
            } else {
                System.out.println("Invalid input.");
                pickHero();
            }

    }

    public static void startBattle() {
        proceed();
        System.out.println("You've encountered an enemy!");

        //Heroes
        int heroHealth = 100;
        //int attackPoints = 40;
        int quantityPotions = 10;
        int potionPoints = 35;


        //Enemies
        int enemyHealth = 100;
        //int enemyAttackPoints = 30;

        while (enemyHealth > 0) {
            Scanner sc5 = new Scanner(System.in);
            int range = 100 - 1 + 1;
            int damageMade = ((int)(Math.random() *range) + 1);
            int damageReceived = ((int)(Math.random() *range) + 1);
            // Random random = new Random();

            System.out.println("Your heroHealth is: " + heroHealth);
            System.out.println("The enemyHealth is: " + enemyHealth);
            System.out.println("Choose an action:");
            System.out.println("1. Attack");
            System.out.println("2. Drink Potion");
            System.out.println("3. Run");

            String input = sc5.nextLine();
            if(input.equals("1")) {
                // int damageMade = random.nextInt(attackPoints);
                // int damageReceived = random.nextInt(enemyAttackPoints);

                enemyHealth = enemyHealth - damageMade;
                heroHealth = heroHealth - damageReceived;

                System.out.println("You attack the enemy and made a damage of " + damageMade + ".");
                System.out.println("You receive a damage of " + damageReceived + ".");

                if (heroHealth <= 0) {
                    System.out.println("Your injuries are too grave and you die from battle...");
                    break;
//                    Do you want to try again? [y/n]
//                    startBattle()
                }
            } else if (input.equals("2")) {
                if(quantityPotions > 0 ) {
                    heroHealth = heroHealth + potionPoints;
                    quantityPotions -= 1;
                    System.out.println("You drink a potion and increase your heroHealth.");
                    System.out.println("Your heroHealth is now " + heroHealth + ".");
                    System.out.println("You have " + quantityPotions + " potions remaining.");
                } else {
                    System.out.println("You have 0 potions left!");
                    if (quantityPotions == 0) {
                        disable();
                    }
                }
            } else if (input.equals("3")) {
                System.out.println("You run from the enemy");
                startBattle();
            } else {
                System.out.println("Invalid input.");
                continue;
            }

        }

            //System.out.println("You have defeated the enemy!");
            //System.out.println("Your heroHealth is now " + heroHealth + ".");
            //System.out.println("You have " + quantityPotions + " potions left.");
        if (heroHealth <= 0 ) {
            System.out.println("Game Over.");
            quit();
        } else {
            System.out.println("You have defeated the enemy!");
            System.out.println("Your heroHealth is now " + heroHealth + ".");
            System.out.println("You have " + quantityPotions + " potions left.");
            System.out.println("Hope you enjoyed the game!");
            quit();
        }
    }

    public static void disable() {
        System.out.println("You don't have a choice to drink any more potions! Attack or Run.");
    }


    public static void quit() {
            System.out.println("Okay, goodbye!");
    }

    public static void proceed() {
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Press any key to continue");
        String cont = sc3.nextLine();
    }





}
