package co.com.certification.challenge.Automation.questions.Fly;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.certification.challenge.Automation.userinterface.UserBookFlight.BookFlight.VERIFYFLIGHT;

public class CheckFlightAvianca implements Question<Boolean>
{
    String word;

    public CheckFlightAvianca(String word)
    {
        this.word = word;
    }

    public static CheckFlightAvianca is(String questionv)
    {
        return new CheckFlightAvianca(questionv);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String text = Text.of(VERIFYFLIGHT).viewedBy(actor).asString();
        return word.equals(text );
    }
}