package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;

public class SociodemoDTO implements Serializable{

	private Long id;
	
	private String user;
	
	private GenericoDTO estadoCivil;
	
	private String nroHijos;
	
	private GenericoDTO sexo;
	
	private String edad;
	
	private GenericoDTO escolaridadCumplida;
	
	private GenericoDTO estrato;
	
	private String antiguedadEmpresa;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public GenericoDTO getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(GenericoDTO estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getNroHijos() {
		return nroHijos;
	}

	public void setNroHijos(String nroHijos) {
		this.nroHijos = nroHijos;
	}

	public GenericoDTO getSexo() {
		return sexo;
	}

	public void setSexo(GenericoDTO sexo) {
		this.sexo = sexo;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public GenericoDTO getEscolaridadCumplida() {
		return escolaridadCumplida;
	}

	public void setEscolaridadCumplida(GenericoDTO escolaridadCumplida) {
		this.escolaridadCumplida = escolaridadCumplida;
	}

	public GenericoDTO getEstrato() {
		return estrato;
	}

	public void setEstrato(GenericoDTO estrato) {
		this.estrato = estrato;
	}

	public String getAntiguedadEmpresa() {
		return antiguedadEmpresa;
	}

	public void setAntiguedadEmpresa(String antiguedadEmpresa) {
		this.antiguedadEmpresa = antiguedadEmpresa;
	}
	
	
}
