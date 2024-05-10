package screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target USERNAME_FIELD = Target.the("username field").located(By.id("userName"));
    public static final Target PASSWORD_FIELD = Target.the("password field").located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("login button").located(By.id("login"));
    public static final Target LOGIN_STATUS_MESSAGE = Target.the("login status message").located(By.id("login-status"));
}
