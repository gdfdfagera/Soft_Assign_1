import java.util.ArrayList;

public class Add implements IActivity{

    @Override
    public void Action(int id, String brand, String shop, int price, String new_brand, String new_shop, int new_price, ArrayList<Product> arr) {
        Product p = new Product(id, new_brand, new_shop, new_price);
        arr.add(p);
    }
}
