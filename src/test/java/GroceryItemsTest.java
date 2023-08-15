import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GroceryItemsTest {

    @Test
    public void testDefaultConstructor() {
        GroceryItems item = new GroceryItems();
        assertEquals("", item.getName());
        assertEquals(0.0, item.getPrice(), 0.001); // Comparing doubles with a delta
        assertEquals("", item.getType());
        assertEquals("", item.getExpiration());
    }

    @Test
    public void testParameterizedConstructor() {
        String expectedName = "Apple";
        double expectedPrice = 1.99;
        String expectedType = "Fruit";
        String expectedExpiration = "2023-08-31";

        GroceryItems item = new GroceryItems(expectedName, expectedPrice, expectedType, expectedExpiration);

        assertEquals(expectedName, item.getName());
        assertEquals(expectedPrice, item.getPrice(), 0.001);
        assertEquals(expectedType, item.getType());
        assertEquals(expectedExpiration, item.getExpiration());
    }

    @Test
    public void testSetName() {
        GroceryItems item = new GroceryItems();
        item.setName("Banana");
        assertEquals("Banana", item.getName());
    }

    @Test
    public void testSetPrice() {
        GroceryItems item = new GroceryItems();
        item.setPrice(2.49);
        assertEquals(2.49, item.getPrice(), 0.001);
    }

    @Test
    public void testSetType() {
        GroceryItems item = new GroceryItems();
        item.setType("Vegetable");
        assertEquals("Vegetable", item.getType());
    }

    @Test
    public void testSetExpiration() {
        GroceryItems item = new GroceryItems();
        item.setExpiration("2023-09-15");
        assertEquals("2023-09-15", item.getExpiration());
    }
}
