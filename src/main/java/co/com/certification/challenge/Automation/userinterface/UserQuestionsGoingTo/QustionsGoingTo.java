package co.com.certification.challenge.Automation.userinterface.UserQuestionsGoingTo;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class QustionsGoingTo
{
    public static final Target VERIFYITEMS = Target.the("Verify items").located(By.xpath("//*[@id=\"app-layer-base\"]/div/div/div/div[1]/div/section/div/form/div[1]/div/div/button[1]"));

}
