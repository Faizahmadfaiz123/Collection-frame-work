package pack;

import java.util.Stack;

public class Test {

	public static void main(String[] args) {
		
//		Stack Classes.
		
		Stack<String> slist = new Stack<String>();
		slist.push("faiz");
		slist.push("ahmad");
		slist.push("jan");
		slist.push("khalid");
		
		System.out.println(slist);
		System.out.println(slist.search("faiz"));
		System.out.println(slist.search("ahmad"));
		System.out.println(slist.search("khalid"));
		System.out.println(slist.search("jan"));
		
		System.out.println(slist.peek());
		
		System.out.println(slist.pop());
		
		slist.pop();
		System.out.println(slist);
		
		
		System.out.println(slist.isEmpty());
		
		
	}

}
