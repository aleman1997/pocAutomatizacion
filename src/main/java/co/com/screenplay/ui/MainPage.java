package co.com.screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {
    public static final Target DASHBOARD_TITLE = Target.the("dashboard title").locatedBy("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div/div[1]/div/p");
}
