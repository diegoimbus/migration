package co.cuidamos.migracion.ds.api.model.certif;

import java.util.Date;

import javax.persistence.*;



@Entity
@Table(name = "sst_encuestas_form",schema = "esqcore")
public class SstEncuestasFormCertif {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_sst_encuestas_form")
    private Long id;


    @Column(name = "_created")
    private Date created;

    @Column(name = "_modified")
    private Date modified;

    @Column(name = "_id_user_create")
    private Integer id_user_create;
    
    @Column(name = "_user")
    private Integer user;

    @Column(name = "_enable")
    private Boolean enable;

    @Column(name = "_checked")
    private Boolean checked;

    @Column(name = "_tags")
    private Integer tags;
    
    @Column(name = "_version")
    private Integer version;
    
    @Column(name = "_fid_core_subdomain")
    private String subdomain;
    
    @Column(name = "fid_user")
    private Integer fidUser;
    
    @Column(name= "fid_sst_encuestas_tipo")
    private Integer fidSstEncuestasTipo;
    
    @Column(name = "fid_sst_recurso")
    private Integer fidSstRecurso;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Integer getId_user_create() {
		return id_user_create;
	}

	public void setId_user_create(Integer id_user_create) {
		this.id_user_create = id_user_create;
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

	public Integer getTags() {
		return tags;
	}

	public void setTags(Integer tags) {
		this.tags = tags;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getSubdomain() {
		return subdomain;
	}

	public void setSubdomain(String subdomain) {
		this.subdomain = subdomain;
	}

	public Integer getFidUser() {
		return fidUser;
	}

	public void setFidUser(Integer integer) {
		this.fidUser = integer;
	}

	public Integer getFidSstEncuestasTipo() {
		return fidSstEncuestasTipo;
	}

	public void setFidSstEncuestasTipo(Integer integer) {
		this.fidSstEncuestasTipo = integer;
	}

	public Integer getFidSstRecurso() {
		return fidSstRecurso;
	}

	public void setFidSstRecurso(Integer integer) {
		this.fidSstRecurso = integer;
	}
    
    
}
