package org.mv.seleni.MavenTestNg;

import java.sql.Driver;

import org.demo.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinSearchPage extends BaseClass {
	
	public AdactinSearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="datepick_out")
	private WebElement checkoutDate;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	@FindBy(id="Reset")
	private WebElement reset;
	
	@FindBy(id="datepick_in")
	private WebElement checkin;
	
	public WebElement getLoc() {
		return loc;
	}

	@FindBy(id="location")
	private WebElement loc;

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckoutDate() {
		return checkoutDate;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getReset() {
		return reset;
	}
	
	

}
