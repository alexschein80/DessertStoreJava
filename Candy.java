package Dessert;

public class Candy extends DessertItem {
	
	public double weight;
	public double pricePerLB;
	public double calories;
	public double cost;
	
	/**
	 * default constructor
	 */
	public Candy() {
		name = "";

	}
	
	/**
	 * overloaded constructor
	 * @param name - takes in a string to name the object
	 */
	public Candy(String name) {
		this.name = name;
		weight = 0.00;
		pricePerLB = 0.00;
		cost = getCost();
		calories = 0.00;
		
	}
	
	/**
	 * gets the calories for the object
	 * @return - returns the calories of the object
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
	 * gets the value for price per pound for the object
	 * @return - returns the value for price per pound
	 */
	public double getPricePerLB() {
		return pricePerLB;
	}
	
	/**
	 * sets the value for price per pounds
	 * @param price
	 */
	public void setPricePerLB(double price) {
		this.pricePerLB = price;
	}
	
	/**
	 * gets the value for the weight of the object
	 * @return - returns the weight
	 */
	public double getWeight() {
		return weight;
	}
	
	/**
	 * sets the weight for the object
	 * @param weight - double parameter to set the weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	/**
	 * gets the cost of the object
	 * @return - returns the cost of the object as a double
	 */
	public double getCost() {
		double cost;
		double temp;
		temp = weight * pricePerLB;
		cost = Math.round(temp * 100);
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
		if(this.name.length() >= 6) {
			str = String.format("%.2f @ %.2f /lb\n%s \t", this.weight, this.pricePerLB, this.name);
		}else if(this.name.length() <= 5 ) {
		str = String.format("%.2f @ %.2f /lb\n%s \t\t", this.weight, this.pricePerLB, this.name);
		}
		return str;
	}
}
