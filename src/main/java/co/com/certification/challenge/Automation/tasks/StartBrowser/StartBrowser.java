package co.com.certification.challenge.Automation.tasks.StartBrowser;

import co.com.certification.challenge.Automation.userinterface.UserStartBrowser.EnterWebSite;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class StartBrowser implements Task
{
    private EnterWebSite enterWebSite;

    public static StartBrowser webSiteCedex() {
        return Tasks.instrumented(StartBrowser.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor)
    {
        actor.attemptsTo(Open.browserOn(enterWebSite));
    }
}