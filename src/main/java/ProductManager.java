public class ProductManager {
    private final ProductRepository repository;

    ProductManager(ProductRepository repository) {
        this.repository = repository;
    }

    public static ProductManager createProductManager(ProductRepository repository) {
        return new ProductManagerBuilder().setRepository(repository).createProductManager();
    }

    public void add(Product item) {
        repository.save(item);
    }

}