class Biba1
{
	Biba1()
		{this(10);
			System.out.println("Inside 1");
		}
	Biba1(int a)
		{this(20.25f);
			System.out.println("Inside 2 Arg");
		}
	Biba1(float b)
		{
			System.out.println("Inside 3 Arg");
		}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		biba1 ref1 = new Biba();
	}
}
