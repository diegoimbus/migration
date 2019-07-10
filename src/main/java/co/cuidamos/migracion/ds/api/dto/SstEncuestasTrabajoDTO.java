package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SstEncuestasTrabajoDTO implements Serializable{
	
	private Long id;
	
	private String cargoLaboral;
	
	private String equiposOpera;
	
	private String sugerenciasCondTrabajo;
	
	private List<RisksDTO> risks;

	private String subdomain;
	
	private Integer quantityFields;
	
	private Integer encuestaForm;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCargoLaboral() {
		return cargoLaboral;
	}

	public void setCargoLaboral(String cargoLaboral) {
		this.cargoLaboral = cargoLaboral;
	}

	public String getEquiposOpera() {
		return equiposOpera;
	}

	public void setEquiposOpera(String equiposOpera) {
		this.equiposOpera = equiposOpera;
	}

	public String getSugerenciasCondTrabajo() {
		return sugerenciasCondTrabajo;
	}

	public void setSugerenciasCondTrabajo(String sugerenciasCondTrabajo) {
		this.sugerenciasCondTrabajo = sugerenciasCondTrabajo;
	}

	public List<RisksDTO> getRisks() {
		return risks;
	}

	public void setRisks(List<RisksDTO> risks) {
		this.risks = risks;
	}

	public String getSubdomain() {
		return subdomain;
	}

	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}

	public Integer getQuantityFields() {
		return quantityFields;
	}

	public void setQuantityFields(Integer quantityFields) {
		this.quantityFields = quantityFields;
	}

	public Integer getEncuestaForm() {
		return encuestaForm;
	}

	public void setEncuestaForm(Integer encuestaForm) {
		this.encuestaForm = encuestaForm;
	}
	
	

}
