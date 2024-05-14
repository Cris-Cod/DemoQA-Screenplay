package screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeLoginLocators {

    public static final Target BTN_DELETE_ACCOUNT = Target.the("btn delete account").located(By.cssSelector("div[class='text-center button']"));

    public static final Target MODAL_DELETE = Target.the("modal delete account").located(By.id("closeSmallModal-ok"));
}
