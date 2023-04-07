package class_lab;

public class StudentRecord {

	String sname;
	int roll_no;
	
	 StudentRecord(String s,int n) {
		this.sname = s;
		this.roll_no = n;
	}
	 void display() {
			System.out.println(roll_no+" "+sname);
		}
	
	public static void main(String[] args) {
		
		StudentRecord sr = new StudentRecord("john",2);
		sr.display();
	}

}
