package framework.stepdefinitions;

import java.util.List;

import cucumber.api.java.en.Given;
import io.cucumber.datatable.DataTable;

public class Practicestepdefinitions {

	@Given ("^I practice data tables$")
	public void pracdatatables(DataTable table) {
		List<List<String>> list = table.asLists();
		System.out.println(list);
	}	
	
	@Given ("^I practice data tables again$")
	public void pracdatatables(List<List<String>> table) {
		System.out.println(table);
	}	
	
	@Given ("I test step {int} definitions")
	public void testdatatables(int table) {
		System.out.println(table);
	}	
}
