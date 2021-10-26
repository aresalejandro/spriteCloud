package com.spritecloud.pages;

import com.spritecloud.core.DriverService;
import io.cucumber.java8.Th;
import org.openqa.selenium.By;
import com.spritecloud.PageCommons.PageCommons;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.io.File;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;

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

    public void setFullName(String name) { setInput(By.id(FULL_NAME),name); }

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


}
