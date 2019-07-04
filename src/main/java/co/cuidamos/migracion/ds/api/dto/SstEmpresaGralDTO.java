package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;

public class SstEmpresaGralDTO implements Serializable {

    private Long id;

    private String nombreRazonSocial;

    private String cantidadSedes;

    private String sedePrincipal;

    private String anioCreacion;

    private Integer empresaDesarrolla;

    private Integer cantidadTrabajadores;

    private String nombreGerente;

    private String firmaGerente;

    private String logoEmpresa;

    private String subdomain;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreRazonSocial() {
        return nombreRazonSocial;
    }

    public void setNombreRazonSocial(String nombreRazonSocial) {
        this.nombreRazonSocial = nombreRazonSocial;
    }

    public String getCantidadSedes() {
        return cantidadSedes;
    }

    public void setCantidadSedes(String cantidadSedes) {
        this.cantidadSedes = cantidadSedes;
    }

    public String getSedePrincipal() {
        return sedePrincipal;
    }

    public void setSedePrincipal(String sedePrincipal) {
        this.sedePrincipal = sedePrincipal;
    }

    public String getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(String anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public Integer getEmpresaDesarrolla() {
        return empresaDesarrolla;
    }

    public void setEmpresaDesarrolla(Integer empresaDesarrolla) {
        this.empresaDesarrolla = empresaDesarrolla;
    }

    public Integer getCantidadTrabajadores() {
        return cantidadTrabajadores;
    }

    public void setCantidadTrabajadores(Integer cantidadTrabajadores) {
        this.cantidadTrabajadores = cantidadTrabajadores;
    }

    public String getNombreGerente() {
        return nombreGerente;
    }

    public void setNombreGerente(String nombreGerente) {
        this.nombreGerente = nombreGerente;
    }

    public String getFirmaGerente() {
        return firmaGerente;
    }

    public void setFirmaGerente(String firmaGerente) {
        this.firmaGerente = firmaGerente;
    }

    public String getLogoEmpresa() {
        return logoEmpresa;
    }

    public void setLogoEmpresa(String logoEmpresa) {
        this.logoEmpresa = logoEmpresa;
    }

    public String getSubdomain() {
        return subdomain;
    }

    public void setSubdomain(String subdomain) {
        this.subdomain = subdomain;
    }
}
