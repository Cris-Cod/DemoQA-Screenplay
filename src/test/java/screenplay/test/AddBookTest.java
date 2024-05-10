package screenplay.test;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import screenplay.taks.AddBook;
import screenplay.taks.OpenLoginPage;
@RunWith(SerenityRunner.class)
public class AddBookTest {

    private WebDriver driver;

    private Actor user = Actor.named("User");

    @Test
    public void addBook(){
        driver = new ChromeDriver();
        user.can(BrowseTheWeb.with(driver));
        user.attemptsTo(
                OpenLoginPage.loginPage(),
                AddBook.addBook("Programming JavaScript Applications")
        );
    }
}
