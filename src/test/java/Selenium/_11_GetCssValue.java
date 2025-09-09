package Selenium;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _11_GetCssValue extends BaseDriver {

    @Test
    public void GetCssValueTest(){
        driver.get("https://www.snapdeal.com/");
        WebElement aramaKutusu=driver.findElement(By.id("inputValEnter"));

        // Şekillendiren özellikleri, renk, fontu, background yani class ın içindekiler
        System.out.println("aramaKutusu.getCssValue(color) = " + aramaKutusu.getCssValue("color"));
        System.out.println("aramaKutusu.getCssValue(font-size) = " + aramaKutusu.getCssValue("font-size"));
        System.out.println("aramaKutusu.getCssValue(height) = " + aramaKutusu.getCssValue("height"));
        System.out.println("aramaKutusu.getCssValue(font-family) = " + aramaKutusu.getCssValue("font-family"));

        BekleKapat();
    }
}
