package co.cuidamos.migracion.ds.api.model.pdn;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "sst_salud_trabaj_form")
public class SstSaludTrabajForm implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_sst_salud_trabaj_form")
    private Integer idSstSaludTrabajForm;
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
    @JoinColumn(name = "fid_user", referencedColumnName = "id_user")
    @ManyToOne
    private CoreUsuario fidUser;
	public Integer getIdSstSaludTrabajForm() {
		return idSstSaludTrabajForm;
	}
	public void setIdSstSaludTrabajForm(Integer idSstSaludTrabajForm) {
		this.idSstSaludTrabajForm = idSstSaludTrabajForm;
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
	public CoreSubdomains getFidCoreSubdomain() {
		return fidCoreSubdomain;
	}
	public void setFidCoreSubdomain(CoreSubdomains fidCoreSubdomain) {
		this.fidCoreSubdomain = fidCoreSubdomain;
	}
	public CoreUsuario getFidUser() {
		return fidUser;
	}
	public void setFidUser(CoreUsuario fidUser) {
		this.fidUser = fidUser;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
}
