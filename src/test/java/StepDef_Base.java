import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 * User: kphani
 * Date: 20/8/12
 * Time: 7:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class StepDef_Base {

    protected   static WebDriver driver=null;

    @Before
    public void StepDef_Base() {
        this.driver = new SharedDriver() ;
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
