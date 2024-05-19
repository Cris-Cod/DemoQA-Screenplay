package screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeLoginLocators {

    public static final Target BTN_DELETE_ACCOUNT = Target.the("btn delete account").located(By.xpath("//div[@class='text-center button']/button"));

    public static final Target MODAL_DELETE = Target.the("modal delete account").located(By.id("closeSmallModal-ok"));
    public static final Target DIV_BUTTONS = Target.the("div Buttons").located(By.id("gotoStore"));
}
