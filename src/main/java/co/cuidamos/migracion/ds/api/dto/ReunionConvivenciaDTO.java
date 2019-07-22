package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class ReunionConvivenciaDTO implements Serializable{

	private String temaTratadoConviv;
	
	private String medidasRecomendConviv;
	
	private List<IntegranteDTO> listadoUsuarios_responsableConviv;
	
	private String fechaEjecucionConviv;
	
	private String observacionConviv;

	public String getTemaTratadoConviv() {
		return temaTratadoConviv;
	}

	public void setTemaTratadoConviv(String temaTratadoConviv) {
		this.temaTratadoConviv = temaTratadoConviv;
	}

	public String getMedidasRecomendConviv() {
		return medidasRecomendConviv;
	}

	public void setMedidasRecomendConviv(String medidasRecomendConviv) {
		this.medidasRecomendConviv = medidasRecomendConviv;
	}

	public List<IntegranteDTO> getListadoUsuarios_responsableConviv() {
		return listadoUsuarios_responsableConviv;
	}

	public void setListadoUsuarios_responsableConviv(List<IntegranteDTO> listadoUsuarios_responsableConviv) {
		this.listadoUsuarios_responsableConviv = listadoUsuarios_responsableConviv;
	}

	public String getFechaEjecucionConviv() {
		return fechaEjecucionConviv;
	}

	public void setFechaEjecucionConviv(String string) {
		this.fechaEjecucionConviv = string;
	}

	public String getObservacionConviv() {
		return observacionConviv;
	}

	public void setObservacionConviv(String observacionConviv) {
		this.observacionConviv = observacionConviv;
	}
	
	
}
