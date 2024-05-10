package screenplay.test;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import screenplay.taks.OpenLoginPage;
import screenplay.taks.RegisterNewUser;
import screenplay.user_interface.CreateNewUser;

public class CreaterUserTest {

    private WebDriver driver;

    private Actor user = Actor.named("User");

    @Test
    public void createrUserTest(){
        driver = new ChromeDriver();
        user.can(BrowseTheWeb.with(driver));
        user.attemptsTo(
                 OpenLoginPage.loginPage(),
                 RegisterNewUser.registerNewUser("Test01", "Test01","test012", "Test2023*")
         );

    }

}
