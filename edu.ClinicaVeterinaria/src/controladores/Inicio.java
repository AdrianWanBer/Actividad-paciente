package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.EsclavoDto;
import dtos.PacienteDto;
import servicios.ClienteImplementacion;
import servicios.ClienteInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

public class Inicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<PacienteDto> listaPaciente = new ArrayList<PacienteDto>();
		List<EsclavoDto> listaEsclavo = new ArrayList<EsclavoDto>();

		ClienteInterfaz ci = new ClienteImplementacion();
		// MenuInterfaz mi = new MenuImplementacion();

		ci.crearPacienteNuevo(sc, listaPaciente, listaEsclavo);
		for (PacienteDto paciente : listaPaciente) {
			System.out.println(paciente.toString());
		}
		for (EsclavoDto esclavo : listaEsclavo) {
			System.out.println(esclavo.toString());
		}

	}

}
