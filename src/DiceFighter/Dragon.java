package src.DiceFighter;

public class Dragon
        /**
         * @author Joshua
         *This class holds the statistics for the Dragon enemy
         * this class and functions will be called within the Dragon encounter
         */
{
    private static int armourClass = 16; //This value is how hard it is to hit the goblin
    private static int health = 20; // this value is the total hp of the goblin
    private static int attackBonus = 4; // this value is what the goblin will add to its d20 roll in order to hit the player
    private static int damage= 2; // this value is how much the goblin will reduce the players hp by on a hit


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

    public int Dragon()
    {
        this.armourClass = armourClass;
        this.health = health;
        this.attackBonus = attackBonus;

        return 0;
    }
}
