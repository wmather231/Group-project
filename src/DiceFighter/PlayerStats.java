package src.DiceFighter;
import helpers.InputReader;

/**
 * @author William
 * Holds information about the player's and allows for customisation
 */
public class PlayerStats
{
    private static int strength;
    private static int constitution;
    private static int dexterity;
    private static int playerArmourClass = 10 + dexterity;
    private static int playerHealthMax = 10 + constitution;
    private static int playerAttackBonus = strength + dexterity;
    public static int playerDamage = strength;
    public static int playerHealth = 10 + constitution;
    private static String playerName;

    public static void buildCharacter()
    {
         playerName = InputReader.getString("What is your name, hero?\n");
        int count = 0;
        while (count <= 3)
        {
            System.out.println("Dexterity will increase your bonus to hit and your armour class\n Strength will increase your bonus to hit and your damage\n Constitution will increase your max health\n");
            System.out.println("Choose where you want your stats to be\n\n");
            int playerOptions;
            if (count == 0)
            {
                System.out.println("Where do you want your 5 stat to be?\n\n");
                playerOptions = InputReader.getInt("1. Dexterity\n 2. Strength\n 3. Constitution\n\n");
                switch (playerOptions)
                {
                    case 1:
                        dexterity = 5;
                        count++;
                        break;
                    case 2:
                        strength = 5;
                        count++;
                        break;
                    case 3:
                        constitution = 5;
                        count++;
                        break;
                    default:
                        System.out.println("Please pick a real option moron\n\n");
                }
            }
            else if (count == 1)
            {
                System.out.println("Where do you want your 3 stat to be?\n\n");
                playerOptions = InputReader.getInt("1. Dexterity\n 2. Strength\n 3. Constitution\n\n");
                switch (playerOptions)
                {
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
                        System.out.println("Please pick a real option moron\n\n");
                }
            }
            else if (count == 2)
            {
                System.out.println("Where do you want your 1 stat to be?\n\n");
                playerOptions = InputReader.getInt("1. Dexterity\n 2. Strength\n 3. Constitution\n\n");
                switch (playerOptions)
                {
                    case 1:
                        dexterity = 1;
                        count++;
                        break;
                    case 2:
                        strength = 1;
                        count++;
                        break;
                    case 3:
                        constitution = 1;
                        count++;
                        break;
                    default:
                        System.out.println("Please pick a real option moron\n\n");

                }
            }
            else
            {
                if (dexterity == strength || strength == constitution || constitution == dexterity)
                {
                    count = 0;
                    System.out.println("Please make sure stats don't overlap\n\n");
                }
                else
                {
                    count = 4;
                }


            }
        }
        playerArmourClass = 10 + dexterity; //This value is how hard it is to hit the Player
        playerHealthMax = 10 + constitution; // this value is the total hp of the Player
        playerAttackBonus = strength + dexterity; // this value is what the Player will add to its d20 roll in order to hit enemies
        playerDamage = strength; // this value is how much the Player will reduce the players hp by on a hit
        playerHealth = playerHealthMax;

        System.out.println("\nDexterity: " + dexterity + "\nStrength: " + strength + "\nconstitution: " + constitution);
        System.out.println("\nArmour Class: " + playerArmourClass + "\nHealth: " + playerHealthMax + "\nAttack Bonus: " + playerAttackBonus + "\nDamage: 1d6 + " + playerDamage + "\n");
    }

    public PlayerStats()
    {
        this.playerArmourClass = playerArmourClass;
        this.playerHealthMax = playerHealthMax;
        this.playerAttackBonus = playerAttackBonus;
    }

    public static int getPlayerArmourClass()
    {
        return playerArmourClass;
    }

    public static int getPlayerAttackBonus()
    {
        return playerAttackBonus;
    }

    public static int getPlayerDamage()
    {
        return playerDamage;
    }

    public static int getPlayerHealth()
    {
        return playerHealth;
    }

    public static int getBuildCharacter()
    {

        return dexterity + constitution + strength;

    }
    public static String getPlayerName()
    {
        return playerName;
    }
    public static int getPlayerHealthMax()
    {
        return playerHealthMax;
    }
}

