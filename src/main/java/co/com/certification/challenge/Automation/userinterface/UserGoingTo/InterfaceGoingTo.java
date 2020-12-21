package co.com.certification.challenge.Automation.userinterface.UserGoingTo;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InterfaceGoingTo
{
    public static final Target CLICKCGOINGTO = Target.the("Click going to").located(By.xpath("//*[@id=\"location-field-destination-menu\"]/div[1]/button"));
    public static final Target ENTERENTEGOINGTO = Target.the("Enter GOING TO").located(By.xpath("//*[@id=\"location-field-destination\"]"));
    public static final Target CLICKSEARCH = Target.the("Click search").located(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/button"));

}
