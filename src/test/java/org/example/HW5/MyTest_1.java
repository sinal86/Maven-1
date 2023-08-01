package org.example.HW5;

import org.example.BaseClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MyTest_1 extends BaseClass {
    @Before
    public void setUp() {
        initDriver();
    }

    @Test
    public void LogoLJ() {
        webDriver.get("https://www.livejournal.com/");
        WebElement webElement1 = webDriver.findElement(By.xpath("//div[@class = 's-logo']//a[@href = \"https://www.livejournal.com\"]//span[contains(text(), 'LiveJournal')]"));
        Assert.assertTrue(webElement1.isDisplayed());
        Assert.assertEquals("LiveJournal", webElement1.getText());
    }
}
