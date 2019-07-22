package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SstComitedDataConformacionComiteConvivenciaDTO implements Serializable {
	
	private Long id;
	
	private String fechaActa_ConvivenciaM;
	
	private List<IntegranteDTO> listadoUsuarios_ConvivTrabaj;
	
	private Integer modalidadRepresentTrabajConviv;
	
	private List<IntegranteDTO> listadoUsuarios_EmpleaConviv;
	
	private String subdomain;
	
	private Integer tipComite;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFechaActa_ConvivenciaM() {
		return fechaActa_ConvivenciaM;
	}

	public void setFechaActa_ConvivenciaM(String string) {
		this.fechaActa_ConvivenciaM = string;
	}

	public List<IntegranteDTO> getListadoUsuarios_ConvivTrabaj() {
		return listadoUsuarios_ConvivTrabaj;
	}

	public void setListadoUsuarios_ConvivTrabaj(List<IntegranteDTO> listadoUsuarios_ConvivTrabaj) {
		this.listadoUsuarios_ConvivTrabaj = listadoUsuarios_ConvivTrabaj;
	}

	public Integer getModalidadRepresentTrabajConviv() {
		return modalidadRepresentTrabajConviv;
	}

	public void setModalidadRepresentTrabajConviv(Integer modalidadRepresentTrabajConviv) {
		this.modalidadRepresentTrabajConviv = modalidadRepresentTrabajConviv;
	}

	public List<IntegranteDTO> getListadoUsuarios_EmpleaConviv() {
		return listadoUsuarios_EmpleaConviv;
	}

	public void setListadoUsuarios_EmpleaConviv(List<IntegranteDTO> listadoUsuarios_EmpleaConviv) {
		this.listadoUsuarios_EmpleaConviv = listadoUsuarios_EmpleaConviv;
	}

	public String getSubdomain() {
		return subdomain;
	}

	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}

	public Integer getTipComite() {
		return tipComite;
	}

	public void setTipComite(Integer tipComite) {
		this.tipComite = tipComite;
	}
	
	

}
