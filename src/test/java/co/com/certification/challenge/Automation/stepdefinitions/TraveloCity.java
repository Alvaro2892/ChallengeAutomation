package co.com.certification.challenge.Automation.stepdefinitions;

import co.com.certification.challenge.Automation.model.InitializeObjects;
import co.com.certification.challenge.Automation.questions.GoingTo.CheckGoingTo;
import co.com.certification.challenge.Automation.questions.NumberPeople.CheckNumberPeople;
import co.com.certification.challenge.Automation.tasks.GoingToTravel.GoingToTraveloCity;
import co.com.certification.challenge.Automation.tasks.ReservationFly.TaskBookFlight;
import co.com.certification.challenge.Automation.tasks.ReservationsHotel.HotelReservation;
import co.com.certification.challenge.Automation.tasks.StartBrowser.StartBrowser;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class TraveloCity
{
    @Given("^that the user wants to find a destination for their vacations$")
    public void thatTheUserWantsToFindADestinationForTheirVacations()
    {
        theActorCalled("Alvaro").wasAbleTo(StartBrowser.webSiteCedex());
    }

    @When("^he enters the web site and chooses the going to option$")
    public void heEntersTheWebSiteAndChoosesTheGoingToOption(List<InitializeObjects> data)
    {
        theActorInTheSpotlight().attemptsTo(GoingToTraveloCity.traveloCity(data));

    }

    @Then("^he verifies that he found the perfect accommodation (.*)$")
    public void heVerifiesThatHeFoundThePerfectAccommodation(String questionv)
    {
        theActorInTheSpotlight().should(seeThat(CheckGoingTo.is(questionv)));
    }

    @When("^he enters the web site and looks for hotels for four people$")
    public void heEntersTheWebSiteAndLooksForHotelsForFourPeople(List<InitializeObjects> data)
    {
        theActorInTheSpotlight().attemptsTo(HotelReservation.onTraveloCity(data));

    }

    @Then("^he verifies that in the guest option there is the number of people that the user entered (.*)$")
    public void heVerifiesThatInTheGuestOptionThereIsTheNumberOfPeopleThatTheUserEntered(String questionv)
    {
        theActorInTheSpotlight().should(seeThat(CheckNumberPeople.is(questionv)));

    }

    @When("^he enters and looks for a flight but with the avianca airline$")
    public void heEntersAndLooksForAFlightButWithTheAviancaAirline(List<InitializeObjects> data)
    {
        theActorInTheSpotlight().attemptsTo(TaskBookFlight.onTraveloCity(data));
    }

    @Then("^he verifies that the flight chosen was the one delivered$")
    public void heVerifiesThatTheFlightChosenWasTheOneDelivered()
    {

    }


}
