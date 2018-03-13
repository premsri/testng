package org.mv.seleni.MavenPackage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Junit {
	
	
	@Test
	public void test1() {
System.out.println("1");
}
	@Ignore
	@Test
	public void test2() {
		System.out.println("1");

	}
	@Test
	public void test3() {
		Assert.assertTrue(false);
		System.out.println("1");

	}
	@Test
	public void test4() {
		System.out.println("1");

	}
	
}
