package Selenium;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class _15_ActionClick extends BaseDriver {
    @Test
    public void Test() {
        driver.get("http://demoqa.com/buttons");
        MyFunc.Bekle(2);

        WebElement btnClickMe=driver.findElement(By.xpath("//button[text()='Click Me']"));
        // btnClickMe.click();

        Actions aksiyonlar=new Actions(driver); // web sayfası aksiyonlara açıldı.
        Action aksiyon= aksiyonlar.moveToElement(btnClickMe).click().build();
        // elementin üzerin click için git orda bekle.aksiyonu hazırla.
        System.out.println("Aksyion hazırlandı");

        MyFunc.Bekle(2);
        aksiyon.perform(); // aksiyon gerçekleşiyor. işleme al, uygula.

        //kısa hali
        //aksiyonlar.moveToElement(btnClickMe).click().build().perform();  // çok aksiyon için

        //daha kısa hali
        //new Actions(driver).moveToElement(btnClickMe).click().build().perform(); // tek bir aksiyon

        // daha da kısa hali
        //new Actions(driver).click(btnClickMe).build().perform(); // tek bir aksiyon

        BekleKapat();
    }
}
