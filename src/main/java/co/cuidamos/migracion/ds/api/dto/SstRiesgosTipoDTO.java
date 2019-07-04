package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.List;

public class SstRiesgosTipoDTO implements Serializable {
	
	private Long id;
	
	private List<RisksDTO> risks;
	
	private String subdomain;
	
	private Integer quantityFields;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
	

}
