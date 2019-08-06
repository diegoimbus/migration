package co.cuidamos.migracion.ds.api.model.pdn;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "core_grupousuario")
public class CoreGrupoUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_groupuser")
    private Integer idGroupuser;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
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
    @Column(name = "nivel_grupo")
    private Integer nivelGrupo;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fidGroupuser", fetch = FetchType.LAZY)
    private List<CorePermisos> corePermisosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fidGroupuser", fetch = FetchType.LAZY)
    private List<CoreUsuario> coreUsuarioList;
	public Integer getIdGroupuser() {
		return idGroupuser;
	}
	public void setIdGroupuser(Integer idGroupuser) {
		this.idGroupuser = idGroupuser;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public Integer getNivelGrupo() {
		return nivelGrupo;
	}
	public void setNivelGrupo(Integer nivelGrupo) {
		this.nivelGrupo = nivelGrupo;
	}
	public List<CorePermisos> getCorePermisosList() {
		return corePermisosList;
	}
	public void setCorePermisosList(List<CorePermisos> corePermisosList) {
		this.corePermisosList = corePermisosList;
	}
	public List<CoreUsuario> getCoreUsuarioList() {
		return coreUsuarioList;
	}
	public void setCoreUsuarioList(List<CoreUsuario> coreUsuarioList) {
		this.coreUsuarioList = coreUsuarioList;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
    
    
}
