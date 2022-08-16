package com.falabella.Questions;

import com.falabella.UserInterfaces.SesionIniciadaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionRegistro implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return SesionIniciadaPage.MSJ_CUENTA_CREADA.resolveFor(actor).isVisible(); }

    public static Question validar(){ return new ValidacionRegistro(); }


}
