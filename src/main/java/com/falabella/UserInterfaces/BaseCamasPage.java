package com.falabella.UserInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class BaseCamasPage extends PageObject {

    public static final Target IMG_PRIMER_PRODUCTO = Target.the("imagen primer producto a seleccionar").located(By.xpath("//img[@src='https://falabella.scene7.com/is/image/FalabellaCO/2747905?wid=240&hei=240&qlt=70']"));
    public static final Target BTN_AGREGAR_PRIMER_PRODUCTO = Target.the("boton agregar primer producto").located(By.id("testId-Pod-action-2747905"));
    public static final Target BTN_BOLSA_COMPRAS_PRIMER_PRODUCTO = Target.the("boton ver bolsa de compras primer producto").located(By.xpath("//a[@id='linkButton']"));
    public static final Target IMG_SEGUNDO_PRODUCTO = Target.the("imagen segundo producto a seleccionar").located(By.xpath("//img[@src='https://falabella.scene7.com/is/image/FalabellaCO/36269017?wid=240&hei=240&qlt=70']"));
    public static final Target BTN_AGREGAR_SEGUNDO_PRODUCTO = Target.the("boton agregar segundo producto").located(By.id("testId-Pod-action-36269017"));
    public static final Target BTN_BOLSA_COMPRAS_SEGUNDO_PRODUCTO = Target.the("boton ver bolsa de compras segundo producto").located(By.xpath("//a[@href='https://www.falabella.com.co/falabella-co/basket?v1']"));


}

