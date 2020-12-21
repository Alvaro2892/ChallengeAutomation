package co.com.certification.challenge.Automation.tasks.ReservationsHotel;

import co.com.certification.challenge.Automation.model.InitializeObjects;
import co.com.certification.challenge.Automation.userinterface.ReservationsHotel.ReservationsHotel;
import co.com.certification.challenge.Automation.userinterface.UserGoingTo.InterfaceGoingTo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.certification.challenge.Automation.util.Constants.ZERO;

public class HotelReservation implements Task
{
    private List<InitializeObjects> data;

    public HotelReservation(List<InitializeObjects> data)
    {
        this.data = data;
    }

    public static HotelReservation onTraveloCity(List<InitializeObjects> initializeObjects)
    {
        return Tasks.instrumented(HotelReservation.class, initializeObjects);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        InitializeObjects info = data.get(ZERO);
        actor.attemptsTo(
                Click.on(InterfaceGoingTo.CLICKCGOINGTO),
                Enter.theValue(info.getGointTo()).into(InterfaceGoingTo.ENTERENTEGOINGTO).thenHit(Keys.ENTER),
                Click.on(ReservationsHotel.PEOPLE),
                Click.on(ReservationsHotel.ADDPEOPLE),
                Click.on(ReservationsHotel.ADDPEOPLE),
                Click.on(ReservationsHotel.CLICKOK),
                Click.on(InterfaceGoingTo.CLICKSEARCH),
                Click.on(ReservationsHotel.CLICKPEOPLE)
        );
    }
}
