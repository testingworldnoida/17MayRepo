package testing;

import java.io.IOException;

public class B {

	public static void main(String[] args) throws IOException {
		
		PropertyReader p = new PropertyReader();
		System.out.println(p.fetchPropertyData("Password"));
		
	}
	
}
