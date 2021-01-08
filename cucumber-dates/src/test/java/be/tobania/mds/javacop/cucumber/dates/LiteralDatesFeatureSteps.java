package be.tobania.mds.javacop.cucumber.dates;

import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import be.DateExpressionLexer;
import be.DateExpressionParser;
import be.DateHelper;




public class LiteralDatesFeatureSteps {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	Date today;
	
	String result;
	 protected long computeDateExpression(String dateExpression) throws Exception {

	        ANTLRInputStream in = new ANTLRInputStream(new StringReader(dateExpression));
	        DateExpressionLexer lexer = new DateExpressionLexer(in);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        DateExpressionParser parser = new DateExpressionParser(tokens);

	        return parser.eval().value;
	    }
	 
	
	@Given("today is {string}")
	public void today_is(String today) throws Exception {

		
		this.today=  sdf.parse(today);
		DateHelper.setToday(this.today.getTime());
	
		
	}

	@When("the parser evaluates the expression {string}")
	public void the_parser_evaluates_the_expression(String expression) throws Exception {
	   long time = computeDateExpression(expression);
	   result = sdf.format(new Date(time));
	}	

	@Then("it returns {string}")
	public void it_returns(String expected_result) {
	    Assert.assertEquals("it is not the exepected result", expected_result, result);
	}
}
