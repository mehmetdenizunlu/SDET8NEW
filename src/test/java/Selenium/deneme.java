package Selenium;

import Utlity.BaseDriver;
import org.testng.annotations.Test;

public class deneme extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://github.com/mehmetdenizunlu?tab=repositories");
        BekleKapat();
    }
}
