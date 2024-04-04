package com.pat.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pat.di.atributo.Coche;
import com.pat.di.atributo.Motor;
import com.pat.di.profiles.EnvironmentService;
import com.pat.di.qualifiers.Animal;
import com.pat.di.qualifiers.Nido;
import com.pat.di.qualifiers.Pajaro;
import com.pat.di.qualifiers.Perro;
import com.pat.di.scopes.EjemploScopeService;

@SpringBootApplication
public class DependencyInyectionApplication {
	
	private static final Logger log = LoggerFactory.getLogger(DependencyInyectionApplication.class);


	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInyectionApplication.class, args);
		EjemploScopeService ejemploScopeService = context.getBean(EjemploScopeService.class);
		EjemploScopeService ejemploScopeService1 = context.getBean(EjemploScopeService.class);
		
		log.info("Este Bean es equal {}", ejemploScopeService.equals(ejemploScopeService1));
		log.info("Este Bean es == {}", ejemploScopeService.equals(ejemploScopeService1));
	}

}
