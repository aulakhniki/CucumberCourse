package StepsDefinitions;

import Learning.CucumberCourse.RestaurantMenu;
import Learning.CucumberCourse.RestaurantMenuItem;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MenuManagement {
	 RestaurantMenuItem NewMenuItem ;
	 RestaurantMenu LocationMenu;
	@Given("I have a menu item with name {string} and price {int}")
	public void i_have_a_menu_item_with_name_and_price(String MenuItemName, Integer Price) {
	   
	    NewMenuItem  = new RestaurantMenuItem(MenuItemName, MenuItemName, Price);
	    System.out.println("Step 1");
	    
	}

	@When("I add that Menu Item")
	public void i_add_that_Menu_Item() {
	    
	    LocationMenu = new RestaurantMenu();
	    LocationMenu.AddNewItem(NewMenuItem);
	    System.out.println("Step 2");
	}

	@Then("Menu item with name {string} should be added")
	public void menu_item_with_name_should_be_added(String string) {
	  boolean Exists = LocationMenu.DoesItemExists(NewMenuItem);
	  System.out.println("Step 3:" + Exists);
	}

}
