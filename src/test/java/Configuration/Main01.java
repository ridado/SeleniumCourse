package Configuration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class Main01 {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.bing.com");
        WebElement element = driver.findElement(By.name("q"));
        element.clear();
        element.sendKeys("https://coderslab.pl/pl");
        element.submit();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.quit();
    }

}