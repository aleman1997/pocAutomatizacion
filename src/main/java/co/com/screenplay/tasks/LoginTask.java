package co.com.screenplay.tasks;

import co.com.screenplay.ui.LoginPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.EnsureFieldVisible;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginTask implements Task {
    private final String username;
    private final String password;

    public LoginTask(String username, String password){
        this.username = username;
        this.password = password;
    }

    @Step("Log in with username {0} and password {1}")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(LoginPage.USERNAME_FIELD),
                Enter.theValue(password).into(LoginPage.PASSWORD_FIELD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );

    }


    public static LoginTask withCredencials(String username, String password){
        return  instrumented(LoginTask.class, username,password);
    }



}
