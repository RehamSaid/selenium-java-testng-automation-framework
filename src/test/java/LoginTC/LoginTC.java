package LoginTC;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTC extends BaseTest {
    LoginPage loginPage;
    //     We added priority to @Test to control which test case runs first,
    // since tests run alphabetically by name by default.
    @Test(priority = 1)
    public void testValidCredentials(){
//        setup frome BaseTest calss
//        LOGIN
//        -----------------using ID, NAME AND linktext-----------------------
//        driver.findElement(By.linkText("Form Authentication")).click();
//        driver.findElement(By.id("username")).sendKeys("tomsmith");
//        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//        driver.findElement(By.className("radius")).click();
//        -----------------using xpath(relative)-----------------------
//        driver.findElement(By.xpath("//a[contains(text(),'Form')]")).click();
//        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("tomsmith");
//        driver.findElement(By.xpath("password")).sendKeys("SuperSecretPassword!");

        loginPage = homePage.clickOnFormeAuthenticationLink();
        loginPage.insertUserName("tomsmith");
        loginPage.insertPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage=loginPage.clickOnLoginButton();
//        assertion
        String actualResult=secureAreaPage.getSuccessMessage();
        String expectedResult="You logged into a secure area!";
        Assert.assertTrue(actualResult.contains(expectedResult));
//        close browser frome BaseTest calss
    }
    @Test
    public void testInvalidUsername(){
        loginPage = homePage.clickOnFormeAuthenticationLink();
        loginPage.insertUserName("tom");
        loginPage.insertPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();

//        assertion
        String actualResult=loginPage.getErrorMessage();
        String expectedResult="Your username is invalid!";
        Assert.assertTrue(actualResult.contains(expectedResult));
//        close browser frome BaseTest calss
    }
    @Test
    public void testInvalidpassword(){
//        setup frome BaseTest calss
        //        login
        loginPage = homePage.clickOnFormeAuthenticationLink();
        loginPage.insertUserName("tomsmith");
        loginPage.insertPassword("aaaaa");
        loginPage.clickOnLoginButton();


//        assertion
        String actualResult=loginPage.getErrorMessage();
        String expectedResult="Your password is invalid!";
        Assert.assertTrue(actualResult.contains(expectedResult));

//        close browser frome BaseTest calss
    }
//    inhance the code not to open the browser each time do test case (time) ---> we will use BaseTest class and use inheritance concept

}
