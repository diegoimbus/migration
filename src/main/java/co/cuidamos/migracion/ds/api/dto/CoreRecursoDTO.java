package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;

public class CoreRecursoDTO implements Serializable {
	
	private Long id;
	
	private Integer fid_tipo_recurso;
	
	private String nombre_archivo;
	
	private String redimension;
	
	private boolean destacado;
	
	private String title;
	
	private String description;
	
	private String legend1;
	
	private String legend2;
	
	private String legend3;
	
	private String latitud;
	
	private String longitud;
	
	private String size;
	
	private String weight;
	
	private String aux1;
	
	private String aux2;
	
	private String aux3;
	
	private Long fecha_vencimiento;
	
	private Long _modified;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getFid_tipo_recurso() {
		return fid_tipo_recurso;
	}

	public void setFid_tipo_recurso(Integer fid_tipo_recurso) {
		this.fid_tipo_recurso = fid_tipo_recurso;
	}

	public String getNombre_archivo() {
		return nombre_archivo;
	}

	public void setNombre_archivo(String nombre_archivo) {
		this.nombre_archivo = nombre_archivo;
	}

	public String getRedimension() {
		return redimension;
	}

	public void setRedimension(String redimension) {
		this.redimension = redimension;
	}

	public boolean isDestacado() {
		return destacado;
	}

	public void setDestacado(boolean destacado) {
		this.destacado = destacado;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLegend1() {
		return legend1;
	}

	public void setLegend1(String legend1) {
		this.legend1 = legend1;
	}

	public String getLegend2() {
		return legend2;
	}

	public void setLegend2(String legend2) {
		this.legend2 = legend2;
	}

	public String getLegend3() {
		return legend3;
	}

	public void setLegend3(String legend3) {
		this.legend3 = legend3;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
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

	public Long getFecha_vencimiento() {
		return fecha_vencimiento;
	}

	public void setFecha_vencimiento(Long fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}

	public Long get_modified() {
		return _modified;
	}

	public void set_modified(Long _modified) {
		this._modified = _modified;
	}
	
	

}
