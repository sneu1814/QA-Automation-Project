import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class CartTest {
    public static void main(String[] args) {

        // Launch browser
        WebDriver driver = new ChromeDriver();

        // Add wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open website
        driver.get("https://www.saucedemo.com/");

        // Login first
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Add product to cart
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

        // Get cart count
        String cartCount = driver.findElement(By.className("shopping_cart_badge")).getText();

        // Validate cart
        if(cartCount.equals("1")) {
            System.out.println("Product added to cart - PASS");
        } else {
            System.out.println("Cart Test Failed - FAIL");
        }

        // Close browser
        driver.quit();
    }
}git push