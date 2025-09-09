package Selenium;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _03_FindingByIdNotFoundException extends BaseDriver {

    @Test
    public void FindingByIdNotFoundExceptionTest() {
        driver.get("https://form.jotform.com/221934510376353");

        try {
            WebElement isimKutusu=driver.findElement(By.id("hataliLocator"));
        }
        catch (Exception ex)
        {
            System.out.println("Web element bulunamadı : " + ex.getMessage());
        }

        // Herhangi bir hata alabilceğimiz noktayı try catch arasına alıyoruz kodu kırmasın diye

        BekleKapat();
    }
}
