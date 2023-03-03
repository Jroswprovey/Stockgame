/*
 * The point of this object is to Keep information about the player and allow it to be accessed as needed by other methods as needed.
 * The Stock Purchases Array list tracks the Purchased stock and the price it was purchased at.
 *
 */

import java.math.BigDecimal;
import java.util.ArrayList;

public class Player {

    private BigDecimal Bal = BigDecimal.valueOf(6783.67);
    private ArrayList<ArrayList<Object>> StockPurchases = new ArrayList<>();

    private String Name;


    public Player(String name){
        Name = name;
    }

    public BigDecimal GetBal(){
        return Bal;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void AddAction(String stock, double purchasePrice) {
        ArrayList<Object> PurchaseInfo = new ArrayList<>();
        PurchaseInfo.add(stock);
        PurchaseInfo.add(purchasePrice);
        StockPurchases.add(PurchaseInfo);
    }
}
