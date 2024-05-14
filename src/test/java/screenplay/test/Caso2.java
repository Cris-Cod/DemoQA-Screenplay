package screenplay.test;


import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import screenplay.taks.*;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "testdata/testcaso2.csv")
public class Caso2 {

    private String firstname;
    private String lastnameUser;
    private String userName;
    private String password;
    private String first_name;
    private String last_Name;
    private String email;
    private String mobile;
    private String subjects;
    private String current_Address;

    private WebDriver driver;

    private Actor user = Actor.named("User");


    @Test
    public void testCase2(){
        driver = new ChromeDriver();
        user.can(BrowseTheWeb.with(driver));
        driver.manage().window().maximize();
        user.attemptsTo(
                OpenLoginPage.loginPage(),
                RegisterNewUser.registerNewUser(firstname,lastnameUser,userName,password),
                SelectAlertNewUser.selectAlertNewUser(),
                SelectFrames.selectFrames(),
                FillForms.fillForms(first_name,last_Name,email,mobile,subjects,current_Address),
                DeleteUserCase2.deleteUserCase2(userName,password),
                ValidateLoginUser.validateLoginUser(userName,password)
        );
    }


}
