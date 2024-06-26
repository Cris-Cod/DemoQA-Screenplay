package screenplay.test;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.junit.annotations.UseTestDataFrom;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import screenplay.taks.DeleteUser;
import screenplay.taks.OpenLoginPage;
import screenplay.taks.RegisterNewUser;
import screenplay.taks.SelectAlertNewUser;

@RunWith(SerenityParameterizedRunner.class)
@UseTestDataFrom(value = "testdata/data.csv")
public class CreaterUserTest {

    private WebDriver driver;
    private String firstname;
    private String lastname;
    private String userName;
    private String password;

    private Actor user = Actor.named("User");

    @Test
    public void createrUserTest(){
        driver = new ChromeDriver();
        user.can(BrowseTheWeb.with(driver));
        driver.manage().window().maximize();
        user.attemptsTo(
                 OpenLoginPage.loginPage(),
                 RegisterNewUser.registerNewUser(firstname, lastname,userName, password),
                 SelectAlertNewUser.selectAlertNewUser(),
                 DeleteUser.deleteUser(userName, password)
         );

    }

}
