package src;
import java.util.Random;

public class Dice
{
    Random roll = new Random();

    private int diceFour = roll.nextInt(4) + 1;
    private int diceSix= roll.nextInt(6) + 1;
    private int diceTen = roll.nextInt(10) + 1;
    private int diceTwenty = roll.nextInt(20) + 1;
}
