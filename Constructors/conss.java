class Cons 
{int a = 200;
Cons(float b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Cons d = new Cons(200.5f);
	}
}
