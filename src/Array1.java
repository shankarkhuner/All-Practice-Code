
public class Array1 {

	public static void main(String[] args) {
	 System.out.println("Start");
	 Emp e1 = new Emp(101,"Rahul");
	 Emp e2 = new Emp(102,"Karn");
	 Emp e3 = new Emp(103,"Amar");
	 Emp[] e = new Emp[3];
	 e[0] = e1;
	 e[1] = e2;
	 e[2] = e3;
	 for(Emp ee:e)//e1,e2,e3 
	 {
		 System.out.println(ee.empid + "-" +ee.empName);
		 
	 }
	 
	 System.out.println("Stop");
		

	}

}
