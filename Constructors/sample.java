
class Sample
{
	int a;
	Sample()
		{
			System.out.println("Inside 0 Args");
			a=100;
		}
		void m1()
		{
			System.out.println("Inside m1");
			System.out.println(a);
			
		}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		Sample s1 = new Sample();
		s1.m1();
		System.out.println("Stop");

	}
}
