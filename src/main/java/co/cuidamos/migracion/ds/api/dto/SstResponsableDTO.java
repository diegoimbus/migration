package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.List;

public class SstResponsableDTO implements Serializable {
	
	private Long id;
	
	private Integer nombreGerenteResponsab;
	
	private Integer nombreResponsableSST;
	
	private Integer nombreCoResponsableSST;
	
	private String uploadCertificado50hresponsable;
	
	private String uploadActasCopasst;
	
	private Integer nombrePdteConvivencia;
	
	private Integer nombreVigiaSeguridad;
	
	private List<IntegranteDTO> integrantesBrigada;
	
	private String subdomain;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNombreGerenteResponsab() {
		return nombreGerenteResponsab;
	}

	public void setNombreGerenteResponsab(Integer nombreGerenteResponsab) {
		this.nombreGerenteResponsab = nombreGerenteResponsab;
	}

	public Integer getNombreResponsableSST() {
		return nombreResponsableSST;
	}

	public void setNombreResponsableSST(Integer nombreResponsableSST) {
		this.nombreResponsableSST = nombreResponsableSST;
	}

	public Integer getNombreCoResponsableSST() {
		return nombreCoResponsableSST;
	}

	public void setNombreCoResponsableSST(Integer nombreCoResponsableSST) {
		this.nombreCoResponsableSST = nombreCoResponsableSST;
	}

	public String getUploadCertificado50hresponsable() {
		return uploadCertificado50hresponsable;
	}

	public void setUploadCertificado50hresponsable(String uploadCertificado50hresponsable) {
		this.uploadCertificado50hresponsable = uploadCertificado50hresponsable;
	}

	public String getUploadActasCopasst() {
		return uploadActasCopasst;
	}

	public void setUploadActasCopasst(String uploadActasCopasst) {
		this.uploadActasCopasst = uploadActasCopasst;
	}

	public Integer getNombrePdteConvivencia() {
		return nombrePdteConvivencia;
	}

	public void setNombrePdteConvivencia(Integer nombrePdteConvivencia) {
		this.nombrePdteConvivencia = nombrePdteConvivencia;
	}

	public Integer getNombreVigiaSeguridad() {
		return nombreVigiaSeguridad;
	}

	public void setNombreVigiaSeguridad(Integer nombreVigiaSeguridad) {
		this.nombreVigiaSeguridad = nombreVigiaSeguridad;
	}

	public List<IntegranteDTO> getIntegrantesBrigada() {
		return integrantesBrigada;
	}

	public void setIntegrantesBrigada(List<IntegranteDTO> integrantesBrigada) {
		this.integrantesBrigada = integrantesBrigada;
	}

	public String getSubdomain() {
		return subdomain;
	}

	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}
	
	

}
