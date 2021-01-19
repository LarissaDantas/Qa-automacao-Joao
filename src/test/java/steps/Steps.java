package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.WebDriver;
import page.Page;

public class Steps {

    WebDriver driver = config.config.CreateWebDriver("chrome");

    Page page = new Page(driver);

    @Dado("^que acesso o site da shoestock (.*)$")
    public void AcessoOSitedaShoestock(String url) throws Exception {
        page.acessarUrlLogin(url);
    }

    @Entao("^valido se o texto é o mesmo do modal$")
    public void validoSeOTextoÉOMesmoDoModal() {
        page.validarTexto();
        page.fecharNavegador();
    }

    @Quando("^seleciono a sandalia desejada$")
    public void selecionoASandaliaDesejada() {
        page.sandaliaDesejada();
    }

    @Entao("^visualiso a sandalia no meu carrinho$")
    public void visualisoASandaliaNoMeuCarrinho() {
        page.validarTexto();
        page.fecharNavegador();
    }

    @E("^seleciono o modelo de sandalias$")
    public void selecionoOModeloDeSandalias(){ page.selecionoOModeloDeSandalia();
    }
}
