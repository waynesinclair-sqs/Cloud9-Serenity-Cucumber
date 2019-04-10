import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources",
        glue="com.expleo.QE.stepdefinitions"
)

//features = "classpath:features"

public class CucumberWithSerenityTest
{
}
