package co.com.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target USERNAME_FIELD = Target.the("username field").located(By.name("username"));
    public static final Target PASSWORD_FIELD = Target.the("password field").located(By.name("password"));
    public static final Target LOGIN_BUTTON = Target.the("login button").located(By.cssSelector("button[type='submit']"));
    public static final Target FORGOT_PASSWORD_LINK = Target.the("Forgot your password? link").locatedBy("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p");

}
