package org.mv.seleni.MavenPackage;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@Suite.SuiteClasses({Junit.class, Junit1.class})
public class RunJunit {

	public static void main(String[] args) {
		
	
	Result result = JUnitCore.runClasses(Junit.class, Junit1.class);
	System.out.println(result.getFailureCount());
	System.out.println(result.getIgnoreCount());
	System.out.println(result.getRunTime());
	System.out.println(result.getRunCount());
	List<Failure> failures = result.getFailures();
	for (Failure failure : failures) {
		System.out.println(failure);
	}
}}
