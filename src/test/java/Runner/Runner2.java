package Runner;

import org.junit.runner.RunWith;



//if u don't give like below then no o/p ll come:
//	//features="src/test/java/features",
//glue= "stepdefinitions",
//plugin={"pretty", "html:target/report1.html"} 


//here project structure is diff we need to gv like below then only everything ll be executed
//	features="src/test/java/features",
//glue= "stepdefinitions",
//plugin={"pretty", "html:target/report1.html"} 


//if u want to run a specific feature file: 
//features="src/test/java/features/dummy1.feature"



//as per the standards, feature files should be in src/test/resources folder



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features="src/test/java/features",
		//features="src/test/java/features/dummy1.feature",
		features="src/test/resources/features",
		glue= "stepdefinitions",
		plugin={"pretty", "html:target/report1.html"}  
		         )
                
public class Runner2 {
	
	

}
