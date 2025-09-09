package Selenium;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.testng.annotations.Test;

public class _01_OpeningWebsite extends BaseDriver {
   @Test
    public void Test() {
       driver.get("https://www.google.com/");
       MyFunc.Bekle(10);
       driver.quit();
   }
}
