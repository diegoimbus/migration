package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.List;

public class AmenazasDTO implements Serializable{
	
	private List<RisksDTO> amenazasNaturales;
	
	private List<RisksDTO> amenazasTecnologicas1;
	
	private List<RisksDTO> amenazasSociales;
	
	private List<RisksDTO> amenazasTecnologicas2;

	public List<RisksDTO> getAmenazasNaturales() {
		return amenazasNaturales;
	}

	public void setAmenazasNaturales(List<RisksDTO> amenazasNaturales) {
		this.amenazasNaturales = amenazasNaturales;
	}

	public List<RisksDTO> getAmenazasTecnologicas1() {
		return amenazasTecnologicas1;
	}

	public void setAmenazasTecnologicas1(List<RisksDTO> amenazasTecnologicas1) {
		this.amenazasTecnologicas1 = amenazasTecnologicas1;
	}

	public List<RisksDTO> getAmenazasSociales() {
		return amenazasSociales;
	}

	public void setAmenazasSociales(List<RisksDTO> amenazasSociales) {
		this.amenazasSociales = amenazasSociales;
	}

	public List<RisksDTO> getAmenazasTecnologicas2() {
		return amenazasTecnologicas2;
	}

	public void setAmenazasTecnologicas2(List<RisksDTO> amenazasTecnologicas2) {
		this.amenazasTecnologicas2 = amenazasTecnologicas2;
	}
	
	

}
