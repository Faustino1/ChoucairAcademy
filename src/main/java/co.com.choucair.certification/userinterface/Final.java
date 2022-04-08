package co.com.choucair.certification.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Final {
    public static final Target CLAVE = Target.the("Crea tu contrasena")
            .located(By.id("password"));

    public static final Target CONFIRMA_CLAVE = Target.the("Confirma tu contrasena")
            .located(By.id("confirmPassword"));

    public static final Target CHECKBOX_OPCIONAL = Target.the("Mantengame actualizado por correo")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));

    public static final Target TERMINOS = Target.the("Terminos de uso")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target POLITICAS = Target.the("Politicas de Privacidad")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BOTON_COMPLETAR = Target.the("Politicas de Privacidad")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

}
