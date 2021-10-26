package com.spritecloud.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import com.spritecloud.pages.HomePage;

public class HomeSteps {

    private final String MENSSAGE_ELEMENT_BOX = "Please select an item from left to start practice.";
    private final String MESSAGE_CHECK_BOX = "You have selected :";
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
}
