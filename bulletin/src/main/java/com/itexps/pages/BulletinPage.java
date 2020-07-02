/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.pages;

import com.itexps.util.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author verma
 */
public class BulletinPage extends BaseClass{
  // initializing web element
    @FindBy(css = "[title=\"IBG Bulletin\"]")
   private WebElement title;
    
   @FindBy(id="Name")
   private WebElement fullname;
   
   @FindBy(id="Email")
   private WebElement email;
   
   @FindBy(xpath="(//select[@id='Location'])[2]")
   private WebElement location;
   
   @FindBy(name="Captcha")
   private WebElement captcha;
   
   @FindBy(xpath="//input[@value='Send']")
   private WebElement send;
   
   //initializing page object
   public BulletinPage(){PageFactory.initElements(driver,this);
   }
// action or the process
   public void bulletin(){
      title.click();
   }
   public void info(){
      fullname.sendKeys(prop.getProperty("name"));
      email.sendKeys(prop.getProperty("email"));
      email.sendKeys(Keys.TAB);
      location.sendKeys("c");
      location.sendKeys("c");
      captcha.sendKeys(prop.getProperty("captcha"));
      send.click();
      driver.close();
      driver.quit();
   }
   }



