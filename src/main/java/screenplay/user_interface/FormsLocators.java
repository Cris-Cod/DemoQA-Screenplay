package screenplay.user_interface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormsLocators {

    private static int date = 022;

    public static final Target BTN_FORMS = Target.the("btn forms").located(By.xpath("//div[@class='left-pannel']/div/div[2]"));
    public static final Target BTN_PRACTICE_FORM = Target.the("btn practice form").located(By.xpath("//div[@class='left-pannel']/div/div[2]/div/ul/li"));
    public static final Target INPUT_FIRSTNAME = Target.the("input firstname").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("input lastname").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("input email").located(By.id("userEmail"));
    public static final Target INPUT_GENDER  = Target.the("input gender").located(By.cssSelector("label[for='gender-radio-1']"));
    public static final Target INPUT_MOBILE  = Target.the("input mobile").located(By.id("userNumber"));
    public static final Target INPUT_DATE_BIRTH  = Target.the("input date birth").located(By.id("dateOfBirthInput"));
    public static final Target SELECT_MONTH  = Target.the("select month").located(By.xpath("//select[@class='react-datepicker__month-select']"));
    public static final Target SELECT_YEAR  = Target.the("select year").located(By.xpath("//select[@class='react-datepicker__year-select']"));
    public static final Target SELECT_DAY  = Target.the("select day").located(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--023']"));
    public static final Target INPUT_SUBJECT  = Target.the("input subject").located(By.xpath("//div[@id='subjectsContainer']/div/div"));
    public static final Target ENTER_SUBJECT = Target.the("enter subject").located(By.id("subjectsInput"));
    public static final Target CHECKBOX  = Target.the("checkbox").located(By.cssSelector("label[for='hobbies-checkbox-1']"));
    public static final Target UPLOADPICTURE = Target.the("upload picture").located(By.id("uploadPicture"));
    public static final Target TEXTAREA_ADDRESS = Target.the("textarea address").located(By.id("currentAddress"));
    public static final Target SELECT_STATE = Target.the("select state").located(By.id("state"));
    public static final Target SELECT_STATE_OPTION = Target.the("select state option").located(By.id("react-select-3-option-2"));
    public static final Target SELECT_CITY = Target.the("select city").located(By.id("city"));
    public static final Target SELECT_CITY_OPTION = Target.the("select city option").located(By.id("react-select-4-option-0"));
    public static final Target BTN_SUBMIT = Target.the("button submit").located(By.id("submit"));
    public static final Target BTN_CLOSE = Target.the("Button close").located(By.id("closeLargeModal"));

    //closeLargeModal

    //class-subjects-auto-complete__input
    //id--react-select-2-option-1
}
