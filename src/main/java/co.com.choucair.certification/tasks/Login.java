package co.com.choucair.certification.tasks;

import co.com.choucair.certification.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    private String strUser;
    private String strPasssword;

    public Login(String strUser, String strPasssword){
        this.strUser = strUser;
        this.strPasssword = strPasssword;
    }

    public static Login onThePage(String strUser, String strPasssword) {

        return Task.instrumented(Login.class, strUser, strPasssword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
                Enter.theValue(strUser).into(ChoucairLoginPage.USER),
        Enter.theValue(strPasssword).into(ChoucairLoginPage.PASSWORD),
                Click.on(ChoucairLoginPage.ENTER_BUTTON)
                );

    }
}
