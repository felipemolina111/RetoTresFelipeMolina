package com.falabella.Task;

import com.falabella.Utils.Datos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;


import java.io.IOException;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.falabella.UserInterfaces.PaginaPrincipalPage.*;
import static com.falabella.UserInterfaces.RegistroPage.*;

public class Registro implements Task {

    Datos datos = new Datos();



    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(Click.on(BTN_INICIO_SESION),
                    Click.on(BTN_REGISTRATE),
                    Enter.theValue(datos.leerDatosExcel("DatosRetoTres.xlsx","Registro",1,0)).into(TXT_NOMBRE),
                    Enter.theValue(datos.leerDatosExcel("DatosRetoTres.xlsx","Registro",1,1)).into(TXT_APELLIDO_PATERNO),
                    Enter.theValue(datos.leerDatosExcel("DatosRetoTres.xlsx","Registro",1,2)).into(TXT_APELLIDO_MATERNO),
                    Enter.theValue(datos.leerDatosExcel("DatosRetoTres.xlsx","Registro",1,3)).into(TXT_EMAIL),
                    Enter.theValue(datos.leerDatosExcel("DatosRetoTres.xlsx","Registro",1,4)).into(TXT_CLAVE),
                    Enter.theValue(datos.leerDatosExcel("DatosRetoTres.xlsx","Registro",1,5)).into(TXT_CONFIRMAR_CLAVE),
                    Enter.theValue(datos.leerDatosExcel("DatosRetoTres.xlsx","Registro",1,8)).into(TXT_NUMERO_DOCUMENTO),
                    Click.on(RDO_HOMBRE),

                    SelectFromOptions.byVisibleText(datos.leerDatosExcel("DatosRetoTres.xlsx","Registro",1,9)).from(LST_DIA),
                    SelectFromOptions.byVisibleText(datos.leerDatosExcel("DatosRetoTres.xlsx","Registro",1,10)).from(LST_MES),
                    SelectFromOptions.byVisibleText(datos.leerDatosExcel("DatosRetoTres.xlsx","Registro",1,11)).from(LST_ANO),
                    Enter.theValue(datos.leerDatosExcel("DatosRetoTres.xlsx","Registro",1,12)).into(TXT_CELULAR),
                    Click.on(CHK_ACEPTAR_CONDICIONES)
            );
        }
        catch (IOException e){

        }
    }

    public static Registro registro (){ return instrumented (Registro.class); }



}
