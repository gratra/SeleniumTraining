package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocators {
    public static void main(String[] args) throws InterruptedException {
        // System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        //--The above was used before we added the webdriver manager dependecies
        //--Now we can write the code like below -

        WebDriverManager.chromedriver().setup();
        //--WebDriverManager.chromedriver().driverVersion("102.0.5005.61").setup(); // --This same as above just and example with
        //-- a specified version of chrome browser

        WebDriver driver = new ChromeDriver(); // created web-driver object

        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        driver.findElement(RelativeLocator.with(By.tagName("input")).above(loginButton)).sendKeys("Test123456");
        Thread.sleep(2000);

        driver.close();
    }
}
