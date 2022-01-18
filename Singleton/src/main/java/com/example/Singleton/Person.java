package com.example.Singleton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Person implements Prototype{
	
	private String name;
	private int age;
	
	public Person(String name) {
		super();
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public Person clone() {
	
		Person a=new Person (this.name);
		return a;
	}
	
	/*public static void main(String[] args) {
		SpringApplication.run(Person.class, args);
	}*/

	public static PersonBuilder builder() {
        return new PersonBuilder();
    }
	
	private Person(PersonBuilder personBuilder) {
        super();
        this.name = personBuilder.name;
        this.age = personBuilder.age;
    }
	
	public static class PersonBuilder {
        private String name;
        private int age;
        public PersonBuilder name (String name) {
            this.name = name;
            return this;
        }
        public PersonBuilder age (int age) {
            this.age = age;
            return this;
        }
        public Person build () {
            return new Person(this);
        }
    }
	
	public static class PersonDecorator {
        private String name;
        private int age;
        public PersonDecorator name (String name) {
            this.name = name;
            return this;
        }
        public PersonDecorator age (int age) {
            this.age = age;
            return this;
        }
        public PersonDecorator PersonDecorator () {
            return new PersonDecorator();
        }
    }

	public void operacion() {
		System.out.println("Ejecutando operación");
		
	}
}
