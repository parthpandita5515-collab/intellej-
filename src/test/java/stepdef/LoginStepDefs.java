package stepdef;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefs extends TestBase {

    @Given("^open the browser$")
    public void openTheBrowser() {
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
    }

    @And("^enter the url$")
    public void enterTheUrl() {
        driver.get("https://www.facebook.com/");
    }

    @And("^enter the credentials$")
    public void enterTheCredentials() {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("qweerrr@gmail.com");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("qwert");
    }

    @When("^user is clicking on login button$")
    public void userIsClickingOnLoginButton() {
        driver.findElement(By.xpath("//span//span[contains(text(),'Log in')]")).click();
    }

    @Then("^user should be able to navigate to homepage$")
    public void userShouldBeAbleToNavigateToHomepage() {
        System.out.println("user should be able to navigate to homepage");

    }

    @Then("close the browser")
    public void closeTheBrowser() {
        driver.quit();
    }

    @Given("enter the username and password")
    public void enterTheUsernameAndPassword() {
        driver.findElement(By.xpath("//input[@name='customer[email]']")).sendKeys("blaaaa@gmail.com");
        driver.findElement(By.xpath("//input[@name='customer[password]']")).sendKeys("boat");
    }

    @Then("clicking on login button")
    public void clickingOnLoginButton() {
        driver.findElement(By.xpath("//input[@value='Sign In']")).click();
    }

    @Given("click on login tab")
    public void clickOnLoginTab() {
        driver.findElement(By.xpath("//div//nav//a[contains(text(),'Log In')]")).click();
    }

    @Then("verify the title of the page {string}")
    public void verifyTheTitleOfThePage(String arg0) {
        driver.findElement(By.xpath("")).click();
    }

    @Given("click on the catalog")
    public void clickOnTheCatalog() {
     driver.findElement(By.xpath("//div//nav//a[contains(text(),'Catalog')]")).click();
    }

    @Then("choose a product")
    public void chooseAProduct() {
      driver.findElement(By.xpath("//img[@alt='Black heels']")).click();
    }

    @Then("add to cart the product")
    public void addToCartTheProduct() {
        driver.findElement(By.xpath("//div//input[@value='Add to Cart']")).click();
    }

    @Then("user should be able to check the cart details {string}")
    public void userShouldBeAbleToCheckTheCartDetails(String arg0) {
      driver.findElement(By.xpath(""));
    }

    @Then("Validate the numbering on My Cart on clicking on Add to Cart button {string}")
    public void validateTheNumberingOnMyCartOnClickingOnAddToCartButton(String expectedTitle) {
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
   }

    @When("click on checkout button")
    public void clickOnCheckoutButton() {
        driver.findElement(By.xpath("//div//input[@value='Check Out']")).click();
    }

    @Then("Validate the title of checkout page {string}")
    public void validateTheTitleOfCheckoutPage(String arg0) {
        driver.findElement(By.xpath(""));
    }

    @When("User is clicking on checkout button")
    public void userIsClickingOnCheckoutButton() {
       driver.findElement(By.xpath("//div//input[@name='checkout']")).click();
    }

    @Then("Validate the title of Contact detail and payment page {string}")
    public void validateTheTitleOfContactDetailAndPaymentPage(String arg0) {
        driver.findElement(By.xpath(""));
    }

    @When("User is entering Contact Detail and Payment Detail")
    public void userIsEnteringContactDetailAndPaymentDetail() {
      driver.findElement(By.xpath("//div//input[@name='email']")).sendKeys();
      driver.findElement(By.xpath("//div//input[@name='firstName']")).sendKeys();
      driver.findElement(By.xpath("//div//input[@placeholder='Last name']")).sendKeys();
      driver.findElement(By.xpath("//div//input[@placeholder='Company (optional)']")).sendKeys();
      driver.findElement(By.xpath("//div//input[@placeholder='Address']")).sendKeys();
      driver.findElement(By.xpath("//div//input[@placeholder='Apartment, suite, etc. (optional)']")).sendKeys();
      driver.findElement(By.xpath("//div//input[@placeholder='City']")).sendKeys();
      driver.findElement(By.xpath("//input[@placeholder='PIN code']")).sendKeys("gf");
    }

    @And("Click on Pay Now button")
    public void clickOnPayNowButton() {
        driver.findElement(By.xpath(""));
    }

    @Then("click on add cart")
    public void clickOnAddCart() {
        driver.findElement(By.xpath("//div//a[@class='toggle-drawer cart desktop 'and contains(text(),'My Cart ')]")).click();
    }
}
