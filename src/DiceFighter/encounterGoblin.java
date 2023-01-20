package src.DiceFighter;

public class encounterGoblin
{
    int userAction;
   public void beginEncounter()
   {
       while ((PlayerStats.health > 0) && (Goblin.health > 0))
       {
            System.out.println("What will you do?");
            userAction = helpers.InputReader.getInt("1 Attack " + System.lineSeparator() + "2 nothing");
       }
   }



}
