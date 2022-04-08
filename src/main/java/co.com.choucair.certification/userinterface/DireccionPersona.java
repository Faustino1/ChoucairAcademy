package co.com.choucair.certification.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DireccionPersona {
    public static final Target CIUDAD = Target.the("Ciudad")
            .located(By.id("city"));

    public static final Target POSTAL = Target.the("Codigo postal")
            .located(By.id("zip"));

    public static Target PAIS_CONTENENDOR = Target.the("Contenedor para el pais")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));

    public static final Target PAIS = Target.the("Pais")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target BOTON_DISPOSITIVOS = Target.the("Boton que lleva a la seccion de dispositivos")
            .located(By.xpath("//a[class='btn btn-blue pull-right']"));



}
