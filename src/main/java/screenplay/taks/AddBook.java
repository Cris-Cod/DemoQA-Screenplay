package screenplay.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import screenplay.actions.IteratorBook;
import screenplay.user_interface.AddBookLocators;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddBook implements Task {

    private final String book;

    public AddBook(String book) {
        this.book = book;
    }

    public static AddBook addBook(String nameBook){
        return instrumented(AddBook.class, nameBook);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(AddBookLocators.BTN_BOOK_STORE),
                Click.on(AddBookLocators.BTN_BOOK_STORE),
                IteratorBook.iteratorBook(book)
        );
    }
}
