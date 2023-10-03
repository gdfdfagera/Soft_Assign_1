import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admin admin = new Admin();

        Product p1 = new Product(1, "samsung", "technodom", 400000);
        Product p2 = new Product(2, "xiomi", "sulpak", 150000);
        Product p3 = new Product(3, "huawei", "mechta", 320000);
        Product p4 = new Product(4, "iphone", "belii", 500000);
        Product p5 = new Product(5, "asus", "technodom", 450000);
        Product p6 = new Product(6, "samsung", "mechta", 700000);
        Product p7 = new Product(7, "lenovo", "sulpak", 360000);
        Product p8 = new Product(8, "asus", "sulpak", 360000);
        ArrayList<Product> arr = new ArrayList<>();
        arr.add(p1);
        arr.add(p2);
        arr.add(p3);
        arr.add(p4);
        arr.add(p5);
        arr.add(p6);
        arr.add(p7);
        arr.add(p8);


        while (true){
            System.out.println("Choose 1 if you want to add new product");
            System.out.println("Choose 2 if you want to delete product");
            System.out.println("Choose 3 if you want to update product");
            System.out.println("Choose 4 if you want to see a list of products");
            System.out.println("Choose 5 if you want to exit");
            int choose = sc.nextInt();
            if (choose == 1){
                admin.setAct(new Add());
                admin.executeAction(1, arr);
            } else if (choose == 2){
                admin.setAct(new Delete());
                admin.executeAction(2, arr);
            } else if (choose == 3){
                admin.setAct(new Update());
                admin.executeAction(3, arr);
            } else if (choose == 4) {
                for (Product t:
                     arr) {
                    System.out.println(t.getId() + t.getBrand() + t.getPrice() + t.getShop());
                }
            } else {
                break;
            }
        }
    }
}
