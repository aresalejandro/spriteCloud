package com.spritecloud.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import com.spritecloud.pages.HomePage;

public class HomeSteps {

    private final String MENSSAGE_ELEMENT_BOX = "Please select an item from left to start practice.";
    private final String MESSAGE_CHECK_BOX = "You have selected :";
    private final String MENSSAGE_NEW_TAB = "This is a sample page";

    private HomePage homeView;
    
    private HomePage getHomeView() {
        if (homeView == null) {
            homeView = new HomePage();
        }
        return homeView;
    }


    @Given("The Home view is displayed")
    public void homeView() {
        HomePage homeView = getHomeView();
        homeView.goToBaseUrl();
        Assert.assertTrue(homeView.isHomeDisplayed());
    }

    @When("The user go to Elements box")
    public void elementBox() {
        HomePage homeView = getHomeView();
        homeView.clickBoxElement("1");
        Assert.assertEquals(homeView.getMenssageElement(),MENSSAGE_ELEMENT_BOX);
    }

    @Then("The user select Text Box and complete the form")
    public void textBoxAndCompleteForm() {
        HomePage homeView = getHomeView();
        homeView.clickTextBox();
        homeView.setFullName("Alejandro Ares");
        homeView.setEmail("alejandroares@test.com");
        homeView.setCurrentAddres("automation Test");
        homeView.setPermanentAddres("automation Test");
        homeView.clickSubmitButton();
        Assert.assertTrue(homeView.returnTextBoxMenssage());
    }

    @Then("The user select Check Box")
    public void checkBox() throws InterruptedException {
        HomePage homeView = getHomeView();
        homeView.clickCheckBox();
        homeView.clickCheck();
        Assert.assertEquals(homeView.getMenssageCheckBoxt(),MESSAGE_CHECK_BOX);
    }

    @Then("The user select Web Table")
    public void webTable() throws InterruptedException {
        HomePage homeView = getHomeView();
        homeView.clickWebTable();
        homeView.manageTable();

    }

    @Then("The user select Upload File")
    public void uploadFile() {
        HomePage homeView = getHomeView();
        homeView.clickUploadFile();
        homeView.uploadImage();
        Assert.assertTrue(homeView.isUploadFileCorrectyl());
    }

    @When("The user go to Alerts box")
    public void alertBox() {
        HomePage homeView = getHomeView();
        homeView.clickBoxElement("3");
        Assert.assertEquals(homeView.getMenssageElement(),MENSSAGE_ELEMENT_BOX);
    }

    @Then("The user select alert: (.*)")
    public void alertTypes(String alert) throws InterruptedException {
        HomePage homeView = getHomeView();
        homeView.clickAlert();
        switch (alert){
            case "CONFIRM" : homeView.clickAlertConfirm();
                break;
            case "TIMER" : homeView.clickAlertTime();
                break;
            case "PROMPT" : homeView.clickAlertPrompt();
            break;
        }

    }

    @Then("The user select new tab")
    public void newTab() {
        HomePage homeView = getHomeView();
        homeView.clickNewTab();
        homeView.windowsHandle();
        Assert.assertEquals(homeView.getNewTabMenssage(),MENSSAGE_NEW_TAB);
    }

    @When("The user go to Widgets box")
    public void widgets() {
        HomePage homeView = getHomeView();
        homeView.clickBoxElement("4");
        Assert.assertEquals(homeView.getMenssageElement(),MENSSAGE_ELEMENT_BOX);
    }

    @Then("The user select Slider")
    public void slider() throws InterruptedException {
        HomePage homeView = getHomeView();
        homeView.clickSlider();
        homeView.slider();
    }

    @Then("The user select Progress Bar")
    public void progressBar() throws InterruptedException {
        HomePage homeView = getHomeView();
        homeView.clickProgressBar();
        homeView.progressBar();
    }

    @When("The user go to Interactions box")
    public void interactions() {
        HomePage homeView = getHomeView();
        homeView.clickBoxElement("5");
        Assert.assertEquals(homeView.getMenssageElement(),MENSSAGE_ELEMENT_BOX);
    }

    @Then("The user select Dragabble")
    public void dragaBble() throws InterruptedException {
        HomePage homeView = getHomeView();
        homeView.clickdragabble();
        homeView.dragabble();
    }
}
