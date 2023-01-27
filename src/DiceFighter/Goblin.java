package src.DiceFighter;
import helpers.InputReader;
/**
 * @author Joshua
 *This class holds the statistics for the Goblin enemy
 * this class and functions will be called within the Goblin encounter
 */
public class Goblin
{
    private static int armourClass = 13;
   private static int health = 10;
   private static int attackBonus = 2;
    private static int damage = 2;


    public static int getArmourClass()
    {
        return armourClass;
    }

    public static int getAttackBonus()
    {
        return attackBonus;
    }

    public static int getDamage()
    {
        return damage;
    }

    public static int getHealth()
    {
        return health;
    }

    public int Goblin()
    {
        this.armourClass = armourClass;
        this.health = health;
        this.attackBonus = attackBonus;

        return 0;
    }

}

