class Array03 
{
	public static void main(String[] args) 
	{
		Emp e1 = new Emp(100, "Satish");
		Emp e2 = new Emp(200, "Ram");
		Emp e3 = new Emp(300, "Sham");
		Emp[] e = new Emp[3];
		e[0] = e1;
		e[1] = e2;
		e[2] = e3;
		for(Emp ee : e)
			{
				System.out.println(ee.empid+"---"+ee.empname);
			}
	}
}
