class Employinfo
{
	int id;
	float sal;
		Employinfo(int id,float sal)
		{
			this.id=id;
			this.sal=sal;
		}
		void getinfo()
			{
				System.out.println("Employ id is"+id);
				System.out.println("Employ sal is"+sal);
			}
}
class OR 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}	Employinfo empl1 = new Employinfo(101,20000.5f);
		empl1.getinfo();
		Employinfo empl2 = new Employinfo(201,20000.5f);
		empl2.getinfo();
}
