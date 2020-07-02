/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.stepDefinitions;

import com.itexps.pages.BulletinPage;
import com.itexps.util.BaseClass;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

/**
 *
 * @author verma
 */
public class StepDefinition extends BaseClass {
    // declaring variable
  BulletinPage bulletinpage;
  
  @Given("^user is on bulletin homepage$")
public void user_is_on_bulletin_homepage() throws Throwable {
    // initialization
    BaseClass.initialization();
    bulletinpage = new BulletinPage();
    //calls bulletin method
    bulletinpage.bulletin();
}

@Then("^user enter name and email$")
public void user_enter_name_and_email() throws Throwable {
    // call info method from the bulletinepage
    bulletinpage.info();
}

@Then("^user select location$")
public void user_select_location() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  
}

@Then("^user enter captcha and submit$")
public void user_enter_captcha_and_submit() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  
}

@Then("^user closes web app$")
public void user_closes_web_app() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   
}  
}
