package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class ListofElements {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://trytestingthis.netlify.app/");
      //  driver.navigate().to("https://trytestingthis.netlify.app/");
        Thread.sleep(2000);

        //To get the list of elements example from dropdown create variable

        List<WebElement> options = driver.findElements(By.name("Optionwithcheck[]"));
        for (WebElement element : options){
            System.out.println(element.getText());
        }

        System.out.println(options);
        driver.close();

      //  System.out.println(driver.getCurrentUrl());
      //  System.out.println(driver.getTitle());
        ;
    }
}

