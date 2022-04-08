package co.com.choucair.certification.tasks;

import co.com.choucair.certification.model.UtestDatos;
import co.com.choucair.certification.userinterface.Final;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class LlenarFinal implements Task {

    private List<UtestDatos> datos;

    public LlenarFinal(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static LlenarFinal laPagina(List<UtestDatos>datos) {
        return Task.instrumented(LlenarFinal.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Enter.theValue(datos.get(0).getStrClave()).into(Final.CLAVE),
            Enter.theValue(datos.get(0).getStrClave()).into(Final.CONFIRMA_CLAVE),
            Click.on(Final.CHECKBOX_OPCIONAL),
            Click.on(Final.TERMINOS),
            Click.on(Final.POLITICAS),
            Click.on(Final.BOTON_COMPLETAR)
            );
    }
}
