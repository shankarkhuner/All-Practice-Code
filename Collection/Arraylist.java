import java.util.ArrayList;
class ArrayList1

{
	public static void main(String[] args) 
	{
		Emp1 e1 = new Emp1(101,"emp");
		Dept d1 = new Dept(201,"dept");

		Integer i = 100;
		ArrayList a1 = new ArrayList();
		a1.add(e1);
		a1.add(d1);
		a1.add(i);
		for(Object o : a1)
			{
			if(o instanceof Emp1)
				{
					Emp1 e = (Emp1)o;
					System.out.println(e.empid+" "+e.empName);

				}
				else if(o instanceof Dept)
					{
					Dept d = (Dept)o;
					System.out.println(d.Deptid+" "+d.DeptName);
						
					}
					else if(o instanceof Integer)
					{
					Integer ii = (Integer)o;
					System.out.println(ii);
						
					}


				
			}
	}
}
