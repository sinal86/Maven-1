package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.common.CommonAction;
import org.junit.After;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    protected WebDriver driver= CommonAction.createDriver();
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

    protected void switchWindow() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    protected void open(String url){
        driver.get(url);
    }
  public void quite() {driver.quit();}
}