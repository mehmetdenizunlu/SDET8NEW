package Selenium;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class _41_Odev  extends BaseDriver {
    /*
    1-https://formsmarts.com/form/yu?mode=h5 sitesini açınız
    2-Personal use radio butonunu seçiniz
    3- How did you discover XYZ? altındaki search Engine'i seçiniz.
    4-Less Than One a Week i seçiniz
    5-Averge'i seçiniz.
    6-How long have you been using XYZ? altındaki I'm not using yet, but I will in the future seçeneğini seçin
    What is your favorite feature ? kısmına bir text girin
    css selector kullanarak senaryonuzu oluşturun .  Select tanımlı olan yerlerde seçimler için select kullanın

      locators :

     2- input[id='u_dh8_4586_1']
     3-  select[id='u_dh8_4588'] select locator , option[value='Search Engine'] seçilen locator.
     4- input[id='u_dh8_89585_2']
     5- input[id='u_dh8_4589_1']
     6- select[id='u_dh8_4597'] select locator ,  select[id='u_dh8_4597']>:nth-child(5)
    */

    @Test
    public void Test() {
        driver.get("https://formsmarts.com/form/yu?mode=h5");
        JavascriptExecutor js =(JavascriptExecutor)driver;

        WebElement radioCheck = driver.findElement(By.cssSelector("input[id='u_dh8_4586_1']"));
        radioCheck.click();

        System.out.println("seçilimi ? : " + radioCheck.isSelected());

        Assert.assertTrue(radioCheck.isSelected(),"checkbox seçilmedi.");

        WebElement firstSelect = driver.findElement(By.cssSelector("select[id='u_dh8_4588']"));
        Select firstMenu = new Select(firstSelect);
        firstMenu.selectByIndex(1);

        Assert.assertTrue(firstMenu.getOptions().get(1).getText().toLowerCase().contains("engine"));

        System.out.println("seçilen select texti :  ? : " + firstMenu.getOptions().get(1).getText());

        WebElement lessThanOneCheckBox = driver.findElement(By.cssSelector("input[id='u_dh8_89585_2']"));
        lessThanOneCheckBox.click();

        Assert.assertTrue(lessThanOneCheckBox.isSelected(),"Seçiminiz Seçili Değil");
        System.out.println("Less Than One seçili mi : " + lessThanOneCheckBox.isSelected());

        //averge kadar scroll yapılıcak.

        WebElement avergeCheckBox = driver.findElement(By.cssSelector("input[id='u_dh8_4589_1']"));

        js.executeScript("arguments[0].scrollIntoView(true);", avergeCheckBox );
        js.executeScript("arguments[0].click()",avergeCheckBox);

        Assert.assertTrue(avergeCheckBox.isSelected(),"Averge Check Box seçili depil !!");
        System.out.println("Averge seçili mi : " + avergeCheckBox.isSelected());

        WebElement secondSelect = driver.findElement(By.cssSelector("select[id='u_dh8_4597']"));
        Select secondMenu = new Select(secondSelect);
        secondMenu.selectByIndex(4);


        System.out.println("İkinci select seçili olan : " + secondMenu.getOptions().get(4).getText().toLowerCase());


        Assert.assertTrue(secondMenu.getOptions().get(4).getText().toLowerCase().contains("ı'm not using xyz yet, but ı will in the future"));

        WebElement textArea = driver.findElement(By.cssSelector("textarea[id='u_dh8_89597']"));
        textArea.sendKeys("Test Başarı İle Bitti Teşekkürlerrrrr :D :D :*");

        System.out.println("Gönderdiğimiz metin = " + textArea.getAttribute("value"));

        Assert.assertTrue(textArea.getAttribute("value").contains("Başarı") , "Gönderdiğimiz metin yazdırılmadı.");

        // NOT: Son yaptığımız kısımda textArea tagı var metme ulaşmak için getAttribure("value") olarak istek attık not ..
        BekleKapat();

    }
}
