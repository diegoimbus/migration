package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.Date;

public class SstPlanTrabajoDTO implements Serializable {
	
	private Long id;
	
	private String metaplan1;
	
	private String actividadPlan1;
	
	private IntegranteDTO responsablePlan1;
	
	private String recFinanPlan1;
	
	private String recTecnPlan1;
	
	private String recPersonPlan1;
	
	private Date fechaRealPlan1;
	
	private GenericoDTO estadoPlanTrabajo;
	
	private String subdomain;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMetaplan1() {
		return metaplan1;
	}

	public void setMetaplan1(String metaplan1) {
		this.metaplan1 = metaplan1;
	}

	public String getActividadPlan1() {
		return actividadPlan1;
	}

	public void setActividadPlan1(String actividadPlan1) {
		this.actividadPlan1 = actividadPlan1;
	}

	public IntegranteDTO getResponsablePlan1() {
		return responsablePlan1;
	}

	public void setResponsablePlan1(IntegranteDTO responsablePlan1) {
		this.responsablePlan1 = responsablePlan1;
	}

	public String getRecFinanPlan1() {
		return recFinanPlan1;
	}

	public void setRecFinanPlan1(String recFinanPlan1) {
		this.recFinanPlan1 = recFinanPlan1;
	}

	public String getRecTecnPlan1() {
		return recTecnPlan1;
	}

	public void setRecTecnPlan1(String recTecnPlan1) {
		this.recTecnPlan1 = recTecnPlan1;
	}

	public String getRecPersonPlan1() {
		return recPersonPlan1;
	}

	public void setRecPersonPlan1(String recPersonPlan1) {
		this.recPersonPlan1 = recPersonPlan1;
	}

	public Date getFechaRealPlan1() {
		return fechaRealPlan1;
	}

	public void setFechaRealPlan1(Date fechaRealPlan1) {
		this.fechaRealPlan1 = fechaRealPlan1;
	}

	public GenericoDTO getEstadoPlanTrabajo() {
		return estadoPlanTrabajo;
	}

	public void setEstadoPlanTrabajo(GenericoDTO estadoPlanTrabajo) {
		this.estadoPlanTrabajo = estadoPlanTrabajo;
	}

	public String getSubdomain() {
		return subdomain;
	}

	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}
	
	

}
