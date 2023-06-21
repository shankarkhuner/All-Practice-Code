class Array04 
{
	public static void main(String[] args) 
	{
		int[] a = new int[5];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		for(int i = 0; i < a.length; i++)
			{
				System.out.println(a[i]);
			}
			Emp[] e = new Emp[5];
			e[0] = new Emp(100, "Megha");
			e[1] = new Emp(200, "Renuka");
			e[2] = new Emp(300, "Priti");
			for(int i = 0; i<a.length; i++)
				{
					System.out.println(e[i]);
				}

	}
}
