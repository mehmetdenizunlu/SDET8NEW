package Selenium;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class _18_ActionHoverTest extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://www.hepsiburada.com/");
        MyFunc.Bekle(2);

        WebElement element=driver.findElement(By.xpath("//*[text()='Moda']"));

        Actions aksiyonDriver=new Actions(driver);
        Action aksiyon=aksiyonDriver.moveToElement(element).build();
        aksiyon.perform();

        //new Actions(driver).moveToElement(element).build().perform();

        BekleKapat();
    }
}
