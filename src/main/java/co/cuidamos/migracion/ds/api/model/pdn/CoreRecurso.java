/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.cuidamos.migracion.ds.api.model.pdn;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author anthon2109
 */
@Entity
@Table(name = "core_recurso")
public class CoreRecurso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_core_recurso")
    private Integer idCoreRecurso;
    @Size(max = 2147483647)
    @Column(name = "nombre_archivo")
    private String nombreArchivo;
    @Column(name = "_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @Size(max = 45)
    @Column(name = "redimension")
    private String redimension;
    @Column(name = "destacado")
    private Boolean destacado;
//    @Size(max = 45)
    @Column(name = "title")
    private String title;
    @Size(max = 245)
    @Column(name = "description")
    private String description;
    @Size(max = 45)
    @Column(name = "legend_1")
    private String legend1;
    @Size(max = 45)
    @Column(name = "legend_2")
    private String legend2;
    @Size(max = 45)
    @Column(name = "legend_3")
    private String legend3;
    @Column(name = "_modified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modified;
    @Column(name = "_enable")
    private Boolean enable;
    @Column(name = "_checked")
    private Boolean checked;
    @Size(max = 2147483647)
    @Column(name = "_tags")
    private String tags;
    @Column(name = "_version")
    private Integer version;
    @Size(max = 2147483647)
    @Column(name = "autor")
    private String autor;
    @Size(max = 200)
    @Column(name = "latitud")
    private String latitud;
    @Size(max = 200)
    @Column(name = "longitud")
    private String longitud;
    @Size(max = 200)
    @Column(name = "size")
    private String size;
    @Size(max = 200)
    @Column(name = "weight")
    private String weight;
    @Size(max = 255)
    @Column(name = "aux1")
    private String aux1;
    @Size(max = 255)
    @Column(name = "aux2")
    private String aux2;
    @Size(max = 255)
    @Column(name = "aux3")
    private String aux3;
    @Column(name = "_user")
    private Integer user;
    @Column(name = "_id_user_create")
    private Integer idUserCreate;
    @Column(name = "fecha_vencimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getIdCoreRecurso() {
        return idCoreRecurso;
    }

    public void setIdCoreRecurso(Integer idCoreRecurso) {
        this.idCoreRecurso = idCoreRecurso;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getRedimension() {
        return redimension;
    }

    public void setRedimension(String redimension) {
        this.redimension = redimension;
    }

    public Boolean getDestacado() {
        return destacado;
    }

    public void setDestacado(Boolean destacado) {
        this.destacado = destacado;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLegend1() {
        return legend1;
    }

    public void setLegend1(String legend1) {
        this.legend1 = legend1;
    }

    public String getLegend2() {
        return legend2;
    }

    public void setLegend2(String legend2) {
        this.legend2 = legend2;
    }

    public String getLegend3() {
        return legend3;
    }

    public void setLegend3(String legend3) {
        this.legend3 = legend3;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getAux1() {
        return aux1;
    }

    public void setAux1(String aux1) {
        this.aux1 = aux1;
    }

    public String getAux2() {
        return aux2;
    }

    public void setAux2(String aux2) {
        this.aux2 = aux2;
    }

    public String getAux3() {
        return aux3;
    }

    public void setAux3(String aux3) {
        this.aux3 = aux3;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getIdUserCreate() {
        return idUserCreate;
    }

    public void setIdUserCreate(Integer idUserCreate) {
        this.idUserCreate = idUserCreate;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
