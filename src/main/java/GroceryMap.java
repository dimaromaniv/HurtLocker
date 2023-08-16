
import java.util.HashMap;
import java.util.Map;

public class GroceryMap {
    public static HashMap<String, Integer> groceryMap = new HashMap<>();

    public static void runAllNameFinders() {
        counterMilk();
        counterCookies();
        counterApples();
        counterBread();
        counterErrorName();

        for (Map.Entry<String, Integer> entry : groceryMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Item: " + key + " | Count: " + value);
        }

    }

    public static HashMap<String, Integer> counterMilk() {
        String milk = "Milk";
        int counterMilk = 0;
        for (int i = 0; i < GroceryList.list.size(); i++) {
            String tempName = GroceryList.list.get(i).getName();
            if (!tempName.isEmpty() &&
                    (tempName.charAt(0) == 'm' || tempName.charAt(0) == 'M') &&
                    (tempName.charAt(tempName.length() - 1) == 'k' || tempName.charAt(tempName.length() - 1) == 'K')) {
                counterMilk++;
            }
        }
        groceryMap.put(milk, counterMilk);
        return groceryMap;
    }

    public static HashMap<String, Integer> counterCookies() {
        String cookies = "Cookies";
        int counterCookies = 0;
        for (int i = 0; i < GroceryList.list.size(); i++) {
            String tempName = GroceryList.list.get(i).getName();
            if (!tempName.isEmpty() &&
                    (tempName.charAt(0) == 'c' || tempName.charAt(0) == 'C') &&
                    (tempName.charAt(tempName.length() - 1) == 's' || tempName.charAt(tempName.length() - 1) == 'S')) {
                counterCookies++;
            }
        }
        groceryMap.put(cookies, counterCookies);
        return groceryMap;
    }

    public static HashMap<String, Integer> counterApples() {
        String apples = "Apples";
        int counterApples = 0;
        for (int i = 0; i < GroceryList.list.size(); i++) {
            String tempName = GroceryList.list.get(i).getName();
            if (!tempName.isEmpty() &&
                    (tempName.charAt(0) == 'a' || tempName.charAt(0) == 'A') &&
                    (tempName.charAt(tempName.length() - 1) == 's' || tempName.charAt(tempName.length() - 1) == 'S')) {
                counterApples++;
            }
        }
        groceryMap.put(apples, counterApples);
        return groceryMap;
    }

    public static HashMap<String, Integer> counterBread() {
        String bread = "Bread";
        int counterBread = 0;
        for (int i = 0; i < GroceryList.list.size(); i++) {
            String tempName = GroceryList.list.get(i).getName();
            if (!tempName.isEmpty() &&
                    (tempName.charAt(0) == 'b' || tempName.charAt(0) == 'B') &&
                    (tempName.charAt(tempName.length() - 1) == 'd' || tempName.charAt(tempName.length() - 1) == 'D')) {
                counterBread++;
            }
        }
        groceryMap.put(bread, counterBread);
        return groceryMap;
    }

    public static HashMap<String, Integer> counterErrorName() {
        int counterErrorName = 0;
        String error = "Error";
        for (int i = 0; i < GroceryList.list.size(); i++) {
            String tempName = GroceryList.list.get(i).getName();
            if (tempName.isEmpty()) {
                counterErrorName++;
            }
        }
        groceryMap.put(error, counterErrorName);
        return groceryMap;
    }
}

