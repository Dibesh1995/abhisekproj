package com.flipkart.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipkart.generic.BaseClass;

public class LoginPage extends BaseClass {
	@FindBy (xpath="(//input[@type='text'])[2]")
	private WebElement untbx;
	@FindBy (xpath="//input[@type='password']")
	private WebElement pwdtbx;
	@FindBy (xpath="(//span[text()='Login'])[2]")
	private WebElement loginbtn;
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	public void setLogin(String un,String pwd)
	{
		untbx.sendKeys(un);
		pwdtbx.sendKeys(pwd);
		loginbtn.click();
	}
	

}
