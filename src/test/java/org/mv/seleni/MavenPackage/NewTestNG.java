package org.mv.seleni.MavenPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Ignore;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestNG {
	@Test(priority = 1)
	public void b_test() {
		System.out.println("testb");
	}

	@Test(priority = 2)
	public void a_test() {
		System.out.println("testa");
	}
	@Ignore
	public void c_test() {
		System.out.println("testc");
	}
	@Test
	public void test() {
		Assert.assertTrue(false);
		System.out.println("test");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before each test method");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("after each test method");
	}
	@BeforeClass
	public void beforeClass() {
		System.out.println("before first test case in current class");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("after first test case in current class");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("before any test method in that class");
	}
	@AfterTest
	public void afterTest() {
		System.out.println("before any test method in that class");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before all test cases in suite");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("after all test cases in suite");
	}

}
