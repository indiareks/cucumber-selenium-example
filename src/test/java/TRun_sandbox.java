/**
 * Created with IntelliJ IDEA.
 * User: kphani
 * Date: 3/9/12
 * Time: 5:06 PM
 * To change this template use File | Settings | File Templates.
 */
import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(format = { "html:target/cucumber-html-report",
        "json-pretty:target/cucumber-report.json"},tags = {"@temp"})
public class TRun_sandbox {
}
