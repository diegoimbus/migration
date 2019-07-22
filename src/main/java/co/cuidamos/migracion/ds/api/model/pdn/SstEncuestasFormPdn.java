package co.cuidamos.migracion.ds.api.model.pdn;

import javax.persistence.*;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "sst_encuestas_form")
public class SstEncuestasFormPdn implements Serializable {
	
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Basic(optional = false)
    @Column(name = "id_sst_encuestas_form")
    private Integer idSstEncuestasForm;
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
    @JoinColumn(name = "fid_sst_encuestas_tipo", referencedColumnName = "id_sst_encuestas_tipo")
    @ManyToOne
    private SstEncuestasTipoPdn fidSstEncuestasTipo;
    @JoinColumn(name = "fid_sst_recurso", referencedColumnName = "id_core_modulo_recurso")
    @ManyToOne
    private CoreModuloRecurso fidRecurso;
    
    
	public Integer getIdSstEncuestasForm() {
		return idSstEncuestasForm;
	}
	public void setIdSstEncuestasForm(Integer idSstEncuestasForm) {
		this.idSstEncuestasForm = idSstEncuestasForm;
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
        	if (modified != null)
            return simpleDateFormat.parse(simpleDateFormat.format(modified));
        	else 
        		return new Date();
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
	public CoreUsuario getFidUser() {
		return fidUser;
	}
	public void setFidUser(CoreUsuario fidUser) {
		this.fidUser = fidUser;
	}
	public SstEncuestasTipoPdn getFidSstEncuestasTipo() {
		return fidSstEncuestasTipo;
	}
	public void setFidSstEncuestasTipo(SstEncuestasTipoPdn fidSstEncuestasTipo) {
		this.fidSstEncuestasTipo = fidSstEncuestasTipo;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public CoreModuloRecurso getFidRecurso() {
		return fidRecurso;
	}
	public void setFidRecurso(CoreModuloRecurso fidRecurso) {
		this.fidRecurso = fidRecurso;
	}
    
    

}
