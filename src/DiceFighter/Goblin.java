package src.DiceFighter;
import helpers.InputReader;

public class Goblin
{
    /**
     *This class holds the statistics for the Goblin enemy
     * this class and functions will be called within the Goblin encounter class
    */
    private static int armourClass = 13; //This value is how hard it is to hit the goblin
   private static int health = 10; // this value is the total hp of the goblin
   private static int attackBonus = 2; // this value is what the goblin will add to its d20 roll in order to hit the player
    private static int damage; // this value is how much the goblin will reduce the players hp by on a hit
        {
        }

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

