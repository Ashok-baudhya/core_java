package inheritance_lab;

public class fruit {
	
	String name_of_fruit;
	String type;
	double price;
	
	fruit(String name_of_fruit,String type,double price)
	{
		this.name_of_fruit =name_of_fruit;
		this.type = type;
		this.price = price;
		
	}
	
	void displayFruit()
	{
		System.out.println("Name of Fruit : "+name_of_fruit);
		System.out.println("Single fruit or bunch fruit : "+type);
		System.out.println("Price : "+price);
		
	}

	public static void main(String[] args) {
		
		fruit apple = new fruit("Apple","Single",2.5);
		fruit banana = new fruit("banana","bunch",20.35);
		
		System.out.println("\nFirst Fruit");
		apple.displayFruit();
		System.out.println("\nSecond Fruit");
		banana.displayFruit();
		

	}

}
