package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ReunionDTO implements Serializable {

	private String temaTratado;
	
	private String planAccion;
	
	private List<IntegranteDTO> listadoUsuarios_responsable;
	
	private Date fechaEjecucion;
	
	private String observacion;

	public String getTemaTratado() {
		return temaTratado;
	}

	public void setTemaTratado(String temaTratado) {
		this.temaTratado = temaTratado;
	}

	public String getPlanAccion() {
		return planAccion;
	}

	public void setPlanAccion(String planAccion) {
		this.planAccion = planAccion;
	}


	

	public List<IntegranteDTO> getListadoUsuarios_responsable() {
		return listadoUsuarios_responsable;
	}

	public void setListadoUsuarios_responsable(List<IntegranteDTO> listadoUsuarios_responsable) {
		this.listadoUsuarios_responsable = listadoUsuarios_responsable;
	}

	public Date getFechaEjecucion() {
		return fechaEjecucion;
	}

	public void setFechaEjecucion(Date fechaEjecucion) {
		this.fechaEjecucion = fechaEjecucion;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	
}
