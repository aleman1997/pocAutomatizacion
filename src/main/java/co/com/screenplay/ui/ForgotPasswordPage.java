package co.com.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ForgotPasswordPage {
    public static final Target RESET_BUTTON = Target.the("reset password button").located(By.xpath("//button[@type='submit']"));
    public static final Target USERNAME_FIELD = Target.the("username field for password recovery").located(By.name("username"));
    public static final Target CANCEL_BUTTON = Target.the("reset password button").located(By.xpath("//button[@class='oxd-button oxd-button--large oxd-button--ghost orangehrm-forgot-password-button orangehrm-forgot-password-button--cancel']"));

    public static final Target VALIDATE_MESSAGE_LOGIN = Target.the("Validate redirect to page login").located(By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']"));
    public static final Target VALIDATE_MESSAGE_SENT_SUCCESFULLY = Target.the("Validate menssage of confirmation").located(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']"));





}
