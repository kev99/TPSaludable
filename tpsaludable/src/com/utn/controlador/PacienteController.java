package com.utn.controlador;

import com.utn.factory.PacienteFactory;
import com.utn.modelo.Paciente;

public class PacienteController {

	private PacienteFactory pf;

	public PacienteController() {
		this.pf = new PacienteFactory();
	}

	public void insertoPaciente(Paciente paciente) {
		try {
			pf.insert(paciente);
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

	public void muestroPacientesCargados() {
		try {
			for (Paciente item : pf.getAll()) {
				System.out.println(item);
			}
		} catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}

}
