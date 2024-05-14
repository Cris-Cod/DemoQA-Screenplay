package screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AlertsLocators {

    public static final Target BTN_ALERTS_FRAMES = Target.the("btn alerts frames").located(By.xpath("//div[@class='left-pannel']/div/div[3]"));
    public static final Target BTN_NESTED_FRAMES = Target.the("btn nested frames").located(By.xpath("//div[@class='left-pannel']/div/div[3]/div/ul/li[4]"));
    public static final Target IFRAME_PARENT = Target.the("Parent frame").located(By.id("frame1"));
    public static final Target IFRAME_CHILD = Target.the("Child frame").located(By.cssSelector("iframe[srcdoc='<p>Child Iframe</p>']"));


}
