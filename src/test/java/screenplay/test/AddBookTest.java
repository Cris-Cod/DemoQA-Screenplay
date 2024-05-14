package screenplay.test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import screenplay.taks.AddBooks;
import screenplay.taks.OpenLoginPage;


@RunWith(SerenityRunner.class)
public class AddBookTest {

    private WebDriver driver;

    private Actor user = Actor.named("User");

    @Test
    public void addBook(){
        driver = new ChromeDriver();
        user.can(BrowseTheWeb.with(driver));
        driver.manage().window().maximize();
        user.attemptsTo(
                OpenLoginPage.loginPage(),
                AddBooks.addBooks("Programming JavaScript Applications")
        );
    }
}
