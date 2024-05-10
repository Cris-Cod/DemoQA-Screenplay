package screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

;

public class CreateNewUser {

    public static final Target BTN_NEW_USER = Target.the("btn new user").located(By.id("newUser"));
    public static final Target FIELD_FIRSTNAME = Target.the("field firstname").located(By.id("firstname"));
    public static final Target FIELD_LASTANAME = Target.the("field lastname").located(By.id("lastname"));
    public static final Target FIELD_USER = Target.the("field user").located(By.id("userName"));
    public static final Target FIELD_PASSWORD = Target.the("field user").located(By.id("password"));
    public static final Target BTN_REGISTER = Target.the("field user").located(By.id("register"));
}
