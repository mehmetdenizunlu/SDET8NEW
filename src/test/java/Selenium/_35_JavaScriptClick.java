package Selenium;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _35_JavaScriptClick extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://demo.automationtesting.in/Frames.html");

        WebElement ciftFrameLink= driver.findElement(By.xpath("//a[@href='#Multiple']"));
        //ciftFrameLink.click();  //öne consent çıktığından tıklatamadı

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", ciftFrameLink);  // içerden kod ile tıklatıldı

        BekleKapat();
    }
}
