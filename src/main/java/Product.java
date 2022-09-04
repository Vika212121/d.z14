public class Product {
    private int id;
    private String name;

    public Product() {
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
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
