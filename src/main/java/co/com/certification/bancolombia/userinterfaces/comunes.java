package co.com.certification.bancolombia.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class comunes {

    public static final Target BTN_REGISTRAR = Target.the("Boton de registrar").locatedBy("//a[@class='unauthenticated-nav-bar__sign-up']");
    public static final Target BTN_UBICACION = Target.the("Boton de registrar").locatedBy("//font[contains(text(),'{0}");
    public static final Target ACCESO = Target.the("Boton de registrar").locatedBy("//span[contains(text(),'Next: Last Step')]");
    public static final Target MENSAJE = Target.the("Boton de registrar").locatedBy("//font[contains(text(),'¡Bienvenido a la comunidad')]");

}
