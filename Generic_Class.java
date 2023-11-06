package practice_code;

import java.util.ArrayList;
import java.util.List;


//  generic class provide a type safety;
// error is shows on the compile time not to the Runtime

public class Generic_Class {
	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		str.add("Shankar");
		System.out.println(str);
		
		// non generic non type safe you can add all type of data like int, double,char etc.
		
		List list = new ArrayList();
		list.add("Khuner");
		list.add(123);
		list.add('A');
		System.out.println(list);
	}

}
