package com.falabella.Task;

import com.falabella.Utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import static com.falabella.UserInterfaces.PaginaPrincipalPage.*;
import static com.falabella.UserInterfaces.BaseCamasPage.*;
import static com.falabella.UserInterfaces.BolsaComprasPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;



public class AgregarProductosBolsa implements Task {

    Datos datos = new Datos();


    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(

                    /*Click.on(BTN_INICIO_SESION),
                    Enter.theValue(datos.leerDatosExcel("DatosRetoTres.xlsx","Registro",1,3)).into(TXT_CORREO),
                    Enter.theValue(datos.leerDatosExcel("DatosRetoTres.xlsx","Registro",1,5)).into(TXT_CONSIGNA),
                    Click.on(BTN_INGRESAR),
                    WaitUntil.the(BTN_INGRESAR, isNotVisible()),
                    Click.on(BTN_IR_COMPRAR),*/

                    // TODO: El login no funciona correctamente por seguridad de la pagina
                    Click.on(BTN_CATEGORIAS),
                    Click.on(BTN_DORMITORIO),
                    Click.on(BTN_BASECAMA),
                    Scroll.to(IMG_PRIMER_PRODUCTO),
                    HoverOverElement.over(IMG_PRIMER_PRODUCTO),
                    Click.on(BTN_AGREGAR_PRIMER_PRODUCTO),
                    Click.on(BTN_BOLSA_COMPRAS_PRIMER_PRODUCTO),
                    Enter.theValue("base cama").into(TXT_BUSQUEDA),
                    Click.on(BTN_REALIZAR_BUSQUEDA),
                    Scroll.to(IMG_SEGUNDO_PRODUCTO),
                    HoverOverElement.over(IMG_SEGUNDO_PRODUCTO),
                    Click.on(BTN_AGREGAR_SEGUNDO_PRODUCTO),
                    Click.on(BTN_BOLSA_COMPRAS_SEGUNDO_PRODUCTO)

            );
        } catch (Exception e) {

        }
    }

        public static AgregarProductosBolsa agregarProductosBolsa(){ return instrumented (AgregarProductosBolsa.class); }

}
