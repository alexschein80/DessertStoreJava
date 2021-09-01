package Dessert;

public class Cookie extends DessertItem{
	
	public double cost;
	public double cookieNum;
	public double ppDozen;
	public double calories;
	
	/**
	 * default constructor
	 */
	public Cookie(){
		name = "";
		cookieNum = 0;
		ppDozen = 0.00;
		cost = 0.00;
		calories = 0.00;
	}

	/**
	 * overloaded constructor that takes in a string
	 * @param name - takes in a string to set the name of the object
	 */
	public Cookie(String name){
		this.name = name;
		cookieNum = 0;
		ppDozen = 0.00;
		cost = getCost();
		calories = 0.00;
	}
	
	/**
	 * gets the number of cookies
	 * @return - returns the number of cookies
	 */
	public double getCookieNum() {
		return cookieNum;
	}
	
	/**
	 * sets the number of cookies
	 * @param cookieNum - takes in a double parameter to set the number of cookies
	 */
	public void setCookieNum(double cookieNum) {
		this.cookieNum = cookieNum;
	}
	
	/**
	 * gets the calorie value of the object
	 * @return - returns the value of calories
	 */
	public double getCalories() {
		return calories;
	}
	
	/**
	 * sets the calories for the object
	 * @param calories - takes in a double parameter to set the calories for the object
	 */
	public void setCalories(double calories) {
		this.calories = calories;
	}
	
	/**
	 * gets the price per dozen for the object
	 * @return - returns the value of the price per dozen
	 */
	public double getPPDozen() {
		return ppDozen;
	}
	
	/**
	 * sets the value for the price per dozen for the object
	 * @param ppDozen - takes in a double parameter to set the price per dozen for the object
	 */
	public void setPPDozen(double ppDozen) {
		this.ppDozen = ppDozen;
	}
	
	/**
	 * gets the cost of the object
	 * @return - returns the cost of the object as a double
	 */
	public double getCost() {
		double temp;
		double temp1;
		temp = ppDozen / 12;
		temp1 = cookieNum * temp;
		cost = Math.round(temp1 * 100);
		cost = cost/100;
		return cost;
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
		str = String.format("%.2f @ %.2f /dz\n%s Cookies", this.cookieNum, this.ppDozen, this.name);
		return str;
	}
}
