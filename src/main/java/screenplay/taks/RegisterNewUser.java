package screenplay.taks;

import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import screenplay.user_interface.CreateNewUser;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import screenplay.utils.CONSTANST;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;
import static screenplay.utils.Time.waiting;

public class RegisterNewUser implements Task {

    private final String firstName;
    private final String lastName;
    private final String user;
    private final String pass;

    public RegisterNewUser(String firstName, String lastName, String user, String pass) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.user = user;
        this.pass = pass;
    }

    public static RegisterNewUser registerNewUser(String firstName, String lastName, String user, String pass){
        return instrumented(RegisterNewUser.class, firstName, lastName, user, pass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Scroll.to(CreateNewUser.BTN_NEW_USER),
                    Click.on(CreateNewUser.BTN_NEW_USER),
                    Enter.theValue(firstName).into(CreateNewUser.FIELD_FIRSTNAME),
                    Enter.theValue(lastName).into(CreateNewUser.FIELD_LASTANAME),
                    Enter.theValue(user).into(CreateNewUser.FIELD_USER),
                    Enter.theValue(pass).into(CreateNewUser.FIELD_PASSWORD));
                    waiting(CONSTANST.TIME_CAPTACHA);

    }
}
