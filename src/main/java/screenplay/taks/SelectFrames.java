package screenplay.taks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.questions.Text;
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

    private WebElement frameParent = (WebElement) AlertsLocators.IFRAME_PARENT;
    private WebElement frameChild = (WebElement)  AlertsLocators.IFRAME_CHILD;
    private String textIframe;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AlertsLocators.BTN_ALERTS_FRAMES),
                Click.on(AlertsLocators.BTN_NESTED_FRAMES),
                Switch.toFrame(frameParent),
                Switch.toFrame(frameChild),
                Switch.toDefaultContext()
        );

    }
}
