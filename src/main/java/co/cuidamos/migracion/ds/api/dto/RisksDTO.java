package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;

public class RisksDTO implements Serializable {

	private String parent;
	
	private Integer id;
	
	private String label;
	
	private Integer order;

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}
	
	
}
