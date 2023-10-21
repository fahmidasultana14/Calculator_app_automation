import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcScreen {



    @FindBy(id = "com.google.android.calculator:id/op_add")
    WebElement btnPlus;

    @FindBy(id = "com.google.android.calculator:id/op_div")
    WebElement btnDiv;

    @FindBy(id = "com.google.android.calculator:id/op_mul")
    WebElement btnMul;

    @FindBy(id = "com.google.android.calculator:id/op_sub")
    WebElement btnSub;


    @FindBy(id = "com.google.android.calculator:id/eq")
    WebElement btneq;

    @FindBy(id = "com.google.android.calculator:id/result_final")
    WebElement txtResult;

    AndroidDriver driver;

    public CalcScreen(AndroidDriver driver){
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    }




    public String calcSeries(AndroidDriver driver,String series){
        char[] Array = series.toCharArray();

        for (char c:Array) {
            if (Character.isDigit(c)){
                driver.findElement(By.id("com.google.android.calculator:id/digit_"+ c)).click();
            }
            else if (c=='+') {
                btnPlus.click();
            }
            else if (c=='-') {
                btnSub.click();
            }
            else if (c=='*') {
                btnMul.click();
            }
            else if (c=='/') {
                btnDiv.click();
            }
        }

        btneq.click();
        return txtResult.getText();

    }




}



