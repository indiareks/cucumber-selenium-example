import org.junit.Before;
import org.junit.Test;

import static java.lang.System.out;

/**
 * Created with IntelliJ IDEA.
 * User: kphani
 * Date: 10/8/12
 * Time: 8:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class Validate_zbox {
    //private TemperatureServer t = new TemperatureServer(10);
   // private TemperatureServer t2 = new TemperatureServer(10);
    // public static final WebDriver driver1 = new FirefoxDriver();

    private String t = "kph"     ;
    private String t2 = "kph"     ;

   static {
       //WebDriver driver = new FirefoxDriver();

   }
   public Validate_zbox(){
        System.out.println("defaulst qqqqqqqqqqqq ");

    }

    @Before
    public  void beforec(){
        System.out.println("BeforeClass ");

    }

  @Test
   public void test1(){

        String i=new String("dfd");
        String k=new String("dfd");
        TemperatureServer s;// = new TemperatureServer(10);
        TemperatureServer e;// = new TemperatureServer(10);

        out.println(t.hashCode());
        out.println(t);

        out.println(t2.hashCode());
        out.println(t2);
   }

    }




