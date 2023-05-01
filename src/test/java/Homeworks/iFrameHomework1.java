package Homeworks;

import Utilities.Base;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class iFrameHomework1 extends Base {
    //https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidiniz.
    //Web sitesini maximize yapınız.
    //İkinci emojiye tıklayınız.
    //Tüm ikinci emoji öğelerine tıklayınız.
    //Parent iframe geri dönünüz.
    //Formu doldurun (Formu istediğiniz metinlerle doldurun) apply button’a basınız

    @Test
    public void test01(){
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

        WebElement emojiFrame= driver.findElement(By.xpath("//iframe[@id='emoojis']"));
        driver.switchTo().frame(emojiFrame);

        driver.findElement(By.xpath("//a[@href='#nature']")).click();

        driver.switchTo().defaultContent();

        //tüm ikinci emojiler derken?

        driver.findElement(By.id("text")).sendKeys("hello guyz");
        driver.findElement(By.id("smiles")).sendKeys("what a big smile");
        driver.findElement(By.id("nature")).sendKeys("the bee");
        driver.findElement(By.id("food")).sendKeys("cake");
        driver.findElement(By.id("activities")).sendKeys("reading");
        driver.findElement(By.id("places")).sendKeys("home");
        driver.findElement(By.id("objects")).sendKeys("book");
        driver.findElement(By.id("flags")).sendKeys("Switzerland");
        driver.findElement(By.xpath("//button[@id='send']")).click();


    }
}
