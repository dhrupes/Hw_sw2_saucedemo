package testsuite;

import browserfactory.BaseTest;
import com.google.common.base.Verify;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    /*3. Write down the following test into ‘LoginTest’ class
1. userSholdLoginSuccessfullyWithValid Credentials
* Enter “standard_user” username
* Enter “secret_sauce” password
* Click on ‘LOGIN’ button
* Verify the text “PRODUCTS”   */
    String baseurl = "https://www.saucedemo.com/";
    @Before
    public void setup(){
        openBrowser(baseurl);
    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        WebElement clickUsername = driver.findElement(By.xpath("//input[@data-test='username']"));
        clickUsername.sendKeys("standard_user");
        WebElement clickPassword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        clickPassword.sendKeys("secret_sauce");
        WebElement clickLogin = driver.findElement(By.xpath("//input[@type='submit']"));
           clickLogin.click();
    }

  @Test
    /* verifyThatSixProductsAreDisplayedOnPage
* Enter “standard_user” username
* Enter “secret_sauce” password
* Click on ‘LOGIN’ button
* Verify that six products are displayed on page */
public void verifyThatSixProductsAreDisplayedOnPage(){
      WebElement clickUsername = driver.findElement(By.xpath("//input[@data-test='username']"));
      clickUsername.sendKeys("standard_user");
      WebElement clickPassword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
      clickPassword.sendKeys("secret_sauce");
      WebElement clickLogin = driver.findElement(By.xpath("//input[@type='submit']"));
      clickLogin.click();
      WebElement verifyone = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
      String actualMess = verifyone.getText();
      String expectedMess = "Sauce Labs Backpack";
      Assert.assertEquals(expectedMess, actualMess);

      WebElement verifyTwo = driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']"));
      String actualMess2 = verifyTwo.getText();
      String expectedMess2 = "Sauce Labs Bike Light";
      Assert.assertEquals(expectedMess, actualMess);

      WebElement verifyThree = driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
      String actualMess3 = verifyThree.getText();
      String expectedMess3 = "Sauce Labs Bolt T-Shirt";
      Assert.assertEquals(expectedMess, actualMess);

      WebElement verifyFour = driver.findElement(By.xpath("//div[text()='Sauce Labs Fleece Jacket']"));
      String actualMess4 = verifyFour.getText();
      String expectedMess4 = "Sauce Labs Fleece Jacket";
      Assert.assertEquals(expectedMess, actualMess);

      WebElement verifyFive = driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']"));
      String actualMess5 = verifyFive.getText();
      String expectedMess5 = "Sauce Labs Onesie";
      Assert.assertEquals(expectedMess, actualMess);

      WebElement verifySix = driver.findElement(By.xpath("//div[text()='Test.allTheThings() T-Shirt (Red)']"));
      String actualMess6 = verifySix.getText();
      String expectedMess6 = "Test.allTheThings() T-Shirt (Red)";
      Assert.assertEquals(expectedMess, actualMess);

  }

}
