package Selenium;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class _29_ExplicitWait extends BaseDriver {

    @Test
    public void Test() {
        // element var ama tıklanabilir olana kadar beklemem gereken durumlar
        // element var ama içine yazı gönderilebilr durumda değil
        // alert in gözükmesini bekle
        // url beklediğin olana kadar bekle
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn=driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        btn.click();

        WebElement msj=driver.findElement(By.id("demo"));
        // yukarıdaki elemanın görünen yazısı WebDriver olana kadar bekle
        WebDriverWait beklemeSuresi=new WebDriverWait(driver, Duration.ofSeconds(120)); //driverı 20 bekletme süresi

        beklemeSuresi.until(ExpectedConditions.textToBe(By.id("demo"),"WebDriver"));
        //verilen locator ın görünen yazısı WebDriver olana kadar bekle
        System.out.println("msj.getText() = " + msj.getText());

        // WebDriver yazmasını istiyorum

        BekleKapat();
    }
}
