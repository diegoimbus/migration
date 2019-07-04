package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;

public class IntegranteDTO implements Serializable {

	private Integer id;
	
	private String user;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	
}
