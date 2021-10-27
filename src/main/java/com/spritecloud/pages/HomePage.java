package com.spritecloud.pages;

import com.spritecloud.core.DriverService;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import com.spritecloud.PageCommons.PageCommons;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.io.File;
import java.nio.file.Paths;
import java.sql.Driver;
import java.util.List;


public class HomePage extends PageCommons {

    private final String ELEMENT_BOX = "//*[@id=\"app\"]/div/div/div[2]/div/div[{{s}}]";
    private final String MENSSAGE_ELEMENT = "#app > div > div > div.row > div.col-12.mt-4.col-md-6";
    private final String TEXT_BOX = "#item-0";
    private final String CHECK_BOX = "#item-1";
    private final String CHECK = "#tree-node > ol > li > span > label > span.rct-checkbox > svg";
    private final String CHECK_BOX_MENSSAGE = "#result > span:nth-child(1)";
    private final String WEB_TABLE = "#item-3";
    private final String TABLE = "//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]";
    private final String EDIT_ROW = "edit-record-1";
    private final String UPLOAD_FILE = "#item-7";
    private final String UPLOAD_FILE_MESSAGE = "uploadedFilePath";
    private final String FULL_NAME = "userName";
    private final String EMAIL = "userEmail";
    private final String CURRENT_ADDRES = "currentAddress";
    private final String PERMANENT_ADDRES = "permanentAddress";
    private final String BUTTON_SUBMIT = "submit";
    private final String OUTPUT_MENSSAGE = "output";
    private final String ALERTS = "//*[@id=\"item-1\"]/span[text()='Alerts']";
    private final String ALERT_CONFIRM = "confirmButton";
    private final String ALERT_CONFIRM_MENSSAGE = "confirmResult";
    private final String ALERT_PROMPT = "promtButton";
    private final String ALERT_PROMPT_MENSSAGE = "promptResult";
    private final String ALERT_TIMER = "timerAlertButton";
    private final String BROWSER_WINDOWS = "//*[@id=\"item-0\"]/span[text()='Browser Windows']";
    private final String NEW_TAB = "tabButton";
    private final String NEW_TAB_MENSSAGE = "sampleHeading";
    private final String SLIDER_BOX = "//*[@id=\"item-3\"]/span[text()='Slider']";
    private final String SLIDER = "sliderContainer";
    private final String PROGRESS_BAR_BOX = "//*[@id=\"item-4\"]/span[text()='Progress Bar']";
    private final String PROGRESS_BAR_START = "startStopButton";
    private final String PROGRESS_BAR = "#progressBar > div";
    private final String DRAGABBLE_BOX = "//*[@id=\"item-4\"]/span[text()='Dragabble']";
    private final String DRAGABBLE = "dragBox";



    public boolean isHomeDisplayed() {
        return isPresent(By.xpath(ELEMENT_BOX.replace("{{s}}", "1")));
    }

    public void clickBoxElement(String box) {
        String element = (ELEMENT_BOX.replace("{{s}}", box));
        ScrollDownToFindElement(By.xpath(element));
        click(By.xpath(element));
    }

    public String getMenssageElement() {
        return getText(By.cssSelector(MENSSAGE_ELEMENT));
    }

    public void clickTextBox() {
        click(By.cssSelector(TEXT_BOX));
    }

    public void setFullName(String name) {
        waitForElementPresent(By.id(FULL_NAME));
        setInput(By.id(FULL_NAME),name); }

    public void setEmail(String email) { setInput(By.id(EMAIL),email); }

    public void setCurrentAddres(String currentAddres) { setInput(By.id(CURRENT_ADDRES),currentAddres); }

    public void setPermanentAddres(String permanentAddres) { setInput(By.id(PERMANENT_ADDRES),permanentAddres); }

    public void clickSubmitButton() {
        ScrollDownToFindElement(By.id(BUTTON_SUBMIT));
        click(By.id(BUTTON_SUBMIT)); }

    public boolean returnTextBoxMenssage() {
        return isPresent(By.id(OUTPUT_MENSSAGE));
    }

    public void clickCheckBox() {
        ScrollDownToFindElement(By.cssSelector(CHECK_BOX));
        click(By.cssSelector(CHECK_BOX)); }

    public void clickCheck() throws InterruptedException {
        Thread.sleep(2000);
        waitForElementPresent(By.cssSelector(CHECK));
        click(By.cssSelector(CHECK)); }

    public String getMenssageCheckBoxt() {
        return getText(By.cssSelector(CHECK_BOX_MENSSAGE));
    }

    public void clickWebTable() {
        ScrollDownToFindElement(By.cssSelector(WEB_TABLE));
        click(By.cssSelector(WEB_TABLE)); }

