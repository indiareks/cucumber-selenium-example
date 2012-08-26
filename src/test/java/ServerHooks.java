
import cucumber.annotation.After;
import cucumber.annotation.Before;

import java.io.IOException;
import static java.lang.System.out;

public class ServerHooks {
    public static final int PORT = 8887;

    private TemperatureServer temperatureServer;

    @Before("@temp")
    public void startServer() throws IOException {
        temperatureServer = new TemperatureServer(PORT);
        temperatureServer.start();
        out.println("Before scenario------------------------")   ;
    }

    @After  ("@temp")
    public void stopServer() throws IOException {
        temperatureServer.stop();
        out.println("after scenario~~~~~~~~~~~~~~~~~~~~~~~~~~~")   ;
    }


}
