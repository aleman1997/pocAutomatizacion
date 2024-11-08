package co.com.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddAdminPage {

    public static final Target ADMIN_BUTTON = Target.the("button admin").located(By.linkText("Admin"));
}
