class Cons 
{int a = 100;
	Cons()
		{
			System.out.println("Jay Shankar");
			System.out.println(a);
		}

	public static void main(String[] args)
	{
		System.out.println("Hello World!");

		Cons d = new Cons();
		System.out.println(d.a);

		Cons j = new Cons();
		System.out.println("Stop");
	}
}