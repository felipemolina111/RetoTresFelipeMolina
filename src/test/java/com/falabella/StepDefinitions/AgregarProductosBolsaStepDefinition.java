package com.falabella.StepDefinitions;

import com.falabella.Questions.ValidacionProductosEnBolsa;
import com.falabella.Task.AgregarProductosBolsa;
import com.falabella.UserInterfaces.PaginaPrincipalPage;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AgregarProductosBolsaStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor pedro = Actor.named("pedro");

    private PaginaPrincipalPage paginaPrincipalPage = new PaginaPrincipalPage();

    @Before
    public void configuracion (){
        pedro.can(BrowseTheWeb.with(navegador));
        pedro.wasAbleTo(Open.browserOn(paginaPrincipalPage));}


    @Cuando("El usuario inicie sesion y agregue los productos")
    public void elUsuarioAgregueLosProductos() {
        pedro.attemptsTo(AgregarProductosBolsa.agregarProductosBolsa());
    }

    @Entonces("El usuario visualizara la cantidad de productos")
    public void elUsuarioVisualizaraLaCantidadDeProductos() {
        pedro.should(seeThat("el actor puede ver", ValidacionProductosEnBolsa.validar(), Matchers.equalTo("2")));
    }

}
