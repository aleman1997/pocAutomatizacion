package co.com.screenplay.questions;

import co.com.screenplay.ui.MainPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.openqa.selenium.WebElement;

public class MainPageTitle implements Question<String> {

    @Override
    public String answeredBy(Actor actor){
        WebElement dashboardTitleElement = MainPage.DASHBOARD_TITLE.resolveFor(actor);
        System.out.println("El valor que trae es: " + dashboardTitleElement.getText());
        return dashboardTitleElement.getText();
    }

    public static Question<String> value(){
        return new MainPageTitle();

    }
}
