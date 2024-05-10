package screenplay.utils;


import net.serenitybdd.screenplay.Performable;

public class Time {


    private Time() {
    }

    public static void waiting(int waitingTime){
        try {
            Thread.sleep(waitingTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}
