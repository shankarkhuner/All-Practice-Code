class Biba1
{
	Biba1()
		{
			System.out.println("Inside 1 Arg");
		}
	Biba1(int a)
		{
			System.out.println("Inside 2 Arg");
		}
	Biba1(float b)
		{
			System.out.println("Inside 3 Arg");
		}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Biba1 ref1 = new Biba1();
	}
}
