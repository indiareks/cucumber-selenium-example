import cucumber.annotation.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created with IntelliJ IDEA.
 * User: kphani
 * Date: 20/8/12
 * Time: 6:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class StepDef_Hotmail {
    private final WebDriver driver;

    public StepDef_Hotmail(SharedDriver driver) {
        this.driver = driver;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

       @Given("^I am on the blank web browser$")
    public void I_am_on_the_blank_web_browser() throws Throwable {
           driver.get("");
            }

    @When("^go I to Hot mail home page$")
    public void go_I_to_Hot_mail_home_page() throws Throwable {
       driver.get("http://www.hotmail.co.uk");
    }

    @Then("^browser should show login and password fields$")
    public void basicElementCheck() {
        assertTrue(driver.findElement(By.id("i0116")).isDisplayed());
        assertTrue(driver.findElement(By.id("idDiv_PWD_PasswordExample")).isDisplayed());

    }
}
