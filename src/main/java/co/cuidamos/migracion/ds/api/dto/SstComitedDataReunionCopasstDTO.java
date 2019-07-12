package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SstComitedDataReunionCopasstDTO implements Serializable {
	
	private Long id;
	
	private String personasOtrosReuCopasst;
	
	private List<IntegranteDTO> listadoUsuarios_ReuCopasst;
	
	private String horaProxReunionCopasst;
	
	private String horaInicioReunionCopasst;
	
	private String horaFinReunionCopasst;
	
	private Date fechaReunion_Copasst;
	
	private Date fechaProxReunionCopasst;
	
	private List<ReunionDTO> temasTratados;
	
	private String ObservacionesReuCopasst;
	
	private String subdomain;
	
	private String tipComite;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPersonasOtrosReuCopasst() {
		return personasOtrosReuCopasst;
	}

	public void setPersonasOtrosReuCopasst(String personasOtrosReuCopasst) {
		this.personasOtrosReuCopasst = personasOtrosReuCopasst;
	}

	public List<IntegranteDTO> getListadoUsuarios_ReuCopasst() {
		return listadoUsuarios_ReuCopasst;
	}

	public void setListadoUsuarios_ReuCopasst(List<IntegranteDTO> listadoUsuarios_ReuCopasst) {
		this.listadoUsuarios_ReuCopasst = listadoUsuarios_ReuCopasst;
	}

	public String getHoraProxReunionCopasst() {
		return horaProxReunionCopasst;
	}

	public void setHoraProxReunionCopasst(String horaProxReunionCopasst) {
		this.horaProxReunionCopasst = horaProxReunionCopasst;
	}

	public String getHoraInicioReunionCopasst() {
		return horaInicioReunionCopasst;
	}

	public void setHoraInicioReunionCopasst(String horaInicioReunionCopasst) {
		this.horaInicioReunionCopasst = horaInicioReunionCopasst;
	}

	public String getHoraFinReunionCopasst() {
		return horaFinReunionCopasst;
	}

	public void setHoraFinReunionCopasst(String horaFinReunionCopasst) {
		this.horaFinReunionCopasst = horaFinReunionCopasst;
	}

	public Date getFechaReunion_Copasst() {
		return fechaReunion_Copasst;
	}

	public void setFechaReunion_Copasst(Date fechaReunion_Copasst) {
		this.fechaReunion_Copasst = fechaReunion_Copasst;
	}

	public Date getFechaProxReunionCopasst() {
		return fechaProxReunionCopasst;
	}

	public void setFechaProxReunionCopasst(Date fechaProxReunionCopasst) {
		this.fechaProxReunionCopasst = fechaProxReunionCopasst;
	}


	public String getObservacionesReuCopasst() {
		return ObservacionesReuCopasst;
	}

	public void setObservacionesReuCopasst(String observacionesReuCopasst) {
		ObservacionesReuCopasst = observacionesReuCopasst;
	}

	public String getSubdomain() {
		return subdomain;
	}

	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}

	public String getTipComite() {
		return tipComite;
	}

	public void setTipComite(String tipComite) {
		this.tipComite = tipComite;
	}

	public List<ReunionDTO> getTemasTratados() {
		return temasTratados;
	}

	public void setTemasTratados(List<ReunionDTO> temasTratados) {
		this.temasTratados = temasTratados;
	}
	
	
	

}
