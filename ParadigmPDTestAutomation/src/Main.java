import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import java.sql.Driver;

public class Main
{
    public static void main(String[] args) throws InterruptedException
    {
        DriverManager.CreateSafariDriver();
        Thread.sleep(3000);
        System.out.println("Safari browser opened. System ready to test.");
        DriverManager.GoToHomePage();
    }

    public static void TestHome ()
    {

    }
}