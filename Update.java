import java.util.ArrayList;

public class Update implements IActivity{
    @Override
    public void Action(int id, String brand, String shop, int price, String new_brand, String new_shop, int new_price, ArrayList<Product> arr) {
        for (Product t:
             arr) {
            if (t.getId() == id){
                t.setPrice(new_price);
                break;
            }
        }
    }
}
