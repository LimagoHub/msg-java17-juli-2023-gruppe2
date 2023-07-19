package de.dependency;

import java.util.ServiceLoader;

public interface Dependency {

	void foo();
	String getName();
	
	static Dependency create(String type) {
		ServiceLoader<Dependency> loader = ServiceLoader.load(Dependency.class);
		Dependency dependency = loader.findFirst().get();
		return dependency;
	}
}