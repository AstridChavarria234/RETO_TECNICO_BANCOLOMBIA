package co.com.certification.bancolombia.tasks;

import co.com.certification.bancolombia.userinterfaces.camposUsuario;
import co.com.certification.bancolombia.userinterfaces.comunes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ingresarDatosUsuario implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(comunes.BTN_REGISTRAR));
        actor.attemptsTo(Enter.theValue("prueba1").into(camposUsuario.PRIMER_NOMBRE),
                Click.on(camposUsuario.APELLIDO),
                Enter.theValue("resultados").into(camposUsuario.APELLIDO),
                Click.on(camposUsuario.EMAIL),
                Enter.theValue("prueba@gmail.com").into(camposUsuario.EMAIL),
                SelectFromOptions.byVisibleText("January").from(camposUsuario.MES),
                SelectFromOptions.byVisibleText("2").from(camposUsuario.DIA),
                SelectFromOptions.byVisibleText("1998").from(camposUsuario.AGNO));

        actor.attemptsTo(Click.on(comunes.BTN_UBICACION.of("Siguiente: Ubicación")),
                Click.on(comunes.BTN_UBICACION.of("Siguiente: Dispositivos")));
        actor.attemptsTo(Click.on(camposUsuario.INGRESO_DATO),
                Enter.theValue("Linux").into(camposUsuario.INGRESO_DATO),
                Click.on(camposUsuario.LISTA),
                Click.on(camposUsuario.INGRESO_DATO),
                Enter.theValue("Fedora").into(camposUsuario.INGRESO_DATO),
                Click.on(camposUsuario.LISTA),
                Click.on(camposUsuario.INGRESO_DATO),
                Enter.theValue("Danish").into(camposUsuario.INGRESO_DATO),
                Click.on(camposUsuario.LISTA),
                Click.on(camposUsuario.INGRESO_DATO),
                Enter.theValue("Evolio").into(camposUsuario.INGRESO_DATO),
                Click.on(camposUsuario.LISTA));
        actor.attemptsTo(Click.on(comunes.ACCESO));
        actor.attemptsTo(Click.on(camposUsuario.CLAVE),
                Enter.theValue("AS990418.asophos").into(camposUsuario.CLAVE),
                Click.on(camposUsuario.CONFIRMAR_CLAVE),
                        Enter.theValue("AS990418.asophos").into(camposUsuario.CONFIRMAR_CLAVE));











    }

    public static ingresarDatosUsuario datosUsuario() {
        return instrumented(ingresarDatosUsuario.class);
    }
}
