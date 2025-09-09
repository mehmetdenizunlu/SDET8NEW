package Selenium;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _04_WebElementGetText  extends BaseDriver {

    @Test
    public void WebElementGetTextTest() {
        driver.get("https://form.jotform.com/221934510376353");

        WebElement labelFirstName=driver.findElement(By.id("sublabel_8_first"));
        String elementinGorunenYazisi=labelFirstName.getText();
        // getText() -> WebElemntin ekranda gözüken yazısını verir
        System.out.println("elementinGorunenYazisi = " + elementinGorunenYazisi);

        WebElement labelLastName=driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labelLastName.getText() = " + labelLastName.getText());

        BekleKapat();
    }
}
