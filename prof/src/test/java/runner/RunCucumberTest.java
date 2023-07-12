package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",	            // Path: features = "classpath:features"
    glue = "steps_definition",					            // Path: Steps
    monochrome = false,							            // Cores no Terminal default: false
    snippets = CucumberOptions.SnippetType.CAMELCASE,		// METHODOS do Steps em CAMELCASE
    dryRun = false,								            // Validar Steps sem executar o teste
    plugin = {									            // Plugins Cucumber para possivel integracao com Jenkins
        "pretty",
        "html:target/cucumber/index.html",
        "json:target/cucumber/index.json"
    }
    //,tags = { "@tagScenario" }

    /**
     * Executar testes no termial
     *
     *	$ mvn test
     *	$ mvn test -Dcucumber.options="--tags @tagScenario"
     *
     *	$ mvn clean
     *	$ mvn clean test
     * */
)
public class RunCucumberTest {
}
