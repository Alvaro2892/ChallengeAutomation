package co.com.certification.challenge.Automation.questions.GoingTo;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.certification.challenge.Automation.userinterface.UserQuestionsGoingTo.QustionsGoingTo.VERIFYITEMS;

public class CheckGoingTo implements Question<Boolean>
{
    String word;

    public CheckGoingTo(String word)
    {
        this.word = word;
    }

    public static CheckGoingTo is(String questionv)
    {
        return new CheckGoingTo(questionv);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String text = Text.of(VERIFYITEMS).viewedBy(actor).asString();
        return word.equals(text );
    }
}