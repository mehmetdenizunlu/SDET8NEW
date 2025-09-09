package Selenium;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class _09_FindingElements_tag extends BaseDriver {

    @Test
    public void FindingElements_tagTest() {
        driver.get("https://www.hepsiburada.com/");

        List<WebElement> linkler=driver.findElements(By.tagName("a"));

        for (WebElement link:linkler)
            if (!link.getText().equals(""))
                System.out.println("link.getText() = " + link.getText());

        BekleKapat();
    }
}
