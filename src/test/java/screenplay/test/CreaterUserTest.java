package screenplay.test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import screenplay.taks.OpenLoginPage;
import screenplay.taks.RegisterNewUser;
import screenplay.taks.SelectAlertNewUser;
import screenplay.user_interface.CreateNewUser;
@RunWith(SerenityRunner.class)
public class CreaterUserTest {

    private WebDriver driver;

    private Actor user = Actor.named("User");

    @Test
    public void createrUserTest(){
        driver = new ChromeDriver();
        user.can(BrowseTheWeb.with(driver));
        user.attemptsTo(
                 OpenLoginPage.loginPage(),
                 RegisterNewUser.registerNewUser("Test03", "Test03","test025", "Test2026*"),
                 SelectAlertNewUser.selectAlertNewUser()
         );

    }

}
