package co.cuidamos.migracion.ds.api.model.pdn;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "sst_at_el_gestion")
public class SstAtelGestionPdn implements Serializable {
	
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_sst_at_el_gestion")
    private Integer idSstAtElGestion;
    @Column(name = "evento_tipo")
    private Integer eventoTipo;
    @Column(name = "evento_fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eventoFecha;
    @Column(name = "indisponib_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date indisponibInicio;
    @Column(name = "indisponib_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date indisponibFin;
    @Column(name = "evento_lugar")
    private String eventoLugar;
    @Column(name = "evento_descripcion")
    private String eventoDescripcion;
    @Column(name = "estado_investigacion")
    private Integer estadoInvestigacion;
    @Column(name = "copasst_vigia")
    private Integer copasstVigia;
    @Column(name = "estado_arl")
    private Integer estadoArl;
    @Column(name = "estado_otro")
    private Integer estadoOtro;
    @Column(name = "medidas_tomadas")
    private String medidasTomadas;
    @Column(name = "difusion_trabajadores")
    private Integer difusionTrabajadores;
    @Column(name = "aux1")
    private String aux1;
    @Column(name = "aux2")
    private String aux2;
    @Column(name = "aux3")
    private String aux3;
    @Column(name = "_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Column(name = "_modified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modified;
    @Column(name = "_id_user_create")
    private Integer idUserCreate;
    @Column(name = "_user")
    private Integer user;
    @Column(name = "_enable")
    private Boolean enable;
    @Column(name = "_checked")
    private Boolean checked;
    @Column(name = "_tags")
    private String tags;
    @Column(name = "_version")
    private Integer version;
    
    @JoinColumn(name = "fid_core_subdomain", referencedColumnName = "id_core_subdomain")
    @ManyToOne
    private CoreSubdomains fidCoreSubdomain;
    
    @JoinColumn(name = "fid_sst_riesgos_tipo_field", referencedColumnName = "id_sst_riesgos_tipo_field")
    @ManyToOne
    private SstRiesgosTipoFields fidSstRiesgosTipoField;

	public Integer getIdSstAtElGestion() {
		return idSstAtElGestion;
	}

	public void setIdSstAtElGestion(Integer idSstAtElGestion) {
		this.idSstAtElGestion = idSstAtElGestion;
	}

	public Integer getEventoTipo() {
		return eventoTipo;
	}

	public void setEventoTipo(Integer eventoTipo) {
		this.eventoTipo = eventoTipo;
	}

	public Date getEventoFecha() {
		return eventoFecha;
	}

	public void setEventoFecha(Date eventoFecha) {
		this.eventoFecha = eventoFecha;
	}

	public Date getIndisponibInicio() {
		return indisponibInicio;
	}

	public void setIndisponibInicio(Date indisponibInicio) {
		this.indisponibInicio = indisponibInicio;
	}

	public Date getIndisponibFin() {
		return indisponibFin;
	}

	public void setIndisponibFin(Date indisponibFin) {
		this.indisponibFin = indisponibFin;
	}

	public String getEventoLugar() {
		return eventoLugar;
	}

	public void setEventoLugar(String eventoLugar) {
		this.eventoLugar = eventoLugar;
	}

	public String getEventoDescripcion() {
		return eventoDescripcion;
	}

	public void setEventoDescripcion(String eventoDescripcion) {
		this.eventoDescripcion = eventoDescripcion;
	}

	public Integer getEstadoInvestigacion() {
		return estadoInvestigacion;
	}

	public void setEstadoInvestigacion(Integer estadoInvestigacion) {
		this.estadoInvestigacion = estadoInvestigacion;
	}

	public Integer getCopasstVigia() {
		return copasstVigia;
	}

	public void setCopasstVigia(Integer copasstVigia) {
		this.copasstVigia = copasstVigia;
	}

	public Integer getEstadoArl() {
		return estadoArl;
	}

	public void setEstadoArl(Integer estadoArl) {
		this.estadoArl = estadoArl;
	}

	public Integer getEstadoOtro() {
		return estadoOtro;
	}

	public void setEstadoOtro(Integer estadoOtro) {
		this.estadoOtro = estadoOtro;
	}

	public String getMedidasTomadas() {
		return medidasTomadas;
	}

	public void setMedidasTomadas(String medidasTomadas) {
		this.medidasTomadas = medidasTomadas;
	}

	public Integer getDifusionTrabajadores() {
		return difusionTrabajadores;
	}

	public void setDifusionTrabajadores(Integer difusionTrabajadores) {
		this.difusionTrabajadores = difusionTrabajadores;
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

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            return simpleDateFormat.parse(simpleDateFormat.format(modified));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public Integer getIdUserCreate() {
		return idUserCreate;
	}

	public void setIdUserCreate(Integer idUserCreate) {
		this.idUserCreate = idUserCreate;
	}

	public Integer getUser() {
		return user;
	}

	public void setUser(Integer user) {
		this.user = user;
	}

	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public Boolean getChecked() {
		return checked;
	}

	public void setChecked(Boolean checked) {
		this.checked = checked;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public CoreSubdomains getFidCoreSubdomain() {
		return fidCoreSubdomain;
	}

	public void setFidCoreSubdomain(CoreSubdomains fidCoreSubdomain) {
		this.fidCoreSubdomain = fidCoreSubdomain;
	}

	public SstRiesgosTipoFields getFidSstRiesgosTipoField() {
		return fidSstRiesgosTipoField;
	}

	public void setFidSstRiesgosTipoField(SstRiesgosTipoFields fidSstRiesgosTipoField) {
		this.fidSstRiesgosTipoField = fidSstRiesgosTipoField;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    

}
