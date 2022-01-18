package com.example.Singleton;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test {

	public static void main(String[] args) {
		PersonSingleton.getInstance().setName("Alvaro");
		Person person=new Person(null);
		Person uno=(Person) person.clone();
		
		System.out.println(uno);
		
		PersonDecorator dos=new PersonDecorator(person);
		System.out.println(dos.getName());
		System.out.println(dos.getAge());
		
		Unit soldado=new Unit("soldado");
		Unit sargento=new Unit("sargento");
		Unit capitan=new Unit("capitan");
		
		capitan.executeCommand("Accion");
	}
}
