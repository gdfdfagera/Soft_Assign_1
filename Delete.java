import java.util.ArrayList;

public class Delete implements IActivity{
    @Override
    public void Action(int id, String brand, String shop, int price, String new_brand, String new_shop, int new_price, ArrayList<Product> arr) {
        for (Product t:
             arr) {
            if (t.getId() == id){
                arr.remove(t);
                break;
            }
        }
    }
}
