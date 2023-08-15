import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroceryList {

    public static ArrayList<GroceryItems> list = new ArrayList<>();




    public static GroceryItems create(String expectedName, Double expectedPrice, String expectedType, String expectedData) {
        GroceryItems item = new GroceryItems(expectedName, expectedPrice, expectedType, expectedData);
        list.add(item);
        return item;
    }

    public static void arrayLooping(ArrayList<String> input) {
        for (int i = 0; i < input.size(); i++) {
            String tempName = JerSon.findName(input.get(i));
            Double tempPrice = JerSon.findPrice(input.get(i));
            String tempType = JerSon.findType(input.get(i));
            String tempData = JerSon.findData(input.get(i));
            create(tempName, tempPrice, tempType, tempData);
        }
    }

    public static String groceryListToString() {
        StringBuilder result = new StringBuilder();
        for (GroceryItems g : list) {

            result.append(g.itemToString()).append("\n\n");
        }
        return result.toString();
    }




    public static Integer checkSize() {
        return list.size();
    }


}
