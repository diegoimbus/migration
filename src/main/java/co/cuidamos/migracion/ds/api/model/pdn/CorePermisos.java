package co.cuidamos.migracion.ds.api.model.pdn;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "core_permisos")
public class CorePermisos implements Serializable {

	    private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    @Column(name = "id_permissions")
	    private Integer idPermissions;
	    @Column(name = "add")
	    private Boolean add;
	    @Column(name = "delete")
	    private Boolean delete;
	    @Column(name = "modify")
	    private Boolean modify;
	    @Column(name = "view")
	    private Boolean view;
	    @Column(name = "resources")
	    private Boolean resources;
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
	    @JoinColumn(name = "fid_groupuser", referencedColumnName = "id_groupuser")
	    @ManyToOne
	    private CoreGrupoUsuario fidGroupuser;
		public Integer getIdPermissions() {
			return idPermissions;
		}
		public void setIdPermissions(Integer idPermissions) {
			this.idPermissions = idPermissions;
		}
		public Boolean getAdd() {
			return add;
		}
		public void setAdd(Boolean add) {
			this.add = add;
		}
		public Boolean getDelete() {
			return delete;
		}
		public void setDelete(Boolean delete) {
			this.delete = delete;
		}
		public Boolean getModify() {
			return modify;
		}
		public void setModify(Boolean modify) {
			this.modify = modify;
		}
		public Boolean getView() {
			return view;
		}
		public void setView(Boolean view) {
			this.view = view;
		}
		public Boolean getResources() {
			return resources;
		}
		public void setResources(Boolean resources) {
			this.resources = resources;
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
		public CoreGrupoUsuario getFidGroupuser() {
			return fidGroupuser;
		}
		public void setFidGroupuser(CoreGrupoUsuario fidGroupuser) {
			this.fidGroupuser = fidGroupuser;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}

	    
	    
	
}
