package co.cuidamos.migracion.ds.api.model.pdn;

import java.io.Serializable;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.persistence.*;

@Entity
@Table(name = "sst_capacitacion_plan_data")
public class SstCapacitacionPlanDataPdn implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_sst_capacitacion_plan_data")
    private Integer idSstCapacitacionPlanData;
    @Column(name = "result")
    private String result;
    @Column(name = "observation")
    private String observation;
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
    @JoinColumn(name = "fid_sst_capacitacion_plan_field", referencedColumnName = "id_sst_capacitacion_plan_field")
    @ManyToOne
    private SstCapacitacionPlanFields fidSstCapacitacionPlanField;
    @JoinColumn(name = "fid_sst_capacitacion_plan_form", referencedColumnName = "id_sst_capacitacion_plan_form")
    @ManyToOne
    private SstCapacitacionPlanForm fidSstCapacitacionPlanForm;
	
    public Integer getIdSstCapacitacionPlanData() {
		return idSstCapacitacionPlanData;
	}
	public void setIdSstCapacitacionPlanData(Integer idSstCapacitacionPlanData) {
		this.idSstCapacitacionPlanData = idSstCapacitacionPlanData;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
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
	public CoreSubdomains getFidCoreSubdomain() {
		return fidCoreSubdomain;
	}
	public void setFidCoreSubdomain(CoreSubdomains fidCoreSubdomain) {
		this.fidCoreSubdomain = fidCoreSubdomain;
	}
	public SstCapacitacionPlanFields getFidSstCapacitacionPlanField() {
		return fidSstCapacitacionPlanField;
	}
	public void setFidSstCapacitacionPlanField(SstCapacitacionPlanFields fidSstCapacitacionPlanField) {
		this.fidSstCapacitacionPlanField = fidSstCapacitacionPlanField;
	}
	public SstCapacitacionPlanForm getFidSstCapacitacionPlanForm() {
		return fidSstCapacitacionPlanForm;
	}
	public void setFidSstCapacitacionPlanForm(SstCapacitacionPlanForm fidSstCapacitacionPlanForm) {
		this.fidSstCapacitacionPlanForm = fidSstCapacitacionPlanForm;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

    
    
}
