import java.util.Scanner;
public class ItemToPurchase {
    private String itemName;
    private int itemPrice;
    private int itemQuantity;

    ItemToPurchase() {
        itemName = "none";
        itemPrice = 0;
        itemQuantity = 0;
    }
    public void setName(String n) { itemName = n;}

    public void setPrice(int p) { itemPrice = p; }

    public void setQuantity(int q) { itemQuantity = q; }

    public String getName() { return itemName; }

    public int getPrice() { return itemPrice; }

    public int getQuantity() { return itemQuantity; }



}
