package src.DiceFighter;

public class Goblin
{
    /**
    *This class holds the statistics for the Goblin enemy
     * this class and functions will be called within the Goblin encounter class
    */
    private int armourClass = 15; //This value is how hard it is to hit the goblin
   private int health = 10; // this value is the total hp of the goblin
   private int attackBonus = 2; // this value is what the goblin will add to its d20 roll in order to hit the player
    public int damage; // this value is how much the goblin will reduce the players hp by on a hit
        {
            Game game;
                    game = new Game();
            game.diceFour();
        }

   public Goblin()
   {
       this.armourClass = armourClass;
       this.health = health;
       this.attackBonus = attackBonus;
   }

}
