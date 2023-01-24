package src.DiceFighter;

public class PlayerStats {

    private int strength; //will affect attackBonus
    private int constitution; //will affect health
    private int dexterity; //will affect armourClass
    private int playerArmourClass = 10 + dexterity; //This value is how hard it is to hit the Player
    private int playerHealthMax = 10 + constitution; // this value is the total hp of the Player
    private int playerAttackBonus = strength + dexterity; // this value is what the Player will add to its d20 roll in order to hit enemies
    public int damage = strength; // this value is how much the Player will reduce the players hp by on a hit

    


    public PlayerStats()
    {
        this.playerArmourClass = playerArmourClass;
        this.playerHealthMax = playerHealthMax;
        this.playerAttackBonus = playerAttackBonus;
    }
}
