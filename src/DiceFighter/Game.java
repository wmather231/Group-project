package src.DiceFighter;

import helpers.InputReader;

import java.util.Random;
import helpers.InputReader;



public class Game
{

    public int run()
    {

        {

            int menuOption = InputReader.getInt("Please enter a menu option");

            System.out.println("What do you want to do? ");
            System.out.println("What do you want to do? ");

            System.out.println("1 Start Game " + System.lineSeparator() + "2 Exit");



            while (menuOption == 1)
            {

                switch (menuOption)
                {
                    case 1:
                        class encounterGoblin goblinOne = new encounterGoblin();
                        break;
                    case 2:
                        menuOption = 2;
                        System.out.println("Goodbye");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please enter a valid option");
                        break;

                }
                int menuCommand;

                return menuOption;
            }
        }

        public int diceRoll()
        {
            Random roll = new Random();
            int diceSize;
            int diceRoller = roll.nextInt(diceSize) + 1;

            return diceRoller;
        }

    }
}

