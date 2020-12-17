package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;

public class UsuarioStepdefs {
    @Dado("Eu execute o metodo GET")
    public void euExecuteOMetodoGET() {
    }

    @Entao("Eu devo ver os nome dos usuarios")
    public void euDevoVerOsNomeDosUsuarios() {
    }

    @Dado("Eu realizo a metodo POST")
    public void euRealizoAMetodoPOST() {
    }

    @Dado("Eu realize o metodo Put")
    public void euRealizeOMetodoPut() {
    }

    @E("Eu realizo atualizo {string}")
    public void euRealizoAtualizo(String arg0) {
    }

    @Dado("Eu realize um POST para {string}")
    public void euRealizeUmPOSTPara(String arg0) {
    }

    @E("Eu realizo um delete para {string}")
    public void euRealizoUmDeletePara(String arg0) {
    }

    @E("Eu realizo um GET com o paramentro {string}")
    public void euRealizoUmGETComOParamentro(String arg0) {
    }

    @Entao("Eu {string} ver o nome {string}")
    public void euVerONome(String arg0, String arg1) {
    }
}
