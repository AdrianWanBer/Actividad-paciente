package dtos;

public class PacienteDto {
	
	//ATRIBUTOS
	long idPaciente;
	String nombreMascota = "aaaaa";
	int edadPaciente = 11111;
	String fchNacimientoPaciente = "9999 12 31";
	String  sexoBiologicoPaciente = "aa";
	String especiePaciente = "aaaaa";
	long idEsclavo;
	
	//CONSTRUCTORES
	
	public PacienteDto() {
		super();
	}
	
	public PacienteDto(long idPaciente, String nombreMascota, int edadPaciente, String fchNacimientoPaciente,
			String sexoBiologicoPaciente, String especiePaciente, long idEsclavo) {
		super();
		this.idPaciente = idPaciente;
		this.nombreMascota = nombreMascota;
		this.edadPaciente = edadPaciente;
		this.fchNacimientoPaciente = fchNacimientoPaciente;
		this.sexoBiologicoPaciente = sexoBiologicoPaciente;
		this.especiePaciente = especiePaciente;
		this.idEsclavo = idEsclavo;
	}
	


	
	//GET Y SET
	public long getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(long idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNombreMascota() {
		return nombreMascota;
	}
	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}
	public int getEdadPaciente() {
		return edadPaciente;
	}
	public void setEdadPaciente(int edadPaciente) {
		this.edadPaciente = edadPaciente;
	}
	public String getFchNacimientoPaciente() {
		return fchNacimientoPaciente;
	}
	public void setFchNacimientoPaciente(String fchNacimientoPaciente) {
		this.fchNacimientoPaciente = fchNacimientoPaciente;
	}
	public String getSexoBiologicoPaciente() {
		return sexoBiologicoPaciente;
	}
	public void setSexoBiologicoPaciente(String sexoBiologicoPaciente) {
		this.sexoBiologicoPaciente = sexoBiologicoPaciente;
	}
	public String getEspeciePaciente() {
		return especiePaciente;
	}
	public void setEspeciePaciente(String especiePaciente) {
		this.especiePaciente = especiePaciente;
	}
	public long getIdEsclavo() {
		return idEsclavo;
	}
	public void setIdEsclavo(long idEsclavo) {
		this.idEsclavo = idEsclavo;
	}
	
	//METODO TOSTRING
	@Override
	public String toString() {
		return "PacienteDto [idPaciente=" + idPaciente + ", nombreMascota=" + nombreMascota + ", edadPaciente="
				+ edadPaciente + ", fchNacimientoPaciente=" + fchNacimientoPaciente + ", sexoBiologicoPaciente="
				+ sexoBiologicoPaciente + ", especiePaciente=" + especiePaciente + ", idEsclavo=" + idEsclavo + "]";
	}
	
	
	
	
}
