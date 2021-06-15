package br.com.automationPratice.myStore.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "br/com/automationPratice/myStore/steps",
		plugin = {"pretty","html:target/cucumber-reports"},
		tags = "@CadastroDeCliente",
		monochrome = true	
)

public class Runner {

}
