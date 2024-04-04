package com.pat.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pat.di.atributo.Coche;
import com.pat.di.atributo.Motor;

@SpringBootApplication
public class DependencyInyectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
		Coche coche = context.getBean(Coche.class);
		System.out.println(coche);
		//Motor motor = new Motor("x11", 1980);
		//Coche coche = new Coche("VmW", 1987, motor);
		
		//System.out.println(coche);
	}

}
