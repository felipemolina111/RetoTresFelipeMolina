package com.falabella.StepDefinitions;

import com.falabella.Task.Registro;
import com.falabella.UserInterfaces.PaginaPrincipalPage;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class RegistroStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor juan = Actor.named("juan");

    private PaginaPrincipalPage paginaPrincipalPage = new PaginaPrincipalPage();

    @Before
    public void configuracion (){
        juan.can(BrowseTheWeb.with(navegador)); }

    @Dado("El usuario se encuentre en la pagina")
    public void elUsuarioSeEncuentreEnLaPagina() {
        juan.wasAbleTo(Open.browserOn(paginaPrincipalPage));
    }

    @Cuando("El usuario llene todos los campos")
    public void elUsuarioLleneTodosLosCampos() {
        juan.attemptsTo(Registro.registro());
    }
    @Entonces("El usuario visualizara el mensaje de mi cuena")
    public void elUsuarioVisualizaraElMensajeDeMiCuena() {

    }


}
