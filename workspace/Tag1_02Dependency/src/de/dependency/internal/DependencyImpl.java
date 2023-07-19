package de.dependency.internal;

import de.demo.Bar;
import de.dependency.Dependency;

public class DependencyImpl implements Dependency {
	
	private Bar bar = new Bar();
	
	@Override
	public void foo() {
		System.out.println("Hier ist foo");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "A";
	}



}
