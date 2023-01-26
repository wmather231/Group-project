package src;

//import Game.Game;

import src.DiceFighter.Game;

public class App {


    public static void main(String[] args) throws Exception {
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" by Joshua && William Mather");
        System.out.println();
        src.DiceFighter.Game app = new src.DiceFighter.Game();
       Game game = new Game();
       game.runMainMenu();
    }
}