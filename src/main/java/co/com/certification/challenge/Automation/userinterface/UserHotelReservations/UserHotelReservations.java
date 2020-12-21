package co.com.certification.challenge.Automation.userinterface.UserHotelReservations;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UserHotelReservations
{
    public static final Target VERIFYNUMBERPEOPLE = Target.the("Verify number people").located(By.xpath("//*[@id=\"room-1-0-adults\"]"));
}
