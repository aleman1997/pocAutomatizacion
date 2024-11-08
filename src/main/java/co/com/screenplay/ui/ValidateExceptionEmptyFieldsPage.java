package co.com.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidateExceptionEmptyFieldsPage {

    public static final Target REQUIRED_MESSAGE_EMPTY_FIELDS = Target.the("Message empty fields").located(By.xpath("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']"));
}
