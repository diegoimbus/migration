package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;

public class SstAmenazasDTO implements Serializable {
	
	private Long id;
	
	private GenericoDTO existeBrigadaAmenazas;
	
	private String[] uploadPlanEmergencia;
	
	private String subdomain;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public GenericoDTO getExisteBrigadaAmenazas() {
		return existeBrigadaAmenazas;
	}

	public void setExisteBrigadaAmenazas(GenericoDTO existeBrigadaAmenazas) {
		this.existeBrigadaAmenazas = existeBrigadaAmenazas;
	}

	public String[] getUploadPlanEmergencia() {
		return uploadPlanEmergencia;
	}

	public void setUploadPlanEmergencia(String[] uploadPlanEmergencia) {
		this.uploadPlanEmergencia = uploadPlanEmergencia;
	}

	public String getSubdomain() {
		return subdomain;
	}

	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}
	
	

}
