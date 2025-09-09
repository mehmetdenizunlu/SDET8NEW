package Selenium;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _31_IFrameGiris extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://demo.automationtesting.in/Frames.html");

        // driver.switchTo().frame(0);  // index ile geçmek sırasına göre geçilebilir
        driver.switchTo().frame("singleframe");  // id vena name yazılarak geçilebilir

        //WebElement iframe1=driver.findElement(By.id("singleframe"));
        //driver.switchTo().frame(iframe1); // webElement olarak da geçilebilir
        //index > webelement> name > id    geçiş hız farkı

        WebElement yaziKutusu=driver.findElement(By.xpath("//input[@type='text']"));
        yaziKutusu.sendKeys("Merhaba");
        // bu noktada hangi sayfanın içindeydim.
        // bu noktada iken herzaman ifram in içind elocator bulacaktır.

        // ya bir adım geri gel diyeceğiz. ya da direk ana sayfaya git diyebiliyoruz
        //driver.switchTo().parentFrame(); // bir geri gel   : burada ana sayfaya dönmüş olursun
        driver.switchTo().defaultContent(); // direk ana sayafa gider.

        BekleKapat();
    }
}
