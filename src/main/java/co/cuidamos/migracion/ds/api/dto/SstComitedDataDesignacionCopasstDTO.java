package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SstComitedDataDesignacionCopasstDTO implements Serializable{

	private Long id;
	
	private Date fechaActa_Copasst;
	
	private List<IntegranteDTO> listadoUsuarios_Trabaj;
	
	private String subdomain;
	
	private Integer tipComite;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaActa_Copasst() {
		return fechaActa_Copasst;
	}

	public void setFechaActa_Copasst(Date fechaActa_Copasst) {
		this.fechaActa_Copasst = fechaActa_Copasst;
	}

	public List<IntegranteDTO> getListadoUsuarios_Trabaj() {
		return listadoUsuarios_Trabaj;
	}

	public void setListadoUsuarios_Trabaj(List<IntegranteDTO> listadoUsuarios_Trabaj) {
		this.listadoUsuarios_Trabaj = listadoUsuarios_Trabaj;
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
