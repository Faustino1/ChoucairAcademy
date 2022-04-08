package co.com.utest.stepdefinitions;

import co.com.choucair.certification.model.UtestDatos;
import co.com.choucair.certification.questions.Responder;
import co.com.choucair.certification.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^Faustino desea registrarse en Utest$")
    public void faustinoDeseaRegistrarseEnUtest() throws Exception{
        OnStage.theActorCalled("Faustino").wasAbleTo(Abrir.Lapagina());
    }

    @When("^El usuario ingresa los datos requeridos por el sistema$")
    public void elUsuarioIngresaLosDatosRequeridosPorElSistema(List<UtestDatos> datos) throws Exception {
    OnStage.theActorInTheSpotlight().attemptsTo(Llenar.laPagina(datos), LlenarDireccion.laPagina(datos),
            LlenarDispositivos.laPagina(datos), LlenarFinal.laPagina(datos));
    }

    @Then("^El registro se completa al ver el boton de Complete Setup")
    public void elRegistroSeCompletaAlVerElBotonDeCompleteSetup(List<UtestDatos> datos) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.aLos(datos)));
    }

}
