package dynamicloading;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;
import pages.OnePage;

public class DynamicTC extends BaseTest {
    @Test
    public void waitTest() throws InterruptedException {
        DynamicLoadingPage dynamicLoadingPage=homePage.clickOnDynamicLoadingLink();
        OnePage onepage=dynamicLoadingPage.clickOnExample1Link();
        onepage.clickOnStartButton();
        Thread.sleep(5000);
        String actualResult=onepage.getValidationMessage();
        String expectedResult="Hello World!";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
