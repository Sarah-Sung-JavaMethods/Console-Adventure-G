import java.util.Random;
import java.util.Scanner;

public class ConsoleAdventure {

//    static Scanner sc2 = new Scanner(System.in);
//    static String userName = sc2.nextLine();

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        gameProgression();

//    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        while(true) {
            System.out.println("Do you want to start the game? [y/n]");
            String userInput = sc1.nextLine();
            if (userInput.toLowerCase().equals("y")) {
                askUserName();
                showDescription();
                pickHero();
                startBattle();
                break;
            } else if (userInput.toLowerCase().equals("n")){
                quit();
                break;
            } else {
                System.out.println("Invalid input.");
            }

        }

    }

    public static void askUserName() {
        Scanner sc2 = new Scanner(System.in);

        System.out.println("What is your name?");
        String userName = sc2.nextLine();
        System.out.println("Hello " + userName + ", welcome to");
        System.out.println("\n" +
                " ____    ____       _       _____     ________  ____  ____       _       ____  _____  ______   _______     _____       _       \n" +
                "|_   \\  /   _|     / \\     |_   _|   |_   __  ||_  _||_  _|     / \\     |_   \\|_   _||_   _ `.|_   __ \\   |_   _|     / \\      \n" +
                "  |   \\/   |      / _ \\      | |       | |_ \\_|  \\ \\  / /      / _ \\      |   \\ | |    | | `. \\ | |__) |    | |      / _ \\     \n" +
                "  | |\\  /| |     / ___ \\     | |   _   |  _| _    > `' <      / ___ \\     | |\\ \\| |    | |  | | |  __ /     | |     / ___ \\    \n" +
                " _| |_\\/_| |_  _/ /   \\ \\_  _| |__/ | _| |__/ | _/ /'`\\ \\_  _/ /   \\ \\_  _| |_\\   |_  _| |_.' /_| |  \\ \\_  _| |_  _/ /   \\ \\_  \n" +
                "|_____||_____||____| |____||________||________||____||____||____| |____||_____|\\____||______.'|____| |___||_____||____| |____| \n" +
                "                                                                                                                               \n");
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
                System.out.println("Awesome! You have picked");
                System.out.println("\n" +
                        "  ____  ___ ____    _    _   _ _____ \n" +
                        " |  _ \\|_ _|  _ \\  / \\  | \\ | | ____|\n" +
                        " | |_) || || | | |/ _ \\ |  \\| |  _|  \n" +
                        " |  _ < | || |_| / ___ \\| |\\  | |___ \n" +
                        " |_| \\_\\___|____/_/   \\_\\_| \\_|_____|\n" +
                        "                                     \n");
                System.out.println("Ridane is a Master Thief whose specialty is stealing dollas while attacking an enemy.");
            } else if (input.equals("2")) {
                System.out.println("Splendid, you have selected");
                System.out.println("\n" +
                        "  ____  _____ ___ _   _ _____ ____  \n" +
                        " | __ )| ____|_ _| \\ | | ____|  _ \\ \n" +
                        " |  _ \\|  _|  | ||  \\| |  _| | |_) |\n" +
                        " | |_) | |___ | || |\\  | |___|  _ < \n" +
                        " |____/|_____|___|_| \\_|_____|_| \\_\\\n" +
                        "                                    \n");
                System.out.println("Beiner is the Captain of the elite Malexandrian Guards.");
            } else if (input.equals("3")) {
                System.out.println("Witchin'! You have chosen");
                System.out.println("\n" +
                        "   ____ ___ ____ ___ \n" +
                        "  / ___|_ _/ ___|_ _|\n" +
                        " | |  _ | | |  _ | | \n" +
                        " | |_| || | |_| || | \n" +
                        "  \\____|___\\____|___|\n" +
                        "                     \n");
                System.out.println("Gigi is a powerful wizard who conjures up advanced black magic!");
            } else if (input.equals("4")) {
                System.out.println("You have enlisted the services of");
                System.out.println("\n" +
                        "  _____ ___ _   _  ___  \n" +
                        " | ____|_ _| \\ | |/ _ \\ \n" +
                        " |  _|  | ||  \\| | | | |\n" +
                        " | |___ | || |\\  | |_| |\n" +
                        " |_____|___|_| \\_|\\___/ \n" +
                        "                        \n");
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
        int quantityPotions = 10;
        int potionPoints = 35;


        //Enemies
        int enemyHealth = 100;

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

                enemyHealth = enemyHealth - damageMade;
                heroHealth = heroHealth - damageReceived;

                System.out.println("You attack the enemy and inflict a damage of " + damageMade + ".");
                System.out.println("You receive a damage of " + damageReceived + ".");

                if (heroHealth <= 0) {
                    System.out.println("Your injuries are too grave and you die from battle...");
                    break;
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
                System.out.println("You run from the enemy.");
                System.out.println("You and the princess briefly retreat to pitch a tent nearby before re-engaging the enemy.");
            } else {
                System.out.println("Invalid input.");
            }

        }

        if (heroHealth <= 0 ) {
            gameOver();
        } else {
            System.out.println("You have defeated the enemy!");
            System.out.println("Your heroHealth is now " + heroHealth + ".");
            System.out.println("You have " + quantityPotions + " potions left.");
            System.out.println("\n" +
                    " a88888b.  .88888.  888888ba   .88888.   888888ba   .d888888  d888888P dP     dP dP         .d888888  d888888P dP  .88888.  888888ba  .d88888b  dP \n" +
                    "d8'   `88 d8'   `8b 88    `8b d8'   `88  88    `8b d8'    88     88    88     88 88        d8'    88     88    88 d8'   `8b 88    `8b 88.    \"' 88 \n" +
                    "88        88     88 88     88 88        a88aaaa8P' 88aaaaa88a    88    88     88 88        88aaaaa88a    88    88 88     88 88     88 `Y88888b. 88 \n" +
                    "88        88     88 88     88 88   YP88  88   `8b. 88     88     88    88     88 88        88     88     88    88 88     88 88     88       `8b dP \n" +
                    "Y8.   .88 Y8.   .8P 88     88 Y8.   .88  88     88 88     88     88    Y8.   .8P 88        88     88     88    88 Y8.   .8P 88     88 d8'   .8P    \n" +
                    " Y88888P'  `8888P'  dP     dP  `88888'   dP     dP 88     88     dP    `Y88888P' 88888888P 88     88     dP    dP  `8888P'  dP     dP  Y88888P  oo \n" +
                    "ooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo\n" +
                    "                                                                                                                                                   \n");
//            System.out.printf("%s, You have rescued Princess Carnet!", userName);
            System.out.println("You receive the Squall Medal of Honor from the crown princess for your bravery.");
            System.out.println("Hope you enjoyed the game!");
        }
    }

    public static void disable() {
        System.out.println("You don't have a choice to drink any more potions! Attack or Run.");
    }

    public static void quit() {
            System.out.println("Goodbye!");
    }

    public static void proceed() {
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Press enter to continue");
        String cont = sc3.nextLine();
    }

    public static void gameOver() {
        System.out.println("\n" +
                "  #####                          #######                      \n" +
                " #     #   ##   #    # ######    #     # #    # ###### #####  \n" +
                " #        #  #  ##  ## #         #     # #    # #      #    # \n" +
                " #  #### #    # # ## # #####     #     # #    # #####  #    # \n" +
                " #     # ###### #    # #         #     # #    # #      #####  \n" +
                " #     # #    # #    # #         #     #  #  #  #      #   #  \n" +
                "  #####  #    # #    # ######    #######   ##   ###### #    # \n" +
                "                                                              \n");
    }



}
