package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;

public class SstEppDTO implements Serializable{

	private Long id;
	
	private EppDTO epps;
	
	private String user;
	
	private String subdomain;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public EppDTO getEpps() {
		return epps;
	}

	public void setEpps(EppDTO epps) {
		this.epps = epps;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getSubdomain() {
		return subdomain;
	}

	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}
	
}
