public class Product {
    private int id;
    private String name;

    public Product() {
    }

    Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
    }

    public static Product createProduct(int id, String name, int price) {
        return new Product(id, name, price);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
}