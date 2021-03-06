

import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class StepDef_Temperature {
    private final WebDriver webDriver;


    public StepDef_Temperature(SharedDriver webDriver) {
        this.webDriver = webDriver;
    }

    @When("^I enter ([\\d.]+) Celcius$")
    public void i_enter_Celcius(double celcius) {
        webDriver.findElement(By.id("celcius")).sendKeys(String.valueOf(celcius));
    }

    @Then("^I should see ([\\d.]+) Fahrenheit$")
    public void i_should_see_Fahrenheit(double fahrenheit) {
        assertEquals(String.valueOf(fahrenheit), webDriver.findElement(By.id("fahrenheit")).getAttribute("value"));
    }
}
