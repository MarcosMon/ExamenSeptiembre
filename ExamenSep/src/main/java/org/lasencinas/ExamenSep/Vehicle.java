package org.lasencinas.ExamenSep;

public class Vehicle implements Target {

	Client cliente = new Mollapp();
	
	public Vehicle() {}
	
	public void execucio(String recibido) {

		System.out.println("Puerta abierta" + recibido );
	}

}
