package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Main_Page {
    @FindBy(xpath = "//a[contains(text(), 'Âîéòè')]")
    private WebElement enter;

    @FindBy(xpath = "///span[contains(text(), 'ÑÎÇÄÀÒÜ')]")
    private WebElement create;

    public WebElement getEnter() {
        return enter;
    }

    public WebElement getCreate() {
        return create;
    }
}
