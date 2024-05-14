package screenplay.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import screenplay.user_interface.CreateNewUser;
import screenplay.user_interface.HomeLoginLocators;
import screenplay.user_interface.LoginPage;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class DeleteUser implements Task {


    private final String username;
    private final String password;

    public DeleteUser(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static DeleteUser deleteUser(String username, String password){
        return instrumented(DeleteUser.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CreateNewUser.BTN_BACK_TO_LOGIN),
                Enter.theValue(username).into(LoginPage.USERNAME_FIELD),
                Enter.theValue(password).into(LoginPage.PASSWORD_FIELD),
                Click.on(LoginPage.LOGIN_BUTTON),
                Click.on(HomeLoginLocators.BTN_DELETE_ACCOUNT),
                Click.on(HomeLoginLocators.MODAL_DELETE),
                WaitUntil.the(alertIsPresent()).forNoMoreThan(Duration.ofSeconds(10)),
                Switch.toAlert().andAccept()
        );
    }
}
