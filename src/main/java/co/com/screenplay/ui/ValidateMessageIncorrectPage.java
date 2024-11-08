package co.com.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidateMessageIncorrectPage {
    public static final Target INCORRECT_MESSAGE_CREDENTIALS = Target.the("incorrect credentials").located(By.cssSelector("p[class='oxd-text oxd-text--p oxd-alert-content-text']"));
}
