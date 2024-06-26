package com.demoqa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertPage extends BasePage{

    @FindBy(id="alertButton")
    public WebElement alertBtn;

    @FindBy(id = "confirmButton")
    public WebElement confirmAlertBtn;

    @FindBy(id="promtButton")
    public WebElement promtAlertBtn;
}
