package stepdef;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SignupStepDefs {
    @And("^enter the cred$")
    public void enterTheCred() {
    }

    @When("^user is clicking on signup button$")
    public void userIsClickingOnSignupButton() {
        System.out.println("user is clicking on signup button");
    }

    @Then("^user should be able to signup successfully$")
    public void userShouldBeAbleToSignupSuccessfully() {System.out.println("user should be able to signup successfully");}

    @When("^user is clicking on signup link$")
    public void userIsClickingOnSignupLink() {
        System.out.println("user is clicking on signup link");
    }

    @Then("^use should see error message for mandatory fields$")
    public void useShouldSeeErrorMessageForMandatoryFields() {System.out.println("use should see error message for mandatory fields");}

    @And("^click n sign up link$")
    public void clickNSignUpLink() {
        System.out.println("click n sign up link");
    }

    @And("^enter name and password$")
    public void enterNameAndPassword() {
        System.out.println("enter name and password");
    }

    @Then("^user should see error message for invalid email$")
    public void userShouldSeeErrorMessageForInvalidEmail() {System.out.println("user should see error message for invalid email");}

    @And("^enter name$")
    public void enterName() {
        System.out.println("enter name");
    }

    @And("^enter email$")
    public void enterEmail() {
        System.out.println("enter email");
    }

    @And("^enter password$")
    public void enterPassword() {
        System.out.println("enter password");
    }

    @And("^enter wrong confirm password$")
    public void enterWrongConfirmPassword() {
        System.out.println("enter wrong confirm password");
    }

    @When("^user is clicking on signup$")
    public void userIsClickingOnSignup() {
        System.out.println("user is clicking on signup");
    }

    @Then("^user should see password mismatched message$")
    public void userShouldSeePasswordMismatchedMessage() {System.out.println("user should see password mismatched message");}
    @And("^click on sign up link$")
    public void clickOnSignUpLink() {
        System.out.println("click on sign up link");
    }

    @And("^enter an already registered email$")
    public void enterAnAlreadyRegisteredEmail() {
        System.out.println("enter an already registered email");
    }

    @When("^user uses an already existing email$")
    public void userUsesAnAlreadyExistingEmail() {
        System.out.println("user uses an already existing email");
    }

    @Then("^user should see email already exist email$")
    public void userShouldSeeEmailAlreadyExistEmail() {System.out.println("user should see email already exist email");}

    @Then("^user should be directed to login page$")
    public void userShouldBeDirectedToLoginPage() {
        System.out.println("user should be directed to login page");
    }

    @Then("^user should not be able to press it$")
    public void userShouldNotBeAbleToPressIt() {
        System.out.println("user should not be able to press it");
    }

    @When("^user signup successfully$")
    public void userSignupSuccessfully() {
        System.out.println("user signup successfully");
    }

    @Then("^user should Recieve email$")
    public void userShouldRecieveEmail() {
        System.out.println("user should recieve email");
    }

    @And("^enter space in textFields$")
    public void enterSpaceInTextFields() {
        System.out.println("enter space in textFields");
    }

    @Then("^user should see a error message$")
    public void userShouldSeeAErrorMessage() {
        System.out.println("user should see a error message");
    }

    @And("^enter a long password$")
    public void enterALongPassword() {
        System.out.println("enter a long password");
    }

    @And("^enter confirm password$")
    public void enterConfirmPassword() {
        System.out.println("enter confirm password");
    }

    @And("click on signup link")
    public void clickOnSignupLink() {
        System.out.println("click on signup link");
    }
}




























