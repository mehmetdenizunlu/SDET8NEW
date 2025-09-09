package Selenium;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

public class _37_WindowYeni extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://www.selenium.dev/");
        MyFunc.Bekle(2);

        driver.switchTo().newWindow(WindowType.TAB); // yeni BOŞ sekme açar.
        //şu anda yeni boş sayfadayım
        driver.get("https://www.facebook.com/");

        MyFunc.Bekle(2);
        BekleKapat();
    }
}
