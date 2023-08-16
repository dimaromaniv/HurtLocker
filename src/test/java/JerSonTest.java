import org.junit.Assert;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JerSonTest {
    @Test
    public void testFindName() {
        JerSon jerSon = new JerSon();
        String input1 = "##naMe:;price:3.23;type:Food^expiration:1/04/2016##";
        String input2 = "##naMe:Milk;price:2.99;type:Beverage^expiration:2/20/2023##";
        String input3 = "##nAme:Chips;price:1.49;type:Snack^expiration:12/31/2022##";
        String input4 = "##naMe:;price:5.99;type:Toy^expiration:##";

        String actual = jerSon.findName(input1);
        String actual2 = jerSon.findName(input2);
        String actual3 = jerSon.findName(input3);
        String actual4 = jerSon.findName(input4);

        String expected = "";
        String expected2 = "Milk";
        String expected3 = "Chips";
        String expected4 = "";

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected2, actual2);
        Assert.assertEquals(expected3, actual3);
        Assert.assertEquals(expected4, actual4);
    }
}
