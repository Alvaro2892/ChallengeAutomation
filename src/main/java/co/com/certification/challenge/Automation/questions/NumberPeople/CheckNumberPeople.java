package co.com.certification.challenge.Automation.questions.NumberPeople;

import co.com.certification.challenge.Automation.questions.GoingTo.CheckGoingTo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Value;

import static co.com.certification.challenge.Automation.userinterface.UserHotelReservations.UserHotelReservations.VERIFYNUMBERPEOPLE;

public class CheckNumberPeople implements Question<Boolean>
{
    String word;

    public CheckNumberPeople(String word)
    {
        this.word = word;
    }

    public static CheckNumberPeople is(String questionv)
    {
        return new CheckNumberPeople(questionv);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String text = Value.of(VERIFYNUMBERPEOPLE).viewedBy(actor).asString();
        return word.equals(text );
    }
}