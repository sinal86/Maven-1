package org.example.HW5;

import org.example.BaseClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyTest_2 extends BaseClass {

    @Test
    public void LogoLJ() {
        open("https://www.livejournal.com/");
        WebElement webElement2 = driver.findElement(By.xpath("//div[contains(@class, 'mainpage__box')]"));
        Assert.assertNotEquals(0, webElement2.getSize());
    }
}
