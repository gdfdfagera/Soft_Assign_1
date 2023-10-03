public class Product {
    private int id;
    private String brand;
    private String shop;
    private int price;
    public Product(int id, String brand, String shop, int price){
        this.id = id;
        this.brand = brand;
        this.shop = shop;
        this.price = price;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getShop() {
        return shop;
    }
}