    public void manageTable() throws InterruptedException {
        WebElement table = getElement(By.xpath(TABLE));
        List<WebElement> rows = table.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]/div/div[3]"));
        for (int i = 0; i<rows.size();i++){
            Thread.sleep(2000);
            click(By.id(EDIT_ROW));
            String age = "26";
            setInput(By.id("age"),age);
            click(By.id(BUTTON_SUBMIT));
            Assert.assertEquals(rows.get(i).getText(),age);
        }
    }

    public void clickUploadFile() {
        ScrollDownToFindElement(By.cssSelector(UPLOAD_FILE));
        click(By.cssSelector(UPLOAD_FILE)); }

    public void uploadImage(){
        getElement(By.id("uploadFile")).sendKeys(System.getProperty("user.dir")+ File.separator+"src"+File.separator+"test"+File.separator+"resources"+File.separator+"image"+File.separator+ Paths.get("dog")+".jpg");
    }

    public boolean isUploadFileCorrectyl() {
        return isPresent(By.id(UPLOAD_FILE_MESSAGE));
    }


    public void clickAlert() {
        ScrollDownToFindElement(By.xpath(ALERTS));
        click(By.xpath(ALERTS)); }

    public void clickAlertConfirm() throws InterruptedException {
        Thread.sleep(2000);
        waitForElementPresent(By.id(ALERT_CONFIRM));
        click(By.id(ALERT_CONFIRM));

        Thread.sleep(2000);
        Alert alert = DriverService.getDriverInstance().switchTo().alert();
        alert.accept();

        Assert.assertTrue(isPresent(By.id(ALERT_CONFIRM_MENSSAGE)));
    }

    public void clickAlertPrompt() throws InterruptedException {
        Thread.sleep(2000);
        waitForElementPresent(By.id(ALERT_PROMPT));
        click(By.id(ALERT_PROMPT));

        Thread.sleep(2000);
        Alert alert = DriverService.getDriverInstance().switchTo().alert();
        alert.sendKeys("AlertTestAutomation");
        alert.accept();

        Assert.assertTrue(isPresent(By.id(ALERT_PROMPT_MENSSAGE)));
    }

    public void clickAlertTime() throws InterruptedException {
        waitForElementPresent(By.id(ALERT_TIMER));
        click(By.id(ALERT_TIMER));
        Thread.sleep(5000);

        Alert alert = DriverService.getDriverInstance().switchTo().alert();
        Boolean alertMenssage = null;
        if(alert == null){
            alertMenssage = false;
        }else {
            alert.accept();
            alertMenssage = true;
        }

        Assert.assertTrue(alertMenssage);
    }

    public void clickNewTab() throws InterruptedException {
        ScrollDownToFindElement(By.xpath(BROWSER_WINDOWS));
        click(By.xpath(BROWSER_WINDOWS));

        waitForElementPresent(By.id(NEW_TAB));
        click(By.id(NEW_TAB));
        Thread.sleep(2000);
    }

    public String getNewTabMenssage() {
        return getText(By.id(NEW_TAB_MENSSAGE)); }

    public void clickSlider() {
        ScrollDownToFindElement(By.xpath(SLIDER_BOX));
        click(By.xpath(SLIDER_BOX));
    }

    public void slider() throws InterruptedException {
        WebElement slider = getElement(By.id(SLIDER));
        Actions SliderAction = new Actions(DriverService.getDriverInstance());
        SliderAction.click(slider).build().perform();
        Thread.sleep(1000);
        for (int i = 0; i < 5; i++)
        {
            SliderAction.sendKeys(Keys.ARROW_LEFT).build().perform();
            Thread.sleep(200);
        }
    }

    public void clickProgressBar() {
        ScrollDownToFindElement(By.xpath(PROGRESS_BAR_BOX));
        click(By.xpath(PROGRESS_BAR_BOX));
    }

    public void progressBar() throws InterruptedException {
        Thread.sleep(2000);
        waitForElementPresent(By.id(PROGRESS_BAR_START));
        click(By.id(PROGRESS_BAR_START));

        WebElement progress_bar = getElement(By.cssSelector(PROGRESS_BAR));
        Boolean finish = false;
        for(int second = 0; second <= 30; second++) {
            System.out.println(progress_bar.getAttribute("class"));
            if(progress_bar.getAttribute("class").contains("progress-bar bg-success")){
                finish = true;
                break;
            }else{
                Thread.sleep(1000);
            }
        }
        Assert.assertTrue(finish);
    }

    public void clickdragabble() throws InterruptedException {
        ScrollDownToFindElement(By.xpath(DRAGABBLE_BOX));
        click(By.xpath(DRAGABBLE_BOX));
        Thread.sleep(1000);
    }

    public void dragabble(){
        ScrollDownToFindElement(By.id(DRAGABBLE));
        WebElement dragabble = getElement(By.id(DRAGABBLE));
        Actions DragabbleAction = new Actions(DriverService.getDriverInstance());
        DragabbleAction.click(dragabble).clickAndHold().moveByOffset(150,150).moveByOffset(0, 200).release().perform();
    }
}
