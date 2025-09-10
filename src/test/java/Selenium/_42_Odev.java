package Selenium;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class _42_Odev extends BaseDriver {
    /*
    1-https://demo.applitools.com/
    2-Username : "tester@gmail.com"   //input[@id='username']
    3-Password : "test1234"          //input[@id='password']
    4-Seign in buttonuna tıklayınız.   //a[@id='log-in']
    5- Your nearest branch closes in : 30m 5s yazısını göründüğünü doğrulayınız.
    ilgili locatorları cssSelector kullanarak ve sibling, child özelliklerini kullanarak bulunuz.

     */

    @Test
    public void Test() {

        driver.get("https://demo.applitools.com/");
        WebElement userName = driver.findElement(By.xpath("//input[@id='username']"));
        userName.sendKeys("tester@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("test1234");

        WebElement seignButton = driver.findElement(By.xpath("//a[@id='log-in']"));
        seignButton.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h6[@id='time']"))));

        WebElement dogrulamaMsj = driver.findElement(By.xpath("//h6[@id='time']"));
        System.out.println("Dogrulama Mesaji : " + dogrulamaMsj.getText());

        Assert.assertTrue(dogrulamaMsj.getText().toLowerCase().contains("your") , "Mesaj görünemedi..");

        BekleKapat();
    }
}
