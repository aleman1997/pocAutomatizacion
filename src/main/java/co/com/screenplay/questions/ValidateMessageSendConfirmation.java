package co.com.screenplay.questions;

import co.com.screenplay.ui.ForgotPasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebElement;

public class ValidateMessageSendConfirmation implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        WebElement messagesSendSuccesfully = ForgotPasswordPage.VALIDATE_MESSAGE_SENT_SUCCESFULLY.resolveFor(actor);
        System.out.println("Message of confirmation: " + messagesSendSuccesfully.getText());
        return messagesSendSuccesfully.getText();
    }

    public static Question<String> value(){
        return new  ValidateMessageSendConfirmation();
    }
}
