package stepdefinitions;

import co.com.screenplay.questions.*;
import co.com.screenplay.tasks.CancelButtonForgotPasswordTask;
import co.com.screenplay.tasks.ForgotPasswordTask;
import co.com.screenplay.tasks.LoginTask;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.steps.StepEventBus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static co.com.screenplay.ui.ValidateMessageIncorrectPage.INCORRECT_MESSAGE_CREDENTIALS;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.drawTheCurtain;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.CoreMatchers.containsString;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class LoginStepDefinitions {
    private Actor user;
    private WebDriver driver;

    /*@Before
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //user = Actor.named("User").whoCan(BrowseTheWeb.with(driver));


    }*/
  /* @After
    public void tearDown(){
        if(driver !=null){
            driver.quit();

        }
    }*/

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User").wasAbleTo(Open.url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));

        //driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("they log in with username {string} and password {string}")
    public void they_log_in_with_username_and_password(String username, String password){
       /* user.attemptsTo(
                LoginTask.withCredencials(username, password)
        );*/
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginTask.withCredencials(username, password)
        );
    }

    @When("the user clicks on forgot password and enters {string}")
    public void the_user_clicks_on_forgot_password(String username) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                ForgotPasswordTask.resetPassword(username)
        );
    }

    @When("the user press the cancel button")
    public void the_user_press_the_cancel_button() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                CancelButtonForgotPasswordTask.cancelButtonForgotPassword()

        );
    }


    @Then("succesfull login")
    public void succesfull_login(){
        OnStage.theActorInTheSpotlight().should(seeThat(MainPageTitle.value(), containsString("Time at Work")));
        //user.should(seeThat(MainPageTitle.value(), containsString("Time at Work")));
    }

    @Then("invalidate login")
    public void invalidate_login(){
        /*user.attemptsTo(
                WaitUntil.the(INCORRECT_MESSAGE_CREDENTIALS, isVisible()).forNoMoreThan(10).seconds()
        );*/
        OnStage.theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(INCORRECT_MESSAGE_CREDENTIALS, isVisible()).forNoMoreThan(10).seconds()
        );

        OnStage.theActorInTheSpotlight().should(seeThat(ValidateMessageIncorrectCredentials.value(), containsString("Invalid credentials")));
        System.out.println("Usuario o contraseña invalida");

        //user.should(seeThat(ValidateMessageIncorrectCredentials.value(), containsString("Invalid credentials")));
    }

    @Then("should show required")
    public void should_show_required() {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateExcepcionEmptyFields.value(), containsString("Required")));
        System.out.println("Tiene campos vacios");
    }

    @Then("should show a message of confirmation")
    public void should_show_a_message_of_confirmation() {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateMessageSendConfirmation.value(), containsString("Reset Password link sent successfully")));
    }

    @Then("will be redirect to login page")
    public void will_be_redirect_to_login_page() {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateRedirectToLogin.value(), containsString("Login")));
        System.out.println("The user pressed the cancel button and was redirected to login page");
    }

}
