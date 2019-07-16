package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.List;

public class SstSociodemoDTO implements Serializable{
	
	private Long id;
	
	private List<SociodemoDTO> users;
	
	private String subdomain;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<SociodemoDTO> getUsers() {
		return users;
	}

	public void setUsers(List<SociodemoDTO> users) {
		this.users = users;
	}

	public String getSubdomain() {
		return subdomain;
	}

	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}
	
	

}
