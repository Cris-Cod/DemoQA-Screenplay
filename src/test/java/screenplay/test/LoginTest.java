package screenplay.test;

import screenplay.actions.Login;
import screenplay.taks.OpenLoginPage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {

    private WebDriver driver;
    private Actor user = Actor.named("User");

    @Test
    public void loginTest(){
        driver = new ChromeDriver();
        user.can(BrowseTheWeb.with(driver));

        //user.wasAbleTo(OpenLoginPage.loginPage());
        user.attemptsTo(
                OpenLoginPage.loginPage(),
                Login.withCredentials("Test5", "Test5#et")
        );
    }

}
