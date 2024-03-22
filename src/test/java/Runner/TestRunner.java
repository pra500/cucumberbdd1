package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



//if we want to run by maven then we ve to add "Test" before/after of the Runner class name.surefire plugin is mandatory.


//just...earlier we were using Runner2 class, now we will use this class
//we can use tags also in runner class, tags="@regression", only that particular scenario ll be executed



//we can use tags in maven also using mvn test -Dcucumber.filter.tags="@search", whatever tag u ll gv, that particular scenario ll
//be executed  
//generally concept is called - in video; Overriding tags in Runner class using Maven command line command



//two tags: custom tags(@smoke, @regression, we use, any name we can gv)   ,default tags: @dev, @ignore, @wip
//@dev- development done testing going on, @ignore: ignore these things, @wip: work in progres - need to chk again
//if u use it but not mentioning in runner class then no changes in result, like below in feature file:
//@dev @smoke
//if u use it like dat: 	//tags="@all and not @dev and not @ignore and not @wip", then der is an impcat on result, here @all ll be running
//not @dev, @ignore, @wip
//@all and @dev: here, both combination ll be running



//if u want to get the name of the scenario alongwith @before/@after then u can use Scenario class; ve created MyHooks.java


//if u want to use more then one thing-       glue= {"stepdefinitions", "hooks"}


//we can generate xml and json reports also:
//"json:target/MyCucumberReports/Myrpt1.json", 
//"junit:target/MyCucumberReports/Myrpt1.xml", 







 











@RunWith(Cucumber.class)
@CucumberOptions(
		//features="src/test/java/features",
		//features="src/test/java/features/dummy1.feature",
	    //features="src/test/java/features/dummy1.feature",
		features="src/test/resources/features",
		//glue= "stepdefinitions",
		glue= {"stepdefinitions", "hooks"},
		dryRun=true,
		//tags="@regression",
		//tags="@search",
		//tags="@all",
		//tags="@all and not @dev and not @ignore and not @wip",
		//tags="@all and @dev and not @ignore and not @wip",
		plugin={//"pretty", "html:target/report1.html"				
				"pretty", 
				"html:target/MyCucumberReports/Myrpt1.html", 
				"json:target/MyCucumberReports/Myrpt1.json", 
				"junit:target/MyCucumberReports/Myrpt1.xml", 			
		
		}		
		         )
                
public class TestRunner {

}
