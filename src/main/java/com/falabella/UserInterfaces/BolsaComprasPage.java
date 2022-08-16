package com.falabella.UserInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BolsaComprasPage extends PageObject {

    public static final Target TXT_BUSQUEDA = Target.the("ingresar busqueda").located(By.xpath("//input[@type='search']"));
    public static final Target BTN_REALIZAR_BUSQUEDA = Target.the("enter realizar busqueda").located(By.xpath("//a[@class='fb-masthead__util-bar__link fb-masthead-search__box__button-search']"));
    public static final Target MSJ_CANTIDAD_PRODUCTOS = Target.the("mensaje de cantidad de productos").located(By.xpath("//i[@class='fb-masthead-basket__count notranslate']"));


}
