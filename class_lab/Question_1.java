package class_lab;

public class Question_1 {

	int id;String name; 
	
	Question_1(int id , String name)
	{
		this.id=id;
		this.name=name;
		
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		
		Question_1 obj1=new Question_1(1, "Magan");
		Question_1 obj2= new Question_1(2, "Atul");

	}

}
