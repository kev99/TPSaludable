package com.utn.vista;

import com.utn.controlador.PacienteController;
import com.utn.factory.PacienteFactory;
import com.utn.modelo.Paciente;
import com.utn.modelo.Persona;

public class Test {

	public static void main(String[] args) {

		PacienteController pc = new PacienteController();

		Paciente p1 = new Paciente("Robin", "Rollhouse", 31312567, 32, "45678763", "robinhousehotmail.com", 23021989,
				"Palermo", "Masculino	", "Locura Temporal");

		pc.insertoPaciente(p1);

		pc.muestroPacientesCargados();

		
		
	}

}
