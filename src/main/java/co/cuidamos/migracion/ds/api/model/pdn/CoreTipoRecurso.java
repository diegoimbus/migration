package co.cuidamos.migracion.ds.api.model.pdn;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name = "core_tipo_recurso")
public class CoreTipoRecurso implements Serializable {
	
	    private static final long serialVersionUID = 1L;
	    @Id
	    @Basic(optional = false)
	    @Column(name = "id_tipo_recurso")
	    private Integer idTipoRecurso;
	    @Column(name = "nombre")
	    private String nombre;
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
	    @Column(name = "orden_listado")
	    private Integer ordenListado;
	    @Column(name = "fid_core_lista_modulo")
	    private Integer fidCoreListaModulo;
	    @OneToMany(mappedBy = "fidTipoRecurso")
	    private Collection<CoreRecurso> coreRecursoCollection;
		public Integer getIdTipoRecurso() {
			return idTipoRecurso;
		}
		public void setIdTipoRecurso(Integer idTipoRecurso) {
			this.idTipoRecurso = idTipoRecurso;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
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
		public Integer getOrdenListado() {
			return ordenListado;
		}
		public void setOrdenListado(Integer ordenListado) {
			this.ordenListado = ordenListado;
		}
		public Integer getFidCoreListaModulo() {
			return fidCoreListaModulo;
		}
		public void setFidCoreListaModulo(Integer fidCoreListaModulo) {
			this.fidCoreListaModulo = fidCoreListaModulo;
		}
		public Collection<CoreRecurso> getCoreRecursoCollection() {
			return coreRecursoCollection;
		}
		public void setCoreRecursoCollection(Collection<CoreRecurso> coreRecursoCollection) {
			this.coreRecursoCollection = coreRecursoCollection;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
	    
	    

}
