package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;
import java.util.List;

public class SstCapacitacionDTO implements Serializable {

	private Long id;
	
	private String nombreCapacitacion;
	
	private Collection<IntegranteDTO> listaUsuarios;
	
	private String dateInicioCapacitacion;
	
	private String dateCumpliCapacitacion;
	
	private GenericoDTO estadoCapacitacion;
	
	private GenericoDTO eficaciaCapacitacion;
	
	private String subdomain;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreCapacitacion() {
		return nombreCapacitacion;
	}

	public void setNombreCapacitacion(String nombreCapacitacion) {
		this.nombreCapacitacion = nombreCapacitacion;
	}

	public Collection<IntegranteDTO> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(Collection<IntegranteDTO> lista) {
		this.listaUsuarios = lista;
	}

	public String getDateInicioCapacitacion() {
		return dateInicioCapacitacion;
	}

	public void setDateInicioCapacitacion(String dateInicioCapacitacion) {
		this.dateInicioCapacitacion = dateInicioCapacitacion;
	}

	public String getDateCumpliCapacitacion() {
		return dateCumpliCapacitacion;
	}

	public void setDateCumpliCapacitacion(String string) {
		this.dateCumpliCapacitacion = string;
	}

	public GenericoDTO getEstadoCapacitacion() {
		return estadoCapacitacion;
	}

	public void setEstadoCapacitacion(GenericoDTO estadoCapacitacion) {
		this.estadoCapacitacion = estadoCapacitacion;
	}

	public GenericoDTO getEficaciaCapacitacion() {
		return eficaciaCapacitacion;
	}

	public void setEficaciaCapacitacion(GenericoDTO eficaciaCapacitacion) {
		this.eficaciaCapacitacion = eficaciaCapacitacion;
	}

	public String getSubdomain() {
		return subdomain;
	}

	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}
	
	
}
