package Selenium;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class _20_DragAndDropBy extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
        MyFunc.Bekle(2);

        List<WebElement> consentButton = driver.findElements(By.xpath("//p[text()='Consent']"));
        if (consentButton.size() > 0)  // bu element var ise ekranda
            consentButton.get(0).click();

        Actions aksiyonDriver = new Actions(driver);

        WebElement solSurgu = driver.findElement(By.xpath("//div[@id='slider-range']/span[1]"));
        aksiyonDriver.dragAndDropBy(solSurgu, 50, 0).build().perform();
        // yatay yönde 100 ileri, dikey yönde 0 hareket
        // + değer girdiğimizde sağa dogru, - değer girdiğimizde sola dogru kaydırıyor

        WebElement sagSurgu = driver.findElement(By.xpath("//div[@id='slider-range']/span[2]"));
        aksiyonDriver.dragAndDropBy(sagSurgu, -50, 0).build().perform();

        BekleKapat();
        // TODO:sol sürgü 200$ , sağ sürgüyü 400$ a getiriniz.
//        int genislik=cubuk.getSize().width;  500$
//        (genislik/500)*200  -> sol sürgü için verilecek miktar
        // isteyen de mediamarket dekileri yapsın
    }
}
