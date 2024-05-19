package screenplay.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.TextContent;
import screenplay.user_interface.AlertsLocators;
import screenplay.user_interface.LoginPage;

public class TextOfLocators {

    public static Question<String> textParentIframe(){
        return actor -> TextContent.of(AlertsLocators.IFRAME_PARENT).answeredBy(actor);
    }

    /*public static String textChildtIframe(Actor actor){
        return BrowseTheWeb.as(actor).find(AlertsLocators.IFRAME_PARENT).getText();
    }*/

    public static Question<String> textChildtIframe(){
        return actor -> TextContent.of(AlertsLocators.IFRAME_CHILD).answeredBy(actor);
    }

    public static Question<String>textInvalidUser(){
        return actor -> TextContent.of(LoginPage.TEXT_INVALID).answeredBy(actor);
    }
}
