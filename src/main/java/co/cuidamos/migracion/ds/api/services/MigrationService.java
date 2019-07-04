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
    
    void migrateSstEncuestas();
    
    void migrateSstInstructivos();
    
    void migrateSstSaludTrabajador();
    
    void migrateSstEpp();
    
    void migrateSstAtel();
    
    void migrateSstAtelGestion();
}
