package com.demoqa.pages;

import com.demoqa.drivers.DriverManager;
import com.demoqa.helper.DropdownHelper;
import com.demoqa.helper.WebElementActions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


// Абстрактный класс, который инициализирует элементы страницы с помощью PageFactory и DriverManager
public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }
    public WebElementActions webElementActions = new WebElementActions();
    public DropdownHelper dropdownHelper = new DropdownHelper(DriverManager.getDriver());
}
