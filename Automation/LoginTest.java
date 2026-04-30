import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class LoginTest {
    public static void main(String[] args) {

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Add wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open website
        driver.get("https://www.saucedemo.com/");

        // Enter username
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        // Enter password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // Click login
        driver.findElement(By.id("login-button")).click();

        // Validate login
        String currentUrl = driver.getCurrentUrl();

        if(currentUrl.contains("inventory")) {
            System.out.println("Login Successful - PASS");
        } else {
            System.out.println("Login Failed - FAIL");
        }

        // Close browser
        driver.quit();
    }
}