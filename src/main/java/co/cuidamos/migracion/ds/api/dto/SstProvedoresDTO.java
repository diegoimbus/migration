package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.List;

public class SstProvedoresDTO implements Serializable{
	
	private Long id;
	
	private String subdomain;
	
	private List<String> proveedorFile;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubdomain() {
		return subdomain;
	}

	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}

	public List<String> getProveedorFile() {
		return proveedorFile;
	}

	public void setProveedorFile(List<String> proveedorFile) {
		this.proveedorFile = proveedorFile;
	}
	
	

}
