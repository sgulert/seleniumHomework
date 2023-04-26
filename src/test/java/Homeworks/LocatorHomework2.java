package Homeworks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorHomework2 extends Base {
    @Test
    public void locatorTest() throws InterruptedException {
        //Go to http://www.google.com
        //Type "Green Mile" in the search box and print the number of results.
        //Type "Premonition" in the search box and print the number of results.
        //Type "The Curious Case of Benjamin Button" in the search box and print the number of results.

        driver.get("http://www.google.com");
        WebElement searchBox= driver.findElement(By.xpath("//textarea[@title='Ara']"));
        searchBox.sendKeys("Green Mile");
        WebElement searchButton= driver.findElement(By.xpath("(//input[@name='btnK'])[1]"));
        searchButton.click();
        WebElement howManyResults= driver.findElement(By.xpath("//div[@id='result-stats']"));
        System.out.println("howManyResults = " + howManyResults.getText());

        WebElement searchBox1= driver.findElement(By.xpath("//textarea[@aria-label='Ara']"));

        searchBox1.click();
        searchBox1.clear();
        searchBox1.sendKeys("Premonition");

        WebElement searchButton1=driver.findElement(By.xpath("//button[@aria-label='Ara']"));
        searchButton1.click();
        WebElement howManyResults1= driver.findElement(By.xpath("//div[@id='result-stats']"));
        System.out.println("howManyResults = " + howManyResults1.getText());

        WebElement searchBox2= driver.findElement(By.xpath("//textarea[@aria-label='Ara']"));
        searchBox2.click();
        searchBox2.clear();
        searchBox2.sendKeys("The Curious Case of Benjamin Button");

        WebElement searchButton2=driver.findElement(By.xpath("//button[@aria-label='Ara']"));
        searchButton2.click();
        WebElement howManyResults2= driver.findElement(By.xpath("//div[@id='result-stats']"));
        System.out.println("howManyResults1.getText() = " + howManyResults2.getText());


    }

}
