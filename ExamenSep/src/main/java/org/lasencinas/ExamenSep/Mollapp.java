package org.lasencinas.ExamenSep;

public class Mollapp implements Client {

	ProgramadorTasques programadorTasques;

	public Mollapp() {
	}

	public void setProgramadorTasques(ProgramadorTasques programadorTasques) {
		this.programadorTasques = programadorTasques;
	}

	public void enviarPeticio(String nombre) {
		this.programadorTasques.executarTasques(nombre);
	}

}
