package co.com.choucair.certification.tasks;

import co.com.choucair.certification.model.UtestDatos;
import co.com.choucair.certification.userinterface.InfoPersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class Llenar implements Task {

    private List<UtestDatos> datos;

    public Llenar(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static Llenar laPagina(List<UtestDatos> datos) {
        return Task.instrumented(Llenar.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Enter.theValue(datos.get(0).getStrNombre()).into(InfoPersonal.NOMBRE),
            Enter.theValue(datos.get(0).getStrApellido()).into(InfoPersonal.APELLIDO),
            Enter.theValue(datos.get(0).getStrEmail()).into(InfoPersonal.EMAIL),
            SelectFromOptions.byVisibleText(datos.get(0).getStrMesNacimiento()).from(InfoPersonal.MES_NACIMIENTO),
            SelectFromOptions.byVisibleText(datos.get(0).getStrDiaNaimiento()).from(InfoPersonal.DIA_NACIMIENTO),
            SelectFromOptions.byVisibleText(datos.get(0).getStrAnioNaccimiento()).from(InfoPersonal.ANIO_NACIMIENTO),
            Click.on(InfoPersonal.BOTON_DIRECCION)
    );
    }
}
