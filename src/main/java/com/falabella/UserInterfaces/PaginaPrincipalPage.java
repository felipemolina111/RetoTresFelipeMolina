package com.falabella.UserInterfaces;


import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.falabella.com.co/falabella-co")

public class PaginaPrincipalPage extends PageObject {

    public static final Target BTN_INICIO_SESION = Target.the("boton iniciar sesion").located(By.xpath("//i[@class='UserInfo-module_icon-user1__lNpOl']"));
    public static final Target BTN_REGISTRATE =     Target.the("boton registrate").located(By.xpath("//a[@href='https://www.falabella.com.co/falabella-co/myaccount/register.jsp']"));
    public static final Target BTN_CATEGORIAS =     Target.the("boton categorias").located(By.xpath("//div[@class='HamburgerBtn-module_icon__1ctEI']"));
    public static final Target BTN_DORMITORIO =     Target.the("boton dormitorio").located(By.xpath("//p[text()='Dormitorio']"));
    public static final Target BTN_BASECAMA =     Target.the("boton basecama").located(By.xpath("//a[@href='/falabella-co/category/cat50527/Camas-y-Base-Camas']"));
    public static final Target TXT_CORREO =     Target.the("ingresar correo").located(By.xpath("//input[@name='email']"));
    public static final Target TXT_CONSIGNA =     Target.the("ingresar la contraseña").located(By.xpath("//input[@name='password']"));
    public static final Target BTN_INGRESAR =     Target.the("boton iniciar sesion").located(By.xpath("//button[@type='submit']"));

}


