package co.com.screenplay.tasks;

import co.com.screenplay.ui.ForgotPasswordPage;
import co.com.screenplay.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CancelButtonForgotPasswordTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(
                    Click.on(LoginPage.FORGOT_PASSWORD_LINK),
                    Click.on(ForgotPasswordPage.CANCEL_BUTTON)
            );
    }

    public static CancelButtonForgotPasswordTask cancelButtonForgotPassword(){
        return instrumented(CancelButtonForgotPasswordTask.class);
    }
}
