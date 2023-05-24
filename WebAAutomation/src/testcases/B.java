package testcases;

import java.util.ArrayList;
import java.util.HashMap;

public class B {

	public HashMap sum(int a, int b){
		int sum =a +b;
		int sub =a-b;
		HashMap m = new HashMap();
		m.put("Sum", sum);
		m.put("Sub", sub);
		return m;
	}
	
}
