package com.bolsadeideas.springboot.di.app.models.services;


//@Service("miServicioComplejo")
public class MyServiceComplejo implements IService {

	@Override
	public String operacion() {
		return "ejecutando algun proceso importante complicado. . .";
	}
	
}
