
 
package cs.colletionfw.listclasses;
import java.util.ArrayList;

public class Collection01 {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add(100);//primitive data type 
		a1.add(200);
		a1.add(300);
		System.out.println(a1);
		a1.add(300);
		a1.add(400);
		System.out.println(a1);
		a1.add(null);
		a1.add(20.25f);
		a1.add('X');
		System.out.println(a1);
	}

}
