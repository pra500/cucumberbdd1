package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class MyHooks {
	
	
	
	@Before
	public void setup(Scenario scn)
	{
		
		System.out.println("++++++execution started for this scenario: "+scn.getName());
		System.out.println("********browser opening on chrome*******");
		
		
	}
	
	
	@After
	public void teardown(Scenario scn)
	{
		System.out.println("++++++execution ended for this scenario: "+scn.getName());
		System.out.println("********browser closing on chrome*******");
		
	}

}
