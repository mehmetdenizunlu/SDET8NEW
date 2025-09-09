package Selenium;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

public class _40_WindowSize extends BaseDriver {
    @Test
    public void Test() {
        driver.get("https://www.youtube.com/");
        MyFunc.Bekle(5);

        driver.manage().window().maximize(); // ekranı max yapar
        Dimension ekranBoyutu=driver.manage().window().getSize();
        System.out.println("ekranBoyutu.width = " + ekranBoyutu.width);
        System.out.println("ekranBoyutu.height = " + ekranBoyutu.height);
        MyFunc.Bekle(2);

        Dimension yeniBoyut=new Dimension(516, 600);
        driver.manage().window().setSize(yeniBoyut);
        //testler e devam ediyorum

        BekleKapat();
    }
}
