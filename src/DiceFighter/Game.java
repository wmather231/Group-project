package src.DiceFighter;

import helpers.InputReader;

import java.util.Random;
import helpers.InputReader;



public class Game
{

    public int run()
    {
        private mainMenu ;
        {

            int menuOption = InputReader.getInt("Please enter a menu option");

            System.out.println("What do you want to do? ");
            System.out.println("What do you want to do? ");

            System.out.println("1 Start Game " + System.lineSeparator() + "2 Exit");

            int menuOption = InputReader.getInt("Please enter a menu option");

            while (menuOption == 1)
            {


                switch (menuOption)
                {
                    case1:
                    private class encounterGoblin =new encounterGoblin();

                    case2:
                    menuOption = 2;
                    System.out.println("Goodbye");
                    System.exit(0);

                    default:
                        System.out.println("Please enter a valid option");
                        break;

                }
                int menuCommand;

                return menuOption;
            }
        }

        public static void diceRoll ()
        {
            Random roll = new Random();
            int diceSize;
            int diceRoller = roll.nextInt(diceSize) + 1;
        }

    }
}

