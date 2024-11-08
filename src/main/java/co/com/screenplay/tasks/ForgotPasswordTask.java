package co.com.screenplay.tasks;

import co.com.screenplay.ui.ForgotPasswordPage;
import co.com.screenplay.ui.LoginPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class ForgotPasswordTask implements Task {
    private final String username;

    public  ForgotPasswordTask(String username){
        this.username = username;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    Click.on(LoginPage.FORGOT_PASSWORD_LINK),
                    Enter.theValue(username).into(ForgotPasswordPage.USERNAME_FIELD),
                    Click.on(ForgotPasswordPage.RESET_BUTTON)
            );
            Thread.sleep(3000);
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

    }

    public static ForgotPasswordTask resetPassword(String username){
        return instrumented(ForgotPasswordTask.class, username);
    }
}
