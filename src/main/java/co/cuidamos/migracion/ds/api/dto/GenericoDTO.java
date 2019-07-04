package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;

public class GenericoDTO implements Serializable {

	private Integer id;
	
	private String label;

	public Integer getId() {
		return id;
	}

	public void set_id(Integer id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}


	
	
}
