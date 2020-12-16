package runners;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/restassuredapi/features/Usuario.feature", glue = {"UsuarioStep"})
public class UsuarioRunner {

    
}
