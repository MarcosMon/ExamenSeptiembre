package org.lasencinas.ExamenSep;

import java.util.ArrayList;
import java.util.List;

public class Tasques {

	List<Filtre> tarea = new ArrayList();

	public Tasques() {
	}

	public List<Filtre> getTasques() {

		return tarea;
	}
	
	public Target getTarget() {
		
		
		return null;
	}
	
	public void afegirTasca(Filtre tasca) {
		
		this.tarea.add(tasca);
		
	}
	
	public void execucio(String recibo) {
		
	}

	public void setTarget(Target target) {
		
	}
}
