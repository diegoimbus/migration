package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;

public class SstAtelDTO implements Serializable {
	
	private Long id;
	
	private GenericoDTO registroAccidentesTrabajo;
	
	private GenericoDTO registroEnfermedadesLabor;
	
	private String numeroIncidentesAnio;
	
	private String numeroNuevasAccionesIT;
	
	private GenericoDTO difusionNuevasAccionesITEnfermedades;
	
	private GenericoDTO difusionNuevasAccionesITAccidentes;
	
	private String numeroAccidentesAnio;
	
	private String numeroNuevasAccionesAT;
	
	private GenericoDTO difusionNuevasAccionesAT;
	
	private String numeroEnfermedadesAnio;
	
	private String numeroNuevasAccionesEL;
	
	private GenericoDTO difusionNuevasAccionesEL;
	
	private GenericoDTO registroIncidentesTrabajo;
	
	private String investigIncidentesTrabajo;
	
	private String investigAccidentesTrabajo;
	
	private String investigEnfermedadesTrabajo;
	
	private String numeroEnfermedadesTotalesAnio;
	
	private String subdomain;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public GenericoDTO getRegistroAccidentesTrabajo() {
		return registroAccidentesTrabajo;
	}

	public void setRegistroAccidentesTrabajo(GenericoDTO registroAccidentesTrabajo) {
		this.registroAccidentesTrabajo = registroAccidentesTrabajo;
	}

	public GenericoDTO getRegistroEnfermedadesLabor() {
		return registroEnfermedadesLabor;
	}

	public void setRegistroEnfermedadesLabor(GenericoDTO registroEnfermedadesLabor) {
		this.registroEnfermedadesLabor = registroEnfermedadesLabor;
	}

	public String getNumeroIncidentesAnio() {
		return numeroIncidentesAnio;
	}

	public void setNumeroIncidentesAnio(String numeroIncidentesAnio) {
		this.numeroIncidentesAnio = numeroIncidentesAnio;
	}

	public String getNumeroNuevasAccionesIT() {
		return numeroNuevasAccionesIT;
	}

	public void setNumeroNuevasAccionesIT(String numeroNuevasAccionesIT) {
		this.numeroNuevasAccionesIT = numeroNuevasAccionesIT;
	}

	public GenericoDTO getDifusionNuevasAccionesITEnfermedades() {
		return difusionNuevasAccionesITEnfermedades;
	}

	public void setDifusionNuevasAccionesITEnfermedades(GenericoDTO difusionNuevasAccionesITEnfermedades) {
		this.difusionNuevasAccionesITEnfermedades = difusionNuevasAccionesITEnfermedades;
	}

	public GenericoDTO getDifusionNuevasAccionesITAccidentes() {
		return difusionNuevasAccionesITAccidentes;
	}

	public void setDifusionNuevasAccionesITAccidentes(GenericoDTO difusionNuevasAccionesITAccidentes) {
		this.difusionNuevasAccionesITAccidentes = difusionNuevasAccionesITAccidentes;
	}

	public String getNumeroAccidentesAnio() {
		return numeroAccidentesAnio;
	}

	public void setNumeroAccidentesAnio(String numeroAccidentesAnio) {
		this.numeroAccidentesAnio = numeroAccidentesAnio;
	}

	public String getNumeroNuevasAccionesAT() {
		return numeroNuevasAccionesAT;
	}

	public void setNumeroNuevasAccionesAT(String numeroNuevasAccionesAT) {
		this.numeroNuevasAccionesAT = numeroNuevasAccionesAT;
	}

	public GenericoDTO getDifusionNuevasAccionesAT() {
		return difusionNuevasAccionesAT;
	}

	public void setDifusionNuevasAccionesAT(GenericoDTO difusionNuevasAccionesAT) {
		this.difusionNuevasAccionesAT = difusionNuevasAccionesAT;
	}

	public String getNumeroEnfermedadesAnio() {
		return numeroEnfermedadesAnio;
	}

	public void setNumeroEnfermedadesAnio(String numeroEnfermedadesAnio) {
		this.numeroEnfermedadesAnio = numeroEnfermedadesAnio;
	}

	public String getNumeroNuevasAccionesEL() {
		return numeroNuevasAccionesEL;
	}

	public void setNumeroNuevasAccionesEL(String numeroNuevasAccionesEL) {
		this.numeroNuevasAccionesEL = numeroNuevasAccionesEL;
	}

	public 	GenericoDTO getDifusionNuevasAccionesEL() {
		return difusionNuevasAccionesEL;
	}

	public void setDifusionNuevasAccionesEL(GenericoDTO difusionNuevasAccionesEL) {
		this.difusionNuevasAccionesEL = difusionNuevasAccionesEL;
	}

	public GenericoDTO getRegistroIncidentesTrabajo() {
		return registroIncidentesTrabajo;
	}

	public void setRegistroIncidentesTrabajo(GenericoDTO registroIncidentesTrabajo) {
		this.registroIncidentesTrabajo = registroIncidentesTrabajo;
	}

	public String getInvestigIncidentesTrabajo() {
		return investigIncidentesTrabajo;
	}

	public void setInvestigIncidentesTrabajo(String investigIncidentesTrabajo) {
		this.investigIncidentesTrabajo = investigIncidentesTrabajo;
	}

	public String getInvestigAccidentesTrabajo() {
		return investigAccidentesTrabajo;
	}

	public void setInvestigAccidentesTrabajo(String investigAccidentesTrabajo) {
		this.investigAccidentesTrabajo = investigAccidentesTrabajo;
	}

	public String getInvestigEnfermedadesTrabajo() {
		return investigEnfermedadesTrabajo;
	}

	public void setInvestigEnfermedadesTrabajo(String investigEnfermedadesTrabajo) {
		this.investigEnfermedadesTrabajo = investigEnfermedadesTrabajo;
	}

	public String getNumeroEnfermedadesTotalesAnio() {
		return numeroEnfermedadesTotalesAnio;
	}

	public void setNumeroEnfermedadesTotalesAnio(String numeroEnfermedadesTotalesAnio) {
		this.numeroEnfermedadesTotalesAnio = numeroEnfermedadesTotalesAnio;
	}

	public String getSubdomain() {
		return subdomain;
	}

	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}
	
	

}
