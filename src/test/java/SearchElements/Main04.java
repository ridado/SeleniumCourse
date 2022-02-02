package SearchElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main04 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://hotel-testlab.coderslab.pl/en/");

        driver.findElement(By.className("hide_xs")).click(); //klika sign in
        driver.findElement(By.cssSelector("[id='email']"))
                .sendKeys("1bc@test.pl"); //wpisuje email
        driver.findElement(By.cssSelector("[data-validate='isPasswd']"))
                .sendKeys("qwert123"); //wpisuje hasło
        driver.findElement(By.cssSelector("[id='SubmitLogin']")).click(); //logowanie

        //driver.findElement(By.cssSelector("[title='Information']")).click();// wyświetla personal info
        driver.findElement(By.cssSelector("[title='Addresses']")).click(); //wyświetla my address

        // driver.quit();


    }
}
