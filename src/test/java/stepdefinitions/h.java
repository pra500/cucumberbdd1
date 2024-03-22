package stepdefinitions;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class h {
	
	
	//@BeforeStep and @AfterStep - ll be executed before and after of each step, ll be written in one class and then automatically
	//ll be applicable on the other classes 
	//here also hooks with tag are there; wherever that tag ll be der, only on that particular step before/after ll be executed not on others
	
	
	
	
	
	@BeforeStep("@regression")
	public void setup()
	{
		System.out.println("+++++++++++");		
	}
	
	
	@AfterStep("@regression")
	public void teardown()
	{
		System.out.println("-----------------");	
	}
	
	@Given("I am logged in to the appli")
	public void i_am_logged_in_to_the_appli() {
	   System.out.println("superb");
	}

	@When("I navigate to the ad")
	public void i_navigate_to_the_ad() {
		 System.out.println("superb1");
	}

}
