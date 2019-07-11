package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.List;

public class SstAmenazasDTO implements Serializable {
	
	private Long id;
	
	private GenericoDTO existeBrigadaAmenazas;
	
	private List<String> uploadPlanEmergencia;
	
	private AmenazasDTO amenazas;
	
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



	public List<String> getUploadPlanEmergencia() {
		return uploadPlanEmergencia;
	}

	public void setUploadPlanEmergencia(List<String> uploadPlanEmergencia) {
		this.uploadPlanEmergencia = uploadPlanEmergencia;
	}

	public String getSubdomain() {
		return subdomain;
	}

	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}

	public AmenazasDTO getAmenazas() {
		return amenazas;
	}

	public void setAmenazas(AmenazasDTO amenazas) {
		this.amenazas = amenazas;
	}
	
	

}
