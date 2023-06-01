class Good
{
	Good(int a)
		{
			System.out.println("My Name");
			System.out.println(a);
		}
	Good()
		{
			System.out.println("Shankar");
		}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Good d1 = new Good();
		Good d2 = new Good(100);
		System.out.println("Stop");
	}
}
