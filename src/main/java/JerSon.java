import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JerSon {
    private static final String newLineSEPAROTOR = "##";


    public JerSon() {

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
        String charsToRemove = " ";  //":@^*%"
        String newLineReplacement = "\n";

        String modifiedString = input.replace(charsToRemove, newLineReplacement);
        modifiedString = modifiedString.replaceAll(";", newLineReplacement);
        modifiedString = modifiedString.replaceAll("@", "\n");
        modifiedString = modifiedString.replaceAll("!", "\n");
        modifiedString = modifiedString.replaceAll("%", "\n");
        modifiedString = modifiedString.replaceAll("\\^", "\n");
        modifiedString = modifiedString.replaceAll("\\*", "\n");

        // modifiedString = modifiedString.replaceAll("*", "\n");

        return modifiedString;
    }


    public static ArrayList<String> modifiedArrayList(ArrayList<String> inputArray) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < inputArray.size(); i++) {
            result.add(modifyString(inputArray.get(i)));
        }
        return result;
    }

    public static String modifyName(String input) {
        StringBuilder temp = new StringBuilder(input);
       // String firstLetter = temp.substring(0,1);
       // temp = temp.replace(0,1,firstLetter);
        StringBuilder sb =new StringBuilder();

        for (int i = 0 ; i < temp.length() ; i++) {
            char ch = temp.charAt(i);
            if (Character.isUpperCase(ch)) {
               ch = Character.toLowerCase(ch);
                sb.append(ch);
            }else {
                sb.append(ch);
            }
            sb.replace(0,1, String.valueOf(Character.toUpperCase(temp.charAt(0))));
        }

        for(int i = 0 ; i < sb.length() ; i++){
            if (sb.charAt(i) == '0') {
                sb.replace(i,i + 1,"o");
            }
        }
        return sb.toString();
    }

    public static String findName(String input) {
//        String input = inputListArr.get(0);

        String regex = "[nN]\\w+:(\\w*)";
        Pattern patternName = Pattern.compile(regex);
        Matcher matcher = patternName.matcher(input);

        String regex2 = "([nN]:)([^;^]+)";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(input);

        if (matcher.find()) {
            String itemNAme = matcher.group(1);
            return itemNAme;
        } else if (matcher2.find()) {
            String newItemName = matcher.group(1) + "\"\"";
            return matcher.replaceFirst(newItemName);
        } else {
            return null;
        }
    }


    public static Double findPrice(String inputStr) {
        String regex = "[pP]\\w+:(\\d+\\.?\\d*)";      //"[pP]\\w+:(\\w*)";
        Pattern patternName = Pattern.compile(regex);
        Matcher matcher = patternName.matcher(inputStr);
        if (matcher.find()) {
            try {
                double itemPrice = Double.parseDouble(matcher.group(1));
                return itemPrice;
            } catch (NumberFormatException e) {

                return 0.0;
            }
        } else {
            return 0.0;
        }
    }

    public static String findType(String input) {
//        String input = inputListArr.get(0);

        String regex = "[tT]\\w+:(\\w*)";
        Pattern patternName = Pattern.compile(regex);
        Matcher matcher = patternName.matcher(input);
        if (matcher.find()) {
            String itemNAme = matcher.group(1);
            return itemNAme;
        } else {
            return null;
        }
    }

    public static String findData(String input) {

        String regex = "[eE]\\w+:(\\d{1,2}/\\d{1,2}/\\d{4})";
        Pattern patternName = Pattern.compile(regex);
        Matcher matcher = patternName.matcher(input);
        if (matcher.find()) {
            try {
                String itemExperiationData = matcher.group(1);
                return itemExperiationData;
            } catch (Exception e) {
                System.out.println("Cant convert Data");
            }
        }
        return null;
    }


}





