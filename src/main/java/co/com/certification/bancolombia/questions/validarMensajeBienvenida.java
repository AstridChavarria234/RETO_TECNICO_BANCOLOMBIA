package co.com.certification.bancolombia.questions;

import co.com.certification.bancolombia.userinterfaces.comunes;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class validarMensajeBienvenida implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
       return comunes.MENSAJE.resolveFor(actor).getText().contains("Bienvenido");
    }

    public static validarMensajeBienvenida bienvenida() {
        return new validarMensajeBienvenida();
    }
}
