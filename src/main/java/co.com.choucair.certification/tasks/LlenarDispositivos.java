package co.com.choucair.certification.tasks;

import co.com.choucair.certification.model.UtestDatos;
import co.com.choucair.certification.userinterface.Dispositivos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

public class LlenarDispositivos implements Task {
    private List<UtestDatos> datos;

    public LlenarDispositivos(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static LlenarDispositivos laPagina(List<UtestDatos> datos) {
        return Task.instrumented(LlenarDispositivos.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(Dispositivos.CONTENEDOR_DISPOSITIVOS),
            Enter.theValue(datos.get(0).getStrDispositivoMovil()).into(Dispositivos.DISPOSITIVO_MOVIL).thenHit(Keys.ARROW_DOWN, Keys.ENTER),

            Click.on(Dispositivos.CONTENEDOR_MODELO),
            Enter.theValue(datos.get(0).getStrModelo()).into(Dispositivos.DISPOSITIVO_MODELO).thenHit(Keys.ARROW_DOWN, Keys.ENTER),

            Click.on(Dispositivos.CONTENEDOR_SISTEMA_OPERATIVO),
            Enter.theValue(datos.get(0).getStrSistemaOperativo()).into(Dispositivos.SISTEMA_OPERATIVO).thenHit(Keys.ARROW_DOWN, Keys.ENTER),

            Click.on(Dispositivos.BOTON_FINAL)
            );
    }
}
