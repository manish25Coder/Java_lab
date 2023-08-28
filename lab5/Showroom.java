package lab5;

import java.util.Scanner;

public class Showroom {

	Scanner sc = new Scanner(System.in);
	String name;
	long mobno;
	double cost;
	double dis;
	double amt;
//creating a methods
	void input()
	{
		System.out.println("Enter Name :");
		name = sc.next();
		System.out.println("Enter Mobile no. :");
		mobno = sc.nextLong();
		System.out.println("Enter Cost :");
		cost = sc.nextDouble();
	}
	//creating a methods
	void calculate()
	{
		if(cost<=10000)
		{
			dis=cost*0.05;
			amt = cost-dis;
			
		}
		else if((cost>10000) && (cost<=20000))
		{
			dis=cost*0.1;
			amt = cost-dis;
			
		}
		else if((cost > 20000) && (cost<=35000))
		{
			dis=cost*0.15;
			amt = cost-dis;
			
		}
		else if(cost > 35000)
		{
			dis=cost*0.2;
			amt = cost-dis;
			System.out.println("Total :"+amt);
		}
		else
		{
			System.out.println("No Discount.");
		}
	}
	//creating a methods
	void display()
	{
		System.out.println("Name :"+name);
		System.out.println("Mobile No. :"+mobno);
		System.out.println("Total Amount :"+amt);
	}
	public static void main(String[] args) {
		//creating constructor
		Showroom sr = new Showroom();
		//calling object
		sr.input();
		sr.calculate();
		sr.display();

	}

}
