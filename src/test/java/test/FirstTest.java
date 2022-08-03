package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    public static void main(String[] args) {
       // System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
        //--The above was used before we added the webdriver manager dependecies
        //--Now we can write the code like below -

       WebDriverManager.chromedriver().setup();
      //  WebDriverManager.chromedriver().driverVersion("102.0.5005.61").setup(); // --This same as above just and example with
        //-- a specfied version of chrome browser
        WebDriver driver = new ChromeDriver(); // created webdriver object

        driver.get("https://www.google.co.uk/");
        driver.close();
    }


}
