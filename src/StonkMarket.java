/*
* The point of this class is to simulate the stock market by randomly generating the percentage at
* which a given stock is going up or down. additionally the user can buy or sell these stocks and it
* will be recorded in the players object
* */

import java.util.Scanner;

public class StonkMarket {
    public static void TickerPage(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("[WorstBuy]"+ RandomPercent()+"%");

        System.out.println("Type R to refresh, B to buy, S to sell, and E to exit");

        String userChoice = scanner.nextLine();

        if(userChoice.equalsIgnoreCase("e")){
            InGameChoiceMenu.Start();
        }else if(userChoice.equalsIgnoreCase("r")){
            TickerPage();
        } else {
            TickerPage();
        }

    }

    private static double RandomPercent(){
        double randomNumber = (double) (Math.round((Math.random()*(100-0+1)+0)*100)) / 100;
        double multiple = 0;

        if(Math.random()> .50) {
            multiple = -1;
        } else {
            multiple =  1;
        }

        double result = multiple * randomNumber;

        return result;
    }
}

