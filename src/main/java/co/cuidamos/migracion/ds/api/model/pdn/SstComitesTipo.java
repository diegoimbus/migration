package co.cuidamos.migracion.ds.api.model.pdn;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name = "sst_comites_tipo")
public class SstComitesTipo implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_sst_comites_tipo")
    private Integer idSstComitesTipo;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "aux")
    private String aux;
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
    @OneToMany(mappedBy = "fidSstComitesTipo")
    private Collection<SstComitesFormPdn> sstComitesFormCollection;
    @OneToMany(mappedBy = "fidSstComitesTipo")
    private Collection<SstComitesFields> sstComitesFieldsCollection;
	public Integer getIdSstComitesTipo() {
		return idSstComitesTipo;
	}
	public void setIdSstComitesTipo(Integer idSstComitesTipo) {
		this.idSstComitesTipo = idSstComitesTipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getAux() {
		return aux;
	}
	public void setAux(String aux) {
		this.aux = aux;
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
	public Collection<SstComitesFormPdn> getSstComitesFormCollection() {
		return sstComitesFormCollection;
	}
	public void setSstComitesFormCollection(Collection<SstComitesFormPdn> sstComitesFormCollection) {
		this.sstComitesFormCollection = sstComitesFormCollection;
	}
	public Collection<SstComitesFields> getSstComitesFieldsCollection() {
		return sstComitesFieldsCollection;
	}
	public void setSstComitesFieldsCollection(Collection<SstComitesFields> sstComitesFieldsCollection) {
		this.sstComitesFieldsCollection = sstComitesFieldsCollection;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
	
}
