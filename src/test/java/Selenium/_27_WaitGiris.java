package Selenium;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _27_WaitGiris extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://letcode.in/waits");

        WebElement buton = driver.findElement(By.id("accept"));
        buton.click();

        MyFunc.Bekle(20); // Web sayfasından haberi yok sadece JAVA tarafını bekletiyor.
        // az veya çok fazla olabilir, yetersiz gelebilir veya zaman kaybı oluşturur
        driver.switchTo().alert().accept();  // alerti kapattım
        BekleKapat();
    }
}
