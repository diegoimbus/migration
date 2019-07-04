package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;

public class SstPoliticaDTO  implements Serializable{

	 private Long id;
	 
	 private Integer deAcuerdoPolitica;
	 
	 private String textoPropioPolitica;
	 
	 private String subdomain;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getDeAcuerdoPolitica() {
		return deAcuerdoPolitica;
	}

	public void setDeAcuerdoPolitica(Integer deAcuerdoPolitica) {
		this.deAcuerdoPolitica = deAcuerdoPolitica;
	}

	public String getTextoPropioPolitica() {
		return textoPropioPolitica;
	}

	public void setTextoPropioPolitica(String textoPropioPolitica) {
		this.textoPropioPolitica = textoPropioPolitica;
	}

	public String getSubdomain() {
		return subdomain;
	}

	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}
	 
	 
}
