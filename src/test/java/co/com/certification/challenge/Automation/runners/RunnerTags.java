package co.com.certification.challenge.Automation.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/ChallengeAutomation.feature",
        tags = {"@Fly"},
        glue = {"co.com.certification.challenge.Automation.stepdefinitions","co.com.certification.challenge.Automation.util"},
        snippets = SnippetType.CAMELCASE )

public class RunnerTags
{
}
