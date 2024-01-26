package servicios;

import java.util.List;
import java.util.Scanner;

import dtos.EsclavoDto;
import dtos.PacienteDto;

public interface ClienteInterfaz {

	public PacienteDto crearPacienteNuevo(Scanner sc, List<PacienteDto> listaPaciente, List <EsclavoDto> listaEsclavo);
}
