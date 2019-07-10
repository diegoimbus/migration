package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class SstCapacitacionDTO implements Serializable {

	private Long id;
	
	private String nombreCapacitacion;
	
	private List<IntegranteDTO> listaUsuarios;
	
	private Date dateInicioCapacitacion;
	
	private Date dateCumpliCapacitacion;
	
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

	public List<IntegranteDTO> getListaUsuarios() {
		return listaUsuarios;
	}

	public void setListaUsuarios(List<IntegranteDTO> listaUsuarios) {
		this.listaUsuarios = listaUsuarios;
	}

	public Date getDateInicioCapacitacion() {
		return dateInicioCapacitacion;
	}

	public void setDateInicioCapacitacion(Date dateInicioCapacitacion) {
		this.dateInicioCapacitacion = dateInicioCapacitacion;
	}

	public Date getDateCumpliCapacitacion() {
		return dateCumpliCapacitacion;
	}

	public void setDateCumpliCapacitacion(Date dateCumpliCapacitacion) {
		this.dateCumpliCapacitacion = dateCumpliCapacitacion;
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
