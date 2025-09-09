package Selenium;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class _36_WindowsGiris extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://www.selenium.dev/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        MyFunc.Bekle(2);

        String anasayfaWindowID=driver.getWindowHandle();  //bulunduğumm window un(Tab) id sini ver
        System.out.println("anasayfaWindowID = " + anasayfaWindowID);

        //linklere tıklatalım
        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));

        for(WebElement e: linkler)
            js.executeScript("arguments[0].click();", e);

        Set<String> windowsIDler= driver.getWindowHandles(); //bütün tabların İD sini ver
        for (String id: windowsIDler)
            System.out.println("id = " + id);

        // bu noktada en son açılan link tabı aktif
        // Peki ilk sayafa nasıl geçiş yaparım ?

        driver.switchTo().window(anasayfaWindowID); // Ana sayafa geçiş yaptım

        BekleKapat();
    }

    @Test
    public void WindowsSoru() {
        /*
    Senaryo:
    https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
    Açılan bütün yeni tablardaki sayfaların title ve url lerini yazdırınız.
    Daha sonra Anasayfa harici diğer tüm sayfaları kapatınız.
 */

        driver.get("https://www.selenium.dev/");
        MyFunc.Bekle(2);

        String anasayfaID=driver.getWindowHandle();

        JavascriptExecutor js=(JavascriptExecutor)driver;

        List<WebElement> linkler=driver.findElements(By.cssSelector("a[target='_blank']"));
        for(WebElement e: linkler) {
            if (e.getAttribute("href").contains("mail")) continue;
            js.executeScript("arguments[0].click();", e);
        }

        Set<String> windowsIDler= driver.getWindowHandles();
        for (String id: windowsIDler)
        {
            try {
                driver.switchTo().window(id);  // ilgili window a geçtik
                System.out.println(driver.getTitle()+" - "+driver.getCurrentUrl());
            }
            catch(Exception ex)
            {
                System.out.println("ex.getMessage() = " + ex.getMessage());
            }
        }


        for(String id: windowsIDler)
        {
            try {
                if (id.equals(anasayfaID)) continue;

                driver.switchTo().window(id);
                driver.close();  // bulunduğum pencereyi kapat
            }
            catch(Exception ex)
            {
            }
        }

        BekleKapat();
    }
}
