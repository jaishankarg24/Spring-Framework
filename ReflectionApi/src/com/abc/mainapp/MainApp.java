package com.abc.mainapp;

import java.lang.reflect.Field;


import java.lang.reflect.Modifier;

public class MainApp {

	public static void main(String[] args) {

		// Access the class object through Class.forName()

		try {
			Class<?> c = Class.forName("com.abc.pojo.Employee");

			System.out.println("Name of the class is :" + c.getName());
			System.out.println();
			
			//JVM should know about the interfaces implemented by Employee Class
			Class<?>[] interfaces = c.getInterfaces();
			for (Class<?> interfacename : interfaces) {
				System.out.println("InterfaceNames are :" + interfacename.getName());

			}
			System.out.println();
			
			//JVM should get the accessmodifier of Employee Class at RunTime.
            
			int modifiers = c.getModifiers();

			System.out.println("Modifier Type is :" + Modifier.toString(modifiers));
			
			System.out.println();
			
			Field[] fields = c.getDeclaredFields();
			for (Field field : fields) {
				System.out.println("Field Name is :"+field.getName());
				System.out.println("Field Type is :"+field.getType());
			}
			
			System.out.println();
			
			//JVM should know about the superclass Information of Employee Class
			System.out.println("The Superclass information is :"+c.getSuperclass().getName());
			
			System.out.println("The class information is :"+c.getClass());

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
