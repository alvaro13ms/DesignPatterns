package com.example.Singleton;

public class PersonDecorator {

	private String name;
	private int age;
	
	public PersonDecorator(Person person) {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return "Nombre" + name;
	}
	
	public int getAge() {
		return age*100;
	}
}
