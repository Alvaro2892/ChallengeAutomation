package co.com.certification.challenge.Automation.util;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hook
{
    @Before
    public void prepareStage()
    {
        OnStage.setTheStage(new OnlineCast());
    }
}
