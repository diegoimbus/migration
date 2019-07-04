package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SstEncuestasDTO implements Serializable{
	
	private Long id;
	
	private String subdomain;
	
	private Integer quantityFields;
	
	private Integer encuestaForm;
	
	private List<RisksDTO> risks;
	
	private String enfermedadTratamiendo;
	
	private String sintomasFisicEmocion;
	
	private String sintomTrabajo;
	
	private String sintomFuera;
	
	private String consultadoSalud;
	
	private String porque;
	
	private Integer ultimAnioIncapacitado;
	

}
