package co.cuidamos.migracion.ds.api.model.pdn;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "core_modulo_recurso")
public class CoreModuloRecurso implements Serializable{
	

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_core_modulo_recurso")
    private Integer idCoreModuloRecurso;
    @Column(name = "fid_registro")
    private String fidRegistro;
    @Column(name = "_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Column(name = "_modified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modified;
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
    @Column(name = "fid_eco_generadores")
    private String fidEcoGeneradores;
    @Column(name = "_id_user_create")
    private Integer idUserCreate;

    @JoinColumn(name = "fid_recurso", referencedColumnName = "id_core_recurso")
    @ManyToOne
    private CoreRecurso fidRecurso;

	public Integer getIdCoreModuloRecurso() {
		return idCoreModuloRecurso;
	}

	public void setIdCoreModuloRecurso(Integer idCoreModuloRecurso) {
		this.idCoreModuloRecurso = idCoreModuloRecurso;
	}

	public String getFidRegistro() {
		return fidRegistro;
	}

	public void setFidRegistro(String fidRegistro) {
		this.fidRegistro = fidRegistro;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
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

	public String getFidEcoGeneradores() {
		return fidEcoGeneradores;
	}

	public void setFidEcoGeneradores(String fidEcoGeneradores) {
		this.fidEcoGeneradores = fidEcoGeneradores;
	}

	public Integer getIdUserCreate() {
		return idUserCreate;
	}

	public void setIdUserCreate(Integer idUserCreate) {
		this.idUserCreate = idUserCreate;
	}

	public CoreRecurso getFidRecurso() {
		return fidRecurso;
	}

	public void setFidRecurso(CoreRecurso fidRecurso) {
		this.fidRecurso = fidRecurso;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    

}
