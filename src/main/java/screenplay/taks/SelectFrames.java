package screenplay.taks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import screenplay.user_interface.AddBookLocators;
import screenplay.user_interface.AlertsLocators;
import screenplay.utils.TextOfLocators;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectFrames implements Task {
    public SelectFrames() {
    }

    public static SelectFrames selectFrames(){
        return instrumented(SelectFrames.class);
    }

    //private Actor user = Actor.named("User");
    //private WebElement frameParent = AlertsLocators.IFRAME_PARENT.resolveFor(user);
    //private WebElement frameChild = AlertsLocators.IFRAME_CHILD.resolveFor(user);
    private String textIframe;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AlertsLocators.BTN_ALERTS_FRAMES),
                Click.on(AlertsLocators.BTN_NESTED_FRAMES),
                Switch.toFrame(4),
                Switch.toFrame(15),
                Switch.toDefaultContext()
        );

    }
}
