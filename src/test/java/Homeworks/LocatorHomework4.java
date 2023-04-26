package Homeworks;

import Utilities.Base;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorHomework4 extends Base {
    //https://id.heroku.com/login sayfasına gidiniz.
    //Bir mail adresi giriniz.
    //Bir password giriniz.
    //Login butonuna tıklayınız.
    //"There was a problem with your login." text görünür ise "Kayıt Yapılamadı" yazdırınız.
    //Eğer yazı görünür değilse "Kayıt Yapıldı" yazdırınız.
    //Tüm sayfaları kapatınız.

    @Test
    public void locator4(){
        driver.get("https://id.heroku.com/login");
        WebElement mailContent= driver.findElement(By.xpath("//input[@id='email']"));
        mailContent.sendKeys("gulertuzuner@gmail.com");
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("325632");
        driver.findElement(By.xpath("//button[@name='commit']")).click();

        System.out.println(driver.findElement(By.xpath("//div[@class=\"alert alert-danger\"]"))
                           .getText().equals("There was a problem with your login.") ? "Kayıt yapılamadı" : "Kayıt işlemi başarılı");

        driver.quit();


    }
}
