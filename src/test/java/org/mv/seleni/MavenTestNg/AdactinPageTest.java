package org.mv.seleni.MavenTestNg;

import org.demo.base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AdactinPageTest extends BaseClass {

	static AdactinPage ad;

	@BeforeMethod
	public void login() {

		launchBrowser("chrome", "http://www.adactin.com/HotelApp/");
	}

	@Test(priority=5)
	public void correctUserWrongPass() throws Throwable {
		ad = new AdactinPage();
		setText(ad.getUserName(), getDataExcel(5, "Input"));
		setText(ad.getPassWord(), getDataExcel(6, "Input"));
		click(ad.getLogin());
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://www.adactin.com/HotelApp/SearchHotel.php", url);
		screenShot(driver, "priority5");
	}

	@Test(priority=1)
	private void enablebox() throws Throwable {
		ad = new AdactinPage();
		boolean b = enableText(ad.getUserName());
		boolean c = enableText(ad.getPassWord());
		boolean d = displayText(ad.getLogin());
		if (b=c=d==true) {
			Assert.assertTrue(true);
		}

	}

	@Test(priority=2)
	private void wrongUser() throws Throwable {
		ad = new AdactinPage();
		setText(ad.getUserName(), getDataExcel(3, "Input"));
		setText(ad.getPassWord(), getDataExcel(4, "Input"));
		click(ad.getLogin());
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://www.adactin.com/HotelApp/SearchHotel.php", url);
		screenShot(driver, "priority2");
	}

	@Test(priority=4)
	private void correctUserPass() throws Throwable {
		ad = new AdactinPage();
		setText(ad.getUserName(), getDataExcel(9, "Input"));
		setText(ad.getPassWord(), getDataExcel(10, "Input"));
		click(ad.getLogin());
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://www.adactin.com/HotelApp/SearchHotel.php", url);
		screenShot(driver, "priority4");

	}

	@Test(priority=3)
	private void withoutUserPass() throws Throwable {
		ad = new AdactinPage();
		click(ad.getLogin());
		String url = driver.getCurrentUrl();
		Assert.assertEquals("http://www.adactin.com/HotelApp/SearchHotel.php", url);
		screenShot(driver, "priority3");

	}

	@AfterMethod
	public void quit() {
		driverQuit(driver);
	}

}
