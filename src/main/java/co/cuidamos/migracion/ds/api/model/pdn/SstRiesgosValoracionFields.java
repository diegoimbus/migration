package co.cuidamos.migracion.ds.api.model.pdn;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name = "sst_riesgos_valoracion_fields")
public class SstRiesgosValoracionFields implements Serializable {

	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_sst_riesgos_valoracion_field")
    private Integer idSstRiesgosValoracionField;
    @Column(name = "label")
    private String label;
    @Column(name = "parent")
    private String parent;
    @Column(name = "required")
    private Boolean required;
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
    @Column(name = "_order")
    private Integer order;
    @Column(name = "default_values")
    private String defaultValues;
    @Column(name = "fid_core_tipo_recurso")
    private Integer fidCoreTipoRecurso;

    @OneToMany(mappedBy = "fidSstRiesgosValoracionField")
    private Collection<SstRiesgosValoracionDataPdn> sstRiesgosValoracionDataCollection;
    @Column(name = "upload_number_files")
    private Integer uploadNumberFiles;
	public Integer getIdSstRiesgosValoracionField() {
		return idSstRiesgosValoracionField;
	}
	public void setIdSstRiesgosValoracionField(Integer idSstRiesgosValoracionField) {
		this.idSstRiesgosValoracionField = idSstRiesgosValoracionField;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public Boolean getRequired() {
		return required;
	}
	public void setRequired(Boolean required) {
		this.required = required;
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
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}
	public String getDefaultValues() {
		return defaultValues;
	}
	public void setDefaultValues(String defaultValues) {
		this.defaultValues = defaultValues;
	}
	public Integer getFidCoreTipoRecurso() {
		return fidCoreTipoRecurso;
	}
	public void setFidCoreTipoRecurso(Integer fidCoreTipoRecurso) {
		this.fidCoreTipoRecurso = fidCoreTipoRecurso;
	}
	public Collection<SstRiesgosValoracionDataPdn> getSstRiesgosValoracionDataCollection() {
		return sstRiesgosValoracionDataCollection;
	}
	public void setSstRiesgosValoracionDataCollection(
			Collection<SstRiesgosValoracionDataPdn> sstRiesgosValoracionDataCollection) {
		this.sstRiesgosValoracionDataCollection = sstRiesgosValoracionDataCollection;
	}
	public Integer getUploadNumberFiles() {
		return uploadNumberFiles;
	}
	public void setUploadNumberFiles(Integer uploadNumberFiles) {
		this.uploadNumberFiles = uploadNumberFiles;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
    
    
	
}
