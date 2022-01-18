package com.example.Singleton;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public interface Prototype{

	public Prototype clone();
}
