package lab5;

public class Overload {

	void perimeterOfSquare(int s)
	{
		int res = 4*s;
		System.out.println("Perimeter of Square :"+ res);
	}
	void perimeterOfRectangle(int l, int b)
	{
		int res = 2*(l+b);
		System.out.println("Perimeter of Rectangle :"+ res);
	}
	void perimeterOfCircle(int r)
	{
		int res = 2 * (22/7) * r;
		System.out.println("Perimeter of circle :"+ res);
	}
	public static void main(String[] args) {
		//creating constructor
		Overload o = new Overload();
		//calling object
		o.perimeterOfSquare(10);
		o.perimeterOfRectangle(10, 20);
		o.perimeterOfCircle(20);


	}

}
