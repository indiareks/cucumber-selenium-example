
import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber-html-report",
        "json-pretty:target/cucumber-report.json"},tags = {"@temp"})
public class TestRun_cukes {
}
