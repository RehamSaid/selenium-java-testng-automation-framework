package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnePage {
    WebDriver driver;
    public OnePage(WebDriver driver) {
        this.driver=driver;
    }
//    loctors
    private By startButton= By.xpath("//button[contains(text(),'Start')]");
    private By validationMessage=By.xpath("//h4[contains(text(),'Hello World!')]");
//    actions
    public void clickOnStartButton(){
        driver.findElement(startButton).click();
    }
    public String getValidationMessage(){
        return driver.findElement(validationMessage).getText();
    }


}
