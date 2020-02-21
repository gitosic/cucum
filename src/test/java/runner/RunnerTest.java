package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "runner",
        tags = "@withdrawal",
        snippets = SnippetType.CAMELCASE
//        name = "^Успешное|Успешная.*"
)
public class RunnerTest {
    @BeforeClass
    public static void connectDB(){
        System.out.println("BeforeClass");
        //throw new QAException("QAException_BeforeClass777");
    }
}