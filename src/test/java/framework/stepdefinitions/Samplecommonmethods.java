package framework.stepdefinitions;

import cucumber.api.java.Before;

public class Samplecommonmethods {
	@Before
	public void testhook() {
		System.out.println("Hook is getting executed..");
	}
}
