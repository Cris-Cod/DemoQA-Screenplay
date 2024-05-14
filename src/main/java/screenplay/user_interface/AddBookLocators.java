package screenplay.user_interface;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import java.util.List;

public class AddBookLocators {


    public static final Target BTN_BOOK_STORE_APPLICATION = Target.the("btn book store application").located(By.xpath("//div[@class='left-pannel']/div/div[6]"));
    public static final Target BTN_BOOK_STORE = Target.the("btn book store").located(By.xpath("//div[@class='left-pannel']/div/div[6]/div/ul/li[2]"));
    public static final Target LIST_BOOKS = Target.the("list of books").located(By.cssSelector("div[class='rt-td'] div"));
    public static final Target BOOK = Target.the("book").located(By.cssSelector("div[class='rt-td'] div"));

}
