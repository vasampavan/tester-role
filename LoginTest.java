package loginPage;
//importing packages.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.TimeoutException;

public class LoginTest { 
    public static void main(String[] args) {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "E:\\tester role\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        try {
    
            driver.get("https://practicetestautomation.com/practice-test-login/"); // Opening login page.
                
                WebElement usernameField = driver.findElement(By.id("username")); //finding username field in the page.
                usernameField.sendKeys("student"); //entering text as "student" into the username field.
               
                WebElement passwordField = driver.findElement(By.id("password")); //finding password field in the page.
                passwordField.sendKeys("Password123"); //entering text as "Password123" into the password field.
                
                WebElement submitButton = driver.findElement(By.id("submit")); //finding submit button in the page.
                submitButton.click(); //Clicking submit button
               
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Wait for 10 seconds to load new page.
                wait.until(ExpectedConditions.urlContains("practicetestautomation.com/logged-in-successfully/")); //waiting until the url contains log-in successful page url.
                    System.out.println("Login successful..."); //printing login successful message on the console.
        } catch (TimeoutException e) {
            System.out.println("Login Unsuccessful..."); //printing login unsuccessful message on the console.
        } finally {
          
            driver.close(); // Close the browser
        }
    }   
}
