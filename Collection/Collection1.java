
import java.util.Scanner;

interface Client
{
	void inpute();// public+Abstract
	void output();//public +Abstract
}

class Raju implements Client
{
	String name; double salary;
	public void inpute() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name: ");
		name = sc.nextLine();
		
		System.out.println("Enter Your Salary: ");
		salary = sc.nextDouble();
	}
	public void output() 
	{
     System.out.println(name+" "+salary);
	}
	public static void main(String[] args) {
		Client c = new Raju();
		c.inpute(); c.output();
	}
	
	
	}