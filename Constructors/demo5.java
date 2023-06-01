class Demo 
{int a = 200;
static int c = 70;
	Demo(int a,int c)
		{
			System.out.println(this.a+a);
			System.out.println(this.a);
			System.out.println(this.c);
			System.out.println(c);
		}
		void m1(int a)
			{
				System.out.println("M1 Method");
				System.out.println(a);
				System.out.println(a);
				System.out.println(this.a);
				System.out.println(this);
			}
		void m2(int a)
			{
				System.out.println("M1 Method");
				System.out.println(a);
				System.out.println(a);
				System.out.println(this.a);
			}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Demo ref = new Demo(100,90);
		ref.m1(52);
		ref.m2(80);
	}
}
