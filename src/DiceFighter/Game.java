package src.DiceFighter;

import helpers.InputReader;


public class Game
{
    public int userAction;
    //public static int run()
    private int goblinHp;
    private int playerHp;

    private int dragonHp;

        public void runMainMenu()
        {
            System.out.println("What do you want to do? ");

            System.out.println("1 Start src.DiceFighter.Game " + System.lineSeparator() + "2 Exit\n");

            //PlayerStats.getBuildCharacter();

            int menuOption = InputReader.getInt("Please enter a menu option\n");

            while (menuOption == 1)
            {


                switch (menuOption)
                {
                    case 1:

                        firstEncounter();

                    case 2:
                    menuOption = 2;
                    System.out.println("Goodbye");
                    System.exit(0);

                    default:
                        System.out.println("Please enter a valid option");
                        break;

                }
                int menuCommand;

                //return menuOption;
            }

        }



    private void firstEncounter()
    {
        PlayerStats.buildCharacter();
        System.out.println("A Goblin Attacks!");
        encounterGoblin();
    }



    private void encounterGoblin()
    {
        goblinHp = Goblin.getHealth();
        playerHp = PlayerStats.getPlayerHealth();
        while ((playerHp > 0) || (goblinHp > 0))
        {
            System.out.println("What will you do?");
            userAction = helpers.InputReader.getInt("1 Attack " + System.lineSeparator() + "2 nothing\n");

            if (userAction == 1)
            {

                int playerAttackRoll = Dice.getDiceTwenty();
                System.out.println("You attack! " + playerAttackRoll);
                if (playerAttackRoll >= Goblin.getArmourClass())
                         {
                          goblinHp = goblinHp - Dice.getDiceSix();
                          System.out.println("\nYou deal " + (Goblin.getHealth() - goblinHp + " damage"));
                          System.out.println("\nThe Goblin has " + goblinHp + "HP left");

                          if (goblinHp <= 0)
                             {
                                 System.out.println("You slay the goblin");
                                 encounterDragon();
                             }

                        }
                else
                {
                System.out.println("You missed the Goblin");
                }
            }
            else if (userAction == 2)
            {
                System.out.println("You goad the monster to attack you");
            }

            int goblinTurn;
            {
                System.out.println("The Goblin attacks!");
                int goblinAttack = Dice.getDiceTwenty() + Goblin.getAttackBonus();
                System.out.println("The Goblin rolls " + goblinAttack);
                if (goblinAttack >= PlayerStats.getPlayerArmourClass())
                {
                    playerHp = playerHp - (Dice.getDiceFour() + Goblin.getDamage());
                    if (playerHp <= 0)
                    {
                        System.out.println("You died");
                        System.exit(0);
                    }
                    else
                    {
                        System.out.println("The goblin strikes you");
                        System.out.println("\n Your HP is reduced to " + playerHp);
                    }
                }
                else
                {
                    System.out.println("The Goblin misses you");
                }
            }
        }
        }

        private void encounterDragon()
        {
            System.out.println("\nA Dragon charges at you!");

            dragonHp = Dragon.getHealth();
            playerHp = PlayerStats.getPlayerHealth();
            while ((playerHp > 0) || (goblinHp > 0))
            {
                System.out.println("\nWhat will you do?");
                userAction = helpers.InputReader.getInt("1 Attack " + System.lineSeparator() + "2 nothing\n");

                if (userAction == 1)
                {

                    int playerAttackRoll = Dice.getDiceTwenty();
                    System.out.println("You attack! " + playerAttackRoll);
                    if (playerAttackRoll >= Dragon.getArmourClass())
                    {
                        dragonHp = dragonHp - Dice.getDiceSix();
                        System.out.println("\nYou deal " + (Dragon.getHealth() - dragonHp + " damage"));
                        System.out.println("\nThe Dragon has" + dragonHp + " HP left");
                        if (dragonHp <= 0);
                        {
                            System.out.println("You slay the Dragon");
                            encounterEnd();
                        }

                    }
                    else
                    {
                        System.out.println("You missed the Dragon");
                    }
                }
                else if (userAction == 2)
                {
                    System.out.println("You goad the monster to attack you");
                }

                int dragonTurn;  //The Dragon will now act
                {
                    System.out.println("The Dragon attacks!");
                    int dragonAttack = Dice.getDiceTwenty() + Dragon.getAttackBonus();
                    System.out.println("The Dragon rolls " + dragonAttack);
                    if (dragonAttack >= PlayerStats.getPlayerArmourClass())
                    {
                        playerHp = playerHp - (Dice.getDiceTen() + Dragon.getDamage());
                        System.out.println("\n Your HP is reduced to " + playerHp);
                        if (playerHp <= 0)
                        {
                            System.out.println("You died");
                            System.exit(0);
                        }
                        else
                        {
                            System.out.println("The Dragon strikes you");
                            System.out.println("\n Your HP is reduced to " + playerHp);
                        }
                    }
                    else
                    {
                        System.out.println("The Dragon misses you");
                    }
                }
            }

        }
        private void encounterEnd()
        {
            System.out.println("\nYou have slain the monsters! You are a hero!");
            System.exit(0);
        }
    }

