package stepdef;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    public static WebDriver driver;
    public void openBrowser(){
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.get("https://sauce-demo.myshopify.com/");
       driver.manage().window().maximize();
    }

    public void closeBrowser(){
       driver.quit();
    }
}
