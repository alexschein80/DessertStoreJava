package Dessert;

public class IceCream extends DessertItem{

	public double cost;
	public double calories;
	public double price;
	
	/**
	 * default constructor
	 */
	public IceCream() {
		name = "";
	}
	
	/**
	 * overloaded constructor that takes in a string as parameter
	 * @param name - string parameter to name the object
	 */
	public IceCream(String name) {
		this.name = name;
		cost = 0;
	}
	
	/**
	 * sets the cost of the object
	 * @param cost - takes in a double parameter to set the cost of the object
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * gets the calories of the object
	 * @return - returns the calorie value
	 */
	public double getCalories() {
		return calories;
	}
	
	/**
	 * sets the calories of the object
	 * @param calories - takes in a double parameter to set the calories of the object
	 */
	public void setCalories(double calories) {
		this.calories = calories;
	}

	/**
	 * gets the cost of the object
	 * @return - returns the cost of the object as a double
	 */
	public double getCost() {
		return price;
	}
	
	/**
	 * compares another object to this object
	 * @param - object that is being compared to this object
	 */
	public int compareTo(Object o) {
		//sets variable other to the object that is being compared to
		DessertItem other = (DessertItem) o;
		//conditions to compare calories between objects
		if(this.getCalories() < other.getCalories()) {
			 return -1;
		 }if(this.getCalories() > other.getCalories()) {
			 return 1;
		 }if(this.getCalories() == other.getCalories()){
			 return 0;
		 }return 0;
	 }
	
	/**
	 * outputs a formatted string
	 * @return - returns a formatted string
	 */
	public String toString() {
		String str = "";
		str = String.format("%s\nIce Cream \t", this.name);
		return str;
	}
}
