/*
* This class initializes the player object and gathers the needed info for that object to be initiated properly.
* */

import java.util.Scanner;

public class StartMenu {
    public static Player MainPLayer = new Player(null);
    public static void StartMenu(){


        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to "+Main.gameName);

        System.out.println("Whats your name?");
        MainPLayer.setName(scanner.nextLine());

        System.out.println("[1]Start");
        if(scanner.nextLine().equalsIgnoreCase("1")){
            InGameChoiceMenu.Start();



        }



    }
}
