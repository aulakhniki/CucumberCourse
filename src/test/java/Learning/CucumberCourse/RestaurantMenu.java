package Learning.CucumberCourse;

import java.util.ArrayList;

public class RestaurantMenu {
//To add menu items of the restaurant menu items
	ArrayList<RestaurantMenuItem> MenuItems = new ArrayList<RestaurantMenuItem>();
	
	public boolean AddNewItem(RestaurantMenuItem NewMenuItem)throws IllegalArgumentException{
	
		return MenuItems.add(NewMenuItem);
	}
	
	public boolean DoesItemExists(RestaurantMenuItem newMenuItem)
	{
		boolean Exists = false;
		if (MenuItems.contains(newMenuItem))
		{Exists = true;}
		return Exists;
	}
}
