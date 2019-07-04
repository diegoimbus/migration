package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.List;

public class SstSaludTrabajadorDTO implements Serializable{
	
	private Long id;
	
	List<String> cerMedIng;
	
	List<String> cerPedCon;

	List<String> cerMedRet;
	
	private String user;
	
	private String Subdomain;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<String> getCerMedIng() {
		return cerMedIng;
	}

	public void setCerMedIng(List<String> cerMedIng) {
		this.cerMedIng = cerMedIng;
	}

	public List<String> getCerPedCon() {
		return cerPedCon;
	}

	public void setCerPedCon(List<String> cerPedCon) {
		this.cerPedCon = cerPedCon;
	}

	public List<String> getCerMedRet() {
		return cerMedRet;
	}

	public void setCerMedRet(List<String> cerMedRet) {
		this.cerMedRet = cerMedRet;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getSubdomain() {
		return Subdomain;
	}

	public void setSubdomain(String subdomain) {
		Subdomain = subdomain;
	}
	
	
	
	
}
