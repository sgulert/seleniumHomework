package Homeworks;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class LocatorHomework3 extends Base {
    @Test
    public void locatorHomework3(){
        //Navigate to website  https://testpages.herokuapp.com/styled/index.html
        //Under the ORIGINAL CONTENTS
        //Click on Alerts
        //Print the URL
        //Navigate back
        //Print the URL
        // Click on Basic Ajax
        //Print the URL
        //Enter value 20 and Enter
        //And then verify Submitted Values is displayed open page
        //Close driver.
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement alerts= driver.findElement(By.xpath("//a[@id='alerts']"));
        alerts.click();
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.navigate().back();
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        WebElement basicajax= driver.findElement(By.xpath("//a[@id='basicajax']"));
        basicajax.click();
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        WebElement values= driver.findElement(By.xpath("//input[@type='submit']"));
        values.sendKeys("20"+ Keys.ENTER);

        WebElement check = driver.findElement(By.xpath("//p[text()='Submitted Values']"));
        Assert.assertEquals(check.getText(), "Submitted Values");

        driver.quit();



    }

}
