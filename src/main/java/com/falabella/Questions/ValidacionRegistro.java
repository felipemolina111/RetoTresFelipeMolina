package com.falabella.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidarRegistro implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return MensajeLoginPage.MSJ_LOGIN.resolveFor(actor).isVisible();
    }

    public static Question validar(){
        return new ValidacionLogin();
    }


}
