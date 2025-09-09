package Selenium;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _34_ScrollToWebElement extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://www.selenium.dev/selenium/web/scrolling_tests/frame_with_nested_scrolling_frame_out_of_view.html");
        MyFunc.Bekle(2);

        JavascriptExecutor js=(JavascriptExecutor)driver;

        WebElement iframe=driver.findElement(By.name("nested_scrolling_frame"));

        js.executeScript("arguments[0].scrollIntoView();", iframe); // elemente kadar kaydır

        BekleKapat();
    }
}
