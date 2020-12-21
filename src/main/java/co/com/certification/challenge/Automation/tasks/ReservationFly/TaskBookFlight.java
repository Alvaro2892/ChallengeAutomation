package co.com.certification.challenge.Automation.tasks.ReservationFly;

import co.com.certification.challenge.Automation.model.InitializeObjects;
import co.com.certification.challenge.Automation.userinterface.UserBookFlight.BookFlight;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.util.List;

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
        actor.attemptsTo(
                Click.on(BookFlight.CLICKFLIGHT) );

    }
}
