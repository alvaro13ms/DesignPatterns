package com.example.Singleton;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonSingleton {
	
	  private static Person INSTANCE;
	  

	  
	   private PersonSingleton() {
		   
	   }

	
	   public static Person getInstance() {
	     if (INSTANCE==null) {
	    	 INSTANCE=new Person(null);
	     }
	     return INSTANCE;
	   }
	   

}
