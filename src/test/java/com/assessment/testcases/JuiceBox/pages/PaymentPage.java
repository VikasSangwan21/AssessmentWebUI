package com.assessment.testcases.JuiceBox.pages;

import com.assessment.testcases.JuiceBox.BasePageJB;
import com.assessment.utils.DataGenerateUtils;

import static com.assessment.keywords.WebUI.*;

import org.openqa.selenium.By;

public class PaymentPage extends BasePageJB {

    
    private By addNewCardSection  = By.id("mat-expansion-panel-header-0");
    private By nameTextbox  = By.xpath("(//mat-form-field)[2]//input");
    private By cardNumberTextbox  = By.xpath("(//mat-form-field)[3]//input");
    private By expiryMonthDD  = By.xpath("(//select)[1]");
    private By expiryYearDD  = By.xpath("(//select)[2]");
    private By submitButton   = By.id("submitButton");
    private By selectCard  = By.id("mat-radio-46");
    
    private By proceedToReviewButton  = By.cssSelector("[aria-label='Proceed to review']");
    private By completePurchaseButton  = By.cssSelector("[aria-label='Complete your purchase']");



    
    public void addNewCard() {
        clickElement(addNewCardSection);
        sleep(3);
        setTextUsingJS(nameTextbox, DataGenerateUtils.randomFullName());
        setTextUsingJS(cardNumberTextbox, "1234123412341234");
        selectOptionByIndex(expiryMonthDD, 3);
        selectOptionByIndex(expiryYearDD, 3);
        //clickElementWithJs(nameTextbox);
        clickElementWithJs(submitButton);

        sleep(600);

    }

        
    public void selectCardAndCompletePayment() {
        
        clickElementWithJs(selectCard);
        clickElement(proceedToReviewButton);
        clickElement(completePurchaseButton);
        


    }


}


