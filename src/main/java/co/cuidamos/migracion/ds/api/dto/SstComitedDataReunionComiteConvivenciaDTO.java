package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SstComitedDataReunionComiteConvivenciaDTO implements Serializable {
	
	private Long id;
	
	private String fechaReunion_Convivencia;
	
	private String fechaProxReunionConvivencia;
	
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

	public String getFechaReunion_Convivencia() {
		return fechaReunion_Convivencia;
	}

	public void setFechaReunion_Convivencia(String fechaReunion_Convivencia) {
		this.fechaReunion_Convivencia = fechaReunion_Convivencia;
	}

	public String getFechaProxReunionConvivencia() {
		return fechaProxReunionConvivencia;
	}

	public void setFechaProxReunionConvivencia(String string) {
		this.fechaProxReunionConvivencia = string;
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
