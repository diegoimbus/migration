package co.cuidamos.migracion.ds.api.controller;

import co.cuidamos.migracion.ds.api.services.MigrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/migration")
public class MigrationTest {

    @Autowired
    private MigrationService migrationService;

    @GetMapping
    public void executeMigration(){
 //       migrationService.migrateSstEmpresaGral();
 //       migrationService.migrateSstEmpresaEspec();
 //       migrationService.migrateSstPolitica();
 //       migrationService.migrateSstObjetivos();
 //       migrationService.migrateSstReponsable();
 //       migrationService.migrateSstRiegosTipo();
 //       migrationService.migrateSstControles();
 //       migrationService.migrateSstEncuestasForm();
 //       migrationService.migrateSstEncuestasTrabajo();
 //       migrationService.migrateSstEncuestasSalud();
 //       migrationService.migrateSstEpp();
 //       migrationService.migrateSstAtel();
 //       migrationService.migrateSstAtelGestion();
 //       migrationService.migrateSstMatrizLegal();
 //       migrationService.migrateSstPlanTrabajo();
 //       migrationService.migrateSstCapacitacion();
 //      migrationService.migrateSstAmenazas(); //discutir con Clemente
        migrationService.migrateSstComitesDataConformacionComiteConvivencia();
 //       //migrationService.migrateSstComitesDataConformacionCopasst();
 //       //migrationService.migrateSstComitesDataDesignacionVigia();
 //       //migrationService.migrateSstComitesDataReunionComiteConvivencia();
 //       //migrationService.migrateSstComitesDataReunionCopasst();
 //       //migrationService.migrateSstComitesDataReunionVigia();
 //       //migrationService.migrateSstComitesForm();
 //       migrationService.migrateSstInstructivos();
 //       migrationService.migrateSstSaludTrabajador();
 //       //migrationService.migrateSstSociodemo();
 //       migrationService.migrateSstRiesgosValoracion();
        
    }
    
    
}
