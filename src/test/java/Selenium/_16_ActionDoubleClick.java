package Selenium;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class _16_ActionDoubleClick extends BaseDriver {

    @Test
    public void Test(){
        driver.get("https://demoqa.com/buttons");

        WebElement btnDblClick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
        MyFunc.Bekle(2);

        Actions aksiyonDriver=new Actions(driver);
        Action aksiyon=aksiyonDriver.moveToElement(btnDblClick).doubleClick().build();
        aksiyon.perform();

        //new Actions(driver).doubleClick(btnDblClick).build().perform();

        BekleKapat();
    }
}
