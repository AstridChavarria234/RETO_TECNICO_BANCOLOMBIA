package stepDefinitions;

import co.com.certification.bancolombia.questions.validarMensajeBienvenida;
import co.com.certification.bancolombia.tasks.ingresarDatosUsuario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class registroUsuario {


    @Dado("que se quiere registrar un usuario")
    public void ingresarDatosUsuario() {
        theActorInTheSpotlight().attemptsTo(ingresarDatosUsuario.datosUsuario());
    }

    @Cuando("se realice el registro")
    public void registrarUsuario() {


    }

    @Entonces("se deberia visualizar el mensaje de bienvenida")
    public void validarMensaje() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(validarMensajeBienvenida.bienvenida()));
    }
}
