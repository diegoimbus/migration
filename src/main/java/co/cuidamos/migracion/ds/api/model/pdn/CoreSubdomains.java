/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.cuidamos.migracion.ds.api.model.pdn;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author anthon2109
 */
@Entity
@Table(name = "core_subdomains")
public class CoreSubdomains implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id_core_subdomain", unique = true)
    private String idCoreSubdomain;
    @Column(name = "fid_subdomains_type")
    private Integer fidSubdomainsType;
    @Column(name = "gral_nombre_dominio")
    private String gralNombreDominio;
    @Column(name = "gral_nombre_text")
    private String gralNombreText;
    @Column(name = "fid_tipo_consultor")
    private Integer fidTipoConsultor;
    @Column(name = "gral_tipo_cliente")
    private String gralTipoCliente;
    @Column(name = "fid_pais")
    private Integer fidPais;
    @Column(name = "fid_departamento")
    private Integer fidDepartamento;
    @Column(name = "fid_ciudad")
    private Integer fidCiudad;
    @Column(name = "gral_corregimiento")
    private String gralCorregimiento;
    @Column(name = "gral_barrio")
    private String gralBarrio;
    @Column(name = "gral_direccion")
    private String gralDireccion;
    @Column(name = "gral_fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date gralFecha;
    @Column(name = "gral_nit")
    private String gralNit;
    @Column(name = "gral_telefono")
    private String gralTelefono;
    @Column(name = "gral_correo_admin")
    private String gralCorreoAdmin;
    @Column(name = "comentarios")
    private String comentarios;
    @Column(name = "latitud")
    private String latitud;
    @Column(name = "longitud")
    private String longitud;
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
    @Column(name = "view_video")
    private Boolean viewVideo;
    @Column(name = "visita_validacion")
    private Integer visitaValidacion;
    @Column(name = "tipo_plan")
    private String tipoPLan;
    @Column(name = "estado_demo")
    private Boolean estadoDemo;
    @Column(name = "estado_certf_salud")
    private Boolean estadoCertfSalud;
    @Column(name = "estado_epp")
    private Boolean estadoEpp;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getIdCoreSubdomain() {
        return idCoreSubdomain;
    }

    public void setIdCoreSubdomain(String idCoreSubdomain) {
        this.idCoreSubdomain = idCoreSubdomain;
    }

    public Integer getFidSubdomainsType() {
        return fidSubdomainsType;
    }

    public void setFidSubdomainsType(Integer fidSubdomainsType) {
        this.fidSubdomainsType = fidSubdomainsType;
    }

    public String getGralNombreDominio() {
        return gralNombreDominio;
    }

    public void setGralNombreDominio(String gralNombreDominio) {
        this.gralNombreDominio = gralNombreDominio;
    }

    public String getGralNombreText() {
        return gralNombreText;
    }

    public void setGralNombreText(String gralNombreText) {
        this.gralNombreText = gralNombreText;
    }

    public Integer getFidTipoConsultor() {
        return fidTipoConsultor;
    }

    public void setFidTipoConsultor(Integer fidTipoConsultor) {
        this.fidTipoConsultor = fidTipoConsultor;
    }

    public String getGralTipoCliente() {
        return gralTipoCliente;
    }

    public void setGralTipoCliente(String gralTipoCliente) {
        this.gralTipoCliente = gralTipoCliente;
    }

    public Integer getFidPais() {
        return fidPais;
    }

    public void setFidPais(Integer fidPais) {
        this.fidPais = fidPais;
    }

    public Integer getFidDepartamento() {
        return fidDepartamento;
    }

    public void setFidDepartamento(Integer fidDepartamento) {
        this.fidDepartamento = fidDepartamento;
    }

    public Integer getFidCiudad() {
        return fidCiudad;
    }

    public void setFidCiudad(Integer fidCiudad) {
        this.fidCiudad = fidCiudad;
    }

    public String getGralCorregimiento() {
        return gralCorregimiento;
    }

    public void setGralCorregimiento(String gralCorregimiento) {
        this.gralCorregimiento = gralCorregimiento;
    }

    public String getGralBarrio() {
        return gralBarrio;
    }

    public void setGralBarrio(String gralBarrio) {
        this.gralBarrio = gralBarrio;
    }

    public String getGralDireccion() {
        return gralDireccion;
    }

    public void setGralDireccion(String gralDireccion) {
        this.gralDireccion = gralDireccion;
    }

    public Date getGralFecha() {
        return gralFecha;
    }

    public void setGralFecha(Date gralFecha) {
        this.gralFecha = gralFecha;
    }

    public String getGralNit() {
        return gralNit;
    }

    public void setGralNit(String gralNit) {
        this.gralNit = gralNit;
    }

    public String getGralTelefono() {
        return gralTelefono;
    }

    public void setGralTelefono(String gralTelefono) {
        this.gralTelefono = gralTelefono;
    }

    public String getGralCorreoAdmin() {
        return gralCorreoAdmin;
    }

    public void setGralCorreoAdmin(String gralCorreoAdmin) {
        this.gralCorreoAdmin = gralCorreoAdmin;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
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

    public Boolean getViewVideo() {
        return viewVideo;
    }

    public void setViewVideo(Boolean viewVideo) {
        this.viewVideo = viewVideo;
    }

    public Integer getVisitaValidacion() {
        return visitaValidacion;
    }

    public void setVisitaValidacion(Integer visitaValidacion) {
        this.visitaValidacion = visitaValidacion;
    }

    public String getTipoPLan() {
        return tipoPLan;
    }

    public void setTipoPLan(String tipoPLan) {
        this.tipoPLan = tipoPLan;
    }

    public Boolean getEstadoDemo() {
        return estadoDemo;
    }

    public void setEstadoDemo(Boolean estadoDemo) {
        this.estadoDemo = estadoDemo;
    }

    public Boolean getEstadoCertfSalud() {
        return estadoCertfSalud;
    }

    public void setEstadoCertfSalud(Boolean estadoCertfSalud) {
        this.estadoCertfSalud = estadoCertfSalud;
    }

    public Boolean getEstadoEpp() {
        return estadoEpp;
    }

    public void setEstadoEpp(Boolean estadoEpp) {
        this.estadoEpp = estadoEpp;
    }
}
