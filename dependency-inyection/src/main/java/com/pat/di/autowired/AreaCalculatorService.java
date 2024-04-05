package com.pat.di.autowired;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaCalculatorService {

	@Autowired
	private List<Figure> figures;
	
	public double calcAreas() {
		double area=0;
		for(Figure figure : figures) {
			area+=figure.calcularArea();
		}
		return area;	
	}
	
}
