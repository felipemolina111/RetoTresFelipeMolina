package com.falabella.UserInterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegistroPage extends PageObject {

    public static final Target TXT_NOMBRE = Target.the("nombre").located(By.name("user"));
    public static final Target TXT_APELLIDO_PATERNO = Target.the("apellido paterno").located(By.name("apellidopaterno"));
    public static final Target TXT_APELLIDO_MATERNO = Target.the("apellido materno").located(By.name("apellidomaterno"));
    public static final Target TXT_EMAIL = Target.the("email").located(By.xpath("//input[@id='mail']"));
    public static final Target TXT_CLAVE = Target.the("clave").located(By.xpath("//input[@id='clave1']"));
    public static final Target TXT_CONFIRMAR_CLAVE = Target.the("confirmar clave").located(By.xpath("//input[@id='clave2']"));
    public static final Target TXT_NUMERO_DOCUMENTO = Target.the("numero documento").located(By.xpath("//input[@id='cedula_colombia']"));
    public static final Target RDO_HOMBRE = Target.the("genero hombre").located(By.xpath("(//input[@id='tipodireccion_0'])[1]"));
    public static final Target LST_DIA = Target.the("dia").located(By.xpath("//select[@id='day']"));
    public static final Target LST_MES = Target.the("mes").located(By.xpath("//select[@id='month']"));
    public static final Target LST_ANO = Target.the("año").located(By.xpath("//select[@id='year']"));
    public static final Target TXT_CELULAR = Target.the("celular").located(By.xpath("//input[@id='celular']"));
    public static final Target CHK_ACEPTAR_CONDICIONES = Target.the("check aceptar condiciones").located(By.xpath("//input[@id='agreelegaleId']"));
    public static final Target BTN_GUARDAR = Target.the("boton crear cuenta").located(By.xpath("//a[@id='boton_Ar']"));
}
