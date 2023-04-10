package class_lab;

public class Question_10 {
	
	
	int a,b,c;
	
	Question_10(int a,int b, int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public Question_10() {
	}

	void display()
	{
		System.out.println("a = "+a +"  b = "+b +"  c = "+c);
	}

	public static void main(String[] args) {
	
		System.out.println("store value in instance variable");
		Question_10 Q1 = new Question_10(10,20,30);
		Q1.display();
		
		System.out.println();
		
		System.out.println("not pass any value during object creation");
		Question_10 Q2 = new Question_10();
		Q2.display();
		
	}

}
