package co.com.choucair.certification.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

import java.lang.annotation.Target;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("Button that shows us the form to login")
            .located(By.xpath("//div[@class='d-none d-lg-block]//strong[conatins(text(), 'Ingresar']"));

    public static final Target INPUT_USER = Target.the(targeElemenName, "where do we write the user")
            .located(By.id("username"));

    public static final Target INPUT_PASSWORD=Target.the(targeElemenName, "where do we write the password")
            .located(By.id("password"));
}
