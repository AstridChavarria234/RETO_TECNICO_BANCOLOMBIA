package co.com.certification.bancolombia.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class camposUsuario {

    public static final Target  PRIMER_NOMBRE = Target.the("primer nombre de  usuario").located(By.id("firstName"));
    public static final Target  APELLIDO = Target.the("apellido de usuario").located(By.id("lastName"));
    public static final Target  EMAIL = Target.the("direccion de correo ").located(By.id("email"));
    public static final Target  MES = Target.the("mes de nacimiento").located(By.id("birthMonth"));
    public static final Target  DIA = Target.the("dia de nacimiento").located(By.id("birthDay"));
    public static final Target  AGNO = Target.the("agno de nacimiento").located(By.id("birthYear"));
    public static final Target  INGRESO_DATO = Target.the("ingreso").locatedBy("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]");
    public static final Target  LISTA = Target.the("lista").locatedBy("//*[@id=\"ui-select-choices-row-15-0\"]/span/div");
    public static final Target  CLAVE = Target.the("clave").located(By.id("password"));
    public static final Target  CONFIRMAR_CLAVE = Target.the("confirmar clave").located(By.id("confirmPassword"));


}
