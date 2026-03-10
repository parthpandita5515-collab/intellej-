package salenium.test;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class Selln {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.youtube.com/");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement searchBox = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("search_query"))
        );
        searchBox.sendKeys("la la la");
        searchBox.sendKeys(Keys.ENTER);
        WebElement firstVideo = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("(//ytd-video-renderer//a[@id='video-title'])[1]")
                )
        );
        firstVideo.click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("video")));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < 15; i++) {

            Boolean adPlaying = (Boolean) js.executeScript(
                    "return document.getElementById('movie_player').classList.contains('ad-showing');"
            );
            try {
                WebDriverWait adWait = new WebDriverWait(driver, Duration.ofSeconds(6));

                WebElement skipButton = adWait.until(
                        ExpectedConditions.elementToBeClickable(
                                By.xpath("//button[contains(@class,'skip')]")
                        )
                );

                skipButton.click();
                System.out.println("Ad skipped!");

            } catch (Exception e) {
                System.out.println("No skippable ad.");
            }
            if (adPlaying) {
                js.executeScript("document.querySelector('video').muted = true;");
                System.out.println("Ad detected and muted!");

                try {
                    WebElement skipAd = driver.findElement(
                            By.cssSelector("ytp-ad-skip-button-modern")
                    );
                    if (skipAd.isDisplayed()) {
                        skipAd.click();
                        System.out.println("Ad skipped!");
                    }
                } catch (Exception ignored) {}

            } else {
                js.executeScript("document.querySelector('video').muted = false;");
                break;
            }

            Thread.sleep(2000);
        }
        js.executeScript("document.querySelector('video').playbackRate = 1.5;");
        js.executeScript(
                "var player = document.getElementById('movie_player');" +
                        "if(player){ player.setPlaybackQuality('hd1080'); }");

        System.out.println("Video playing at 1.5x speed");

        while (true) {

            Boolean ended = (Boolean) js.executeScript("return document.querySelector('video').ended;");

            if (ended) {
                System.out.println("Video ended!");
                break;
            }

            Thread.sleep(3000);
        }
        WebElement firstRecommended = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("(//ytd-compact-video-renderer//a[@id='video-title'])[1]")));
        firstRecommended.click();
        System.out.println("Playing first recommended video!");
        Thread.sleep(30000);
        driver.quit();
    }
}