package co.com.certification.challenge.Automation.tasks.GoingToTravel;

import co.com.certification.challenge.Automation.model.InitializeObjects;
import co.com.certification.challenge.Automation.userinterface.UserGoingTo.InterfaceGoingTo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.certification.challenge.Automation.util.Constants.ZERO;

public class GoingToTraveloCity implements Task
{
    private List<InitializeObjects> data;

    public GoingToTraveloCity(List<InitializeObjects> data)
    {
        this.data = data;
    }

    public static GoingToTraveloCity traveloCity(List<InitializeObjects> initializeObjects)
    {
        return Tasks.instrumented(GoingToTraveloCity.class, initializeObjects);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        InitializeObjects info = data.get(ZERO);

        actor.attemptsTo(
                Click.on(InterfaceGoingTo.CLICKCGOINGTO),
                Enter.theValue(info.getGointTo()).into(InterfaceGoingTo.ENTERENTEGOINGTO).thenHit(Keys.ENTER),
                Click.on(InterfaceGoingTo.CLICKSEARCH)
        );
    }
}
