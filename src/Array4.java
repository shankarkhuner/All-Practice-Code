 

public class Array4 {
	static int[] m1()
	{
		System.out.println("Inside m1 Method");
		int[] a = {100,200,300};
		return a;
	} 
	void m2(String[] ss) 
	{
		System.out.println("Inside m2 Method");
		for(String sss:ss) {
			System.out.println(sss);
		}
	}

	public static void main(String[] args) {
		int[] aa = Array4.m1();
		for(int aaa:aa) {
			System.out.println(aaa);
		}
		String[] str = {"cyber","Success","Training"};
		Array4 arr = new Array4();
		arr.m2(str);
		
		

	}

}
