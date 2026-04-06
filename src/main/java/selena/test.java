package selena;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://www.facebook.com/");
        driver.findElements(By.xpath("//a"));
//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("qweerrr@gmail.com");
//        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("qwert");
//        driver.findElement(By.xpath("//span//span[contains(text(),'Log in')]")).click();
          }
}