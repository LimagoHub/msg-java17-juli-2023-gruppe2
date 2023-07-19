package de.dependency.internal;

import de.dependency.Dependency;

public class DepB implements Dependency {

	@Override
	public void foo() {
		System.out.println("Hier ist b");

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "B";
	}

}
