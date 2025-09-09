package Selenium;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _39_EkranKaydetme extends BaseDriver {
    @Test
    public void Test() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        MyFunc.Bekle(2);

//        WebElement username=driver.findElement(By.name("username"));
//        username.sendKeys("ismet");
        driver.findElement(By.name("username")).sendKeys("ismet");  //kısa yazılışı
        driver.findElement(By.name("password")).sendKeys("123");    //kısa yazılışı
        driver.findElement(By.cssSelector("button[type='submit']")).click();  //kısa yazılışı

        MyFunc.Bekle(2);

        List<WebElement> errorMsg=driver.findElements(By.xpath("//*[text()='Invalid credentials']"));
        if (errorMsg.size()>0) // hata mesajı çıkmış semektir
        {
            System.out.println("Hata oldu, ekran görüntüsünü alıyoruz");
            //ekran kaydını al

            TakesScreenshot ts=(TakesScreenshot)driver;
            File hafizadaDosyaHalinde =ts.getScreenshotAs(OutputType.FILE); // ekran kaydı aldı dosya tipi şeklinde

            // hafızadaki bu ekran görüntüsünü, fiziksel bir dosyaya yaz dememiz lazım
            FileUtils.copyFile(hafizadaDosyaHalinde, new File("/Users/mehmetdenizunlu/Desktop/SDET/SeleniumProject/src/test/java/EkranKaydi/hatagörseli.png"));

            // TODO :  Öyle bir şey yapınki her ekran kaydı , AYRI AYRI kaydedilsin. 2025_03_26_13_56
        }

        BekleKapat();
    }
}
