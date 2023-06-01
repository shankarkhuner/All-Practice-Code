
class Sample 
{
	Sample()
		{
			this(10);
			System.out.println("Inside 0 arg constructore");
			return;
		}
	Sample(int a)
		{
			System.out.println("Inside 1 arg constructore");
			return;
		}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		Sample ref = new Sample();
		System.out.println("Stop");
	}
}
