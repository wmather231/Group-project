package src;

//import Game.Game;

public class App {


    public static void main(String[] args) throws Exception {
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" by William Mather");
        System.out.println();
        //src.Game app = new src.Game();
       Game game = new Game();
       game.run();
    }
}