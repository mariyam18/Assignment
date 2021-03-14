
import java.util.*;
public class Grocery {
	static int total;
	static int budget;
	String name;
	int price;
	String quantity;
	
	static ArrayList list = new ArrayList();
	
	public String toString()
	{
		System.out.println(name + "            "+ quantity +"         "+ price);
		
		return " ";
	}
	
	//parameterized constructor
	public Grocery(String name, String quantity, int price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	//additem method
	public static  void additem()
	{
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter product : ");
		String name= sc.nextLine();
		System.out.println("Enter quantity : ");
		String quantity= sc.nextLine();
		System.out.println("Enter Price : ");
		int price= sc.nextInt();
		if(price>budget) {
			System.out.println("Can't Buy the product ###(because budget left is"+budget+" )\n");
		}
		else {
			total=total+price;
			budget = budget-total;
		}
		
		Grocery  item = new Grocery(name,quantity,price);
		list.add(item); 
		
	}
	
	public static void display() {
		System.out.println("Grocery list is:");
		System.out.println("Product name   Quantity   Price \n");
		  for (Object x : list) {
              System.out.println(x);
          }
	}
	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the budget");
		budget=sc.nextInt();
		
		do{
			
		System.out.println("1. Add an item \n"
				+ "2. Exit");
		
		 choice =sc.nextInt();
		
		switch(choice) {
		
		case 1: 
			additem();
			break;
				
		case 2: 
			display();
			break;
		}
		}while(choice!=2);
		
		
		
		
	}

}
