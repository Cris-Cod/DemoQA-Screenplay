package screenplay.taks;


import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;



public class OpenLoginPage {

    public static Performable loginPage(){
        return Task.where("{0} open the login page",
                Open.browserOn().thePageNamed("home.page")
        );
    }


}
