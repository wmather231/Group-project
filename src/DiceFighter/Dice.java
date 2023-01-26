package src.DiceFighter;
import java.util.Random;

/**
 * @author William
 * Holds the random dice functions and allows them to be called to other classes
 */
public class Dice
{
    public int diceRoll()
    {
        int diceTwenty;
        int diceTen;
        int diceSix;
        int diceFour;
        Random roll = new Random();
        int diceRoller = roll.nextInt() + 1;

        return diceRoller;
    }
    public static int getDiceTwenty() {
        Random rollTwenty = new Random();
        int diceRoller = rollTwenty.nextInt(20) + 1;
        return diceRoller;
    }
    public static int getDiceTen() {
        Random rollTen = new Random();
        int diceRoller = rollTen.nextInt(10) + 1;
        return diceRoller;
    }
    public static int getDiceSix() {
        Random rollSix = new Random();
        int diceRoller = rollSix.nextInt(6) + 1;
        return diceRoller;
    }
    public static int getDiceFour() {
        Random rollFour = new Random();
        int diceRoller = rollFour.nextInt(4) + 1;
        return diceRoller;
    }

}
