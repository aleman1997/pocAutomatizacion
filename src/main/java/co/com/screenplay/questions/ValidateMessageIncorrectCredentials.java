package co.com.screenplay.questions;

import co.com.screenplay.ui.MainPage;
import co.com.screenplay.ui.ValidateMessageIncorrectPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebElement;

public class ValidateMessageIncorrectCredentials implements Question {
    @Override
    public String answeredBy(Actor actor) {
        WebElement messageIncorrectCredentials = ValidateMessageIncorrectPage.INCORRECT_MESSAGE_CREDENTIALS.resolveFor(actor);
        System.out.println("El valor que trae es: " + messageIncorrectCredentials.getText());
        return messageIncorrectCredentials.getText();
    }

    public static Question<String>value(){
        return new  ValidateMessageIncorrectCredentials();
    }


}
