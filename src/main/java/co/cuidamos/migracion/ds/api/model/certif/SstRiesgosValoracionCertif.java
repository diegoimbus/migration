package co.cuidamos.migracion.ds.api.model.certif;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import co.cuidamos.migracion.ds.api.config.JsonDataUserType;


@Entity
@Table(name = "sst_riesgos_valoracion",schema = "esqcore")
@TypeDef(name = "JsonDataUserType", typeClass = JsonDataUserType.class)
public class SstRiesgosValoracionCertif {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "sstriesgosvaloracion")
    @Type(type = "JsonDataUserType")
    private String sstRiesgosValoracion;

    @Column(name = "_created")
    private Date created;

    @Column(name = "_modified")
    private Date modified;

    @Column(name = "_id_user_create")
    private Integer id_user_create;

    @Column(name = "_enable")
    private Boolean enable;

    @Column(name = "_checked")
    private Boolean checked;

    @Column(name = "_tags")
    private Integer tags;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSstRiesgosValoracion() {
		return sstRiesgosValoracion;
	}

	public void setSstRiesgosValoracion(String sstRiesgosValoracion) {
		this.sstRiesgosValoracion = sstRiesgosValoracion;
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

    
}
