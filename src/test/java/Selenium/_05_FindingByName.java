package Selenium;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class _05_FindingByName extends BaseDriver {

    @Test
    public void FindingByNameTest(){
        // Senaryo: (locator olarak name kullanılacak)
        // 1-  https://form.jotform.com/221934510376353  sayfasınız açınız
        // 2-  isim kutucuğuna "Mehmet" yazdırınız
        // 3-  soyad kutucuğuna "Deniz" yazdırınız

        driver.get("https://form.jotform.com/221934510376353");

        WebElement ad=driver.findElement(By.name("q8_name[first]"));
        ad.sendKeys("Mehmet");

        WebElement soyad=driver.findElement(By.name("q8_name[last]"));
        soyad.sendKeys("Deniz");

        BekleKapat();

    }
}
