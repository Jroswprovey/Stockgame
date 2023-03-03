/*
* this class is the main menu of the game where the user can decide what to do in the game.
* */


import java.util.Scanner;

public class InGameChoiceMenu {
    public static void Start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What would you like to do?");
        System.out.println("[1] Go to the ATM");
        System.out.println("[2] Go to the stock market");

        String UserChoice = scanner.nextLine();

        if(UserChoice.equalsIgnoreCase("1")){
            ATM.AtmMainMenu();
        }
        if(UserChoice.equalsIgnoreCase("2")){
            StonkMarket.TickerPage();
        }




    }
}
