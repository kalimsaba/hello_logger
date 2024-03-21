import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;


public class App {

    static {
        // must set before the Logger
        // loads logging.properties 
        try {
            //If the program cannot find the file, right-click on the .properties file, and get the relative path
            LogManager.getLogManager().readConfiguration(new FileInputStream("resources/logging.properties"));
        } catch (SecurityException | IOException e1) {
            //No logger, yet. Printing to console
            e1.printStackTrace();
        }
    }
  
    private static final Logger logger = Logger.getLogger(App.class.getName());
    

    public static void main(String[] args)  {    

        logger.log(Level.INFO,"The 'Hello, World' program runs");
        System.out.println("Hello, World!");
    }
}
