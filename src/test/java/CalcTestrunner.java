import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalcTestrunner extends Setup{

    @Test(priority = 1,description = "Series Calculation")
    public  void doseries() throws InterruptedException {
        CalcScreen screen=new CalcScreen(driver);
        String value = screen.calcSeries(driver,"100/10*5-10+60");
        //System.out.println(value);
        Assert.assertEquals(value,"100");
        Allure.description("Calculate the Series.");

    }
}
