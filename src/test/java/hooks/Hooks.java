package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hooks {
    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @After
    public void tearDown() {
        OnStage.drawTheCurtain();
    }
}
