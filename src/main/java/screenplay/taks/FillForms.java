package screenplay.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import screenplay.user_interface.FormsLocators;

import java.nio.file.Path;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class FillForms implements Task {

    private final String firstname;
    private final String lastName;
    private final String email;
    private final String mobile;
    private final String subjects;
    private final String address;

    private final Path path = Path.of("src/test/resources/images/serenityBDD.png");

    public FillForms(String firstname, String lastName, String email, String mobile, String subjects, String address) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.subjects = subjects;
        this.address = address;
    }

    public static FillForms fillForms(String firstname, String lastName, String email, String mobile, String subjects, String address){
        return instrumented(FillForms.class, firstname, lastName, email, mobile, subjects, address);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FormsLocators.BTN_FORMS),
                Click.on(FormsLocators.BTN_PRACTICE_FORM),
                Enter.theValue(firstname).into(FormsLocators.INPUT_FIRSTNAME),
                Enter.theValue(lastName).into(FormsLocators.INPUT_LASTNAME),
                Enter.theValue(email).into(FormsLocators.INPUT_EMAIL),
                Scroll.to(FormsLocators.INPUT_GENDER),
                Click.on(FormsLocators.INPUT_GENDER),
                Enter.theValue(mobile).into(FormsLocators.INPUT_MOBILE),
                Scroll.to(FormsLocators.INPUT_DATE_BIRTH),
                Click.on(FormsLocators.INPUT_DATE_BIRTH),
                SelectFromOptions.byVisibleText("June").from(FormsLocators.SELECT_MONTH),
                SelectFromOptions.byValue("1997").from(FormsLocators.SELECT_YEAR),
                Click.on(FormsLocators.SELECT_DAY),
                Enter.theValue(subjects).into(FormsLocators.INPUT_SUBJECT),
                Click.on(FormsLocators.CHECKBOX),
                Upload.theFile(path).to(FormsLocators.UPLOADPICTURE),
                Enter.theValue(address).into(FormsLocators.TEXTAREA_ADDRESS),
                Click.on(FormsLocators.SELECT_STATE),
                Click.on(FormsLocators.SELECT_STATE_OPTION),
                Click.on(FormsLocators.SELECT_CITY),
                Click.on(FormsLocators.SELECT_CITY_OPTION),
                Click.on(FormsLocators.BTN_SUBMIT)
        );
    }
}
