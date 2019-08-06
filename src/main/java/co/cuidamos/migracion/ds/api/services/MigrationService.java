package co.cuidamos.migracion.ds.api.services;

public interface MigrationService {

    void migrateSstEmpresaGral();
    
    void migrateSstEmpresaEspec();
    
    void migrateSstPolitica();
    
    void migrateSstObjetivos();
    
    void migrateSstReponsable();
    
    void migrateSstRiegosTipo();
    
    void migrateSstRiesgosValoracion();
    
    void migrateSstControles();
    
    void migrateSstEncuestasForm();
    
    void migrateSstEncuestasTrabajo();
    
    void migrateSstEncuestasSalud();
    
    void migrateSstInstructivos();
    
    void migrateSstSaludTrabajador();
    
    void migrateSstEpp();
    
    void migrateSstAtel();
    
    void migrateSstAtelGestion();
    
    void migrateSstMatrizLegal();
    
    void migrateSstPlanTrabajo();
    
    void migrateSstCapacitacion();
    
    void migrateSstAmenazas();
    
    void migrateSstComitesDataReunionVigia();
    
    void migrateSstComitesDataDesignacionVigia();
    
    void migrateSstComitesDataReunionCopasst();
    
    void migrateSstComitesDataConformacionCopasst();
    
    void migrateSstComitesDataConformacionComiteConvivencia();
    
    void migrateSstComitesDataReunionComiteConvivencia();
    
    void migrateSstComitesForm();
    
    void migrateSstSociodemo();
    
    void migrateSstProveedores();
    
    void migrateCoreUsuario();
    
    void migrateCoreRecurso();

}