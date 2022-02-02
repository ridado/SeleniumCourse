package Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.NoSuchElementException;

public class Main01 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //opóznienie wykonania

        driver.get("https://hotel-testlab.coderslab.pl/en/");

        driver.findElement(By.className("hide_xs")).click();
        driver.findElement(By.cssSelector(".is_required.validate.account_input.form-control"))
                .sendKeys("abc@test.com");
        driver.findElement(By.id("SubmitCreate")).click();

        WebElement searchFirstName = driver.findElement(By.id("customer_firstname"));
        if(searchFirstName.isDisplayed()){
            searchFirstName.sendKeys("Peter");
        } else{
            throw new ElementNotVisibleException("Element firstName is not visible");
        }
        WebElement searchLastName = driver.findElement(By.id("customer_lastname"));
        if(searchLastName.isDisplayed()){
            searchLastName.sendKeys("Stanley");
        } else{
            throw new ElementNotVisibleException("Element lastName is not visible");
        }

        WebElement searchEmail = driver.findElement(By.id("email"));
        if(searchEmail.isDisplayed()){
            searchEmail.clear();
            searchEmail.sendKeys("asdfs@test.pl");
        } else{
            throw new ElementNotVisibleException("Element email is not visible");
        }
        WebElement searchPassword = driver.findElement(By.id("passwd"));
        if(searchPassword.isDisplayed()){
            searchPassword.sendKeys("M@gia1123");
        } else{
            throw new ElementNotVisibleException("Element password is not visible");
        }
        driver.findElement(By.name("submitAccount")).click();
        //driver.quit();
    }
}
