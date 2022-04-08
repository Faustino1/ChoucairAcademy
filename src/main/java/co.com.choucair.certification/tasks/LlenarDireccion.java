package co.com.choucair.certification.tasks;

import co.com.choucair.certification.model.UtestDatos;
import co.com.choucair.certification.userinterface.DireccionPersona;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.security.Key;
import java.util.List;

public class LlenarDireccion implements Task {

    private List<UtestDatos> datos;

    public LlenarDireccion(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static LlenarDireccion laPagina(List<UtestDatos> datos) {
        return Task.instrumented(LlenarDireccion.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Enter.theValue(datos.get(0).getStrCiudad()).into(DireccionPersona.CIUDAD),
            Hit.the(Keys.ARROW_DOWN).into(DireccionPersona.CIUDAD),
            Hit.the(Keys.ENTER).into(DireccionPersona.CIUDAD),
            Enter.theValue(datos.get(0).getStrPostal()).into(DireccionPersona.POSTAL),
            Click.on(DireccionPersona.PAIS_CONTENENDOR),
            Enter.theValue(datos.get(0).getStrPais()).into(DireccionPersona.PAIS).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
            Click.on(DireccionPersona.BOTON_DISPOSITIVOS)
    );
    }
}
