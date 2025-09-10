package Selenium;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class _43_Odev extends BaseDriver {
    /*
      1- https://testpages.herokuapp.com/styled/index.html sayfasına git.
      2-Calculator'e tıklayınız
      3-İlk inputa herhangi bir sayı giriniz.
      3-ikinci inputa herhangi bir sayı giriniz
      4-Select yardımı ile minus seçeneğini seçiniz
      5-Calculate butonuna tıklayınız
      6-Sonucu alınız
      7-Sonucu yazdırınız
      8-Ana sayfaya back ile gidiniz ve url ile doğrulama işlemi yapınız.

      Xpath ile lacotor bulma işlemi yapınız.
      

     */

    @Test
    public void Test() {
        driver.get("https://testpages.eviltester.com/styled/index.html");
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement calculatorButton = driver.findElement(By.xpath("//a[@id='calculatetest']"));
        js.executeScript("arguments[0].click();",calculatorButton);

        WebElement simpleCalculatorText = driver.findElement(By.xpath("//h1[text()='Simple Calculator']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBe(By.xpath("//h1[text()='Simple Calculator']"),"Simple Calculator"));

        Assert.assertTrue(simpleCalculatorText.getText().toLowerCase().contains("simple calculator") , "tıklandıktan sonra msj görünmüyor");

        WebElement firstInput = driver.findElement(By.xpath("//input[@id='number1']"));
        firstInput.sendKeys("30");

        WebElement secondInput = driver.findElement(By.xpath("//input[@id='number2']"));
        secondInput.sendKeys("20");

        WebElement selectMenu = driver.findElement(By.xpath("//select[@id='function']"));
        Select select = new Select(selectMenu);
        select.selectByValue("minus");

        String sayi1 = firstInput.getAttribute("value");
        String sayi2 = secondInput.getAttribute("value");

        int sayi1Int = Integer.parseInt(sayi1);
        int sayi2Int = Integer.parseInt(sayi2);

        int cikartma = sayi1Int-sayi2Int;


        System.out.println(sayi1);
        System.out.println(sayi2);

        WebElement calculator = driver.findElement(By.xpath("//input[@id='calculate']"));
        calculator.click();

        WebElement answer = driver.findElement(By.xpath("//span[@id='answer']"));
        System.out.println("Sonuc : "+answer.getText());

        String answerVeri = answer.getText();
        int answerVeriInt = Integer.parseInt(answerVeri);

        if (cikartma==answerVeriInt) {
            System.out.println("İşlem doğrudur.");
        } else {
            System.out.println("işlem yanlış yapılmıştır.");
        }





        MyFunc.Bekle(4);


        BekleKapat();

    }
}
