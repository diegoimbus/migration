package co.cuidamos.migracion.ds.api.model.certif;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import co.cuidamos.migracion.ds.api.config.JsonDataUserType;

@Entity
@Table(name = "sst_atel", schema = "esqcore")
@TypeDef(name = "JsonDataUserType", typeClass = JsonDataUserType.class)
public class SstAtelCertif {
	   
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Basic(optional = false)
	    @Column(name = "id")
	    private Long id;
	    
	    @NotNull
	    @Column(name = "sstatel")
	    @Type(type = "JsonDataUserType")
	    private String sstAtel;

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

		public String getSstAtel() {
			return sstAtel;
		}

		public void setSstAtel(String sstAtel) {
			this.sstAtel = sstAtel;
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
