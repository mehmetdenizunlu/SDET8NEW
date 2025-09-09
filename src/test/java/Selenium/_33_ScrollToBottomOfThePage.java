package Selenium;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class _33_ScrollToBottomOfThePage extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunc.Bekle(2);

        JavascriptExecutor js=(JavascriptExecutor)driver;

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); // tüm sayafı scroll
        MyFunc.Bekle(2);

        js.executeScript("window.scrollTo(0,0)"); // sayfanın başına git

        BekleKapat();
    }
}
