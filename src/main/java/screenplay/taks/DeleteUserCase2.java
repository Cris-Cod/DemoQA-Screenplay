package screenplay.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.waits.WaitUntil;
import screenplay.user_interface.AddBookLocators;
import screenplay.user_interface.HomeLoginLocators;
import screenplay.user_interface.LoginPage;

import java.time.Duration;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;

public class DeleteUserCase2 implements Task {

    private final String username;
    private final String pass;

    public DeleteUserCase2(String username, String pass) {
        this.username = username;
        this.pass = pass;
    }

    public static DeleteUserCase2 deleteUserCase2(String username, String pass){
        return instrumented(DeleteUserCase2.class, username, pass);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AddBookLocators.BTN_BOOK_STORE_APPLICATION),
                Click.on(LoginPage.BTN_LOGIN),
                Enter.theValue(username).into(LoginPage.USERNAME_FIELD),
                Enter.theValue(pass).into(LoginPage.PASSWORD_FIELD),
                Click.on(LoginPage.LOGIN_BUTTON),
                WaitUntil.the(HomeLoginLocators.DIV_BUTTONS, isVisible()).forNoMoreThan(10).seconds(),
                Scroll.to(HomeLoginLocators.DIV_BUTTONS),
                Click.on(HomeLoginLocators.BTN_DELETE_ACCOUNT),
                Click.on(HomeLoginLocators.MODAL_DELETE),
                WaitUntil.the(alertIsPresent()).forNoMoreThan(Duration.ofSeconds(10)),
                Switch.toAlert().andAccept()
        );
    }
}
