class Emp
{
	int empid;
	String EmpName;
	 Emp(int empid,String EmpName){
		this.empid = empid;
		this.EmpName = EmpName;
	}
	public String toString(){
		return empid +EmpName;
		
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Emp str = new Emp(10,"cyberrr");
		System.out.println(str);
	}
}
