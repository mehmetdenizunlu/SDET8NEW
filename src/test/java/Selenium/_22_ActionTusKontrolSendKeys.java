package Selenium;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class _22_ActionTusKontrolSendKeys extends BaseDriver {

    @Test
    public void Test1() {
        driver.get("https://demoqa.com/auto-complete");

        WebElement txtBox = driver.findElement(By.id("autoCompleteSingleInput"));

        // txt a git, içine tıklat,b harfine bas, aşağı tuşa bas, enter a bas
        Actions aksiyonDriver = new Actions(driver);

        aksiyonDriver
                .moveToElement(txtBox)
                .click()
                .sendKeys("b")
                .build().perform();

        MyFunc.Bekle(2); //tuşa basıldığında seçeneklerin çıkması için bir süre gerekiyor

        aksiyonDriver
                .sendKeys(Keys.DOWN)
                .sendKeys(Keys.ENTER)
                .build()
                .perform();
        // ctrl+alt+l
        BekleKapat();
    }
}
