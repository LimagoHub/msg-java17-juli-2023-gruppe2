package main;

import java.lang.reflect.Method;

import de.tiere.Schwein;

public class Main {

	public static void main(String[] args) throws Exception{
		
		Class clazz = Schwein.class;
		
		Object object = clazz.getConstructor().newInstance();
		
		System.out.println(object);
		
		Method m = clazz.getMethod("fuettern");
		m.invoke(object);
		
		System.out.println(object);
		
		m = clazz.getDeclaredMethod("setGewicht", int.class);
		m.setAccessible(true);
		m.invoke(object, -100);
		System.out.println(object);
		

	}

}
