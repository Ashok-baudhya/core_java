package class_lab;

public class Square_Question {
	
	int square(int s)
	{
		return s*s;
	}
	double square (double s)
	{
		return s*s;
	}

	public static void main(String[] args) {
		
		Square_Question sq = new Square_Question();
		System.out.println(sq.square(3));
		System.out.format("%.2f",sq.square(0.2));
	}

}
