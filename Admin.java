import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    private final String login = "Admin";
    private final String password = "Admin";
    IActivity act;

    public void setAct(IActivity act) {
        this.act = act;
    }

    public void executeAction(int n, ArrayList<Product> arr){
        Scanner sc = new Scanner(System.in);
        int id;
        String brand = "";
        String shop = "";
        int price = 0;
        String new_brand = "";
        String newShop = "";
        int new_price = 0;
        if (n == 1){
            System.out.println("Say an id");
            id = sc.nextInt();
            System.out.println("Say a brand");
            new_brand = sc.next();
            System.out.println("Say a shop");
            newShop = sc.next();
            System.out.println("Say a price");
            new_price = sc.nextInt();
        } else if (n == 2){
            id = sc.nextInt();
        } else {
            id = sc.nextInt();
            new_price = sc.nextInt();
        }
        act.Action(id,brand,shop,price, new_brand, newShop, new_price, arr);
    }
}
