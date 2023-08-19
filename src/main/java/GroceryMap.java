
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroceryMap {
    public static HashMap<String, HashMap<Double, Integer>> groceryMap = new HashMap<>();


    public static void runAllNameFinders() {
        addingNames();
        addingPrice();
        print(groceryMap);
        for (Map.Entry<String, HashMap<Double, Integer>> entry : groceryMap.entrySet()) {
            String key = entry.getKey();
            HashMap value = entry.getValue();
            System.out.println("Item: " + key + " | Count: " + value);
        }
    }

    public static String print(HashMap<String, HashMap<Double, Integer>> map) {
        StringBuilder output = new StringBuilder();
        for (HashMap.Entry<String, HashMap<Double, Integer>> el : groceryMap.entrySet()) {
            String wordName = el.getKey();
            HashMap<Double, Integer> innerMap = groceryMap.get(wordName);

            output.append(String.format("name:    %s    \t\t seen: %d times%n", wordName, innerMap.size()));
            output.append("=================  \t\t ===============%n\n");

            for (HashMap.Entry<Double, Integer> inner : innerMap.entrySet()) {
                Double price = inner.getKey();
                Integer count = inner.getValue();


                output.append(String.format("Price:   %.2f      \t\t seen: %d times%n", price, count));
                output.append("-----------------  \t\t ---------------\n");
            }
        }
        System.out.println(output.toString());
        return output.toString();

    }


    public static HashMap<String, HashMap<Double, Integer>> addingNames() {
        for (int i = 0; i < GroceryList.list.size(); i++) {
            String tempName = GroceryList.list.get(i).getName();
            if (!groceryMap.containsKey(tempName)) {
                groceryMap.put(tempName, new HashMap<>());
            }else if (tempName.isEmpty()) {
                tempName = "EROR";
                groceryMap.put(tempName, new HashMap<>());
            }
        }
        return groceryMap;
    }

    public static HashMap<String, HashMap<Double, Integer>> addingPrice() {
        for (int i = 0; i < GroceryList.list.size(); i++) {
            GroceryItems item = GroceryList.list.get(i);
            String tempName = item.getName();
            Double tempPrice = item.getPrice();

            if (groceryMap.containsKey(tempName)) {
                HashMap<Double, Integer> innerMap = groceryMap.get(tempName);

                if (innerMap.containsKey(tempPrice)) {
                    innerMap.put(tempPrice, innerMap.get(tempPrice) + 1);
                } else {
                    innerMap.put(tempPrice, 1);
                }
            }
        }
        return groceryMap;
    }


}

//    public static void runAllNameFinders() {
//        counterMilk();
//        counterCookies();
//        counterApples();
//        counterBread();
//        counterErrorName();
//
//        for (Map.Entry<String,HashMap<Double, Integer>> entry : groceryMap.entrySet()) {
//            String key = entry.getKey();
//            HashMap value = entry.getValue();
//            System.out.println("Item: " + key + " | Count: " + value);
//        }

//    }


//
//    public static HashMap<String, HashMap<Double ,Integer>> counterMilk() {
//        HashMap<Double,Integer> tempHashMap = new HashMap<>();
//
//        String milk = "Milk";
//        int counterMilk = 0;
//        Double tempPrices = 0.0;
//        for (int i = 0; i < GroceryList.list.size(); i++) {
//            String tempName = GroceryList.list.get(i).getName();
//            Double tempPrice = GroceryList.list.get(i).getPrice();
//
//            if (tempPrices != 0.0) {
//                tempPrices = tempPrice;
//            }
//
//            if (!tempName.isEmpty() &&
//                    (tempName.charAt(0) == 'm' || tempName.charAt(0) == 'M') &&
//                    (tempName.charAt(tempName.length() - 1) == 'k' || tempName.charAt(tempName.length() - 1) == 'K')) {
//                counterMilk++;
//            }
//        }
//
//        tempHashMap.put(tempPrices,counterMilk);
//
//        groceryMap.put(milk,tempHashMap);
//        return groceryMap;
//    }
//
//    public static HashMap<String, Integer> counterCookies() {
//        String cookies = "Cookies";
//        int counterCookies = 0;
//        for (int i = 0; i < GroceryList.list.size(); i++) {
//            String tempName = GroceryList.list.get(i).getName();
//            if (!tempName.isEmpty() &&
//                    (tempName.charAt(0) == 'c' || tempName.charAt(0) == 'C') &&
//                    (tempName.charAt(tempName.length() - 1) == 's' || tempName.charAt(tempName.length() - 1) == 'S')) {
//                counterCookies++;
//            }
//        }
//        groceryMap.put(cookies, counterCookies);
//        return groceryMap;
//    }
//
//    public static HashMap<String, Integer> counterApples() {
//        String apples = "Apples";
//        int counterApples = 0;
//        for (int i = 0; i < GroceryList.list.size(); i++) {
//            String tempName = GroceryList.list.get(i).getName();
//            if (!tempName.isEmpty() &&
//                    (tempName.charAt(0) == 'a' || tempName.charAt(0) == 'A') &&
//                    (tempName.charAt(tempName.length() - 1) == 's' || tempName.charAt(tempName.length() - 1) == 'S')) {
//                counterApples++;
//            }
//        }
//        groceryMap.put(apples, counterApples);
//        return groceryMap;
//    }
//
//    public static HashMap<String, Integer> counterBread() {
//        String bread = "Bread";
//        int counterBread = 0;
//        for (int i = 0; i < GroceryList.list.size(); i++) {
//            String tempName = GroceryList.list.get(i).getName();
//            if (!tempName.isEmpty() &&
//                    (tempName.charAt(0) == 'b' || tempName.charAt(0) == 'B') &&
//                    (tempName.charAt(tempName.length() - 1) == 'd' || tempName.charAt(tempName.length() - 1) == 'D')) {
//                counterBread++;
//            }
//        }
//        groceryMap.put(bread, counterBread);
//        return groceryMap;
//    }
//
//    public static HashMap<String, Integer> counterErrorName() {
//        int counterErrorName = 0;
//        String error = "Error";
//        for (int i = 0; i < GroceryList.list.size(); i++) {
//            String tempName = GroceryList.list.get(i).getName();
//            if (tempName.isEmpty()) {
//                counterErrorName++;
//            }
//        }
//        groceryMap.put(error, counterErrorName);
//        return groceryMap;
//    }
//        }
//