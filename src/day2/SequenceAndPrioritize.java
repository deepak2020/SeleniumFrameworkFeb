package day2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SequenceAndPrioritize {

	@Test(groups= {"sanity","regression"})

	public void Login() {

		System.out.println("This is the Login -->" + Thread.currentThread().getId());
		

	}

	@Test(groups= {"smoke","regression"})

	public void Registration() {

		System.out.println("This is the Registration -->"+ + Thread.currentThread().getId());

	}

	@Test(groups= {"regression"})

	public void Three() {

		System.out.println("This is the Test Case number Three -->"+ + Thread.currentThread().getId());

	}

	@Test(groups="regression")

	public void Four() {

		System.out.println("This is the Test Case number Four -->"+ + Thread.currentThread().getId());

	}

}
