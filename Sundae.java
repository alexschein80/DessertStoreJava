package Dessert;


public class Sundae extends IceCream{

	public String topping;
	public double toppingPrice;
	public double calories;
	public double price;
	
	/**
	 * default constructor
	 */
	public Sundae() {
		name = "";
	}
	
	/**
	 * overloaded constructor that takes in the name of the object
	 * @param name - name of the object as a string
	 */
	public Sundae(String name) {
		this.name = name;
		this.topping = "";
		this.toppingPrice = 0;
		cost = getCost();
		this.calories = 0;
		this.price = 0;
	}
	
	/**
	 * gets the price of the object
	 * @return - returns price of the object
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * sets the price of the object
	 * @param price - double parameter to set the price of the object
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * gets the price of the topping
	 * @return - returns the value of the topping price
	 */
	public double getToppingPrice() {
		return toppingPrice;
	}
	
	/**
	 * sets the price of the topping
	 * @param toppingPrice - passes a double as the price for the topping
	 */
	public void setToppingPrice(double toppingPrice) {
		this.toppingPrice = toppingPrice;
	}
	
	/**
	 * gets the calories of the object
	 * @return - returns the value of calories
	 */
	public double getCalories() {
		return calories;
	}
	
	/**
	 * sets the calories for the object
	 */
	public void setCalories(double calories) {
		this.calories = calories;
	}
	
	/**
	 * gets the topping of the object
	 * @return - returns the topping of the object
	 */
	public String getTopping() {
		return topping;
	}
	
	/**
	 * sets the topping for the object
	 * @param topping - takes in a string as parameter to name the topping
	 */
	public void setTopping(String topping) {
		this.topping = topping;
	}
	
	/**
	 * gets the total cost of the object
	 * @return - returns the price of the object
	 */
	public double getCost() {
		return toppingPrice + price;
	}
	
	/**
	 * outputs a formatted string
	 * @return - returns a formatted string
	 */
	public String toString() {
		String str = "";
		str = String.format("%s Sundae with\n%s", this.topping, this.name);
		return str;
	}
	
}
