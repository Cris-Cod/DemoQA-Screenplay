package screenplay.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import screenplay.user_interface.CreateNewUser;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class SelectAlertNewUser implements Task {

    public SelectAlertNewUser() {
    }

    public static SelectAlertNewUser selectAlertNewUser(){
        return instrumented(SelectAlertNewUser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CreateNewUser.BTN_REGISTER),
                Click.on(CreateNewUser.BTN_REGISTER),
                WaitUntil.the(alertIsPresent()).forNoMoreThan(Duration.ofSeconds(10)),
                Switch.toAlert().andAccept()
        );
    }
}
