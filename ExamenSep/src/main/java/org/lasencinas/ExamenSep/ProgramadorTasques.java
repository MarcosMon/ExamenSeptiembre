package org.lasencinas.ExamenSep;

import java.util.ArrayList;
import java.util.List;

public class ProgramadorTasques {
	
	Tasques task = new Tasques();
	
	
	public ProgramadorTasques(Target vehicle) {
		
		
	}

	public void setTasca(Filtre autenticacio) {
		
		
		task.afegirTasca(autenticacio);
		
	}
	
	public Tasques getTasques() {
		
		
	
		return task;
	}
	
	public void executarTasques(String tasca) {
		
		
	}
	

}
