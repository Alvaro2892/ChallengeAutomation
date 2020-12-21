package co.com.certification.challenge.Automation.tasks.ReservationFly;

import co.com.certification.challenge.Automation.model.InitializeObjects;
import co.com.certification.challenge.Automation.userinterface.UserBookFlight.BookFlight;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.certification.challenge.Automation.util.Constants.ZERO;

public class TaskBookFlight implements Task
{

    private List<InitializeObjects> data;

    public TaskBookFlight(List<InitializeObjects> data)
    {
        this.data = data;
    }

    public static TaskBookFlight onTraveloCity(List<InitializeObjects> initializeObjects)
    {
        return Tasks.instrumented(TaskBookFlight.class, initializeObjects);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        InitializeObjects info = data.get(ZERO);
        actor.attemptsTo(
                Click.on(BookFlight.CLICKFLIGHT),
                Click.on(BookFlight.ORIGINFlight),
                Enter.theValue(info.getGointTo()).into(BookFlight.ENTERORIGIN).thenHit(Keys.ENTER),
                Click.on(BookFlight.GOINGTOFLIGHT),
                Enter.theValue(info.getOrgin()).into(BookFlight.ENTERGOINGTO).thenHit(Keys.ENTER),
                Click.on(BookFlight.CLICKSEARCH),
                Scroll.to(BookFlight.SCROLLAIRLINE),
                Click.on(BookFlight.CLICKAVIANCA),
                Scroll.to(BookFlight.SCROLLFILTER)
                );

    }
}
