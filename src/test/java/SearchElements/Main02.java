package SearchElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main02 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://hotel-testlab.coderslab.pl/en/");

        WebElement hotelLoccationInput = driver.findElement(By.name("hotel_location"));
        hotelLoccationInput.sendKeys("Warsaw");
        WebElement searchNowButton = driver.findElement(By.name("search_room_submit"));
        WebElement enterYourEmailInput = driver.findElement(By.name("email"));
        enterYourEmailInput.sendKeys("test@test.com");
        WebElement subscribeButton = driver.findElement(By.name("submitNewsletter"));

        searchNowButton.click();

        //driver.quit();
    }
}
