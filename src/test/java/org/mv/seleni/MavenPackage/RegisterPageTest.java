package org.mv.seleni.MavenPackage;

import javax.sql.rowset.JdbcRowSet;

import org.demo.base.BaseClass;
import org.openqa.selenium.WebDriver;

import net.bytebuddy.jar.asm.commons.GeneratorAdapter;

public class RegisterPageTest extends BaseClass{

	public static void main(String[] args) throws Throwable {
		getDriver("http://demoqa.com/registration/");
		RegisterPage demo =new RegisterPage();
		
		setText(demo.getFirstName(), getDataExcel(0, "FirstName"));
		setText(demo.getLastName(), getDataExcel(0, "FirstName"));
		setText(demo.getMob(), getDataExcel(0, "FirstName"));
		setText(demo.getUserName(), getDataExcel(0,"FirstName"));
		setText(demo.getEmail(), getDataExcel(2,"FirstName"));
		setText(demo.getAboutMe(), getDataExcel(0,"FirstName"));
		setText(demo.getPass(), getDataExcel(0,"FirstName"));
		setText(demo.getAgainPass(), getDataExcel(0,"FirstName"));
	}
	
}
