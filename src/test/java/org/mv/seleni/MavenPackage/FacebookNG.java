package org.mv.seleni.MavenPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.apache.commons.io.FileUtils;
import org.demo.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;

public class FacebookNG extends BaseClass {
	FacebookLogin fbl;
	FacebookRecovery fbr;

	@Test
	public void f() throws IOException {
		fbl = new FacebookLogin();
		fbr = new FacebookRecovery();
		setText(fbl.getEmail(), "premsri2504@gmail.com");
		setText(fbl.getPassword(), "9987042504");
		click(fbl.getLogin());

	}

	@BeforeTest
	public void beforeTest() {
		launchBrowser("chrome", "https://www.facebook.com/");

	}

	@AfterTest
	public void afterTest() {
		driverQuit(driver);
	}

}
