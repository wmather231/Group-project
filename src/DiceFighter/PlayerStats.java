package src.DiceFighter;
import helpers.InputReader;
public class PlayerStats {

    private int strength; //will affect attackBonus
    private int constitution; //will affect health
    private int dexterity; //will affect armourClass
    private int playerArmourClass = 10 + dexterity; //This value is how hard it is to hit the Player
    private int playerHealthMax = 10 + constitution; // this value is the total hp of the Player
    private int playerAttackBonus = strength + dexterity; // this value is what the Player will add to its d20 roll in order to hit enemies
    public int damage = strength; // this value is how much the Player will reduce the players hp by on a hit
    public int playerHealth;

    int count = 0;
    while(count <= 3)
    {
        System.out.println("Choose where you want your stats to be");
        if (count == 0) {
            System.out.println("Where do you want your 5 stat to be?\n");
            int playerOptions = InputReader.getInt("1. Dexterity\n 2. Strength\n 3. Constitution\n");
            switch(playerOptions) {
                case 1: dexterity = 5; count++;
                        break;
                case 2: strength = 5; count++;
                        break;
                case 3: constitution = 5; count++;
                        break;
                default: System.out.println("Please pick a real option moron\n");
            }
        else if (count == 1) {
                System.out.println("Where do you want your 3 stat to be?\n");
                int playerOptions = InputReader.getInt("1. Dexterity\n 2. Strength\n 3. Constitution\n");
                switch(playerOptions) {
                    case 1:
                        dexterity = 3;
                        count++;
                        break;
                    case 2:
                        strength = 3;
                        count++;
                        break;
                    case 3:
                        constitution = 3;
                        count++;
                        break;
                    default:
                        System.out.println("Please pick a real option moron\n");
                }
                    else if (count == 1) {
                        System.out.println("Where do you want your 1 stat to be?\n");
                        int playerOptions = InputReader.getInt("1. Dexterity\n 2. Strength\n 3. Constitution\n");
                        switch(playerOptions) {
                            case 1: dexterity = 1; count++;
                                break;
                            case 2: strength = 1; count++;
                                break;
                            case 3: constitution = 1; count++;
                                break;
                            default: System.out.println("Please pick a real option moron\n");
            }

                }
                    else {
                        if (dexterity == strength || strength == constitution || constitution == dexterity){
                            count = 0;
                            System.out.println("Please make sure stats don't overlap");
                        }
                }
    }


    public PlayerStats()
    {
        this.playerArmourClass = playerArmourClass;
        this.playerHealthMax = playerHealthMax;
        this.playerAttackBonus = playerAttackBonus;
    }
}
