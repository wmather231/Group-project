import helpers.InputReader;

import java.util.Random;


public class Game
{

    public int run()
    {

        {

            int menuOption = InputReader.getInt("Please enter a menu option");

                System.out.println("What do you want to do? ");

                System.out.println("1 Start Game " + System.lineSeparator() + "2 Exit");




                switch (menuOption)
                {
                    case 1:
                        ;

                    case 2:
                        ;

                    default:
                        System.out.println("Please enter a valid option");
                        break;

                }
                int menuCommand;

                return menuOption;
            }
        }

    public static void diceFour()
    {
        Random roll = new Random();
        int diceFour = roll.nextInt(4) + 1;

    }
    public static void diceSix()
    {
        Random roll = new Random();
        int diceSix= roll.nextInt(6) + 1;

    }
    public static void diceTen()
    {
        Random roll = new Random();
        int diceTen = roll.nextInt(10) + 1;

    }
    public static void diceTwenty()
    {
        Random roll = new Random();
        int diceTwenty = roll.nextInt(20) + 1;
    }

}

