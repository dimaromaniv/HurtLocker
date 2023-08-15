import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GroceryListTest {

    @Test
    public void testCreateAndCheckSize() {
        GroceryList.list.clear(); // Clear the list before the test
        int initialSize = GroceryList.checkSize();

        GroceryItems item = GroceryList.create("Apple", 1.99, "Fruit", "2023-08-31");

        assertEquals(initialSize + 1, GroceryList.checkSize());
        assertEquals("Apple", item.getName());
        assertEquals(1.99, item.getPrice(), 0.001);
        assertEquals("Fruit", item.getType());
        assertEquals("2023-08-31", item.getExpiration());
    }

    @Test
    public void testArrayLooping() {
        GroceryList.list.clear(); // Clear the list before the test

        ArrayList<String> input = new ArrayList<>();
        input.add("naMe:Apple\nprice:1.99\ntype:Fruit\nexpiration:5/02/2016");
        input.add("naMe:Banana\nprice:0.99\ntype:Fruit\nexpiration:5/02/2016");

        GroceryList.arrayLooping(input);

        assertEquals(2, GroceryList.checkSize());

        GroceryItems firstItem = GroceryList.list.get(0);
        assertEquals("Apple", firstItem.getName());
        assertEquals(1.99, firstItem.getPrice(), 0.01); // Use a delta of 0.01
        assertEquals("Fruit", firstItem.getType());
        assertEquals("5/02/2016", firstItem.getExpiration());

        GroceryItems secondItem = GroceryList.list.get(1);
        assertEquals("Banana", secondItem.getName());
        assertEquals(0.99, secondItem.getPrice(), 0.01); // Use a delta of 0.01
        assertEquals("Fruit", secondItem.getType());
        assertEquals("5/02/2016", secondItem.getExpiration());
    }



}