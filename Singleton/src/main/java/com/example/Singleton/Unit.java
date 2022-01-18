package com.example.Singleton;

public class Unit {

	private String name;
	private Unit subordinate;

	
	public Unit (String name,Unit subordinate) {
		this.name=name;
		this.subordinate=subordinate;
	}
	
	public Unit(String string) {
		// TODO Auto-generated constructor stub
	}

	public void executeCommand (String command) {
		if(subordinate==null) {
			System.out.println("Orden " + command + " ejecutada por " + this.name);
			
		}else {
			System.out.println("Orden " + command + " ejecutada por " + this.name);
			subordinate.executeCommand(command);
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public Unit getSubordinate() {
		return subordinate;
	}
	
	public void setSubordinate(Unit subordinate) {
		this.subordinate=subordinate;
	}
	
	
};
