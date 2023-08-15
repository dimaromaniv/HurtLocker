import java.util.HashMap;
import java.util.Map;

public class GroceryMap {
    public static HashMap<String,Integer> groceryMap = new HashMap<>();

    public static void runAllNameFinders () {
        counterMilk();
        counterBread();
        counterCookies();
        counterApples();
        counterErrorName();

        for (Map.Entry<String, Integer> entry : groceryMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Item: " + key + " | Count: " + value);
        }

    }

    public static HashMap<String, Integer> counterMilk() {

        //  double price = 0.0;
        String milk = "Milk";
        int counterMilk = 0;
        for (int i = 0; i < GroceryList.list.size()-15; i++) {
            StringBuilder tempName = new StringBuilder(GroceryList.list.get(i).getName());
            if (tempName.charAt(0) == 'm' || tempName.charAt(0) == 'M' &&
                    tempName.charAt(tempName.length() - 1) == 'k' || tempName.charAt(tempName.length() - 1) == 'K') {
                counterMilk++;
            }
            groceryMap.put(milk,counterMilk);
        }
        return groceryMap;
    }

    public static HashMap<String, Integer> counterCookies() {
        String cookies = "Cookies";
        int counterCookies = 0;
        for (int i = 0; i < GroceryList.list.size()-15; i++) {
            StringBuilder tempName = new StringBuilder(GroceryList.list.get(i).getName());
            if (tempName.charAt(0) == 'c' || tempName.charAt(0) == 'C' &&
                    tempName.charAt(tempName.length() - 1) == 's' || tempName.charAt(tempName.length() - 1) == 'S') {
                counterCookies++;
            }
            groceryMap.put(cookies,counterCookies);
        }
        return groceryMap;
    }
    public static HashMap<String, Integer> counterApples() {
        int counterAplles = 0;
        String apples = "Apples";
        for (int i = 0; i < GroceryList.list.size()-15; i++) {
            StringBuilder tempName = new StringBuilder(GroceryList.list.get(i).getName());
            if (tempName.charAt(0) == 'a' || tempName.charAt(0) == 'A' &&
                    tempName.charAt(tempName.length() - 1) == 's' || tempName.charAt(tempName.length() - 1) == 'S') {
                counterAplles++;
            }
            groceryMap.put(apples,counterAplles);
        }
        return groceryMap;
    }
    public static HashMap<String, Integer> counterBread() {
        int counterBread = 0;
        String bread = "Bread";
        for (int i = 0; i < GroceryList.list.size()-15; i++) {
            StringBuilder tempName = new StringBuilder(GroceryList.list.get(i).getName());
            if (tempName.charAt(0) == 'b' || tempName.charAt(0) == 'B' &&
                    tempName.charAt(tempName.length() - 1) == 'd' || tempName.charAt(tempName.length() - 1) == 'D') {
                counterBread++;
            }
            groceryMap.put(bread,counterBread);
        }
        return groceryMap;
    }

    public static HashMap<String, Integer> counterErrorName() {
        int counterErrorName = 0;
        String error = "Error";
        for (int i = 0; i < GroceryList.list.size()-15; i++) {
            StringBuilder tempName = new StringBuilder(GroceryList.list.get(i).getName());
            if (tempName.toString() == "") {
                counterErrorName++;
            }
            groceryMap.put(error,counterErrorName);
        }
        return groceryMap;
    }
}
