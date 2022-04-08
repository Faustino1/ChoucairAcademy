package co.com.choucair.certification.userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Dispositivos {
    public static final Target CONTENEDOR_DISPOSITIVOS = Target.the("Contenedor de dispositivos")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div"));

    public static final Target DISPOSITIVO_MOVIL = Target.the("Dispositivo movil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/input[1]"));

    public static final Target CONTENEDOR_MODELO = Target.the("Contenedor modelo")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div"));

    public static final Target DISPOSITIVO_MODELO = Target.the("Dispositivo movil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/input[1]"));

    public static final Target CONTENEDOR_SISTEMA_OPERATIVO = Target.the("Contenedor del sisema operativo")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div"));

    public static final Target SISTEMA_OPERATIVO = Target.the("Sistema operativo del dispositivo")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/input[1]"));

    public static final Target BOTON_FINAL = Target.the("Boton final")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}
