package Selenium;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class _07_FindElementVeFindElements extends BaseDriver {
    @Test
    public void FindElementVeFindElementsTest(){
        // Browserda incele yaptığınızda id lerden aramalar için #, class aramalar için . konabilir.


        driver.get("https://form.jotform.com/221934510376353");

        //WebElement element1=driver.findElement(By.id("hataliLocator"));
        // no such element: element bulunamadı

        List<WebElement> elementler=driver.findElements(By.id("hataliLocator"));
        System.out.println("elementler.size() = " + elementler.size());
        // findElements locator hatalı ise hata vermez boş list gönderir

        BekleKapat();
    }
}
