package Selenium;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class _17_ActionRightClickTest extends BaseDriver {

    @Test
    public void Test() {
        driver.get("https://demoqa.com/buttons");
        MyFunc.Bekle(2);

        WebElement rightClickBtn=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));

        Actions aksiyonDriver=new Actions(driver);
        Action aksyion=aksiyonDriver.moveToElement(rightClickBtn).contextClick().build();
        aksyion.perform();

        //new Actions(driver).contextClick(rightClickBtn).build().perform();

        BekleKapat();
    }
}
