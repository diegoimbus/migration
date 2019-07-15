package co.cuidamos.migracion.ds.api.model.certif;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "sst_comites_form", schema = "esqcore")
public class SstComitesFormCertif {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_sst_comites_form")
    private Long idSstComitesForm;
    
    @Column(name = "_created")
    private Date created;
    
    @Column(name = "_modified")
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
    
    @Column(name = "fid_core_subdomain")
    private String fidCoreSubdomain;
    
    @Column(name = "fid_sst_comites_tipo")
    private Integer fidSstComitesTipo;

	public Long getIdSstComitesForm() {
		return idSstComitesForm;
	}

	public void setIdSstComitesForm(Long idSstComitesForm) {
		this.idSstComitesForm = idSstComitesForm;
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

	public String getFidCoreSubdomain() {
		return fidCoreSubdomain;
	}

	public void setFidCoreSubdomain(String fidCoreSubdomain) {
		this.fidCoreSubdomain = fidCoreSubdomain;
	}

	public Integer getFidSstComitesTipo() {
		return fidSstComitesTipo;
	}

	public void setFidSstComitesTipo(Integer fidSstComitesTipo) {
		this.fidSstComitesTipo = fidSstComitesTipo;
	}

    
    
}
