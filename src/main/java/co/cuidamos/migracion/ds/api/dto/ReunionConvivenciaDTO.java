package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.Collection;


public class ReunionConvivenciaDTO implements Serializable{

	private String temaTratadoConviv;
	
	private String medidasRecomendConviv;
	
	private Collection<IntegranteDTO> listadoUsuarios_responsableConviv;
	
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

	public Collection<IntegranteDTO> getListadoUsuarios_responsableConviv() {
		return listadoUsuarios_responsableConviv;
	}

	public void setListadoUsuarios_responsableConviv(Collection<IntegranteDTO> lista) {
		this.listadoUsuarios_responsableConviv = lista;
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
