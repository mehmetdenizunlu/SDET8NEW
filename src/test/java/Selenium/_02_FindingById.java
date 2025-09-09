package Selenium;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _02_FindingById extends BaseDriver {

    @Test
    public void FindingByIdTest() {
        driver.get("https://form.jotform.com/221934510376353");

        WebElement isimKutusu= driver.findElement(By.id("first_8")); // first_8 id ile elemanı bul
        isimKutusu.sendKeys("Mehmet Deniz");  // sendkeys: yazı gönder

        WebElement soyadKutusu= driver.findElement(By.id("last_8")); // last_8 id ile elemanı bul
        soyadKutusu.sendKeys("ÜNLÜ");

        BekleKapat();

    }
}
