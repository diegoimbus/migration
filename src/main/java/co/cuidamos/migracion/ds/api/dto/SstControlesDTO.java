package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;

public class SstControlesDTO implements Serializable {

	private Long id;
	
	private String subdomain;
	
	private String riesgosBiologicos_virus;
	
	private String riesgosBiologicos_bacteria;
	
	private String riesgosBiologicos_hongo;
	
	private String riesgosBiologicos_rickettsias;
	
	private String riesgosBiologicos_parasitos;
	
	private String riesgosBiologicos_picaduras;
	
	private String riesgosBiologicos_mordeduras;
	
	private String riesgosBiologicos_fluidosExcrementos;
	
	private String riesgosBiologicos_otrosBiologicos;
	
	private String riesgosFisicos_ruido;

	private String riesgosFisicos_iluminacion;
	
	private String riesgosFisicos_vibracion;
	
	private String riesgosFisicos_temperaturas;
	
	private String riesgosFisicos_presion;
	
	private String riesgosFisicos_radiacionesIon;
	
	private String riesgosFisicos_radiacionesNoIon;
	
	private String riesgosFisicos_otrosFisicos;
	
	private String riesgosQuimicos_polvos;

	private String riesgosQuimicos_fibras;
	
	private String riesgosQuimicos_liquidos;
	
	private String riesgosQuimicos_gases;
	
	private String riesgosQuimicos_humos;
	
	private String riesgosQuimicos_materialParticulado;
	
	private String riesgosQuimicos_otrosQuimicos;
	
	private String riesgosPsicosociales_gestionOrgan;
	
	private String riesgosPsicosociales_caractOrganiz;
	
	private String riesgosPsicosociales_caractGrupoSoc;
	
	private String riesgosPsicosociales_condicionesTarea;
	
	private String riesgosPsicosociales_interfasePerson;
	
	private String riesgosPsicosociales_jornadaTrab;
	
	private String riesgosPsicosociales_otrosPsicosoc;
	
	private String riesgosBiomecanicos_postura;
	
	private String riesgosBiomecanicos_esfuerzo;
	
	private String riesgosBiomecanicos_movRepet;
	
	private String riesgosBiomecanicos_manipulManual;
	
	private String riesgosBiomecanicos_otrosBiomecan;
	
	private String riesgosCondSeguridad_mecanico;
	
	private String riesgosCondSeguridad_electrico;
	
	private String riesgosCondSeguridad_locativo;
	
	private String riesgosCondSeguridad_tecnologico;
	
	private String riesgosCondSeguridad_accTransito;
	
	private String riesgosCondSeguridad_publico;
	
	private String riesgosCondSeguridad_trabAlturas;
	
	private String riesgosCondSeguridad_espaciosConfin;
	
	private String riesgosCondSeguridad_otrosCondSeg;
	
	private String riesgosFenomNaturales_sismo;
	
	private String riesgosFenomNaturales_terremoto;
	
	private String riesgosFenomNaturales_vendaval;
	
	private String riesgosFenomNaturales_inundacion;
	
	private String riesgosFenomNaturales_derrumbe;
	
	private String riesgosFenomNaturales_precipitaciones;
	
