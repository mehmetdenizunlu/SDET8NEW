package Selenium;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class _32_Scrollintro extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunc.Bekle(2);

        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,500)"); // dikey yönde 500 pixel baştan kaydır
        MyFunc.Bekle(2);

        js.executeScript("window.scrollBy(0,500)"); // bulunduğu yerden 500 scroll ileri
        MyFunc.Bekle(2);

        js.executeScript("window.scrollBy(0,-200)"); // bulunduğu yerden 200 geri scroll

        BekleKapat();
    }
}
