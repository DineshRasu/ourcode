package steps;

import cucumber.api.Scenario;

public class Hooks {
	
public void beforeScenario(Scenario sc)	{
	
	System.out.println(sc.getName());
	System.out.println(sc.getId());
}



}
