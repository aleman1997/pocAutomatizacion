package co.com.screenplay.questions;

import co.com.screenplay.tasks.ForgotPasswordTask;
import co.com.screenplay.ui.ForgotPasswordPage;
import co.com.screenplay.ui.ValidateExceptionEmptyFieldsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Task;
import org.openqa.selenium.WebElement;

public class ValidateRedirectToLogin implements Question {


    @Override
    public Object answeredBy(Actor actor) {
        WebElement messageRedirecToLogin = ForgotPasswordPage.VALIDATE_MESSAGE_LOGIN.resolveFor(actor);
        System.out.println("El valor que trae es: " + messageRedirecToLogin.getText());
        return messageRedirecToLogin.getText();
    }

    public static Question<String> value(){
        return new  ValidateRedirectToLogin();
    }
}
