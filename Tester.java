package Dessert;

public class Tester {

	public static void main(String[] args) {
		Cookie Ctester = new Cookie("Chocolate Chip");
		Candy CAtester = new Candy("Fudge");
		IceCream Itester = new IceCream("Vanilla");
		Sundae Stester = new Sundae("Vanilla Ice Cream");
		Checkout register = new Checkout(.098);
		
		
		Ctester.setCookieNum(4);
		Ctester.setPPDozen(3.99);
		Ctester.setCalories(300);
		
		CAtester.setWeight(2.30);
		CAtester.setPricePerLB(.89);
		CAtester.setCalories(250);
		
		Stester.setPrice(1.99);
		Stester.setCalories(500);
		Stester.setToppingPrice(0.50);
		Stester.setTopping("Hot Fudge");
		
		
		Itester.setCalories(350);
		Itester.setPrice(1.99);
		
		register.enterItem(CAtester);
		register.enterItem(Itester);
		register.enterItem(Stester);
		register.enterItem(Ctester);
		register.sortDesserItem();
		System.out.println(register.toString());
		System.out.println("\n");
		System.out.printf("The number of items purchased is : %s\n", register.numberOfItems());
		System.out.printf("The tax rate of this purchase is : %.2f\n", register.getTax());
		System.out.printf("The total amount taxed from this purchase is : $%.2f\n", register.totalTax());
		System.out.printf("The total cost for this purchase is : $%.2f\n", register.totalCost());
		System.out.printf("The item with more calories between\n%s and %s is: %s ", CAtester.getName(), Ctester.getName(), DessertItem.max(CAtester, Ctester));
		
		
		
		System.out.println("\n");
		
		register.clear();
		Cookie Cookie = new Cookie("Chocolate Chip");
		Candy Candy = new Candy("Kit Kat");
		IceCream IceCream = new IceCream("Cookies and Cream");
		Sundae Sundae = new Sundae("Coffee Ice Cream");
		register.enterItem(Cookie);
		register.enterItem(Candy);
		register.enterItem(IceCream);
		register.enterItem(Sundae);
		register.sortDesserItem();
		
		Cookie.setCalories(350);
		Cookie.setCookieNum(5);
		Cookie.setPPDozen(3.49);
		
		Candy.setCalories(350);
		Candy.setPricePerLB(2.99);
		Candy.setWeight(3.4);
		
		IceCream.setCalories(300);
		IceCream.setPrice(4.50);
		
		Sundae.setCalories(500);
		Sundae.setPrice(3.99);
		Sundae.setTopping("Hot Fudge");
		Sundae.setToppingPrice(0.75);
		
		
		
		
		System.out.println(register.toString());
		System.out.printf("The number of items purchased is : %s\n", register.numberOfItems());
		System.out.printf("The tax rate of this purchase is : %.2f\n", register.getTax());
		System.out.printf("The total amount taxed from this purchase is : $%.2f\n", register.totalTax());
		System.out.printf("The total cost for this purchase is : $%.2f\n", register.totalCost());
		System.out.println("\n");
		System.out.printf("The item with more calories between\n%s and %s is: %s ", Sundae.getName(), IceCream.getName(), DessertItem.max(Sundae, IceCream));
		
		
		

		
		

		
	}
}
