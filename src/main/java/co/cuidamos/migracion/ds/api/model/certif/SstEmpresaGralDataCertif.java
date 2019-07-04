package co.cuidamos.migracion.ds.api.model.certif;


import co.cuidamos.migracion.ds.api.config.JsonDataUserType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "sst_empresa_gral_data",schema = "esqcore")
@TypeDef(name = "JsonDataUserType", typeClass = JsonDataUserType.class)
public class SstEmpresaGralDataCertif {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "empresagral")
    @Type(type = "JsonDataUserType")
    private String empresaGral;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpresaGral() {
        return empresaGral;
    }

    public void setEmpresaGral(String empresaGral) {
        this.empresaGral = empresaGral;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SstEmpresaGralDataCertif sstempresagraldata = (SstEmpresaGralDataCertif) o;
        if (!id.equals(sstempresagraldata.id)) {
            return false;
        }
        return this.empresaGral.equals(sstempresagraldata.empresaGral);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + empresaGral.hashCode();
        return result;
    }


}
