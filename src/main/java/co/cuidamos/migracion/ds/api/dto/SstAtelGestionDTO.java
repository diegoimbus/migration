package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SstAtelGestionDTO implements Serializable{

	private Long id;
	
	private GenericoDTO eventoTip;
	
	private Date eventoFec;
	
	private List<IntegranteDTO> userAfectado;
	
	private Date indisInicio;
	
	private Date indisFin;
	
	private String eventLugar;
	
	private String eventDescripcion;
	
	private String estadoInvestigacion;
	
	private String fid_sst_riesgos_tipo_field;
	
	private CopastVigiaDTO copastVigia;
	
	private String estadoArl;
	
	private String estadoOtro;
	
	private String medidasTomadas;
	
	private Integer difuncionTrabajadores;
	
	private String subdomain;
	
	private String aux1;
	
	private String aux2;
	
	private String aux3;
	
	private String fid_core_subdomain;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public GenericoDTO getEventoTip() {
		return eventoTip;
	}

	public void setEventoTip(GenericoDTO eventoTip) {
		this.eventoTip = eventoTip;
	}

	public Date getEventoFec() {
		return eventoFec;
	}

	public void setEventoFec(Date eventoFec) {
		this.eventoFec = eventoFec;
	}

	public List<IntegranteDTO> getUserAfectado() {
		return userAfectado;
	}

	public void setUserAfectado(List<IntegranteDTO> userAfectado) {
		this.userAfectado = userAfectado;
	}

	public Date getIndisInicio() {
		return indisInicio;
	}

	public void setIndisInicio(Date indisInicio) {
		this.indisInicio = indisInicio;
	}

	public Date getIndisFin() {
		return indisFin;
	}

	public void setIndisFin(Date indisFin) {
		this.indisFin = indisFin;
	}

	public String getEventLugar() {
		return eventLugar;
	}

	public void setEventLugar(String eventLugar) {
		this.eventLugar = eventLugar;
	}

	public String getEventDescripcion() {
		return eventDescripcion;
	}

	public void setEventDescripcion(String eventDescripcion) {
		this.eventDescripcion = eventDescripcion;
	}

	public String getEstadoInvestigacion() {
		return estadoInvestigacion;
	}

	public void setEstadoInvestigacion(String estadoInvestigacion) {
		this.estadoInvestigacion = estadoInvestigacion;
	}

	public String getFid_sst_riesgos_tipo_field() {
		return fid_sst_riesgos_tipo_field;
	}

	public void setFid_sst_riesgos_tipo_field(String fid_sst_riesgos_tipo_field) {
		this.fid_sst_riesgos_tipo_field = fid_sst_riesgos_tipo_field;
	}

	public CopastVigiaDTO getCopastVigia() {
		return copastVigia;
	}

	public void setCopastVigia(CopastVigiaDTO copastVigia) {
		this.copastVigia = copastVigia;
	}

	public String getEstadoArl() {
		return estadoArl;
	}

	public void setEstadoArl(String estadoArl) {
		this.estadoArl = estadoArl;
	}

	public String getEstadoOtro() {
		return estadoOtro;
	}

	public void setEstadoOtro(String estadoOtro) {
		this.estadoOtro = estadoOtro;
	}

	public String getMedidasTomadas() {
		return medidasTomadas;
	}

	public void setMedidasTomadas(String medidasTomadas) {
		this.medidasTomadas = medidasTomadas;
	}

	public Integer getDifuncionTrabajadores() {
		return difuncionTrabajadores;
	}

	public void setDifuncionTrabajadores(Integer difuncionTrabajadores) {
		this.difuncionTrabajadores = difuncionTrabajadores;
	}

	public String getSubdomain() {
		return subdomain;
	}

	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}

	public String getAux1() {
		return aux1;
	}

	public void setAux1(String aux1) {
		this.aux1 = aux1;
	}

	public String getAux2() {
		return aux2;
	}

	public void setAux2(String aux2) {
		this.aux2 = aux2;
	}

	public String getAux3() {
		return aux3;
	}

	public void setAux3(String aux3) {
		this.aux3 = aux3;
	}

	public String getFid_core_subdomain() {
		return fid_core_subdomain;
	}

	public void setFid_core_subdomain(String fid_core_subdomain) {
		this.fid_core_subdomain = fid_core_subdomain;
	}
	
	
	
	
}
