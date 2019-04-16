import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.sql.Driver;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        DriverManager.CreateSafariDriver();
        System.out.println("Safari browser opened. System ready to test.");
        DriverManager.GoToHomePage();
        RunTestScripts();
    }

    public static void RunTestScripts() throws InterruptedException
    {
        System.out.println("Test scripts are now running...");
        HomePage.ClickICFLink();
        DriverManager.QuitSafariDriver();
    }
}
