package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;

public class SstObjetivosDTO implements Serializable {
	
	private Long id;
	
	private Integer deAcuerdoObjetivos;
	
	private String crearOtrosObjetivos;
	
	private String subdomain;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getDeAcuerdoObjetivos() {
		return deAcuerdoObjetivos;
	}

	public void setDeAcuerdoObjetivos(Integer deAcuerdoObjetivos) {
		this.deAcuerdoObjetivos = deAcuerdoObjetivos;
	}

	public String getCrearOtrosObjetivos() {
		return crearOtrosObjetivos;
	}

	public void setCrearOtrosObjetivos(String crearOtrosObjetivos) {
		this.crearOtrosObjetivos = crearOtrosObjetivos;
	}

	public String getSubdomain() {
		return subdomain;
	}

	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}
	
	

}
