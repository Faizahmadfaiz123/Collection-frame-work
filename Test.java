package pack;

import java.awt.List;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList arr = new ArrayList();
		arr.add(new stu(10, "alikhan"));
		arr.add(new emp(1, "ahmad"));
		arr.add(new stu(11, "jan"));
		
//		System.out.println(arr);
		
		
//		System.out.println(arr.get(0));
//		System.out.println(arr.get(1));
//		System.out.println(arr.get(2));
		
		emp e1 = (emp)arr.get(0);
		System.out.println(e1.eId + " " + e1.eName);
		emp o02 = (emp)arr.get(1);
		
	}
}
