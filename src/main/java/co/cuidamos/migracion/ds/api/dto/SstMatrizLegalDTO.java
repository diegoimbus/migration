package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.List;

public class SstMatrizLegalDTO implements Serializable {
	
	private Long id;
	
	private MatrizLegalDTO matriz;
	
	private String subdomain;
	
	private Integer quantityFields;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MatrizLegalDTO getMatriz() {
		return matriz;
	}

	public void setMatriz(MatrizLegalDTO matriz) {
		this.matriz = matriz;
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
