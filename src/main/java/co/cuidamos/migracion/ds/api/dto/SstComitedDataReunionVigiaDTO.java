package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.Date;

public class SstComitedDataReunionVigiaDTO implements Serializable{
	
	private Long id;
	
	private Date fechaReunionVigia;
	
	private String otrosUsuariosReunionVigia;
	
	private String revisionPlanTrabajoReuVigia;
	
	private String revisionProgramaCapacitReuVigia;
	
	private String revisionInspeccionReuVigia;
	
	private Date fechaProxReunionVigia;

	private String subdomain;
	
	private Integer tipComite;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFechaReunionVigia() {
		return fechaReunionVigia;
	}

	public void setFechaReunionVigia(Date fechaReunionVigia) {
		this.fechaReunionVigia = fechaReunionVigia;
	}

	public String getOtrosUsuariosReunionVigia() {
		return otrosUsuariosReunionVigia;
	}

	public void setOtrosUsuariosReunionVigia(String otrosUsuariosReunionVigia) {
		this.otrosUsuariosReunionVigia = otrosUsuariosReunionVigia;
	}

	public String getRevisionPlanTrabajoReuVigia() {
		return revisionPlanTrabajoReuVigia;
	}

	public void setRevisionPlanTrabajoReuVigia(String revisionPlanTrabajoReuVigia) {
		this.revisionPlanTrabajoReuVigia = revisionPlanTrabajoReuVigia;
	}

	public String getRevisionProgramaCapacitReuVigia() {
		return revisionProgramaCapacitReuVigia;
	}

	public void setRevisionProgramaCapacitReuVigia(String revisionProgramaCapacitReuVigia) {
		this.revisionProgramaCapacitReuVigia = revisionProgramaCapacitReuVigia;
	}

	public String getRevisionInspeccionReuVigia() {
		return revisionInspeccionReuVigia;
	}

	public void setRevisionInspeccionReuVigia(String revisionInspeccionReuVigia) {
		this.revisionInspeccionReuVigia = revisionInspeccionReuVigia;
	}

	public Date getFechaProxReunionVigia() {
		return fechaProxReunionVigia;
	}

	public void setFechaProxReunionVigia(Date fechaProxReunionVigia) {
		this.fechaProxReunionVigia = fechaProxReunionVigia;
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
