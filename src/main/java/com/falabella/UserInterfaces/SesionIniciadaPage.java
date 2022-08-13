package com.falabella.UserInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SesionIniciadaPage extends PageObject {

    public static final Target MSJ_CUENTA_CREADA = Target.the("mensaje cuenta creada").located(By.xpath("//p[text()='TU CUENTA YA ESTÁ CREADA']"));
    public static final Target BTN_IR_COMPRAR = Target.the("boton ir a comprar").located(By.xpath("//a[text()='IR A COMPRAR']"));
}

