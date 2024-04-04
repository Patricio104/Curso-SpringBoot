package com.pat.di.qualifiers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//Aplicando qualifiers (perrito)
@Component("perrito")
public class Perro extends Animal{

	public Perro(@Value("Rocky")String nombre, @Value("12")Integer edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
