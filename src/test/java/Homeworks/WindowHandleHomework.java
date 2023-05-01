package Homeworks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WindowHandleHomework extends Base {
    //Go to URL: https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/
    //Print the existing windowHandles ids by clicking all the links on the page.
    //Click on the links that open a new page.
    //Close other pages other than the home page.
    //Set the driver back to the main page.

    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.toolsqa.com/selenium-webdriver/window-handle-in-selenium/");

        ChromeOptions options= new ChromeOptions();
        options.addArguments("disable-popup-blocking");

        String homePageID= driver.getWindowHandle();

        List<WebElement> links = driver.findElements(By.xpath("//a[@target='_blank']"));
        System.out.println("links.size()=" + links.size());
        for (int i = 0; i <4 ; i++) {
            links.get(i).click();
        }
        Set<String> windows= driver.getWindowHandles();
        System.out.println("windows = " + windows);

        Iterator<String> iterator= windows.iterator();//gezinme için iterator obj oluşturuldu

        while (iterator.hasNext()){
            driver.switchTo().window(iterator.next());

            if (driver.getWindowHandle().equals(homePageID)){
                continue;
            }
            Thread.sleep(2000);
            driver.close();
        }





    }

}
