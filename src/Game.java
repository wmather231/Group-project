package src;

import helpers.InputReader;

import java.util.Random;
import helpers.InputReader;



public class Game
{
    //public static int run()


        private mainMenu;
        {


            System.out.println("What do you want to do? ");
            System.out.println("What do you want to do? ");

            System.out.println("1 Start src.Game " + System.lineSeparator() + "2 Exit");

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



    public static void diceFour() //simulates a four sided die
    {

        Random roll = new Random();
        int diceFour = roll.nextInt(4) + 1;

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
    public static void diceTwenty() //simulates a twenty sided die
    {
        Random roll = new Random();
        int diceTwenty = roll.nextInt(20) + 1;
    }
}
