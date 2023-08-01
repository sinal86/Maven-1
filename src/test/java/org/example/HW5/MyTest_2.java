package org.example.HW5;

import org.example.BaseClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyTest_2 extends BaseClass {
    @Before
    public void setUp() {
        initDriver();
    }

    @Test
    public void LogoLJ() {
        webDriver.get("https://www.livejournal.com/");
        WebElement webElement2 = webDriver.findElement(By.xpath("//div[contains(@class, 'mainpage__box')]"));
        Assert.assertNotEquals(0, webElement2.getSize());
    }
}
