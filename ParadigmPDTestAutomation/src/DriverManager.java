import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class DriverManager
{
    static WebDriver driver;

    public static void CreateSafariDriver()
    {
        driver = new SafariDriver();
    }

    public static void GoToHomePage()
    {
        driver.get("http://www.paradigmpd.com");
        driver.manage().window().maximize();
    }

    public static void QuitSafariDriver()
    {
        driver.quit();
    }
}
