package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.EsclavoDto;
import dtos.PacienteDto;

public class ClienteImplementacion implements ClienteInterfaz {

	public PacienteDto crearPacienteNuevo(Scanner sc, List<PacienteDto> listaPaciente, List<EsclavoDto> listaEsclavo) {
		PacienteDto nuevoPaciente = new PacienteDto();
		System.out.println("Indique el id del paciente");
		nuevoPaciente.setIdPaciente(sc.nextLong());
		System.out.println("Indique el nombre del paciente");
		nuevoPaciente.setNombreMascota(sc.next());
		System.out.println("Indique la edad del paciente");
		nuevoPaciente.setEdadPaciente(sc.nextInt());
		System.out.println("Indique la fecha de nacimiendo del paciente");
		nuevoPaciente.setFchNacimientoPaciente(sc.next());
		System.out.println("Indique el sexo biologico del paciente");
		nuevoPaciente.setSexoBiologicoPaciente(sc.next());
		System.out.println("Indique la especie del paciente");
		nuevoPaciente.setEspeciePaciente(sc.next());

		System.out.println("El esclavo existe (s/n)");
		if (sc.next().charAt(0) == 'n') {

			nuevoPaciente.setIdEsclavo(crearNuevoEsclavo(sc, listaEsclavo));

		} else {
			int contador = 0;
			do {
				contador = 0;
				System.out.println("Indique el id del esclavo");
				long idEsclavoIndicado = sc.nextLong();

				for (EsclavoDto esclavo : listaEsclavo) {
					if (idEsclavoIndicado == esclavo.getIdEsclavo()) {
						contador++;
						nuevoPaciente.setIdEsclavo(idEsclavoIndicado);
					}
				}
			} while (contador == 0);
		}
		listaPaciente.add(nuevoPaciente);
		return nuevoPaciente;
	}

	private long crearNuevoEsclavo(Scanner sc, List<EsclavoDto> listaEsclavo) {
		
		System.out.println("Indique el id: ");
		long id = sc.nextLong();
		System.out.println("Indique el nombre: ");
		String nombre = sc.next();
		System.out.println("Indique el apellido: ");
		String apellido = sc.next();
		System.out.println("Indique el dni: ");
		String dni = sc.next();
		System.out.println("Indique el telefono: ");
		String telefono = sc.next();
		
	
	EsclavoDto esclavo = new EsclavoDto(id, nombre, apellido, dni, telefono);
	listaEsclavo.add(esclavo);
	return id;
	}
}
