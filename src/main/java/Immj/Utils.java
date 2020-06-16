package Immj;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils extends BasePage {

  //1.To enter text
  public void enterText(By by, String text) {

    driver.findElement(by).sendKeys(text);

  }

  //2. To get Text from the Element
  public String getTextFromElement(By by) {

    String text = driver.findElement(by).getText();

    return text;

  }

  //3. To click an Element
  public void clickElement(By by) {

    driver.findElement(by).click();

  }

  //4. To clear text and enter text
  public static void clearAndEnterText(By by, String text) {
    driver.findElement(by).clear();
    driver.findElement(by).sendKeys(text);
  }

  //5. To select by Visible Text
  public void selectByVisibleText(By by, String text) {
    Select select = new Select(driver.findElement(by));
    select.selectByVisibleText(text);

  }

  //6. To select by Value
  public void selectByValue(By by, String value) {

    Select select = new Select(driver.findElement(by));
    select.selectByValue(value);

  }

  //8. Waiting for the element to be Clickable
  public void waitForClickable(By by,long time) {

    WebDriverWait wait = new WebDriverWait(driver, time);
    wait.until(ExpectedConditions.elementToBeClickable(by));
  }

  //9. Waiting for the element to be visible
  public void waitForElementVisible(By by, long time) {

    WebDriverWait wait = new WebDriverWait(driver, time);

    wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));


  }

  //11. Waiting for the Alert to be Present
  public void waitForAlertPresent(long time) {

    WebDriverWait wait = new WebDriverWait(driver, time);

    wait.until(ExpectedConditions.alertIsPresent());


  }

  //13. Waiting for the Element to Load
  public static void waitForElementToLoad(By by, int time) {
    WebDriverWait wait = new WebDriverWait(driver, time);
    wait.until(ExpectedConditions.elementToBeClickable(by));
  }

  //14. Waiting for the Element to be displayed
  public static void waitForElementToBeDisplayed(By by, int time) {
    WebDriverWait wait = new WebDriverWait(driver, time);
    wait.until(ExpectedConditions.visibilityOf(driver.findElement(by)));
  }



  }
