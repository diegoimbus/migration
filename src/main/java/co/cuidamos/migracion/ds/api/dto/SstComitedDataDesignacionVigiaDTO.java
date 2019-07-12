package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SstComitedDataDesignacionVigiaDTO implements Serializable {

	private Long id;
	
	private Date fechaActaDesignacionVigia;
	
	private List<IntegranteDTO> listadoUsuarios_Vigia;
	
	private String subdomain;
	
	private Integer tipComite;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaActaDesignacionVigia() {
		return fechaActaDesignacionVigia;
	}

	public void setFechaActaDesignacionVigia(Date fechaActaDesignacionVigia) {
		this.fechaActaDesignacionVigia = fechaActaDesignacionVigia;
	}

	public List<IntegranteDTO> getListadoUsuarios_Vigia() {
		return listadoUsuarios_Vigia;
	}

	public void setListadoUsuarios_Vigia(List<IntegranteDTO> listadoUsuarios_Vigia) {
		this.listadoUsuarios_Vigia = listadoUsuarios_Vigia;
	}

	public String getSubdomain() {
		return subdomain;
	}

	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}

	public Integer getTipComite() {
		return tipComite;
	}

	public void setTipComite(Integer tipComite) {
		this.tipComite = tipComite;
	}
	
	
}
