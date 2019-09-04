package org.lasencinas.ExamenSep;

import java.util.ArrayList;
import java.util.List;

public class Tasques {

	Target vehicle = new Vehicle();

	List<Filtre> tareas = new ArrayList();

	public Tasques() {
	}

	public List<Filtre> getTasques() {

		return tareas;
	}

	public Target getTarget() {

		return this.vehicle;
	}

	public void afegirTasca(Filtre tasca) {

		this.tareas.add(tasca);

	}

	public void execucio(String nombre) {

		vehicle.execucio(nombre);

	}

	public void setTarget(Target target) {

		this.vehicle = target;

	}
}
