package Selenium;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

public class _38_RobotGiris extends BaseDriver {
    @Test
    public void Test() throws AWTException {
        driver.get("https://www.selenium.dev/");
        MyFunc.Bekle(2);

        //Klavyeden ctrl+tab a basarak yeni bir sekme açıp, başka sayfa çağıralım.
        // Bunu bu sefer ROBOT class la yapalım
        Robot robot=new Robot();

        //ctrl basıyorum sonra T ye basıp, sonra T yi ve CTRL tuşlarını bırakıyorum

        //Yeni pencere açalım
        robot.keyPress(KeyEvent.VK_CONTROL);  // klavye CTRL tuşuna bas  // KeyEvent.VK_META); Mac lerde CTRL
        robot.keyPress(KeyEvent.VK_T);  // tab tuşu
        robot.keyRelease(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        MyFunc.Bekle(2);

        //yeni açılamış olan TAB a geçelim
        Set<String> idler=driver.getWindowHandles();
        Iterator gosterge=idler.iterator(); // idlerin en başına konumlandı.
        gosterge.next(); // birinci id ye konumlandı
        String ikinciId=gosterge.next().toString(); // ikinci ID ye gitti toString diyereke değeri(ID) aldık

        driver.switchTo().window(ikinciId); //yeni penecereye geçiş yaptım

        driver.get("https://www.facebook.com/");

        MyFunc.Bekle(2);
        BekleKapat();
    }
}
