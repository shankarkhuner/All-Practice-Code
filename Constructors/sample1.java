
class Sample
{
	float n = 12.1545f;
	Sample(float n)
		{
			System.out.println("Inside 0 Args");
			System.out.println(this.n);//find the non-static values & print.
			System.out.println(n);
		}
		void m1()
		{
			System.out.println("Inside m1");
			System.out.println(n);
			
		}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		Sample s1 = new Sample(25.369f);
		s1.m1();
		System.out.println("Stop");

	}
}
