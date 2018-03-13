package org.mv.seleni.MavenTestNg;

import org.demo.base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactinSearchTest extends BaseClass{
	
	AdactinSearchPage at;
	
	@BeforeMethod
	public void login() {
		launchBrowser("chrome", "http://www.adactin.com/HotelApp/");
	}
	@Test(priority=6)
	public void correctUrl() {
		at = new AdactinSearchPage();
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://www.adactin.com/HotelApp/SearchHotel.php", url);
	}
	@Test(priority=7)
	public void woLocation() {
		at=new AdactinSearchPage();
		click(at.getSubmit());
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://www.adactin.com/HotelApp/SelectHotel.php", url);
	}
	@Test(priority=10)
	public void pastCheckoutDate() throws Throwable {
		at =new AdactinSearchPage();
		setText(at.getCheckin(), getDataExcel(12, "Input"));
		setText(at.getCheckoutDate(), getDataExcel(13, "Input"));
		click(at.getSubmit());
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://www.adactin.com/HotelApp/SelectHotel.php", url);
		
	}
	
	@Test(priority=8)
	public void rest() throws Throwable {
		at =new AdactinSearchPage();
		setText(at.getCheckin(), getDataExcel(14, "Input"));
		setText(at.getCheckoutDate(), getDataExcel(15, "Input"));
		click(at.getReset());
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://www.adactin.com/HotelApp/SelectHotel.php", url);
	}
	@Test(priority=9)
	public void withoutCheckdate() throws Throwable {
		at =new AdactinSearchPage();
		selectVisible(at.getLoc(), getDataExcel(16, "Input"));
		click(at.getReset());
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://www.adactin.com/HotelApp/SelectHotel.php", url);

	}
	@AfterMethod
	public void quit() {
		driverQuit(driver);
	}

}
