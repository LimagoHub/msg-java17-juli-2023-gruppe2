package de.main;




import java.util.ServiceLoader;

import de.dependency.Dependency;


public class Main {


	
	public static void main(String[] args) {
		
		
		
	
		Dependency dependency = Dependency.create("A");
		
		dependency.foo();
		
		
	}

}
