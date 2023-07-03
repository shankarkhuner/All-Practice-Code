
public class Array2 {

	public static void main(String[] args) {
		System.out.println("Start");
		
		int[] a = new int[3];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		for(int i = 0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		Emp[] e  = new Emp[5];
		e[0] = new Emp(101,"Aman");
		e[1] = new Emp(102,"Yami");
		e[2] = new Emp(103,"Rashmi");
		
		for(Emp e1:e) {
			if(e1 instanceof Emp) {
				System.out.println(e1.empid+"-"+e1.empName);
			}
			
		}
		System.out.println("Stop");
	}

}
