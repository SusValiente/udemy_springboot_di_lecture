package com.bolsadeideas.springboot.di.app.models.services;

//@Primary
//@Service("miServicioSimple")
public class MyService implements IService {

	@Override
	public String operacion() {
		return "ejecutando algun proceso importante . . .";
	}
	
}
