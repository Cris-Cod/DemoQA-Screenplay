package screenplay.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import screenplay.user_interface.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.assertj.core.api.Assertions.assertThat;
import static screenplay.utils.TextOfLocators.textInvalidUser;

public class ValidateLoginUser implements Task {

    private final String username;
    private final String pass;

    public ValidateLoginUser(String username, String pass) {
        this.username = username;
        this.pass = pass;
    }

    public static ValidateLoginUser validateLoginUser(String username, String password){
        return instrumented(ValidateLoginUser.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(LoginPage.USERNAME_FIELD),
                Enter.theValue(pass).into(LoginPage.PASSWORD_FIELD),
                Scroll.to(LoginPage.LOGIN_BUTTON),
                Click.on(LoginPage.LOGIN_BUTTON),
                WaitUntil.the(LoginPage.TEXT_INVALID, isVisible()).forNoMoreThan(10).seconds()
        );
        var txtInvalid = actor.asksFor(textInvalidUser());
        System.out.println(txtInvalid);
        assertThat(txtInvalid).isEqualTo("Invalid username or password!");
    }
}
