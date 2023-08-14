import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class JerSon {
    private static final String newLineSEPAROTOR = "##";
    public static String keyValueSeparator = ":, @, ^, *, %";
    public String name;
    public String type;
    public double price;
    public String expiration;

    public String outPutString;

    public JerSon() {
        this.name = "";
        this.type = "";
        this.price = 0.0;
        this.expiration = "";
        this.outPutString = "";
    }


    public static ArrayList<String> jersonSplit(String input) {
        ArrayList<String> result = new ArrayList<>();
        String[] inputToArray = input.split(newLineSEPAROTOR);
        for (int i = 0; i < inputToArray.length; i++) {
            String temp = inputToArray[i];
            result.add(temp + "\n");
        }
        return result;
    }

    public static String modifyString(String input) {
        String charsToRemove = ":@^*%";
        String newLineReplacement = "\n";

        String modifiedString = input.replace(charsToRemove, newLineReplacement);
        modifiedString = modifiedString.replaceAll(";", newLineReplacement);
        modifiedString = modifiedString.replaceAll(",", "");
        return modifiedString;
    }


    public static ArrayList<String>  modifiedArrayList (ArrayList<String> inputArray) {
        ArrayList<String > result = new ArrayList<>();
        for (int i = 0 ; i < inputArray.size() ; i++) {
            result.add(modifyString(inputArray.get(i)));
        }
        return result;
    }

//    public static ArrayList<String> toKeyValue(ArrayList<String> inputArrayList) {
//
//        return result;
//    }
}




    
