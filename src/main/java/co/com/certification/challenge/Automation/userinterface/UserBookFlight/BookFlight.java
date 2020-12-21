package co.com.certification.challenge.Automation.userinterface.UserBookFlight;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BookFlight
{
    public static final Target CLICKFLIGHT = Target.the("Book flight").located(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[1]/div[1]/div/figure/div[3]/div/div/ul/li[2]"));
    public static final Target ORIGINFlight = Target.the("Origin flight").located(By.xpath("//*[@id=\"location-field-leg1-origin-menu\"]/div[1]/button"));
    public static final Target ENTERORIGIN = Target.the(" Enter origin").located(By.xpath("//*[@id=\"location-field-leg1-origin\"]"));
    public static final Target GOINGTOFLIGHT = Target.the("Click going to").located(By.xpath("//*[@id=\"location-field-leg1-destination-menu\"]/div[1]/button"));
    public static final Target ENTERGOINGTO = Target.the("Enter going to").located(By.xpath("//*[@id=\"location-field-leg1-destination\"]"));
    public static final Target CLICKSEARCH = Target.the("Click search").located(By.xpath("//*[@id=\"wizard-flight-pwa-1\"]/div[3]/div[2]/button"));
    public static final Target SCROLLAIRLINE = Target.the("Scroll airline").located(By.xpath("//*[@id=\"airlines\"]/div/div[1]"));
    public static final Target CLICKAVIANCA = Target.the("Click Avianca").located(By.xpath("//*[@id=\"airlines\"]/div/div[3]/div"));
    public static final Target SCROLLFILTER = Target.the("Scroll filter").located(By.xpath("//*[@id=\"sort-filter-drawer\"]/div[1]/div[1]/div/div[1]"));
    public static final Target VERIFYFLIGHT = Target.the("verify flight").located(By.xpath("/html/body/div[3]/div[10]/ul/li/button/span[2]"));
}
