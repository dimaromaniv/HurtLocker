import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public String readRawDataToString() throws Exception {
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static void main(String[] args) throws Exception {
        String output = (new Main()).readRawDataToString();
        //System.out.println(output);
        ArrayList<String> outputInArrayList = JerSon.jersonSplit(output); //conver RawData to ArrayList

        ////convert outputInA to "\n" lines
        ArrayList<String> modifiedArrayLIst = JerSon.modifiedArrayList(outputInArrayList);

        //for some case create array, maybe will be not needed

        GroceryList.arrayLooping(modifiedArrayLIst);
//        System.out.println(GroceryList.checkSize());
//        System.out.println(GroceryList.groceryListToString());

        GroceryMap.runAllNameFinders();


    }

}


