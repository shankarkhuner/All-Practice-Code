class Cons 
{
	Cons()
		{
			System.out.println("Jay Shankar");
		
		}
	Cons(int a)
		{
			System.out.println("Shankar");
			System.out.println(a);
		
		}

	public static void main(String[] args)
	{
		System.out.println("Hello World!");

		Cons d = new Cons();

		Cons j = new Cons(10);
		System.out.println("Stop");
	}
}