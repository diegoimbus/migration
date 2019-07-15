package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SstComitedDataReunionComiteConvivenciaDTO implements Serializable {
	
	private Long id;
	
	private Date fechaReunion_Convivencia;
	
	private Date fechaProxReunionConvivencia;
	
	private String horaProxReunionConvivencia;
	
	private ReunionConvivenciaDTO temasTratados;
	
	private String subdomain;
	
	private Integer tipComite;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaReunion_Convivencia() {
		return fechaReunion_Convivencia;
	}

	public void setFechaReunion_Convivencia(Date fechaReunion_Convivencia) {
		this.fechaReunion_Convivencia = fechaReunion_Convivencia;
	}

	public Date getFechaProxReunionConvivencia() {
		return fechaProxReunionConvivencia;
	}

	public void setFechaProxReunionConvivencia(Date fechaProxReunionConvivencia) {
		this.fechaProxReunionConvivencia = fechaProxReunionConvivencia;
	}

	public String getHoraProxReunionConvivencia() {
		return horaProxReunionConvivencia;
	}

	public void setHoraProxReunionConvivencia(String horaProxReunionConvivencia) {
		this.horaProxReunionConvivencia = horaProxReunionConvivencia;
	}


	public ReunionConvivenciaDTO getTemasTratados() {
		return temasTratados;
	}

	public void setTemasTratados(ReunionConvivenciaDTO temasTratados) {
		this.temasTratados = temasTratados;
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
