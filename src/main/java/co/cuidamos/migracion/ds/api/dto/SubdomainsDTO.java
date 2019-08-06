package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;

public class SubdomainsDTO implements Serializable{
	
	private boolean _enable;
	
	private String id_core_subdomain;
	
	private String gral_nombre_dominio;

	public boolean is_enable() {
		return _enable;
	}

	public void set_enable(boolean _enable) {
		this._enable = _enable;
	}

	public String getId_core_subdomain() {
		return id_core_subdomain;
	}

	public void setId_core_subdomain(String id_core_subdomain) {
		this.id_core_subdomain = id_core_subdomain;
	}

	public String getGral_nombre_dominio() {
		return gral_nombre_dominio;
	}

	public void setGral_nombre_dominio(String gral_nombre_dominio) {
		this.gral_nombre_dominio = gral_nombre_dominio;
	}
	
	

}
