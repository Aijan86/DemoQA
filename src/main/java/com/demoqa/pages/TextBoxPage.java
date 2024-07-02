package com.demoqa.pages;

import com.demoqa.entities.TextBoxEntity;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class TextBoxPage extends BasePage{

    // Аннотация @FindBy: Используется для инициализации веб-элементов с помощью Selenium PageFactory.

    @FindBy(xpath ="//*[@id='userName']")
    public WebElement fullNameInput;

    @FindBy(id = "userEmail")
    public WebElement emailInput;

    @FindBy(id = "currentAddress")
    WebElement currentAddressInput;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddresseInput;

    @FindBy(id = "submit")
public WebElement submitBtn;


    public TextBoxPage fillUpTextBoxForm(String fullname, String email, String currentAddress, String permanentAddress) {
        webElementActions.sendKeys(fullNameInput,fullname)
                .sendKeys(emailInput,email)
                .sendKeys(currentAddressInput,currentAddress)
                .sendKeys(permanentAddresseInput,permanentAddress)
                .jsClick(submitBtn);
        return this;
    }


    @Step("Fill up textbox form {0}")
    public TextBoxPage fillUpTextBoxForm(TextBoxEntity textBoxEntity) {
        webElementActions.sendKeys(fullNameInput,textBoxEntity.getFullName())
                .jsSendKeys(emailInput, textBoxEntity.getEmail())
                .jsSendKeys(currentAddressInput, textBoxEntity.getCurrentAddress())
                .jsSendKeys(permanentAddresseInput, textBoxEntity.getPermanentAddress())
                .click(submitBtn);
        return this;
    }
}

