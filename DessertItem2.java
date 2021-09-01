package Dessert;
/**
 * Super class with methods that can be used by subclasses via polymorphism
 * @author Alexandre Schein
 *
 */
public abstract class DessertItem2 implements Comparable {

	 protected String name;

	/**
	 * Null constructor for DessertItem class
	 */
	 public DessertItem2() {
		 this("");
	  }
	/**
	 * Initializes DessertItem data
	 * @param - takes in a string parameter to store the name of the obejct
	 */
	 public DessertItem2(String name) {
	     this.name = name;
	      }
	/**
	 * Returns name of DessertItem
	 * @return name of DessertItem
	 */
	 public final String getName() {
		 return name;
	  }
	/**
	 * Returns cost of DessertItem
	 * @return cost of DessertItem
	 */
	 public abstract double getCost();

	 public abstract double getCalories();
	 
	 /**
	  * compares two objects to see which has a greater caloric value
	  * @param y - the object that is being compared to
	  * @return - returns -1 if the other object has more calories
	  * @return - returns 1 if this object has more calories than the object being compared to
	  * @return - returns 0 if both objects have the same caloric value
	  */
	 public int CompareTo(Object y) {
		 //sets variable other to the object that is being compared to
		 DessertItem2 other = (DessertItem2) y;
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
	  * uses the CompareTo method to return the item with a larger value
	  * @param x - first item that is being compared
	  * @param y - second item that is being compared 
	  * @return - returns the name of the object with the higher caloric value
	  */
	 public static String max(DessertItem2 x, DessertItem2 y) {
		 //checks if compareTo() returns 1,0, or -1 to determine which obejct has a greater caloric value
		 int temp = x.CompareTo(y);
		 if(temp == 1) {
			 return x.getName();
		 }else if(temp == -1) {
			 return y.getName();
		 }else {
			 return "Both dessert items have the same amount of calories.";
		 }
	 }
	 
	 
	 
}

