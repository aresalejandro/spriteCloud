package com.spritecloud.PageCommons;

import org.openqa.selenium.*;
import com.spritecloud.core.DriverService;
import com.spritecloud.core.PropertyManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public abstract class PageCommons {

    public void goToBaseUrl(){
        DriverService.getDriverInstance().get(PropertyManager.getProperty("base.url"));
    }
    
    public WebElement getElement(By locator) {
        return DriverService.getDriverInstance().findElement(locator);
    }

    public String getText(By locator){
        waitForElementPresent(locator);
        WebElement element = getElement(locator);
        return getText(element);
    }

    public String getText(WebElement element){
        return element.getText();
    }

    public void setInput(By locator, String value) {
        waitForElementPresent(locator);
        WebElement element = getElement(locator);
        element.clear();
        element.sendKeys(value);
    }

    public void click(By locator) {
        waitForElementPresent(locator);
        WebElement element = getElement(locator);
        element.click();
    }

    public boolean isPresent(By locator) {
        DriverService.getDriverInstance().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        try {
            getElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        } finally {
            DriverService.getDriverInstance().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        }
    }

    public void waitForElementPresent(By locator) {
        WebDriverWait wait = new WebDriverWait(DriverService.getDriverInstance(), 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    public void ScrollDownToFindElement(By locator) {
        WebDriver driver = DriverService.getDriverInstance();
        WebElement element = getElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void windowsHandle(){
        WebDriver driver = DriverService.getDriverInstance();
        ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(1));
    }
}
