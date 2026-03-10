package salenium.test;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class Seln {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("search_query")));
        searchBox.sendKeys("la la la");
        searchBox.sendKeys(Keys.ENTER);
        WebElement video = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("(//ytd-video-renderer//a[@id='video-title'])[1]")));
        video.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("video")));
        for (int i = 0; i < 10; i++) {
            try {
                WebDriverWait adWait = new WebDriverWait(driver, Duration.ofSeconds(20));

                WebElement skipButton = adWait.until(
                        ExpectedConditions.elementToBeClickable(
                                By.cssSelector("button.ytp-ad-skip-button")));
                skipButton.click();
                System.out.println("Ad skipped!");
            } catch (Exception e) {
                System.out.println("No skippable ad found.");}}
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('video').playbackRate = 1.5;");
        js.executeScript(
                "var player = document.getElementById('movie_player');" +
                        "if(player){ player.setPlaybackQuality('hd1080'); }");
        System.out.println("Video playing at 1.5x and 1080p (if available)");
        Thread.sleep(30000);
        driver.quit();
    }
}