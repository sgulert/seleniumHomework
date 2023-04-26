package Homeworks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;

public class LocatorHomework5 extends Base {
    //Navigate to https://testpages.herokuapp.com/styled/indx.html
    //Click on Calculate under Micro Apps.
    //Type any number in the first input.
    //Type any number in the second input.
    //Click on Calculate.
    //Get the result.
    //Print the result.

    @Test
    public void locatorHomework5(){
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.xpath("//a[@id='calculatetest']")).click();
        driver.findElement(By.xpath("//input[@id='number1']")).sendKeys("1881");
        driver.findElement(By.xpath("//input[@id='number2']")).sendKeys("57");
        driver.findElement(By.xpath("//input[@id='calculate']")).click();
        System.out.println("The answer is" + driver.findElement(By.id("answer")).getText());


    }


}
