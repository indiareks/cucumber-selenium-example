import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

import static java.lang.System.out;

public class StepDef_Hotmail {
   // private final WebDriver driver=null;

   /** public StepDef_Hotmail(SharedDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }**/

    @Given("^I am on the blank web (.*)")
    public void I_am_on_the_blank_web_firefox(String arg1) throws Throwable {
        out.println(arg1);
        }

    @When("^go I to (.*) home page$")
    public void go_I_to_gmail_home_page(String arg1) throws Throwable {
        out.println(arg1);
    }

    @Then("^browser should show the (.*)")
    public void browser_should_show_the_login(String arg1) throws Throwable {
        out.println(arg1);

    }

}