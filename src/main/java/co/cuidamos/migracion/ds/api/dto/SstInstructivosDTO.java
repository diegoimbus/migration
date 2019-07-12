package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.List;

public class SstInstructivosDTO implements Serializable {
	
	private Long id;
	
	private List<String> instructivosFile;
	
	private String Subdomain;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<String> getInstructivosFile() {
		return instructivosFile;
	}

	public void setInstructivosFile(List<String> instructivosFile) {
		this.instructivosFile = instructivosFile;
	}

	public String getSubdomain() {
		return Subdomain;
	}

	public void setSubdomain(String subdomain) {
		Subdomain = subdomain;
	}
	
	

}
