package co.com.certification.challenge.Automation.userinterface.ReservationsHotel;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ReservationsHotel
{
    public static final Target PEOPLE = Target.the("Numbers people").located(By.xpath("//*[@id=\"adaptive-menu\"]/div[1]/button[1]"));
    public static final Target ADDPEOPLE = Target.the("Add people").located(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[1]/div[1]/div/figure/div[3]/div/div/div/div[1]/div/form/div[1]/div[3]/div/div/div[2]/div/section/div[1]/div[1]/div/button[2]"));
    public static final Target CLICKOK = Target.the("Click ok people").located(By.xpath("//*[@id=\"adaptive-menu\"]/div[2]/div/div[2]/button"));
    public static final Target CLICKPEOPLE = Target.the("Click people").located(By.xpath("//*[@id=\"undefined__btn\"]"));
}
