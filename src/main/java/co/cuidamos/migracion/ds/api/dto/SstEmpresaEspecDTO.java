package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SstEmpresaEspecDTO implements Serializable {
	
	private Long id;
	
	private Integer curso50horas;
	
	private Integer porceTrabajAfiliados;
	
	private Integer garantizaResiduosElim;
	
	private Integer arlAfiliadosTrabaj;
	
	private Integer personalContratista;
	
	private Integer flotaDistribucion;
	
	private List<GenericoDTO> mecanismosInformacion;
		
	private Integer clasificacionRiesgo;
	
	private Integer personaEncargadaSST;
	
	private Integer existeSuministroAguaEtc;
	
	private String subdomain;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCurso50horas() {
		return curso50horas;
	}

	public void setCurso50horas(Integer curso50horas) {
		this.curso50horas = curso50horas;
	}

	public Integer getPorceTrabajAfiliados() {
		return porceTrabajAfiliados;
	}

	public void setPorceTrabajAfiliados(Integer porceTrabajAfiliados) {
		this.porceTrabajAfiliados = porceTrabajAfiliados;
	}

	public Integer getGarantizaResiduosElim() {
		return garantizaResiduosElim;
	}

	public void setGarantizaResiduosElim(Integer garantizaResiduosElim) {
		this.garantizaResiduosElim = garantizaResiduosElim;
	}

	public Integer getArlAfiliadosTrabaj() {
		return arlAfiliadosTrabaj;
	}

	public void setArlAfiliadosTrabaj(Integer arlAfiliadosTrabaj) {
		this.arlAfiliadosTrabaj = arlAfiliadosTrabaj;
	}

	public Integer getPersonalContratista() {
		return personalContratista;
	}

	public void setPersonalContratista(Integer personalContratista) {
		this.personalContratista = personalContratista;
	}

	public Integer getFlotaDistribucion() {
		return flotaDistribucion;
	}

	public void setFlotaDistribucion(Integer flotaDistribucion) {
		this.flotaDistribucion = flotaDistribucion;
	}

	public List<GenericoDTO> getMecanismosInformacion() {
		return mecanismosInformacion;
	}

	public void setMecanismosInformacion(List<GenericoDTO> mecanismosInformacion) {
		this.mecanismosInformacion = mecanismosInformacion;
	}

	public Integer getClasificacionRiesgo() {
		return clasificacionRiesgo;
	}

	public void setClasificacionRiesgo(Integer clasificacionRiesgo) {
		this.clasificacionRiesgo = clasificacionRiesgo;
	}

	public Integer getPersonaEncargadaSST() {
		return personaEncargadaSST;
	}

	public void setPersonaEncargadaSST(Integer personaEncargadaSST) {
		this.personaEncargadaSST = personaEncargadaSST;
	}

	public Integer getExisteSuministroAguaEtc() {
		return existeSuministroAguaEtc;
	}

	public void setExisteSuministroAguaEtc(Integer existeSuministroAguaEtc) {
		this.existeSuministroAguaEtc = existeSuministroAguaEtc;
	}

	public String getSubdomain() {
		return subdomain;
	}

	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}

	
}
