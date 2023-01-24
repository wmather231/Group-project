package src.DiceFighter;

import helpers.InputReader;

import java.util.Random;

import src.Goblin;


public class Game
{
    public int userAction;
    //public static int run()


        public void runMainMenu()
        {


            System.out.println("What do you want to do? ");
            System.out.println("What do you want to do? ");

            System.out.println("1 Start src.DiceFighter.Game " + System.lineSeparator() + "2 Exit");

            int menuOption = InputReader.getInt("Please enter a menu option");

            while (menuOption == 1)
            {


                switch (menuOption)
                {
                    case 1:
                    firstEncounter();

                    case 2:
                    menuOption = 2;
                    System.out.println("Goodbye");
                    System.exit(0);

                    default:
                        System.out.println("Please enter a valid option");
                        break;

                }
                int menuCommand;

                //return menuOption;
            }

        }



    public static void diceFour() //simulates a four sided die
    {

        Random roll = new Random();
        int diceFour = roll.nextInt(4) + 1;

    }

    public void firstEncounter()
    {
    System.out.println("A Goblin Attacks!");
     encounterGoblin();
    }

    public static void diceSix() //simulates a six sided die
    {
        Random roll = new Random();
        int diceSix= roll.nextInt(6) + 1;

    }
    public static void diceTen() //simulates a ten sided die
    {
        Random roll = new Random();
        int diceTen = roll.nextInt(10) + 1;

    }
    public static int diceTwenty() //simulates a twenty sided die
    {
        Random roll = new Random();
        int diceTwenty = roll.nextInt(20) + 1;
        return diceTwenty;
    }

    public void doNothing()
    {
        System.out.println("You goad the monster to attack you");
    }
    public int attack()
    {
        diceTwenty();

        return diceTwenty();
    }


    public void encounterGoblin()
    {
        while ((PlayerStats.health > 0) && (Goblin.health > 0))
        {
            System.out.println("What will you do?");
            userAction = helpers.InputReader.getInt("1 Attack " + System.lineSeparator() + "2 nothing");

            if (userAction == 1);
            {
                diceTwenty();
                if (diceTwenty() >= Goblin.getArmourClass())
                {
                    diceSize = 10;
                    Goblin.getHealth() = Goblin.getHealth() - diceRoller;
                }
            }
        }
    }


}

