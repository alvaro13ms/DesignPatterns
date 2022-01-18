package com.example.Singleton;

public class AbstractPersonProxy implements IPersonProxy {

	private Person person;
	
	protected AbstractPersonProxy (Person person) {
		this.person=person;
	}
	
	@Override
	public void operacion() {
		before();
		this.person.operacion();
		after();
	}
	
	public void before() {
		System.out.println("Antes de la operación" + person.getName());
	}
	
	public void after() {
		System.out.println("Después de la operación" + person.getName());
	}
}
