package screenplay.taks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import screenplay.actions.IteratorBook;
import screenplay.user_interface.AddBookLocators;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddBooks implements Task {

    private final String book;

    public AddBooks(String book) {
        this.book = book;
    }

    public static AddBooks addBooks(String nameBook){
        return instrumented(AddBooks.class, nameBook);
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
