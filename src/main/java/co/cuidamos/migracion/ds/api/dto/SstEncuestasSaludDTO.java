package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.List;

public class SstEncuestasSaludDTO implements Serializable{
	
	private Long id;
	
	private String enfermedadTratamiento;
	
	private String sintomasFisicEmocion;
	
	private String sintomFuera;
	
	private GenericoDTO consultadoSalud;
	
	private String ultimAnioIncapacitado;
	
	private String diasIncapacidad;
	
	private List<GenericoDTO> hobbyDeporte;
	
	private GenericoDTO practicaAlgunDeporte;
	
	private List<GenericoDTO> actividadesSaludEmpresa;
	
	private String sugerenciasCondSalud;
	
	private String subdomain;
	
	private Integer encuestaForm;
	
	private String sintomTrabajo;
	
	private String porque;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEnfermedadTratamiento() {
		return enfermedadTratamiento;
	}

	public void setEnfermedadTratamiento(String enfermedadTratamiento) {
		this.enfermedadTratamiento = enfermedadTratamiento;
	}

	public String getSintomasFisicEmocion() {
		return sintomasFisicEmocion;
	}

	public void setSintomasFisicEmocion(String sintomasFisicEmocion) {
		this.sintomasFisicEmocion = sintomasFisicEmocion;
	}

	public String getSintomFuera() {
		return sintomFuera;
	}

	public void setSintomFuera(String sintomFuera) {
		this.sintomFuera = sintomFuera;
	}

	public GenericoDTO getConsultadoSalud() {
		return consultadoSalud;
	}

	public void setConsultadoSalud(GenericoDTO consultadoSalud) {
		this.consultadoSalud = consultadoSalud;
	}

	public String getUltimAnioIncapacitado() {
		return ultimAnioIncapacitado;
	}

	public void setUltimAnioIncapacitado(String ultimAnioIncapacitado) {
		this.ultimAnioIncapacitado = ultimAnioIncapacitado;
	}

	public String getDiasIncapacidad() {
		return diasIncapacidad;
	}

	public void setDiasIncapacidad(String diasIncapacidad) {
		this.diasIncapacidad = diasIncapacidad;
	}

	public List<GenericoDTO> getHobbyDeporte() {
		return hobbyDeporte;
	}

	public void setHobbyDeporte(List<GenericoDTO> hobbyDeporte) {
		this.hobbyDeporte = hobbyDeporte;
	}

	public GenericoDTO getPracticaAlgunDeporte() {
		return practicaAlgunDeporte;
	}

	public void setPracticaAlgunDeporte(GenericoDTO practicaAlgunDeporte) {
		this.practicaAlgunDeporte = practicaAlgunDeporte;
	}

	public List<GenericoDTO> getActividadesSaludEmpresa() {
		return actividadesSaludEmpresa;
	}

	public void setActividadesSaludEmpresa(List<GenericoDTO> actividadesSaludEmpresa) {
		this.actividadesSaludEmpresa = actividadesSaludEmpresa;
	}

	public String getSugerenciasCondSalud() {
		return sugerenciasCondSalud;
	}

	public void setSugerenciasCondSalud(String sugerenciasCondSalud) {
		this.sugerenciasCondSalud = sugerenciasCondSalud;
	}

	public String getSubdomain() {
		return subdomain;
	}

	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}

	public Integer getEncuestaForm() {
		return encuestaForm;
	}

	public void setEncuestaForm(Integer encuestaForm) {
		this.encuestaForm = encuestaForm;
	}

	public String getSintomTrabajo() {
		return sintomTrabajo;
	}

	public void setSintomTrabajo(String sintomTrabajo) {
		this.sintomTrabajo = sintomTrabajo;
	}

	public String getPorque() {
		return porque;
	}

	public void setPorque(String porque) {
		this.porque = porque;
	}
	
	

}
