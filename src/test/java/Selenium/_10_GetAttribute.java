package Selenium;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _10_GetAttribute extends BaseDriver {

    @Test
    public void _10_GetAttributeTest() {
        driver.get("https://form.jotform.com/221934510376353");

        WebElement element=driver.findElement(By.id("sublabel_8_first"));

        System.out.println("element.getAttribute(class) = " + element.getAttribute("class"));
        System.out.println("element.getAttribute(for) = " + element.getAttribute("for"));
        System.out.println("element.getAttribute(id) = " + element.getAttribute("id"));
        System.out.println("element.getAttribute(style) = " + element.getAttribute("style"));

        BekleKapat();
    }
}
