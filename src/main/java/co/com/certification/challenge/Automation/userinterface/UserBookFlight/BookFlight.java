package co.com.certification.challenge.Automation.userinterface.UserBookFlight;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BookFlight
{
    public static final Target CLICKFLIGHT = Target.the("Book flight").located(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[1]/div[1]/div/figure/div[3]/div/div/ul/li[2]"));
}
