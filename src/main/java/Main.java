import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public String readRawDataToString() throws Exception{
        ClassLoader classLoader = getClass().getClassLoader();
        String result = IOUtils.toString(classLoader.getResourceAsStream("RawData.txt"));
        return result;
    }

    public static void main(String[] args) throws Exception{
        String output = (new Main()).readRawDataToString();
        System.out.println(output);
        ArrayList<String> outputInArrayList = JerSon.jersonSplit(output);
        //System.out.println(outputInArrayList.toString());
        System.out.println(JerSon.modifiedArrayList(outputInArrayList));
        String[] temp =  JerSon.modifiedArrayList(outputInArrayList).toArray(new String[0]);

        for (String s : temp) {
            System.out.println(s);
        }

        //System.out.println(temp.toString());
    }
}
