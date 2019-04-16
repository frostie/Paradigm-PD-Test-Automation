import org.openqa.selenium.By;

public class HomePage
{

    public static void ClickICFLink() throws InterruptedException
    {
        DriverManager.driver.findElement(By.linkText("International Coach Federation")).click();
        Thread.sleep(5000);
//        DriverManager.driver.findElement(By.className("sign-in")).click();
    }

    public static void ClickEQLink()
    {

    }

    public static void ClickIPLLink()
    {

    }

    public static void ClickLearnMore()
    {

    }
}
