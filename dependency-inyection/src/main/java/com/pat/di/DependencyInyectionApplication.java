package com.pat.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pat.di.atributo.Coche;
import com.pat.di.atributo.Motor;
import com.pat.di.qualifiers.Animal;
import com.pat.di.qualifiers.Nido;
import com.pat.di.qualifiers.Pajaro;
import com.pat.di.qualifiers.Perro;

@SpringBootApplication
public class DependencyInyectionApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);


	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
		//Perro perro = context.getBean(Perro.class);
		//Animal animal = context.getBean("perrito", Animal.class);
		//log.info("Objeto animal, nombre: {} edad: {}", animal.getNombre(), animal.getEdad());
		Nido nido = context.getBean(Nido.class);
		nido.imprimir();
	}

}
