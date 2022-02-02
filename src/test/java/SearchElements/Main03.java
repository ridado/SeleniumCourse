package SearchElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main03 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://hotel-testlab.coderslab.pl/en/");

        driver.findElement(By.className("hide_xs")).click();
        driver.findElement(By.cssSelector(".is_required.validate.account_input.form-control"))
                .sendKeys("abc@test.com");
        driver.findElement(By.id("SubmitCreate")).click();

        driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Jan");
        driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Nowak");

        WebElement userEmail = driver.findElement(By.xpath("//input[@id='email']"));
        userEmail.clear();
        userEmail.sendKeys("1bc@test.pl");

        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("qwert123");
        driver.findElement(By.xpath("//*[@id='submitAccount']")).click();

        driver.findElement(By.cssSelector("class.icon-user")).click();

        driver.quit();
    }
}
