package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class BrowserActions {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.co.uk/");
        driver.navigate().to("https://automationstepbystep.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle()); ;


       // driver.findElement(By.linkText("")).click();

        //screenshot code

       File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile,new File("./image1.png"));

        driver.close();
    }
    }
