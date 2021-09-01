package Dessert;

import java.util.ArrayList;
import java.util.Collections;

public class Checkout{

	private ArrayList <DessertItem> items;
	private double tax;

	/**
	 * Default constructor for Checkout Class
	 */
	public Checkout() {
		this.tax = 0;
		items = new ArrayList<DessertItem>();
	}
	
	/**
	 * Overloaded constructor that takes in the tax as parameter
	 * @param tax - passes the tax for the dessert items
	 */
	public Checkout(double tax) {
		this.tax = tax;
		items = new ArrayList<DessertItem>();
	}
	
	/**
	 * deletes every element in the array list
	 */
	public void clear() {
		this.items.clear();
	}
	
	/**
	 * adds an item to the array list
	 * @param item - passes a DessertItem object to be added to the array list
	 */
	public void enterItem(DessertItem item) {
		this.items.add(item);
	}
	
	/**
	 * gets the number of elements in the array list items
	 * @return - returns the number of elements in the array list
	 */
	public int numberOfItems() {
		return items.size();
	}
	
	/**
	 * gets the tax rate
	 * @return - returns the tax rate
	 */
	public double getTax() {
		return this.tax;
	}
	
	/**
	 * calculates the total cost of all the items 
	 * @return - returns the cost of all the items in the arraylist
	 */
	public double totalCost() {
		double cost = 0;
		for(DessertItem item: items) {
			cost += item.getCost() + (item.getCost() * this.tax);
		}
		return cost;
	}
	
	/**
	 * calculates the total amount of tax from the purchase
	 * @return - 
	 */
	public double totalTax() {
		double tax = 0;
		for(DessertItem item: items) {
			tax += (item.getCost() * this.tax);
		}
		return tax;
		
	}
	
	/**
	 * sets the tax rate
	 * @param tax - passes tax rate for the items
	 */
	public void setTax(double tax) {
		this.tax = tax;
	}

	/**
	 * sorts the the arraylist by calories
	 */
	public void sortDesserItem() {
    	Collections.sort(items);
	}

	/**
	 * converts the object to a string
	 */
	public String toString() {
		 String str = "";
		 System.out.println("----------CSULB Dessert Shop----------\n");
		 for(DessertItem item: this.items) {
			 str+= String.format("%s\t\t%7.2f\t\t\n", item.toString(), item.getCost());
		 }
		 str += String.format("\nTax:\t\t\t\t$%6.2f\nTotal Cost:\t\t\t$%6.2f", this.totalTax(), this.totalCost());
		 return str;
	 } 


	
}
	