import java.math.BigDecimal;
import java.util.Scanner;

public class ATM {
    public static void AtmMainMenu(){
        Scanner scanner = new Scanner(System.in);

    System.out.println("\n\n\n\n\n");
    System.out.println("beep blop im the atm");
    System.out.println("what do you wanna do");
    System.out.println("[1] Check balance");
    System.out.println("[2] Get money");
    System.out.println();

        switch (scanner.nextLine()) {
            case "1" -> System.out.println("Balance: " + StartMenu.MainPLayer.GetBal());
            case "2" -> {
                String requestedForm = "";
                System.out.println("What from do you want your money in?");
                System.out.println("[1] Tomato seeds");
                System.out.println("[2] Lily pads");
                System.out.println("[3] Monkey knees");
                System.out.println("[4] Duck beaks");
                System.out.println("[5] Bruno butt carpets");
                switch (scanner.nextInt()) {
                    case 1 -> requestedForm = "Tomato seeds";
                    case 2 -> requestedForm = "Lily pads";
                    case 3 -> requestedForm = "Monkey knees";
                    case 4 -> requestedForm = "Duck beaks";
                    case 5 -> requestedForm = "Bruno butt carpets";
                }
                System.out.println(formConverter(scanner.nextInt()) + " " + requestedForm);
            }
            case "3" -> Splitter(1);
        }
        }



    public static double Splitter(int requestedForm){
        BigDecimal bal = StartMenu.MainPLayer.GetBal();
        int balInt = bal.intValue();
        BigDecimal BalOnlyDecimal = bal.subtract(new BigDecimal(balInt));

        System.out.println(BalOnlyDecimal);

        /*
        note to self... if your currency (and any real currency at that matter) doesn't have anymore then two decimals
        you don't need to spend a ton of time working on a way to turn any decimal
        into a whole number when you can just multiply by 100   :|
        */

        if(requestedForm == 1) {
            return balInt;
        } else if(requestedForm == 2){
            return BalOnlyDecimal.doubleValue();
        }
        return -1;
    }

    public static double formConverter(int Form){



        /*
        *    [1] Tomato seeds
        *    [2] Monkey knees
        *    [3] Duck beaks
        *    [4] Bruno butt carpets
        */

        double bal = StartMenu.MainPLayer.GetBal().doubleValue();

        return switch (Form) {
            case 1 -> bal * 100;
            case 2 -> bal;
            case 3 -> bal / 10;
            case 4 -> bal / 100;
            default -> 0;
        };
    }

}
