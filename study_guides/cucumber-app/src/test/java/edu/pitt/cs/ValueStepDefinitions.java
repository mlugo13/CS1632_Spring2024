package edu.pitt.cs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class ValueStepDefinitions {
	// TODO: Fill in!
	Value value;
	
	@Given("a Value")
    public void aValue(){
        value = new Value();
    }

	@When("incVal is called")
	public void iCallIncVal(){
		value.incVal();
	}

	/*or
	 * @When("I call incVal {int} times")
    public void iCallIncValTimes(Integer int1) {
        for(int i = 0; i < int1;i++){
            value.incVal();
        }
    }
	 */

	@Then("getVal returns {int}")
    public void getValReturns(Integer int1) {
        assertEquals((int)int1,value.getVal());
    }
}
