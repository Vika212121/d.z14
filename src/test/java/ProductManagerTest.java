import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductManagerTest {
    Product book1 = new Book(1, "Сказки", 550, "Русские народные");
    Product book2 = new Book(2, "Солнце", 450, "Владимир Дюжин");
    Product smartPhone1 = new Smartphone(3, "Iphone 11", 50000, "Apple");
    Product smartPhone2 = new Smartphone(4, "Iphone 12", 70000, "Apple");
    Product product1 = new Product(5, "Луна", 700);
    Product product2 = new Product(6, "Iphone 13", 90000);

    ProductRepository repository = new ProductRepository();
    ProductManager manager;

    ProductManagerTest() {
        manager = new ProductManager(repository);
    }

    @BeforeEach
    public void setUp() {
        manager.add(book1);
        manager.add(book2);
        manager.add(smartPhone1);
        manager.add(smartPhone2);
        manager.add(product1);
        manager.add(product2);
    }


    @Test
    void shouldRemoveById() {
        repository.removeById(2);
        Product[] actual = repository.findAll();
        Product[] expected = new Product[]{
                book1,
                smartPhone1, smartPhone2,
                product1, product2};

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveByIdNotExist() {
        assertThrows(NotFoundException.class, () -> repository.removeById(10));
    }
}