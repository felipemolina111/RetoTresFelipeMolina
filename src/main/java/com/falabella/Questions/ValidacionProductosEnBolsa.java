package com.falabella.Questions;

import com.falabella.UserInterfaces.BolsaComprasPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionProductosEnBolsa implements Question {

    @Override
    public Object answeredBy(Actor actor) {
        return BolsaComprasPage.MSJ_CANTIDAD_PRODUCTOS.resolveFor(actor).getText(); }

    public static Question validar(){
        return new ValidacionProductosEnBolsa();
    }



}
