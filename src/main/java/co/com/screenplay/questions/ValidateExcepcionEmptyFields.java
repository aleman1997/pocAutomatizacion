package co.com.screenplay.questions;

import co.com.screenplay.ui.ValidateExceptionEmptyFieldsPage;
import co.com.screenplay.ui.ValidateMessageIncorrectPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebElement;

public class ValidateExcepcionEmptyFields implements Question{
    @Override
    public String answeredBy(Actor actor) {
        WebElement messageEmptyFields = ValidateExceptionEmptyFieldsPage.REQUIRED_MESSAGE_EMPTY_FIELDS.resolveFor(actor);
        System.out.println("El valor que trae es: " + messageEmptyFields.getText());
        return messageEmptyFields.getText();
    }

    public static Question<String> value(){
        return new  ValidateExcepcionEmptyFields();
    }
}
