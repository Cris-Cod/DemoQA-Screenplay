package screenplay.actions;

import net.serenitybdd.core.pages.ListOfWebElementFacades;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import screenplay.user_interface.AddBookLocators;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IteratorBook implements Task {


    private final String bookName;
    public IteratorBook(String bookName) {
        this.bookName = bookName;
    }

    public static IteratorBook iteratorBook(String nameBook){
        return instrumented(IteratorBook.class, nameBook);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        ListOfWebElementFacades books = AddBookLocators.LIST_BOOKS.resolveAllFor(actor);
        ListOfWebElementFacades book_covers = AddBookLocators.BOOK.resolveAllFor(actor);

        for (int i = 0; i < books.size(); i++){
            if(books.get(i).getText().equalsIgnoreCase(bookName)){

                actor.attemptsTo(
                        Scroll.to(AddBookLocators.BOOK),
                        Click.on(book_covers.get(i))
                );
                break;
            }
        }
    }
}
