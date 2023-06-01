
class Cons2
{
	Cons2()
		{
			System.out.println("Iside Cons2");
		}
}
class Cons3
{
	Cons3(int a)
		{
			System.out.println("Inside Cons3");
			System.out.println(a);
		}
}
class Cons1 
{
	Cons1()
		{
			System.out.println("Inside Cons1");
		}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Cons1 d1 = new Cons1();
		Cons2 d2 = new Cons2();
		Cons3 d3 = new Cons3(100);
		System.out.println("Stop");
	}
}