	private String riesgosFenomNaturales_otrosFenomNat;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubdomain() {
		return subdomain;
	}

	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}

	public String getRiesgosBiologicos_virus() {
		return riesgosBiologicos_virus;
	}

	public void setRiesgosBiologicos_virus(String riesgosBiologicos_virus) {
		this.riesgosBiologicos_virus = riesgosBiologicos_virus;
	}

	public String getRiesgosBiologicos_bacteria() {
		return riesgosBiologicos_bacteria;
	}

	public void setRiesgosBiologicos_bacteria(String riesgosBiologicos_bacteria) {
		this.riesgosBiologicos_bacteria = riesgosBiologicos_bacteria;
	}

	public String getRiesgosBiologicos_hongo() {
		return riesgosBiologicos_hongo;
	}

	public void setRiesgosBiologicos_hongo(String riesgosBiologicos_hongo) {
		this.riesgosBiologicos_hongo = riesgosBiologicos_hongo;
	}

	public String getRiesgosBiologicos_rickettsias() {
		return riesgosBiologicos_rickettsias;
	}

	public void setRiesgosBiologicos_rickettsias(String riesgosBiologicos_rickettsias) {
		this.riesgosBiologicos_rickettsias = riesgosBiologicos_rickettsias;
	}

	public String getRiesgosBiologicos_parasitos() {
		return riesgosBiologicos_parasitos;
	}

	public void setRiesgosBiologicos_parasitos(String riesgosBiologicos_parasitos) {
		this.riesgosBiologicos_parasitos = riesgosBiologicos_parasitos;
	}

	public String getRiesgosBiologicos_picaduras() {
		return riesgosBiologicos_picaduras;
	}

	public void setRiesgosBiologicos_picaduras(String riesgosBiologicos_picaduras) {
		this.riesgosBiologicos_picaduras = riesgosBiologicos_picaduras;
	}

	public String getRiesgosBiologicos_mordeduras() {
		return riesgosBiologicos_mordeduras;
	}

	public void setRiesgosBiologicos_mordeduras(String riesgosBiologicos_mordeduras) {
		this.riesgosBiologicos_mordeduras = riesgosBiologicos_mordeduras;
	}

	public String getRiesgosBiologicos_fluidosExcrementos() {
		return riesgosBiologicos_fluidosExcrementos;
	}

	public void setRiesgosBiologicos_fluidosExcrementos(String riesgosBiologicos_fluidosExcrementos) {
		this.riesgosBiologicos_fluidosExcrementos = riesgosBiologicos_fluidosExcrementos;
	}

	public String getRiesgosBiologicos_otrosBiologicos() {
		return riesgosBiologicos_otrosBiologicos;
	}

	public void setRiesgosBiologicos_otrosBiologicos(String riesgosBiologicos_otrosBiologicos) {
		this.riesgosBiologicos_otrosBiologicos = riesgosBiologicos_otrosBiologicos;
	}

	public String getRiesgosFisicos_ruido() {
		return riesgosFisicos_ruido;
	}

	public void setRiesgosFisicos_ruido(String riesgosFisicos_ruido) {
		this.riesgosFisicos_ruido = riesgosFisicos_ruido;
	}

	public String getRiesgosFisicos_iluminacion() {
		return riesgosFisicos_iluminacion;
	}

	public void setRiesgosFisicos_iluminacion(String riesgosFisicos_iluminacion) {
		this.riesgosFisicos_iluminacion = riesgosFisicos_iluminacion;
	}

	public String getRiesgosFisicos_vibracion() {
		return riesgosFisicos_vibracion;
	}

	public void setRiesgosFisicos_vibracion(String riesgosFisicos_vibracion) {
		this.riesgosFisicos_vibracion = riesgosFisicos_vibracion;
	}

	public String getRiesgosFisicos_temperaturas() {
		return riesgosFisicos_temperaturas;
	}

	public void setRiesgosFisicos_temperaturas(String riesgosFisicos_temperaturas) {
		this.riesgosFisicos_temperaturas = riesgosFisicos_temperaturas;
	}

	public String getRiesgosFisicos_presion() {
		return riesgosFisicos_presion;
	}

	public void setRiesgosFisicos_presion(String riesgosFisicos_presion) {
		this.riesgosFisicos_presion = riesgosFisicos_presion;
	}

	public String getRiesgosFisicos_radiacionesIon() {
		return riesgosFisicos_radiacionesIon;
	}

	public void setRiesgosFisicos_radiacionesIon(String riesgosFisicos_radiacionesIon) {
		this.riesgosFisicos_radiacionesIon = riesgosFisicos_radiacionesIon;
	}

	public String getRiesgosFisicos_radiacionesNoIon() {
		return riesgosFisicos_radiacionesNoIon;
	}

	public void setRiesgosFisicos_radiacionesNoIon(String riesgosFisicos_radiacionesNoIon) {
		this.riesgosFisicos_radiacionesNoIon = riesgosFisicos_radiacionesNoIon;
	}

	public String getRiesgosFisicos_otrosFisicos() {
		return riesgosFisicos_otrosFisicos;
	}

	public void setRiesgosFisicos_otrosFisicos(String riesgosFisicos_otrosFisicos) {
		this.riesgosFisicos_otrosFisicos = riesgosFisicos_otrosFisicos;
	}

	public String getRiesgosQuimicos_polvos() {
		return riesgosQuimicos_polvos;
	}

	public void setRiesgosQuimicos_polvos(String riesgosQuimicos_polvos) {
		this.riesgosQuimicos_polvos = riesgosQuimicos_polvos;
	}

	public String getRiesgosQuimicos_fibras() {
		return riesgosQuimicos_fibras;
	}

	public void setRiesgosQuimicos_fibras(String riesgosQuimicos_fibras) {
		this.riesgosQuimicos_fibras = riesgosQuimicos_fibras;
	}

	public String getRiesgosQuimicos_liquidos() {
		return riesgosQuimicos_liquidos;
	}

	public void setRiesgosQuimicos_liquidos(String riesgosQuimicos_liquidos) {
		this.riesgosQuimicos_liquidos = riesgosQuimicos_liquidos;
	}

	public String getRiesgosQuimicos_gases() {
		return riesgosQuimicos_gases;
	}

	public void setRiesgosQuimicos_gases(String riesgosQuimicos_gases) {
		this.riesgosQuimicos_gases = riesgosQuimicos_gases;
	}

	public String getRiesgosQuimicos_humos() {
		return riesgosQuimicos_humos;
	}

	public void setRiesgosQuimicos_humos(String riesgosQuimicos_humos) {
		this.riesgosQuimicos_humos = riesgosQuimicos_humos;
	}

	public String getRiesgosQuimicos_materialParticulado() {
		return riesgosQuimicos_materialParticulado;
	}

	public void setRiesgosQuimicos_materialParticulado(String riesgosQuimicos_materialParticulado) {
		this.riesgosQuimicos_materialParticulado = riesgosQuimicos_materialParticulado;
	}

	public String getRiesgosQuimicos_otrosQuimicos() {
		return riesgosQuimicos_otrosQuimicos;
	}

	public void setRiesgosQuimicos_otrosQuimicos(String riesgosQuimicos_otrosQuimicos) {
		this.riesgosQuimicos_otrosQuimicos = riesgosQuimicos_otrosQuimicos;
	}

	public String getRiesgosPsicosociales_gestionOrgan() {
		return riesgosPsicosociales_gestionOrgan;
	}

	public void setRiesgosPsicosociales_gestionOrgan(String riesgosPsicosociales_gestionOrgan) {
		this.riesgosPsicosociales_gestionOrgan = riesgosPsicosociales_gestionOrgan;
	}

	public String getRiesgosPsicosociales_caractOrganiz() {
		return riesgosPsicosociales_caractOrganiz;
	}

	public void setRiesgosPsicosociales_caractOrganiz(String riesgosPsicosociales_caractOrganiz) {
		this.riesgosPsicosociales_caractOrganiz = riesgosPsicosociales_caractOrganiz;
	}

	public String getRiesgosPsicosociales_caractGrupoSoc() {
		return riesgosPsicosociales_caractGrupoSoc;
	}

	public void setRiesgosPsicosociales_caractGrupoSoc(String riesgosPsicosociales_caractGrupoSoc) {
		this.riesgosPsicosociales_caractGrupoSoc = riesgosPsicosociales_caractGrupoSoc;
	}

	public String getRiesgosPsicosociales_condicionesTarea() {
		return riesgosPsicosociales_condicionesTarea;
	}

	public void setRiesgosPsicosociales_condicionesTarea(String riesgosPsicosociales_condicionesTarea) {
		this.riesgosPsicosociales_condicionesTarea = riesgosPsicosociales_condicionesTarea;
	}

	public String getRiesgosPsicosociales_interfasePerson() {
		return riesgosPsicosociales_interfasePerson;
	}

	public void setRiesgosPsicosociales_interfasePerson(String riesgosPsicosociales_interfasePerson) {
		this.riesgosPsicosociales_interfasePerson = riesgosPsicosociales_interfasePerson;
	}

	public String getRiesgosPsicosociales_jornadaTrab() {
		return riesgosPsicosociales_jornadaTrab;
	}

	public void setRiesgosPsicosociales_jornadaTrab(String riesgosPsicosociales_jornadaTrab) {
		this.riesgosPsicosociales_jornadaTrab = riesgosPsicosociales_jornadaTrab;
	}

	public String getRiesgosPsicosociales_otrosPsicosoc() {
		return riesgosPsicosociales_otrosPsicosoc;
	}

	public void setRiesgosPsicosociales_otrosPsicosoc(String riesgosPsicosociales_otrosPsicosoc) {
		this.riesgosPsicosociales_otrosPsicosoc = riesgosPsicosociales_otrosPsicosoc;
	}

	public String getRiesgosBiomecanicos_postura() {
		return riesgosBiomecanicos_postura;
	}

	public void setRiesgosBiomecanicos_postura(String riesgosBiomecanicos_postura) {
		this.riesgosBiomecanicos_postura = riesgosBiomecanicos_postura;
	}

	public String getRiesgosBiomecanicos_esfuerzo() {
		return riesgosBiomecanicos_esfuerzo;
	}

	public void setRiesgosBiomecanicos_esfuerzo(String riesgosBiomecanicos_esfuerzo) {
		this.riesgosBiomecanicos_esfuerzo = riesgosBiomecanicos_esfuerzo;
	}

	public String getRiesgosBiomecanicos_movRepet() {
		return riesgosBiomecanicos_movRepet;
	}

	public void setRiesgosBiomecanicos_movRepet(String riesgosBiomecanicos_movRepet) {
		this.riesgosBiomecanicos_movRepet = riesgosBiomecanicos_movRepet;
	}

	public String getRiesgosBiomecanicos_manipulManual() {
		return riesgosBiomecanicos_manipulManual;
	}

	public void setRiesgosBiomecanicos_manipulManual(String riesgosBiomecanicos_manipulManual) {
		this.riesgosBiomecanicos_manipulManual = riesgosBiomecanicos_manipulManual;
	}

	public String getRiesgosBiomecanicos_otrosBiomecan() {
		return riesgosBiomecanicos_otrosBiomecan;
	}

	public void setRiesgosBiomecanicos_otrosBiomecan(String riesgosBiomecanicos_otrosBiomecan) {
		this.riesgosBiomecanicos_otrosBiomecan = riesgosBiomecanicos_otrosBiomecan;
	}

	public String getRiesgosCondSeguridad_mecanico() {
		return riesgosCondSeguridad_mecanico;
	}

	public void setRiesgosCondSeguridad_mecanico(String riesgosCondSeguridad_mecanico) {
		this.riesgosCondSeguridad_mecanico = riesgosCondSeguridad_mecanico;
	}

	public String getRiesgosCondSeguridad_electrico() {
		return riesgosCondSeguridad_electrico;
	}

	public void setRiesgosCondSeguridad_electrico(String riesgosCondSeguridad_electrico) {
		this.riesgosCondSeguridad_electrico = riesgosCondSeguridad_electrico;
	}

	public String getRiesgosCondSeguridad_locativo() {
		return riesgosCondSeguridad_locativo;
	}

	public void setRiesgosCondSeguridad_locativo(String riesgosCondSeguridad_locativo) {
		this.riesgosCondSeguridad_locativo = riesgosCondSeguridad_locativo;
	}

	public String getRiesgosCondSeguridad_tecnologico() {
		return riesgosCondSeguridad_tecnologico;
	}

	public void setRiesgosCondSeguridad_tecnologico(String riesgosCondSeguridad_tecnologico) {
		this.riesgosCondSeguridad_tecnologico = riesgosCondSeguridad_tecnologico;
	}

	public String getRiesgosCondSeguridad_accTransito() {
		return riesgosCondSeguridad_accTransito;
	}

	public void setRiesgosCondSeguridad_accTransito(String riesgosCondSeguridad_accTransito) {
		this.riesgosCondSeguridad_accTransito = riesgosCondSeguridad_accTransito;
	}

	public String getRiesgosCondSeguridad_publico() {
		return riesgosCondSeguridad_publico;
	}

	public void setRiesgosCondSeguridad_publico(String riesgosCondSeguridad_publico) {
		this.riesgosCondSeguridad_publico = riesgosCondSeguridad_publico;
	}

	public String getRiesgosCondSeguridad_trabAlturas() {
		return riesgosCondSeguridad_trabAlturas;
	}

	public void setRiesgosCondSeguridad_trabAlturas(String riesgosCondSeguridad_trabAlturas) {
		this.riesgosCondSeguridad_trabAlturas = riesgosCondSeguridad_trabAlturas;
	}

	public String getRiesgosCondSeguridad_espaciosConfin() {
		return riesgosCondSeguridad_espaciosConfin;
	}

	public void setRiesgosCondSeguridad_espaciosConfin(String riesgosCondSeguridad_espaciosConfin) {
		this.riesgosCondSeguridad_espaciosConfin = riesgosCondSeguridad_espaciosConfin;
	}

	public String getRiesgosCondSeguridad_otrosCondSeg() {
		return riesgosCondSeguridad_otrosCondSeg;
	}

	public void setRiesgosCondSeguridad_otrosCondSeg(String riesgosCondSeguridad_otrosCondSeg) {
		this.riesgosCondSeguridad_otrosCondSeg = riesgosCondSeguridad_otrosCondSeg;
	}

	public String getRiesgosFenomNaturales_sismo() {
		return riesgosFenomNaturales_sismo;
	}

	public void setRiesgosFenomNaturales_sismo(String riesgosFenomNaturales_sismo) {
		this.riesgosFenomNaturales_sismo = riesgosFenomNaturales_sismo;
	}

	public String getRiesgosFenomNaturales_terremoto() {
		return riesgosFenomNaturales_terremoto;
	}

	public void setRiesgosFenomNaturales_terremoto(String riesgosFenomNaturales_terremoto) {
		this.riesgosFenomNaturales_terremoto = riesgosFenomNaturales_terremoto;
	}

	public String getRiesgosFenomNaturales_vendaval() {
		return riesgosFenomNaturales_vendaval;
	}

	public void setRiesgosFenomNaturales_vendaval(String riesgosFenomNaturales_vendaval) {
		this.riesgosFenomNaturales_vendaval = riesgosFenomNaturales_vendaval;
	}

	public String getRiesgosFenomNaturales_inundacion() {
		return riesgosFenomNaturales_inundacion;
	}

	public void setRiesgosFenomNaturales_inundacion(String riesgosFenomNaturales_inundacion) {
		this.riesgosFenomNaturales_inundacion = riesgosFenomNaturales_inundacion;
	}

	public String getRiesgosFenomNaturales_derrumbe() {
		return riesgosFenomNaturales_derrumbe;
	}

	public void setRiesgosFenomNaturales_derrumbe(String riesgosFenomNaturales_derrumbe) {
		this.riesgosFenomNaturales_derrumbe = riesgosFenomNaturales_derrumbe;
	}

	public String getRiesgosFenomNaturales_precipitaciones() {
		return riesgosFenomNaturales_precipitaciones;
	}

	public void setRiesgosFenomNaturales_precipitaciones(String riesgosFenomNaturales_precipitaciones) {
		this.riesgosFenomNaturales_precipitaciones = riesgosFenomNaturales_precipitaciones;
	}

	public String getRiesgosFenomNaturales_otrosFenomNat() {
		return riesgosFenomNaturales_otrosFenomNat;
	}

	public void setRiesgosFenomNaturales_otrosFenomNat(String riesgosFenomNaturales_otrosFenomNat) {
		this.riesgosFenomNaturales_otrosFenomNat = riesgosFenomNaturales_otrosFenomNat;
	}







    













	













	
}
