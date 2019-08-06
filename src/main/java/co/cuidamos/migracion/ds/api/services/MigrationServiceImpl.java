package co.cuidamos.migracion.ds.api.services;

import co.cuidamos.migracion.ds.api.pdn.repository.CoreSubdomainsDao;
import co.cuidamos.migracion.ds.api.pdn.repository.CoreUsuarioDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstAmenazasDataPdnDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstAmenazasFieldsDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstAtelDataDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstAtelGestionPdnDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstCapacitacionDataPdnDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstCapacitacionFieldsDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstComitesDataPdnDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstComitesFormPdnDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstControlesDataDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstEmpresaEspecDataDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstEmpresaEspecFieldsDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstEmpresaGralDataDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstEncuestasDataPdnDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstEncuestasFieldsDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstEncuestasFormDataDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstEppDataDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstEppFieldsDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstInstructivosDataDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstMatrizLegalDataPdnDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstObjetivosDataDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstPlanTrabajoDataPdnDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstPlanTrabajoFieldsDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstPoliticaDataDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstProveedoresDataPdnDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstResponsabDataDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstRiesgosTipoDataDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstRiesgosTipoFieldsDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstRiesgosValoracionDataDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstRiesgosValoracionFieldsDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstSaludTrabajDataDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstSociodemoDataPdnDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstSociodemoFieldsDao;
import co.cuidamos.migracion.ds.api.dto.*;
import co.cuidamos.migracion.ds.api.util.JsonUtil;
import co.cuidamos.migracion.ds.api.pdn.repository.CoreRecursoDao;
import co.cuidamos.migracion.ds.api.model.pdn.CoreRecurso;
import co.cuidamos.migracion.ds.api.model.pdn.CoreSubdomains;
import co.cuidamos.migracion.ds.api.model.pdn.CoreUsuario;
import co.cuidamos.migracion.ds.api.model.pdn.SstAmenazasDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstAtelDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstAtelGestionPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstCapacitacionPlanDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstComitesDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstComitesFormPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstControlesDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstEmpresaGralDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstEncuestasDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstEncuestasFormPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstEppDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstInstructivosDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstMatrizLegalDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstObjetivosDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstPlanTrabajoDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstEmpresaEspecDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstPoliticaDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstProveedoresDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstResponsabDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstRiesgosTipoDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstRiesgosValoracionDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstSaludTrabajDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstSociodemoDataPdn;
import co.cuidamos.migracion.ds.api.model.certif.CoreRecursoCertif;
import co.cuidamos.migracion.ds.api.model.certif.CoreUsuarioCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstAmenazasCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstAtelCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstAtelGestionCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstCapacitacionCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstComitesCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstComitesFormCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstControlesCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstEmpresaEspecDataCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstEmpresaGralDataCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstEncuestasCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstEncuestasFormCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstEppCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstInstructivosCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstMatrizLegalCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstObjetivosCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstPlanTrabajoCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstPoliticaCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstProveedoresCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstResponsableCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstRiesgosTipoCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstRiesgosValoracionCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstSaludTrabajadorCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstSociodemoCertif;
import co.cuidamos.migracion.ds.api.certif.repository.CoreRecursoCertifDao;
import co.cuidamos.migracion.ds.api.certif.repository.CoreUsuarioCertifDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstAmenazasDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstAtelDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstAtelGestionDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstCapacitacionDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstComitesDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstComitesFormDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstControlesDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstEmpresaEspecDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstEmpresaGralDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstEncuestasDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstEncuestasFormDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstEppDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstInstructivosDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstMatrizLegalDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstObjetivosDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstPlanTrabajoDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstPoliticaDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstProveedoresDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstResponsableDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstRiesgosTipoDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstRiesgosValoracionDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstSaludTrabajadorDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstSociodemoDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MigrationServiceImpl implements MigrationService {

	String subd = "c8c9e081-31a3-4b64-970b-2494463c50a9";
	
	@Autowired
	private CoreUsuarioDao coreUsuarioDao;
	
    @Autowired
    private SstEmpresaGralDataDao sstEmpresaGralDao;

    @Autowired
    private SstEmpresaGralDao sstEmpresaGralDaoCertif;

    @Autowired
    private CoreSubdomainsDao coreSubdomainsDao;

    @Autowired
    private CoreRecursoDao coreRecursoDao;
    
    @Autowired
    private CoreRecursoCertifDao coreRecursoCertifDao;
    
    @Autowired
    private SstEmpresaEspecDataDao sstEmpresaEspecDao;
    
    @Autowired
    private SstEmpresaEspecFieldsDao sstEmpresaEspecFieldsDao;
    
    @Autowired
    private SstEmpresaEspecDao sstEmpresaEspecDaoCertif;
    
    @Autowired
    private SstPoliticaDataDao sstPoliticaDao;
    
    @Autowired
    private SstPoliticaDao sstPoliticaDaoCertif;
    
    @Autowired
    private SstObjetivosDataDao sstObjetivosDao;
    
    @Autowired
    private SstObjetivosDao sstObjetivosDaoCertif;
    
    @Autowired
    private SstResponsabDataDao sstResponsableDao;
    
    @Autowired
    private SstResponsableDao sstResponsableDaoCertif;
    
    @Autowired
    private SstRiesgosTipoDataDao sstRiesgosTipoDao;
    
    @Autowired
    private SstRiesgosTipoDao sstRiesgosTipoDaoCertif;
    
    @Autowired
    private SstRiesgosTipoFieldsDao sstRiesgosFields;
    
    @Autowired
    private SstRiesgosValoracionDataDao sstRiesgosValoracionDao;
    
    @Autowired
    private SstRiesgosValoracionDao sstRiesgosValoracionDaoCertif;
    
    @Autowired
    private SstRiesgosValoracionFieldsDao sstRiesgosValoracionFields;
    
    @Autowired
    private SstControlesDataDao sstControlesDao;
    
    @Autowired
    private SstControlesDao sstControlesDaoCertif;
    
    @Autowired
    private SstEncuestasFormDataDao sstEncuestasFormDao;
    
    @Autowired
    private SstEncuestasFormDao sstEncuestasFormDaoCertif;
    
    @Autowired
    private SstEppDao sstEppDaoCertif;
    
    @Autowired
    private SstEppDataDao sstEppDao;
    
    @Autowired
    private SstEppFieldsDao sstEppFieldsDao;
    
    @Autowired
    private SstAtelDao sstAtelDaoCertif;
    
    @Autowired
    private SstAtelDataDao sstAtelDao;
    
    @Autowired
    private SstAtelGestionDao sstAtelGestionDaoCertif;
    
    @Autowired
    private SstAtelGestionPdnDao sstAtelGestionDao;
    
    @Autowired
    private SstEncuestasDao sstEncuestasDaoCertif;
    
    @Autowired
    private SstEncuestasDataPdnDao sstEncuestasDao;
    
    @Autowired
    private SstEncuestasFieldsDao sstEncuestasFieldsDao;

    @Autowired
    private SstMatrizLegalDataPdnDao sstMatrizLegalDao;
    
    @Autowired
    private SstMatrizLegalDao sstMatrizLegalDaoCertif;
    
    @Autowired
    private SstPlanTrabajoDao sstPlanTrabajoDaoCertif;
    
    @Autowired
    private SstPlanTrabajoDataPdnDao sstPlanTrabajoDao;
    
    @Autowired
    private SstPlanTrabajoFieldsDao sstPlanTrabajoFieldsDao;
    
    @Autowired
    private SstCapacitacionDao sstCapacitacionDaoCertif;
    
    @Autowired
    private SstCapacitacionDataPdnDao sstCapacitacionDao;
    
    @Autowired
    private SstCapacitacionFieldsDao sstCapacitacionFieldsDao;
    
    @Autowired
    private SstAmenazasDao sstAmenazasDaoCertif;
    
    @Autowired
    private SstAmenazasDataPdnDao sstAmenazasDao;
    
    @Autowired
    private SstAmenazasFieldsDao sstAmenazasFieldsDao;
    
    @Autowired
    private SstInstructivosDao sstInstructivosDaoCertif;
    
    @Autowired
    private SstInstructivosDataDao sstInstructivosDao; 
    
    @Autowired
    private SstSaludTrabajDataDao sstSaludTrabajDao;
    
    @Autowired
    private SstSaludTrabajadorDao sstSaludTrabajadorDaoCertif;
    
    @Autowired
    private SstComitesDataPdnDao sstComitesDao;
    
    @Autowired
    private SstComitesDao sstComitesDaoCertif;
    
    @Autowired
    private SstComitesFormPdnDao sstComitesFormDao;
    
    @Autowired
    private SstComitesFormDao sstComitesFormDaoCertif;
    
    @Autowired
    private SstSociodemoDataPdnDao sstSociodemoDataPdnDao;
    
    @Autowired
    private SstSociodemoDao sstSociodemoDaoCertif;
    
    @Autowired
    private SstSociodemoFieldsDao sstSociodemoFieldsDao;
    
    @Autowired
    private SstProveedoresDataPdnDao sstProveedoresDataPdnDao;
    
    @Autowired
    private SstProveedoresDao sstProveedoresDaoCertif;
    
    @Autowired
    private CoreUsuarioCertifDao coreUsuarioDaoCertif;
    
    @Override
    public void migrateSstEmpresaGral() {
        //List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();

        
        //coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstEmpresaGralDataPdn> sstEmpresaGralDataPdnList = sstEmpresaGralDao.getSstEmpresaGralDataBySubdomain(subd);
            sstEmpresaGralDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstEmpresaGralDataPdn::getModified)).forEach((date, sstEmpresaGralDataPdns) -> {
                SstEmpresaGralDTO sstEmpresaGralDTO = new SstEmpresaGralDTO();
                SstEmpresaGralDataCertif sstEmpresaGralDataCertif = new SstEmpresaGralDataCertif();
                sstEmpresaGralDataPdns.parallelStream().forEach(sstEmpresaGralDataPdn -> {

                    if (sstEmpresaGralDataPdn.getFidSstEmpresaGralField().getIdSstEmpresaGralField() == 1) {
                        sstEmpresaGralDTO.setEmpresaDesarrolla(Integer.valueOf(sstEmpresaGralDataPdn.getResult()));
                    }
                    if (sstEmpresaGralDataPdn.getFidSstEmpresaGralField().getIdSstEmpresaGralField() == 2) {
                        sstEmpresaGralDTO.setCantidadTrabajadores(Integer.valueOf(sstEmpresaGralDataPdn.getResult()));
                    }
                    if (sstEmpresaGralDataPdn.getFidSstEmpresaGralField().getIdSstEmpresaGralField() == 3) {
                        sstEmpresaGralDTO.setNombreRazonSocial(sstEmpresaGralDataPdn.getResult());
                    }
                    if (sstEmpresaGralDataPdn.getFidSstEmpresaGralField().getIdSstEmpresaGralField() == 4) {
                        if(sstEmpresaGralDataPdn.getResult() != null){
                            Optional<CoreRecurso> coreRecurso = coreRecursoDao.findById(Integer.valueOf(sstEmpresaGralDataPdn.getResult()));
                            if(coreRecurso.isPresent()){
                                String result = coreRecurso.get().getNombreArchivo();
                                sstEmpresaGralDTO.setLogoEmpresa(result);
                            }

                        }
                    }
                    if (sstEmpresaGralDataPdn.getFidSstEmpresaGralField().getIdSstEmpresaGralField() == 5) {
                        if(sstEmpresaGralDataPdn.getResult() != null){
                            Optional<CoreRecurso> coreRecurso = coreRecursoDao.findById(Integer.valueOf(sstEmpresaGralDataPdn.getResult()));
                            if(coreRecurso.isPresent()){
                                String result = coreRecurso.get().getNombreArchivo();
                                sstEmpresaGralDTO.setFirmaGerente(result);
                            }

                        }

                    }
                    if (sstEmpresaGralDataPdn.getFidSstEmpresaGralField().getIdSstEmpresaGralField() == 15) {
                        sstEmpresaGralDTO.setCantidadSedes(sstEmpresaGralDataPdn.getResult());
                    }
                    if (sstEmpresaGralDataPdn.getFidSstEmpresaGralField().getIdSstEmpresaGralField() == 16) {
                        sstEmpresaGralDTO.setSedePrincipal(sstEmpresaGralDataPdn.getResult());
                    }
                    if (sstEmpresaGralDataPdn.getFidSstEmpresaGralField().getIdSstEmpresaGralField() == 17) {
                        sstEmpresaGralDTO.setAnioCreacion(sstEmpresaGralDataPdn.getResult());
                    }
                    if (sstEmpresaGralDataPdn.getFidSstEmpresaGralField().getIdSstEmpresaGralField() == 18) {
                        sstEmpresaGralDTO.setNombreGerente(sstEmpresaGralDataPdn.getResult());
                    }
                    sstEmpresaGralDTO.setSubdomain(sstEmpresaGralDataPdn.getFidCoreSubdomain().getIdCoreSubdomain());
                    sstEmpresaGralDTO.setId(Long.valueOf(sstEmpresaGralDataPdn.getIdSstEmpresaGralData()));

                    sstEmpresaGralDataCertif.setId(Long.valueOf(sstEmpresaGralDataPdn.getIdSstEmpresaGralData().toString()));

                    sstEmpresaGralDataCertif.setChecked(sstEmpresaGralDataPdn.getChecked());
                    sstEmpresaGralDataCertif.setEnable(sstEmpresaGralDataPdn.getEnable());
                    sstEmpresaGralDataCertif.setModified(sstEmpresaGralDataPdn.getModified());
                    sstEmpresaGralDataCertif.setCreated(sstEmpresaGralDataPdn.getCreated());
                });
                sstEmpresaGralDataCertif.setEmpresaGral(JsonUtil.convertObjectToJson(sstEmpresaGralDTO));
                
                sstEmpresaGralDaoCertif.save(sstEmpresaGralDataCertif);
                System.out.println("------Migrando-----" + sstEmpresaGralDataCertif.getId() + "---------" + sstEmpresaGralDTO.getSubdomain());
            });


       // });
        
        System.out.println("Migracion sstEmpresaGral completada");
      
    }

    
 
	@Override
    public void migrateSstEmpresaEspec() {
    	//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
    	
    	//coreSubdomainsList.forEach(coreSubdomains -> {
    		List<SstEmpresaEspecDataPdn> sstEmpresaEspecDataPdnList = sstEmpresaEspecDao.getSstEmpresaEspecDataBySubdomain(subd);
    		sstEmpresaEspecDataPdnList.
    			parallelStream().collect(Collectors.groupingBy(SstEmpresaEspecDataPdn::getModified)).forEach((date, sstEmpresaEspecDataPdns) -> {
                    SstEmpresaEspecDTO sstEmpresaEspecDTO = new SstEmpresaEspecDTO();
                    SstEmpresaEspecDataCertif sstEmpresaEspecDataCertif = new SstEmpresaEspecDataCertif();
                    sstEmpresaEspecDataPdns.parallelStream().forEach(sstEmpresaEspecDataPdn -> {
                    	
                        if (sstEmpresaEspecDataPdn.getFidSstEmpresaEspecField().getIdSstEmpresaEspecField() == 2) {
                            if(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()) == 48)
                            		sstEmpresaEspecDTO.setPersonaEncargadaSST(1);
                            if(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()) == 49)
                        		sstEmpresaEspecDTO.setPersonaEncargadaSST(2);
                            if(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()) == 50)
                        		sstEmpresaEspecDTO.setPersonaEncargadaSST(3);
                        }
                    	
                        if (sstEmpresaEspecDataPdn.getFidSstEmpresaEspecField().getIdSstEmpresaEspecField() == 3) {
                            if(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()) == 51)
                            	sstEmpresaEspecDTO.setCurso50horas(1);
                            if(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()) == 52)
                            	sstEmpresaEspecDTO.setCurso50horas(2);
                            if(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()) == 53)
                            	sstEmpresaEspecDTO.setCurso50horas(3);
                  
                        }
                        
                        if (sstEmpresaEspecDataPdn.getFidSstEmpresaEspecField().getIdSstEmpresaEspecField() == 6) {
                            if(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()) == 54)
                            	sstEmpresaEspecDTO.setFlotaDistribucion(1);
                            if(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()) == 55)
                            	sstEmpresaEspecDTO.setFlotaDistribucion(2);
                            if(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()) == 56)
                            	sstEmpresaEspecDTO.setFlotaDistribucion(3);
                        }
                        
                        if (sstEmpresaEspecDataPdn.getFidSstEmpresaEspecField().getIdSstEmpresaEspecField() == 7) {
                            if(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()) == 57)
                            	sstEmpresaEspecDTO.setPersonalContratista(1);
                            if(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()) == 58)
                            	sstEmpresaEspecDTO.setPersonalContratista(2);
                            if(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()) == 59)
                            	sstEmpresaEspecDTO.setPersonalContratista(3);
                            
                        }
                        
                        if (sstEmpresaEspecDataPdn.getFidSstEmpresaEspecField().getIdSstEmpresaEspecField() == 12) {
                             
                        	String idLabels[] = sstEmpresaEspecDataPdn.getResult().replace("[","").replace("]","").replace("\"","").split(",");
                            ArrayList<GenericoDTO> mecanismos = new ArrayList<GenericoDTO>();
                            
                            for(String idLabel: idLabels) {
                          	  GenericoDTO genericDTO = new GenericoDTO();
                          	  genericDTO.set_id(Integer.valueOf(idLabel));
                          	  genericDTO.setLabel(sstEmpresaEspecFieldsDao.getSstLabelEmpresaEspecFields(Integer.valueOf(idLabel)));
                          	  mecanismos.add(genericDTO);
                          	 

                            }
                            sstEmpresaEspecDTO.setMecanismosInformacion(mecanismos);
                            
                          }
                        
                        if (sstEmpresaEspecDataPdn.getFidSstEmpresaEspecField().getIdSstEmpresaEspecField() == 17) {
                            sstEmpresaEspecDTO.setArlAfiliadosTrabaj(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()));
                        }
                        
                        if (sstEmpresaEspecDataPdn.getFidSstEmpresaEspecField().getIdSstEmpresaEspecField() == 29) {
                            sstEmpresaEspecDTO.setPorceTrabajAfiliados(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()));
                        }
                        
                        if (sstEmpresaEspecDataPdn.getFidSstEmpresaEspecField().getIdSstEmpresaEspecField() == 41) {
                            sstEmpresaEspecDTO.setClasificacionRiesgo(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()));
                        }
                        


                        if (sstEmpresaEspecDataPdn.getFidSstEmpresaEspecField().getIdSstEmpresaEspecField() == 86) {
                            if(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()) == 87)
                            	sstEmpresaEspecDTO.setExisteSuministroAguaEtc(1);
                            if(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()) == 88)
                            	sstEmpresaEspecDTO.setExisteSuministroAguaEtc(2);
                            if(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()) == 89)
                            	sstEmpresaEspecDTO.setExisteSuministroAguaEtc(3);
                           
                        }
                        
                        if (sstEmpresaEspecDataPdn.getFidSstEmpresaEspecField().getIdSstEmpresaEspecField() == 90) {
                            if(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()) == 87)
                            	sstEmpresaEspecDTO.setGarantizaResiduosElim(1);
                            if(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()) == 88)
                            	sstEmpresaEspecDTO.setGarantizaResiduosElim(2);
                            if(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()) == 89)
                            	sstEmpresaEspecDTO.setGarantizaResiduosElim(3);
                         
                        }                 

                       
                        sstEmpresaEspecDTO.setSubdomain(sstEmpresaEspecDataPdn.getFidCoreSubdomain().getIdCoreSubdomain());
                        sstEmpresaEspecDTO.setId(Long.valueOf(sstEmpresaEspecDataPdn.getIdSstEmpresaEspecData()));
                        
                        sstEmpresaEspecDataCertif.setId(Long.valueOf(sstEmpresaEspecDataPdn.getIdSstEmpresaEspecData().toString()));

                        sstEmpresaEspecDataCertif.setChecked(sstEmpresaEspecDataPdn.getChecked());
                        sstEmpresaEspecDataCertif.setEnable(sstEmpresaEspecDataPdn.getEnable());
                        sstEmpresaEspecDataCertif.setModified(sstEmpresaEspecDataPdn.getModified());
                        sstEmpresaEspecDataCertif.setCreated(sstEmpresaEspecDataPdn.getCreated());
                    });
                    sstEmpresaEspecDataCertif.setEmpresaEspec(JsonUtil.convertObjectToJson(sstEmpresaEspecDTO));
                    
                    sstEmpresaEspecDaoCertif.save(sstEmpresaEspecDataCertif);
                    System.out.println("------Migrando-----" + sstEmpresaEspecDataCertif.getId() + "---------" + sstEmpresaEspecDTO.getSubdomain());
    			});
    
    
    	//});
    	
    	System.out.println("Migracion sstEmpresaEspec completada");
    }
    
	@Override
	public void migrateSstPolitica() {
		//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
        //coreSubdomainsList.forEach(coreSubdomains -> {
		
		List<SstPoliticaDataPdn> sstPoliticaDataPdnList = sstPoliticaDao.getSstPoliticaDataBySubdomain(subd);
            
            sstPoliticaDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstPoliticaDataPdn::getModified)).forEach((date, sstPoliticaDataPdns) -> {
                SstPoliticaDTO sstPoliticaDTO = new SstPoliticaDTO();
                SstPoliticaCertif sstPoliticaCertif = new SstPoliticaCertif();
                
                sstPoliticaDataPdns.parallelStream().forEach(sstPoliticaDataPdn -> {

                    if (sstPoliticaDataPdn.getFidSstPoliticaField().getIdSstPoliticaField() == 1) {
                        if(Integer.valueOf(sstPoliticaDataPdn.getResult()) == 2);
                        	sstPoliticaDTO.setDeAcuerdoPolitica(1);
                        if(Integer.valueOf(sstPoliticaDataPdn.getResult()) == 3);
                        	sstPoliticaDTO.setDeAcuerdoPolitica(2);
                    }
                                        
                    if (sstPoliticaDataPdn.getFidSstPoliticaField().getIdSstPoliticaField() == 5) {
                        sstPoliticaDTO.setTextoPropioPolitica(sstPoliticaDataPdn.getResult());  
                    }
                    

                    sstPoliticaDTO.setSubdomain(sstPoliticaDataPdn.getFidCoreSubdomain().getIdCoreSubdomain());
                    sstPoliticaDTO.setId(Long.valueOf(sstPoliticaDataPdn.getIdSstPoliticaData()));

                    sstPoliticaCertif.setId(Long.valueOf(sstPoliticaDataPdn.getIdSstPoliticaData().toString()));

                    sstPoliticaCertif.setChecked(sstPoliticaDataPdn.getChecked());
                    sstPoliticaCertif.setEnable(sstPoliticaDataPdn.getEnable());
                    sstPoliticaCertif.setModified(sstPoliticaDataPdn.getModified());
                    sstPoliticaCertif.setCreated(sstPoliticaDataPdn.getCreated());
                });
                sstPoliticaCertif.setSstPolitica(JsonUtil.convertObjectToJson(sstPoliticaDTO));
               
                sstPoliticaDaoCertif.save(sstPoliticaCertif);
                System.out.println("------Migrando-----" + sstPoliticaCertif.getId() + "---------" + sstPoliticaDTO.getSubdomain());
            });


       //});
        
		System.out.println("Migracion sstPolitica completada");
	}
	
	@Override
	public void migrateSstObjetivos() {
		//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
        
        //coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstObjetivosDataPdn> sstObjetivosDataPdnList = sstObjetivosDao.getSstObjetivosDataBySubdomain(subd);
            sstObjetivosDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstObjetivosDataPdn::getModified)).forEach((date, sstObjetivosDataPdns) -> {
                SstObjetivosDTO sstObjetivosDTO = new SstObjetivosDTO();
                SstObjetivosCertif sstObjetivosCertif = new SstObjetivosCertif();
                sstObjetivosDataPdns.parallelStream().forEach(sstObjetivosDataPdn -> {

                    if (sstObjetivosDataPdn.getFidSstObjetivosField().getIdSstObjetivosField() == 5) {
                        sstObjetivosDTO.setCrearOtrosObjetivos(sstObjetivosDataPdn.getResult());  
                    }
                                        
                    if (sstObjetivosDataPdn.getFidSstObjetivosField().getIdSstObjetivosField() == 1) {
                        if(Integer.valueOf(sstObjetivosDataPdn.getResult())==2);
                        	sstObjetivosDTO.setDeAcuerdoObjetivos(1);
                            if(Integer.valueOf(sstObjetivosDataPdn.getResult())==3);
                        	sstObjetivosDTO.setDeAcuerdoObjetivos(2);
                    }
                    

                    sstObjetivosDTO.setSubdomain(sstObjetivosDataPdn.getFidCoreSubdomain().getIdCoreSubdomain());
                    sstObjetivosDTO.setId(Long.valueOf(sstObjetivosDataPdn.getIdSstObjetivosData()));

                    sstObjetivosCertif.setId(Long.valueOf(sstObjetivosDataPdn.getIdSstObjetivosData().toString()));

                    sstObjetivosCertif.setChecked(sstObjetivosDataPdn.getChecked());
                    sstObjetivosCertif.setEnable(sstObjetivosDataPdn.getEnable());
                    sstObjetivosCertif.setModified(sstObjetivosDataPdn.getModified());
                    sstObjetivosCertif.setCreated(sstObjetivosDataPdn.getCreated());
                });
                sstObjetivosCertif.setSstObjetivos(JsonUtil.convertObjectToJson(sstObjetivosDTO));
                
                sstObjetivosDaoCertif.save(sstObjetivosCertif);
                
                System.out.println("------Migrando-----" + sstObjetivosCertif.getId() + "---------" + sstObjetivosDTO.getSubdomain());
            });


        //});
        
	System.out.println("Migracion sstObjetivos completada");	
	}
	
	@Override
	public void migrateSstReponsable() {
    	//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
    	
    	List<IntegranteDTO> integrantes = new ArrayList<IntegranteDTO>();
    	
    	//coreSubdomainsList.forEach(coreSubdomains -> {
    		List<SstResponsabDataPdn> sstResponsableDataPdnList = sstResponsableDao.getSstResponsabDataBySubdomain(subd);
    		sstResponsableDataPdnList.
    			parallelStream().collect(Collectors.groupingBy(SstResponsabDataPdn::getModified)).forEach((date, sstResponsabDataPdns) -> {
                    
    				SstResponsableDTO sstResponsableDTO = new SstResponsableDTO();
                    SstResponsableCertif sstResponsableCertif = new SstResponsableCertif();
                    sstResponsabDataPdns.parallelStream().forEach(sstResponsabDataPdn -> {
                    	
                        if (sstResponsabDataPdn.getFidResponsabField().getIdSstResponsabField() == 1) {
                            sstResponsableDTO.setNombreGerenteResponsab(Integer.valueOf(sstResponsabDataPdn.getResult()));
                        }
                    	
                        if (sstResponsabDataPdn.getFidResponsabField().getIdSstResponsabField() == 2) {
                            sstResponsableDTO.setNombreResponsableSST(Integer.valueOf(sstResponsabDataPdn.getResult()));
                        }
                        
                        if (sstResponsabDataPdn.getFidResponsabField().getIdSstResponsabField() == 3) {
                            sstResponsableDTO.setNombreCoResponsableSST(Integer.valueOf(sstResponsabDataPdn.getResult()));
                        }
                        
                        if (sstResponsabDataPdn.getFidResponsabField().getIdSstResponsabField() == 6) {
                            sstResponsableDTO.setNombreVigiaSeguridad(Integer.valueOf(sstResponsabDataPdn.getResult()));
                        }
                        
                        if (sstResponsabDataPdn.getFidResponsabField().getIdSstResponsabField() == 7) {
                            if (sstResponsabDataPdn != null) {
                                Optional<CoreRecurso> coreRecurso = coreRecursoDao.findById(Integer.valueOf(sstResponsabDataPdn.getResult()));
                                if(coreRecurso.isPresent()){
                                    String result = coreRecurso.get().getNombreArchivo();
                                    sstResponsableDTO.setUploadCertificado50hresponsable(result);
                                }
                            	
                            }
                        }
                        
                        if (sstResponsabDataPdn.getFidResponsabField().getIdSstResponsabField() == 8) {
                            if (sstResponsabDataPdn != null) {
                                Optional<CoreRecurso> coreRecurso = coreRecursoDao.findById(Integer.valueOf(sstResponsabDataPdn.getResult()));
                                if(coreRecurso.isPresent()){
                                    String result = coreRecurso.get().getNombreArchivo();
                                    sstResponsableDTO.setUploadActasCopasst(result);
                                }
                            	
                            }
                        }
                        
                        if (sstResponsabDataPdn.getFidResponsabField().getIdSstResponsabField() == 10) {
                            sstResponsableDTO.setNombrePdteConvivencia(Integer.valueOf(sstResponsabDataPdn.getResult()));
                        }


                        
                        if (sstResponsabDataPdn.getFidResponsabField().getIdSstResponsabField() == 11) {

                          	  IntegranteDTO integranteDTO = new IntegranteDTO();
                          	  integranteDTO.setId(Integer.valueOf(sstResponsabDataPdn.getResult()));
                          	  integranteDTO.setUser(coreUsuarioDao.getFirstNameCoreUsuarioByIdUser(Integer.valueOf(sstResponsabDataPdn.getResult()))
                          			  +" "
                          			  +coreUsuarioDao.getLastNameCoreUsuarioByIdUser(Integer.valueOf(sstResponsabDataPdn.getResult())));
                          	  
                          	  integrantes.add(integranteDTO);
                          	 

                            
                          }
                        

                       
                        sstResponsableDTO.setSubdomain(sstResponsabDataPdn.getFidCoreSubdomain().getIdCoreSubdomain());
                        sstResponsableDTO.setId(Long.valueOf(sstResponsabDataPdn.getIdSstResponsabData()));
                        
                        sstResponsableCertif.setId(Long.valueOf(sstResponsabDataPdn.getIdSstResponsabData().toString()));

                        sstResponsableCertif.setChecked(sstResponsabDataPdn.getChecked());
                        sstResponsableCertif.setEnable(sstResponsabDataPdn.getEnable());
                        sstResponsableCertif.setModified(sstResponsabDataPdn.getModified());
                        sstResponsableCertif.setCreated(sstResponsabDataPdn.getCreated());
                    });
                    sstResponsableDTO.setIntegrantesBrigada(integrantes);
                    sstResponsableCertif.setSstResponsable(JsonUtil.convertObjectToJson(sstResponsableDTO));
                    
                    sstResponsableDaoCertif.save(sstResponsableCertif);
                    System.out.println("------Migrando-----" + sstResponsableCertif.getId() + "---------" + sstResponsableDTO.getSubdomain());
    			});
            //});
    
    	System.out.println("Migracion sstResponsable completada");
	}
	
	@Override
	public void migrateSstRiegosTipo() {
		//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
		

       // coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstRiesgosTipoDataPdn> sstRiesgosTipoDataPdnList = sstRiesgosTipoDao.getSstRiesgosTipoDataBySubdomain(subd);
            sstRiesgosTipoDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstRiesgosTipoDataPdn::getModified)).forEach((date, sstRiesgosTipoDataPdns) -> {
                SstRiesgosTipoDTO sstRiesgosTipoDTO = new SstRiesgosTipoDTO();
                SstRiesgosTipoCertif sstRiesgosTipoCertif = new SstRiesgosTipoCertif();
                List<RisksDTO> riesgosBiologicos = Collections.synchronizedList(new ArrayList<RisksDTO>());
                List<RisksDTO> riesgosFisicos = Collections.synchronizedList(new ArrayList<RisksDTO>());
                List<RisksDTO> riesgosQuimicos = Collections.synchronizedList(new ArrayList<RisksDTO>());
                List<RisksDTO> riesgosPsicosociales = Collections.synchronizedList(new ArrayList<RisksDTO>());
                List<RisksDTO> riesgosBiomecanicos = Collections.synchronizedList(new ArrayList<RisksDTO>());
                List<RisksDTO> riesgosCondSeguridad = Collections.synchronizedList(new ArrayList<RisksDTO>());
                List<RisksDTO> riesgosFenomNaturales = Collections.synchronizedList(new ArrayList<RisksDTO>());
                List<List<RisksDTO>> risks2 = Collections.synchronizedList(new ArrayList<List<RisksDTO>>());
                
                sstRiesgosTipoDataPdns.parallelStream().forEach(sstRiesgosTipoDataPdn -> {

                    sstRiesgosTipoDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField();
                    
                    if(sstRiesgosTipoDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 1) {
                    	RisksDTO riegos = new RisksDTO();
                        
                        riegos.setId(Integer.valueOf(sstRiesgosTipoDataPdn.getResult()));
                        riegos.setLabel(sstRiesgosFields.getSstRiesgosTipoDataLabelById(Integer.valueOf(sstRiesgosTipoDataPdn.getResult())));
                        riegos.setOrder(sstRiesgosFields.getSstRiesgosTipoDataOrderById(Integer.valueOf(sstRiesgosTipoDataPdn.getResult())));
                        riegos.setParent(sstRiesgosFields.getSstRiesgosTipoDataLabelById(sstRiesgosFields
                        		.getSstRiesgosTipoDataParentrById(Integer.valueOf(sstRiesgosTipoDataPdn.getResult()))));
                        riesgosBiologicos.add(riegos);
                        
                    }
                    
                    if(sstRiesgosTipoDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 11) {
                    	RisksDTO riegos = new RisksDTO();
                        riegos.setId(Integer.valueOf(sstRiesgosTipoDataPdn.getResult()));
                        riegos.setLabel(sstRiesgosFields.getSstRiesgosTipoDataLabelById(Integer.valueOf(sstRiesgosTipoDataPdn.getResult())));
                        riegos.setOrder(sstRiesgosFields.getSstRiesgosTipoDataOrderById(Integer.valueOf(sstRiesgosTipoDataPdn.getResult())));
                        riegos.setParent(sstRiesgosFields.getSstRiesgosTipoDataLabelById(sstRiesgosFields
                        		.getSstRiesgosTipoDataParentrById(Integer.valueOf(sstRiesgosTipoDataPdn.getResult()))));
                        riesgosFisicos.add(riegos);
                        
                    }
                    
                    if(sstRiesgosTipoDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 20) {
                    	RisksDTO riegos = new RisksDTO();
                        riegos.setId(Integer.valueOf(sstRiesgosTipoDataPdn.getResult()));
                        riegos.setLabel(sstRiesgosFields.getSstRiesgosTipoDataLabelById(Integer.valueOf(sstRiesgosTipoDataPdn.getResult())));
                        riegos.setOrder(sstRiesgosFields.getSstRiesgosTipoDataOrderById(Integer.valueOf(sstRiesgosTipoDataPdn.getResult())));
                        riegos.setParent(sstRiesgosFields.getSstRiesgosTipoDataLabelById(sstRiesgosFields
                        		.getSstRiesgosTipoDataParentrById(Integer.valueOf(sstRiesgosTipoDataPdn.getResult()))));
                        riesgosQuimicos.add(riegos);
                        
                    }
                    
                    if(sstRiesgosTipoDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 28) {
                    	RisksDTO riegos = new RisksDTO();
                        riegos.setId(Integer.valueOf(sstRiesgosTipoDataPdn.getResult()));
                        riegos.setLabel(sstRiesgosFields.getSstRiesgosTipoDataLabelById(Integer.valueOf(sstRiesgosTipoDataPdn.getResult())));
                        riegos.setOrder(sstRiesgosFields.getSstRiesgosTipoDataOrderById(Integer.valueOf(sstRiesgosTipoDataPdn.getResult())));
                        riegos.setParent(sstRiesgosFields.getSstRiesgosTipoDataLabelById(sstRiesgosFields
                        		.getSstRiesgosTipoDataParentrById(Integer.valueOf(sstRiesgosTipoDataPdn.getResult()))));
                        riesgosPsicosociales.add(riegos);
                        
                    }

                    if(sstRiesgosTipoDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 36) {
                    	RisksDTO riegos = new RisksDTO();
                        riegos.setId(Integer.valueOf(sstRiesgosTipoDataPdn.getResult()));
                        riegos.setLabel(sstRiesgosFields.getSstRiesgosTipoDataLabelById(Integer.valueOf(sstRiesgosTipoDataPdn.getResult())));
                        riegos.setOrder(sstRiesgosFields.getSstRiesgosTipoDataOrderById(Integer.valueOf(sstRiesgosTipoDataPdn.getResult())));
                        riegos.setParent(sstRiesgosFields.getSstRiesgosTipoDataLabelById(sstRiesgosFields
                        		.getSstRiesgosTipoDataParentrById(Integer.valueOf(sstRiesgosTipoDataPdn.getResult()))));
                        riesgosBiomecanicos.add(riegos);
                        
                    }
                    
                    if(sstRiesgosTipoDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 42) {
                    	RisksDTO riegos = new RisksDTO();
                        riegos.setId(Integer.valueOf(sstRiesgosTipoDataPdn.getResult()));
                        riegos.setLabel(sstRiesgosFields.getSstRiesgosTipoDataLabelById(Integer.valueOf(sstRiesgosTipoDataPdn.getResult())));
                        riegos.setOrder(sstRiesgosFields.getSstRiesgosTipoDataOrderById(Integer.valueOf(sstRiesgosTipoDataPdn.getResult())));
                        riegos.setParent(sstRiesgosFields.getSstRiesgosTipoDataLabelById(sstRiesgosFields
                        		.getSstRiesgosTipoDataParentrById(Integer.valueOf(sstRiesgosTipoDataPdn.getResult()))));
                        riesgosCondSeguridad.add(riegos);
                        
                    }
                    
                    if(sstRiesgosTipoDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 52) {
                    	RisksDTO riegos = new RisksDTO();
                        riegos.setId(Integer.valueOf(sstRiesgosTipoDataPdn.getResult()));
                        riegos.setLabel(sstRiesgosFields.getSstRiesgosTipoDataLabelById(Integer.valueOf(sstRiesgosTipoDataPdn.getResult())));
                        riegos.setOrder(sstRiesgosFields.getSstRiesgosTipoDataOrderById(Integer.valueOf(sstRiesgosTipoDataPdn.getResult())));
                        riegos.setParent(sstRiesgosFields.getSstRiesgosTipoDataLabelById(sstRiesgosFields
                        		.getSstRiesgosTipoDataParentrById(Integer.valueOf(sstRiesgosTipoDataPdn.getResult()))));
                        riesgosFenomNaturales.add(riegos);
                        
                    }

                    sstRiesgosTipoDTO.setSubdomain(sstRiesgosTipoDataPdn.getFidCoreSubdomain().getIdCoreSubdomain());
                    sstRiesgosTipoDTO.setId(Long.valueOf(sstRiesgosTipoDataPdn.getIdSstRiesgosTipoData()));
                    sstRiesgosTipoDTO.setQuantityFields(7);
                    sstRiesgosTipoCertif.setId(Long.valueOf(sstRiesgosTipoDataPdn.getIdSstRiesgosTipoData().toString()));

                    sstRiesgosTipoCertif.setChecked(sstRiesgosTipoDataPdn.getChecked());
                    sstRiesgosTipoCertif.setEnable(sstRiesgosTipoDataPdn.getEnable());
                    sstRiesgosTipoCertif.setModified(sstRiesgosTipoDataPdn.getModified());
                    sstRiesgosTipoCertif.setCreated(sstRiesgosTipoDataPdn.getCreated());
                });
                
               // sstRiesgosTipoDTO. .setRisks(risks);
                risks2.add(riesgosFenomNaturales);
                risks2.add(riesgosCondSeguridad);
                risks2.add(riesgosBiomecanicos);
                risks2.add(riesgosPsicosociales);
                risks2.add(riesgosQuimicos);
                risks2.add(riesgosFisicos);
                risks2.add(riesgosBiologicos);
                
                
                risks2.set(0, riesgosBiologicos);
                risks2.set(1, riesgosFisicos);
                risks2.set(2, riesgosQuimicos);
                risks2.set(3, riesgosPsicosociales);
                risks2.set(4, riesgosBiomecanicos);
                risks2.set(5, riesgosCondSeguridad);
                risks2.set(6, riesgosFenomNaturales);
                sstRiesgosTipoDTO.setRisks(risks2);
                sstRiesgosTipoCertif.setSstRiesgosTipo(JsonUtil.convertObjectToJson(sstRiesgosTipoDTO));

                sstRiesgosTipoDaoCertif.save(sstRiesgosTipoCertif);
                System.out.println("------Migrando-----" + sstRiesgosTipoCertif.getId() + "---------" + sstRiesgosTipoDTO.getSubdomain());
            });


        //});

        System.out.println("Migracion sstRiesgosTipo completada");
		
	}
	
	
	public void migrateSstRiesgosValoracion() {
		//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
       // coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstRiesgosValoracionDataPdn> sstRiesgosValoracionDataPdnList = sstRiesgosValoracionDao.getSstRiesgosValoracionDataBySubdomain(subd);
            sstRiesgosValoracionDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstRiesgosValoracionDataPdn::getModified)).forEach((date, sstRiesgosValoracionDataPdns) -> {
                SstRiesgosValoracionDTO sstRiesgosValoracionDTO = new SstRiesgosValoracionDTO();
                SstRiesgosValoracionCertif sstRiesgosValoracionCertif = new SstRiesgosValoracionCertif();
                
                sstRiesgosValoracionDataPdns.parallelStream().forEach(sstRiesgosValoracionDataPdn -> {

                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 2) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById(
                        		Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosBiologicos_virus(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 3) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosBiologicos_bacteria(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 4) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosBiologicos_hongo(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 5) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosBiologicos_rickettsias(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 6) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosBiologicos_parasitos(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 7) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosBiologicos_picaduras(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 8) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosBiologicos_mordeduras(generico);  
                    }
                                        
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 9) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosBiologicos_fluidosExcrementos(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 10) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosBiologicos_otrosBiologicos(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 12) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosFisicos_ruido(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 13) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosFisicos_iluminacion(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 14) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosFisicos_vibracion(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 15) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosFisicos_temperaturas(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 16) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosFisicos_presion(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 17) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosFisicos_radiacionesIon(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 18) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosFisicos_radiacionesNoIon(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 19) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosFisicos_otrosFisicos(generico);  
                    }

                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 21) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosQuimicos_polvos(generico);  
                    }

                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 22) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosQuimicos_fibras(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 23) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosQuimicos_liquidos(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 24) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosQuimicos_gases(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 25) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosQuimicos_humos(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 26) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosQuimicos_materialParticulado(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 27) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosQuimicos_otrosQuimicos(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 29) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosPsicosociales_gestionOrgan(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 30) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosPsicosociales_caractOrganiz(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 31) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosPsicosociales_caractGrupoSoc(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 32) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosPsicosociales_condicionesTarea(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 33) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosPsicosociales_interfasePerson(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 34) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosPsicosociales_jornadaTrab(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 35) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosPsicosociales_otrosPsicosoc(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 37) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosBiomecanicos_postura(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 38) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosBiomecanicos_esfuerzo(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 39) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosBiomecanicos_movRepet(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 40) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosBiomecanicos_manipulManual(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 41) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosBiomecanicos_otrosBiomecan(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 43) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosCondSeguridad_mecanico(generico);  
                    }


                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 44) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosCondSeguridad_electrico(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 45) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosCondSeguridad_locativo(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 46) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosCondSeguridad_tecnologico(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 47) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosCondSeguridad_accTransito(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 48) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosCondSeguridad_publico(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 49) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosCondSeguridad_trabAlturas(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 50) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosCondSeguridad_espaciosConfin(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 51) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosCondSeguridad_otrosCondSeg(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 53) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosFenomNaturales_sismo(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 54) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosFenomNaturales_terremoto(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 55) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosFenomNaturales_vendaval(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 56) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosFenomNaturales_inundacion(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 57) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosFenomNaturales_derrumbe(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 58) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosFenomNaturales_precipitaciones(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 1
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 59) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaConsecuenciaRiesgo_riesgosFenomNaturales_otrosFenomNat(generico);  
                    }
                    
                    
                    
                    
                    
                    
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 2) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById(
                        		Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosBiologicos_virus(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 3) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosBiologicos_bacteria(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 4) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosBiologicos_hongo(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 5) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosBiologicos_rickettsias(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 6) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosBiologicos_parasitos(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 7) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosBiologicos_picaduras(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 8) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosBiologicos_mordeduras(generico);  
                    }
                                        
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 9) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosBiologicos_fluidosExcrementos(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 10) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosBiologicos_otrosBiologicos(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 12) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosFisicos_ruido(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 13) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosFisicos_iluminacion(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 14) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosFisicos_vibracion(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 15) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosFisicos_temperaturas(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 16) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosFisicos_presion(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 17) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosFisicos_radiacionesIon(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 18) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosFisicos_radiacionesNoIon(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 19) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosFisicos_otrosFisicos(generico);  
                    }

                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 21) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosQuimicos_polvos(generico);  
                    }

                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 22) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosQuimicos_fibras(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 23) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosQuimicos_liquidos(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 24) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosQuimicos_gases(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 25) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosQuimicos_humos(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 26) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosQuimicos_materialParticulado(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 27) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosQuimicos_otrosQuimicos(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 29) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosPsicosociales_gestionOrgan(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 30) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosPsicosociales_caractOrganiz(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 31) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosPsicosociales_caractGrupoSoc(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 32) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosPsicosociales_condicionesTarea(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 33) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosPsicosociales_interfasePerson(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 34) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosPsicosociales_jornadaTrab(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 35) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosPsicosociales_otrosPsicosoc(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 37) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosBiomecanicos_postura(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 38) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosBiomecanicos_esfuerzo(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 39) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosBiomecanicos_movRepet(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 40) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosBiomecanicos_manipulManual(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 41) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosBiomecanicos_otrosBiomecan(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 43) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosCondSeguridad_mecanico(generico);  
                    }


                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 44) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosCondSeguridad_electrico(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 45) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosCondSeguridad_locativo(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 46) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosCondSeguridad_tecnologico(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 47) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosCondSeguridad_accTransito(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 48) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosCondSeguridad_publico(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 49) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosCondSeguridad_trabAlturas(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 50) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosCondSeguridad_espaciosConfin(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 51) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosCondSeguridad_otrosCondSeg(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 53) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosFenomNaturales_sismo(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 54) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosFenomNaturales_terremoto(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 55) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosFenomNaturales_vendaval(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 56) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosFenomNaturales_inundacion(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 57) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosFenomNaturales_derrumbe(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 58) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosFenomNaturales_precipitaciones(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 6
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 59) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaDeficienciaRiesgo_riesgosFenomNaturales_otrosFenomNat(generico);  
                    }
                    
                    
                    
                    
                    
                    
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 2) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById(
                        		Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosBiologicos_virus(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 3) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosBiologicos_bacteria(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 4) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosBiologicos_hongo(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 5) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosBiologicos_rickettsias(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 6) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosBiologicos_parasitos(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 7) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosBiologicos_picaduras(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 8) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosBiologicos_mordeduras(generico);  
                    }
                                        
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 9) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosBiologicos_fluidosExcrementos(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 10) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosBiologicos_otrosBiologicos(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 12) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosFisicos_ruido(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 13) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosFisicos_iluminacion(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 14) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosFisicos_vibracion(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 15) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosFisicos_temperaturas(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 16) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosFisicos_presion(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 17) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosFisicos_radiacionesIon(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 18) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosFisicos_radiacionesNoIon(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 19) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosFisicos_otrosFisicos(generico);  
                    }

                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 21) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosQuimicos_polvos(generico);  
                    }

                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 22) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosQuimicos_fibras(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 23) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosQuimicos_liquidos(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 24) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosQuimicos_gases(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 25) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosQuimicos_humos(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 26) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosQuimicos_materialParticulado(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 27) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosQuimicos_otrosQuimicos(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 29) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosPsicosociales_gestionOrgan(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 30) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosPsicosociales_caractOrganiz(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 31) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosPsicosociales_caractGrupoSoc(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 32) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosPsicosociales_condicionesTarea(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 33) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosPsicosociales_interfasePerson(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 34) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosPsicosociales_jornadaTrab(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 35) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosPsicosociales_otrosPsicosoc(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 37) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosBiomecanicos_postura(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 38) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosBiomecanicos_esfuerzo(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 39) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosBiomecanicos_movRepet(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 40) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosBiomecanicos_manipulManual(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 41) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosBiomecanicos_otrosBiomecan(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 43) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosCondSeguridad_mecanico(generico);  
                    }


                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 44) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosCondSeguridad_electrico(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 45) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosCondSeguridad_locativo(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 46) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosCondSeguridad_tecnologico(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 47) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosCondSeguridad_accTransito(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 48) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosCondSeguridad_publico(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 49) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosCondSeguridad_trabAlturas(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 50) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosCondSeguridad_espaciosConfin(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 51) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosCondSeguridad_otrosCondSeg(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 53) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosFenomNaturales_sismo(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 54) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosFenomNaturales_terremoto(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 55) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosFenomNaturales_vendaval(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 56) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosFenomNaturales_inundacion(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 57) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosFenomNaturales_derrumbe(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 58) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosFenomNaturales_precipitaciones(generico);  
                    }
                    
                    if (sstRiesgosValoracionDataPdn.getFidSstRiesgosValoracionField().getIdSstRiesgosValoracionField() == 11
                    		&& sstRiesgosValoracionDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 59) {
                        GenericoDTO generico = new GenericoDTO();
                        generico.set_id(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult()));
                        generico.setLabel(sstRiesgosValoracionFields.getSstRiesgosValoracionDataLabelById
                        		(Integer.valueOf(sstRiesgosValoracionDataPdn.getResult())));
                    	sstRiesgosValoracionDTO.setEstimaExpoRiesgo_riesgosFenomNaturales_otrosFenomNat(generico);  
                    }
                    
                    
                   sstRiesgosValoracionDTO.setRisks(null); 
                    
                    
                    sstRiesgosValoracionDTO.setSubdomain(sstRiesgosValoracionDataPdn.getFidCoreSubdomain().getIdCoreSubdomain());
                    sstRiesgosValoracionDTO.setId(Long.valueOf(sstRiesgosValoracionDataPdn.getIdSstRiesgosValoracionData()));

                    sstRiesgosValoracionCertif.setId(Long.valueOf(sstRiesgosValoracionDataPdn.getIdSstRiesgosValoracionData().toString()));

                    sstRiesgosValoracionCertif.setChecked(sstRiesgosValoracionDataPdn.getChecked());
                    sstRiesgosValoracionCertif.setEnable(sstRiesgosValoracionDataPdn.getEnable());
                    sstRiesgosValoracionCertif.setModified(sstRiesgosValoracionDataPdn.getModified());
                    sstRiesgosValoracionCertif.setCreated(sstRiesgosValoracionDataPdn.getCreated());
                });
                sstRiesgosValoracionCertif.setSstRiesgosValoracion(JsonUtil.convertObjectToJson(sstRiesgosValoracionDTO));

                sstRiesgosValoracionDaoCertif.save(sstRiesgosValoracionCertif);
                System.out.println("------Migrando-----" + sstRiesgosValoracionCertif.getId() + "---------" + sstRiesgosValoracionDTO.getSubdomain());
            });


        //});
	
        System.out.println("Migracion sstRiesgosValoracion completada");
	}
	
	@Override
	public void migrateSstControles () {
		
		//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
    	
    	
    	//coreSubdomainsList.forEach(coreSubdomains -> {
    		List<SstControlesDataPdn> sstControlesDataPdnList = sstControlesDao.getSstControlesDataBySubdomain(subd);
    		sstControlesDataPdnList.
    			parallelStream().collect(Collectors.groupingBy(SstControlesDataPdn::getModified)).forEach((date, sstControlesDataPdns) -> {
                    
    				SstControlesDTO sstControlesDTO = new SstControlesDTO();
                    SstControlesCertif sstControlesCertif = new SstControlesCertif();
                    sstControlesDataPdns.parallelStream().forEach(sstControlesDataPdn -> {
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 2) {
                    		sstControlesDTO.setRiesgosBiologicos_virus(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 3) {
                    		sstControlesDTO.setRiesgosBiologicos_bacteria(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 4) {
                    		sstControlesDTO.setRiesgosBiologicos_hongo(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 5) {
                    		sstControlesDTO.setRiesgosBiologicos_rickettsias(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 6) {
                    		sstControlesDTO.setRiesgosBiologicos_parasitos(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 7) {
                    		sstControlesDTO.setRiesgosBiologicos_picaduras(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 8) {
                    		sstControlesDTO.setRiesgosBiologicos_mordeduras(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 9) {
                    		sstControlesDTO.setRiesgosBiologicos_fluidosExcrementos(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 10) {
                    		sstControlesDTO.setRiesgosBiologicos_otrosBiologicos(sstControlesDataPdn.getResult());
                    	}
                    
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 12) {
                    		sstControlesDTO.setRiesgosFisicos_ruido(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 13) {
                    		sstControlesDTO.setRiesgosFisicos_iluminacion(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 14) {
                    		sstControlesDTO.setRiesgosFisicos_vibracion(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 15) {
                    		sstControlesDTO.setRiesgosFisicos_temperaturas(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 16) {
                    		sstControlesDTO.setRiesgosFisicos_presion(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 17) {
                    		sstControlesDTO.setRiesgosFisicos_radiacionesIon(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 18) {
                    		sstControlesDTO.setRiesgosFisicos_radiacionesNoIon(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 19) {
                    		sstControlesDTO.setRiesgosFisicos_otrosFisicos(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 21) {
                    		sstControlesDTO.setRiesgosQuimicos_polvos(sstControlesDataPdn.getResult());
                    	}

                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 22) {
                    		sstControlesDTO.setRiesgosQuimicos_fibras(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 23) {
                    		sstControlesDTO.setRiesgosQuimicos_liquidos(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 24) {
                    		sstControlesDTO.setRiesgosQuimicos_gases(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 25) {
                    		sstControlesDTO.setRiesgosQuimicos_humos(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 26) {
                    		sstControlesDTO.setRiesgosQuimicos_materialParticulado(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 27) {
                    		sstControlesDTO.setRiesgosQuimicos_otrosQuimicos(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 29) {
                    		sstControlesDTO.setRiesgosPsicosociales_gestionOrgan(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 30) {
                    		sstControlesDTO.setRiesgosPsicosociales_caractOrganiz(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 31) {
                    		sstControlesDTO.setRiesgosPsicosociales_caractGrupoSoc(sstControlesDataPdn.getResult());
                    	}
                       
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 32) {
                    		sstControlesDTO.setRiesgosPsicosociales_condicionesTarea(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 33) {
                    		sstControlesDTO.setRiesgosPsicosociales_interfasePerson(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 34) {
                    		sstControlesDTO.setRiesgosPsicosociales_jornadaTrab(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 35) {
                    		sstControlesDTO.setRiesgosPsicosociales_otrosPsicosoc(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 37) {
                    		sstControlesDTO.setRiesgosBiomecanicos_postura(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 38) {
                    		sstControlesDTO.setRiesgosBiomecanicos_esfuerzo(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 39) {
                    		sstControlesDTO.setRiesgosBiomecanicos_movRepet(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 40) {
                    		sstControlesDTO.setRiesgosBiomecanicos_manipulManual(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 41) {
                    		sstControlesDTO.setRiesgosBiomecanicos_otrosBiomecan(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 43) {
                    		sstControlesDTO.setRiesgosCondSeguridad_mecanico(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 44) {
                    		sstControlesDTO.setRiesgosCondSeguridad_electrico(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 45) {
                    		sstControlesDTO.setRiesgosCondSeguridad_locativo(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 46) {
                    		sstControlesDTO.setRiesgosCondSeguridad_tecnologico(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 47) {
                    		sstControlesDTO.setRiesgosCondSeguridad_accTransito(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 48) {
                    		sstControlesDTO.setRiesgosCondSeguridad_publico(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 49) {
                    		sstControlesDTO.setRiesgosCondSeguridad_trabAlturas(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 50) {
                    		sstControlesDTO.setRiesgosCondSeguridad_espaciosConfin(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 51) {
                    		sstControlesDTO.setRiesgosCondSeguridad_otrosCondSeg(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 53) {
                    		sstControlesDTO.setRiesgosFenomNaturales_sismo(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 54) {
                    		sstControlesDTO.setRiesgosFenomNaturales_terremoto(sstControlesDataPdn.getResult());
                    	}
                    	
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 55) {
                    		sstControlesDTO.setRiesgosFenomNaturales_vendaval(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 56) {
                    		sstControlesDTO.setRiesgosFenomNaturales_inundacion(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 57) {
                    		sstControlesDTO.setRiesgosFenomNaturales_derrumbe(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 58) {
                    		sstControlesDTO.setRiesgosFenomNaturales_precipitaciones(sstControlesDataPdn.getResult());
                    	}
                    	
                    	if(sstControlesDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField() == 59) {
                    		sstControlesDTO.setRiesgosFenomNaturales_otrosFenomNat(sstControlesDataPdn.getResult());
                    	}
                    	
                        sstControlesDTO.setSubdomain(sstControlesDataPdn.getFidCoreSubdomain().getIdCoreSubdomain());
                        sstControlesDTO.setId(Long.valueOf(sstControlesDataPdn.getIdSstControlesData()));
                        
                        sstControlesCertif.setId(Long.valueOf(sstControlesDataPdn.getIdSstControlesData().toString()));

                        sstControlesCertif.setChecked(sstControlesDataPdn.getChecked());
                        sstControlesCertif.setEnable(sstControlesDataPdn.getEnable());
                        sstControlesCertif.setModified(sstControlesDataPdn.getModified());
                        sstControlesCertif.setCreated(sstControlesDataPdn.getCreated());
                    });
                    
                    sstControlesCertif.setSstControles(JsonUtil.convertObjectToJson(sstControlesDTO));

                    sstControlesDaoCertif.save(sstControlesCertif);
                    System.out.println("------Migrando-----" + sstControlesCertif.getId() + "---------" + sstControlesDTO.getSubdomain());
    			});
            //});

		System.out.println("Migracion sstControles completada");
	}
	
	@Override
	public void migrateSstEncuestasForm() {
		
		//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
		

        //coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstEncuestasFormPdn> sstEncuestasFormPdnList = sstEncuestasFormDao.getSstEncuestasFormBySubdomain(subd);
            sstEncuestasFormPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstEncuestasFormPdn::getModified)).forEach((date, sstEncuestasFormPdns) -> {

                
                SstEncuestasFormCertif sstEncuestasFormCertif = new SstEncuestasFormCertif();

                
                sstEncuestasFormPdns.parallelStream().forEach(sstEncuestasFormPdn -> {

     
                        sstEncuestasFormCertif.setId(Long.valueOf(sstEncuestasFormPdn.getIdSstEncuestasForm().toString()));

                        sstEncuestasFormCertif.setChecked(sstEncuestasFormPdn.getChecked());
                        sstEncuestasFormCertif.setEnable(sstEncuestasFormPdn.getEnable());
                        sstEncuestasFormCertif.setModified(sstEncuestasFormPdn.getModified());
                        sstEncuestasFormCertif.setCreated(sstEncuestasFormPdn.getCreated());
                        
                        sstEncuestasFormCertif.setSubdomain(String.valueOf(sstEncuestasFormPdn.getFidCoreSubdomain()));
                        sstEncuestasFormCertif.setFidUser(sstEncuestasFormPdn.getFidUser().getIdUser());
                        sstEncuestasFormCertif.setFidSstEncuestasTipo(sstEncuestasFormPdn.getFidSstEncuestasTipo().getIdSstEncuestasTipo());
                	
                	

                    //sstEncuestasFormCertif.setFidSstRecurso(sstEncuestasFormPdn.getFidRecurso().getIdCoreModuloRecurso());
                    
                });
                

                sstEncuestasFormDaoCertif.save(sstEncuestasFormCertif);
                System.out.println("------Migrando-----" + sstEncuestasFormCertif.getId() + "---------" + sstEncuestasFormCertif.getSubdomain());
            });


        //});

        System.out.println("Migracion sstEncuestasForm completada");
		
	}
	
	@Override
	public void migrateSstEncuestasTrabajo() {
		
		//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
        //coreSubdomainsList.forEach(coreSubdomains -> {
		
		List<SstEncuestasDataPdn> sstEncuestasDataPdnList = sstEncuestasDao.getSstEncuestasDataBySubdomain(subd);
            
            sstEncuestasDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstEncuestasDataPdn::getModified)).forEach((date, sstEncuestasDataPdns) -> {
                
                SstEncuestasTrabajoDTO sstEncuestasDTO = new SstEncuestasTrabajoDTO();
                SstEncuestasCertif sstEncuestasCertif = new SstEncuestasCertif();
                List<RisksDTO> risks = Collections.synchronizedList(new ArrayList<RisksDTO>());
                
                sstEncuestasDataPdns.parallelStream().forEach(sstEncuestasDataPdn -> {

                if(sstEncuestasDataPdn.getFidSstEncuestasForm().getFidSstEncuestasTipo().getIdSstEncuestasTipo() == 2) {
                    
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 81)
                		sstEncuestasDTO.setCargoLaboral(sstEncuestasDataPdn.getResult());
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 82)
                		sstEncuestasDTO.setEquiposOpera(sstEncuestasDataPdn.getResult());
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 146)
                		sstEncuestasDTO.setSugerenciasCondTrabajo(sstEncuestasDataPdn.getResult());
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 85) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 86) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 87) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 88) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 89) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 90) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 91) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 92) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 93) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 85) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 95) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 96) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 97) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 98) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 99) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 100) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 101) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 102) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 104) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 105) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 106) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 107) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 108) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 109) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 110) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 112) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 113) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 114) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 115) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 116) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 117) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 118) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 120) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 121) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 122) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 123) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 124) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 126) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 127) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 128) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 129) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 130) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 131) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 132) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 133) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 134) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 136) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 137) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 138) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 139) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 140) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 141) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 142) {
                		RisksDTO registro = new RisksDTO();
                		registro.setId(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField());
                		registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setOrder(sstEncuestasFieldsDao.getSstEncuestasFieldsOrderBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField()));
                		registro.setParent(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(sstEncuestasFieldsDao.getSstEncuestasFieldsParentBySubdomain(sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField())));
                		risks.add(registro);
                	}
                	 
                	sstEncuestasDTO.setSubdomain(sstEncuestasDataPdn.getFidCoreSubdomain().getIdCoreSubdomain());
                    sstEncuestasDTO.setId(Long.valueOf(sstEncuestasDataPdn.getIdSstEncuestasData()));
                    sstEncuestasDTO.setQuantityFields(7);
                    sstEncuestasDTO.setEncuestaForm(sstEncuestasDataPdn.getFidSstEncuestasForm().getIdSstEncuestasForm());
                    
                    sstEncuestasCertif.setId(Long.valueOf(sstEncuestasDataPdn.getIdSstEncuestasData().toString()));

                    sstEncuestasCertif.setChecked(sstEncuestasDataPdn.getChecked());
                    sstEncuestasCertif.setEnable(sstEncuestasDataPdn.getEnable());
                    sstEncuestasCertif.setModified(sstEncuestasDataPdn.getModified());
                    sstEncuestasCertif.setCreated(sstEncuestasDataPdn.getCreated());
                }
                
                });
                if (sstEncuestasDTO != null) {
                	sstEncuestasDTO.setRisks(risks);
                    sstEncuestasCertif.setEncuestas(JsonUtil.convertObjectToJson(sstEncuestasDTO));
                    
                    sstEncuestasDaoCertif.save(sstEncuestasCertif);
                    System.out.println("------Migrando-----" + sstEncuestasCertif.getId() + "---------" + sstEncuestasDTO.getSubdomain());
                }

                
            });


       //});
        
        System.out.println("Migracion sstEncuestas Trabajo completada");
		
	}
	
	@Override
	public void migrateSstEncuestasSalud() {
		
		//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
        //coreSubdomainsList.forEach(coreSubdomains -> {
		
		List<SstEncuestasDataPdn> sstEncuestasDataPdnList = sstEncuestasDao.getSstEncuestasDataBySubdomain(subd);
            
            sstEncuestasDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstEncuestasDataPdn::getModified)).forEach((date, sstEncuestasDataPdns) -> {
                
                SstEncuestasSaludDTO sstEncuestasDTO = new SstEncuestasSaludDTO();
                SstEncuestasCertif sstEncuestasCertif = new SstEncuestasCertif();
                List<GenericoDTO> hobbyDeporte = Collections.synchronizedList(new ArrayList<GenericoDTO>());
                List<GenericoDTO> actividadesSaludEmpresa = Collections.synchronizedList(new ArrayList<GenericoDTO>());
                
                sstEncuestasDataPdns.parallelStream().forEach(sstEncuestasDataPdn -> {

                if(sstEncuestasDataPdn.getFidSstEncuestasForm().getFidSstEncuestasTipo().getIdSstEncuestasTipo() == 1) {
                    
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 41)
                		sstEncuestasDTO.setEnfermedadTratamiento(sstEncuestasDataPdn.getResult());
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 42)
                		sstEncuestasDTO.setSintomasFisicEmocion(sstEncuestasDataPdn.getResult());
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 43)
                		sstEncuestasDTO.setSintomTrabajo(sstEncuestasDataPdn.getResult());
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 44)
                		sstEncuestasDTO.setSintomFuera(sstEncuestasDataPdn.getResult());
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 45) {
                		
                		if(Integer.valueOf(sstEncuestasDataPdn.getResult()) == 46) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			sstEncuestasDTO.setConsultadoSalud(registro);
                		}
                		
                		if(Integer.valueOf(sstEncuestasDataPdn.getResult()) == 47) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			sstEncuestasDTO.setConsultadoSalud(registro);
                		}
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 49)
                		sstEncuestasDTO.setUltimAnioIncapacitado(sstEncuestasDataPdn.getResult());
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 51)
                		sstEncuestasDTO.setUltimAnioIncapacitado(sstEncuestasDataPdn.getResult());
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 52)
                		sstEncuestasDTO.setSugerenciasCondSalud(sstEncuestasDataPdn.getResult());
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 53) {
                		if (Integer.valueOf(sstEncuestasDataPdn.getResult()) == 54) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(Integer.valueOf(sstEncuestasDataPdn.getResult()));
                			registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(Integer.valueOf(sstEncuestasDataPdn.getResult())));
                			hobbyDeporte.add(registro);
                		}
                		
                		if (Integer.valueOf(sstEncuestasDataPdn.getResult()) == 55) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(Integer.valueOf(sstEncuestasDataPdn.getResult()));
                			registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(Integer.valueOf(sstEncuestasDataPdn.getResult())));
                			hobbyDeporte.add(registro);
                		}
                		
                		if (Integer.valueOf(sstEncuestasDataPdn.getResult()) == 56) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(Integer.valueOf(sstEncuestasDataPdn.getResult()));
                			registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(Integer.valueOf(sstEncuestasDataPdn.getResult())));
                			hobbyDeporte.add(registro);
                		}
                		
                		if (Integer.valueOf(sstEncuestasDataPdn.getResult()) == 57) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(Integer.valueOf(sstEncuestasDataPdn.getResult()));
                			registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(Integer.valueOf(sstEncuestasDataPdn.getResult())));
                			hobbyDeporte.add(registro);
                		}
                		
                		if (Integer.valueOf(sstEncuestasDataPdn.getResult()) == 58) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(Integer.valueOf(sstEncuestasDataPdn.getResult()));
                			registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(Integer.valueOf(sstEncuestasDataPdn.getResult())));
                			hobbyDeporte.add(registro);
                		}
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 74) {
                		
                		if(Integer.valueOf(sstEncuestasDataPdn.getResult()) == 75) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			sstEncuestasDTO.setPracticaAlgunDeporte(registro);
                		}
                		
                		if(Integer.valueOf(sstEncuestasDataPdn.getResult()) == 76) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			sstEncuestasDTO.setPracticaAlgunDeporte(registro);
                		}
                		
                		if(Integer.valueOf(sstEncuestasDataPdn.getResult()) == 77) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			sstEncuestasDTO.setPracticaAlgunDeporte(registro);
                		}
                		
                		if(Integer.valueOf(sstEncuestasDataPdn.getResult()) == 78) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			sstEncuestasDTO.setPracticaAlgunDeporte(registro);
                		}
                		
                		if(Integer.valueOf(sstEncuestasDataPdn.getResult()) == 79) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			sstEncuestasDTO.setPracticaAlgunDeporte(registro);
                		}
                		
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 59) {
                		if(Integer.valueOf(sstEncuestasDataPdn.getResult()) == 60 ) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(Integer.valueOf(sstEncuestasDataPdn.getResult()));
                			registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(Integer.valueOf(sstEncuestasDataPdn.getResult())));
                			actividadesSaludEmpresa.add(registro);
                		}
                		
                		if(Integer.valueOf(sstEncuestasDataPdn.getResult()) == 61 ) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(Integer.valueOf(sstEncuestasDataPdn.getResult()));
                			registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(Integer.valueOf(sstEncuestasDataPdn.getResult())));
                			actividadesSaludEmpresa.add(registro);
                		}
                		
                		if(Integer.valueOf(sstEncuestasDataPdn.getResult()) == 62 ) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(Integer.valueOf(sstEncuestasDataPdn.getResult()));
                			registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(Integer.valueOf(sstEncuestasDataPdn.getResult())));
                			actividadesSaludEmpresa.add(registro);
                		}
                		
                		if(Integer.valueOf(sstEncuestasDataPdn.getResult()) == 63 ) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(Integer.valueOf(sstEncuestasDataPdn.getResult()));
                			registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(Integer.valueOf(sstEncuestasDataPdn.getResult())));
                			actividadesSaludEmpresa.add(registro);
                		}
                		
                		if(Integer.valueOf(sstEncuestasDataPdn.getResult()) == 64 ) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(Integer.valueOf(sstEncuestasDataPdn.getResult()));
                			registro.setLabel(sstEncuestasFieldsDao.getSstEncuestasFieldsLabelBySubdomain(Integer.valueOf(sstEncuestasDataPdn.getResult())));
                			actividadesSaludEmpresa.add(registro);
                		}
                	}
                	
                	if (sstEncuestasDataPdn.getFidSstEncuestasField().getIdSstEncuestasField() == 50) 
                		sstEncuestasDTO.setPorque(sstEncuestasDataPdn.getResult());
                	
                	
                	sstEncuestasDTO.setSubdomain(sstEncuestasDataPdn.getFidCoreSubdomain().getIdCoreSubdomain());
                    sstEncuestasDTO.setId(Long.valueOf(sstEncuestasDataPdn.getIdSstEncuestasData()));
                    sstEncuestasDTO.setEncuestaForm(sstEncuestasDataPdn.getFidSstEncuestasForm().getIdSstEncuestasForm());
                    
                    sstEncuestasCertif.setId(Long.valueOf(sstEncuestasDataPdn.getIdSstEncuestasData().toString()));

                    sstEncuestasCertif.setChecked(sstEncuestasDataPdn.getChecked());
                    sstEncuestasCertif.setEnable(sstEncuestasDataPdn.getEnable());
                    sstEncuestasCertif.setModified(sstEncuestasDataPdn.getModified());
                    sstEncuestasCertif.setCreated(sstEncuestasDataPdn.getCreated());
                }
                
                });
                if (sstEncuestasDTO != null) {
                	
                    sstEncuestasCertif.setEncuestas(JsonUtil.convertObjectToJson(sstEncuestasDTO));
                    
                    sstEncuestasDaoCertif.save(sstEncuestasCertif);
                    System.out.println("------Migrando-----" + sstEncuestasCertif.getId() + "---------" + sstEncuestasDTO.getSubdomain());
                }

                
            });


       //});
		System.out.println("Migracion sstEncuestas Salud completada");
	}
	
	@Override
	public void migrateSstInstructivos() {
		
	//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
		

      //  coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstInstructivosDataPdn> sstInstructivosDataPdnList = sstInstructivosDao.getSstInstructivosBySubdomain("subd");
            sstInstructivosDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstInstructivosDataPdn::getModified)).forEach((date, sstInstructivosDataPdns) -> {
                SstInstructivosDTO sstInstructivosDTO = new SstInstructivosDTO();
                SstInstructivosCertif sstInstructivosCertif = new SstInstructivosCertif();
                List<String> instructivosFile = Collections.synchronizedList(new ArrayList<String>());
                
                
                sstInstructivosDataPdns.parallelStream().forEach(sstInstructivosDataPdn -> {
                	
                	if (sstInstructivosDataPdn.getFidSstInstructivosField().getIdSstInstructivosField()==2) {
                        if(sstInstructivosDataPdn.getResult() != null){
                            Optional<CoreRecurso> coreRecurso = coreRecursoDao.findById(Integer.valueOf(sstInstructivosDataPdn.getResult()));
                            if(coreRecurso.isPresent()){
                                String result = coreRecurso.get().getNombreArchivo();
                                instructivosFile.add(result);
                            }

                        }
                	}
                	
                	sstInstructivosDTO.setId(Long.valueOf(sstInstructivosDataPdn.getIdSstInstructivosData().toString()));
                	
                    sstInstructivosCertif.setId(Long.valueOf(sstInstructivosDataPdn.getIdSstInstructivosData().toString()));

                    sstInstructivosCertif.setChecked(sstInstructivosDataPdn.getChecked());
                    sstInstructivosCertif.setEnable(sstInstructivosDataPdn.getEnable());
                    sstInstructivosCertif.setModified(sstInstructivosDataPdn.getModified());
                    sstInstructivosCertif.setCreated(sstInstructivosDataPdn.getCreated());
                    
                    
                    
                });
                sstInstructivosDTO.setInstructivosFile(instructivosFile);
                
                sstInstructivosCertif.setSstInstructivos(JsonUtil.convertObjectToJson(sstInstructivosDTO));
                
                sstInstructivosDaoCertif.save(sstInstructivosCertif);
                System.out.println("------Migrando-----" + sstInstructivosCertif.getId() + "---------" + sstInstructivosDTO.getSubdomain());
            });


        //});
        
		System.out.println("Migracion sstInstructivos completada");
	}
	
	@Override
	public void migrateSstSaludTrabajador() {
		
	//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
		

        //coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstSaludTrabajDataPdn> sstSaludTrabajDataPdnList = sstSaludTrabajDao.getSstSaludTrabajDataBySubdomain(subd);
            sstSaludTrabajDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstSaludTrabajDataPdn::getModified)).forEach((date, sstSaludTrabajDataPdns) -> {
                SstSaludTrabajadorDTO sstSaludTrabajDTO = new SstSaludTrabajadorDTO();
                SstSaludTrabajadorCertif sstSaludTrabajCertif = new SstSaludTrabajadorCertif();
                List<String> certMedIng = Collections.synchronizedList(new ArrayList<String>());
                List<String> certPedCon = Collections.synchronizedList(new ArrayList<String>());
                List<String> certMedRet = Collections.synchronizedList(new ArrayList<String>());
                
                
                
                sstSaludTrabajDataPdns.parallelStream().forEach(sstSaludTrabajDataPdn -> {
                	
                	
                	if (sstSaludTrabajDataPdn.getFidSstSaludTrabajField().getIdSstSaludTrabajField() == 3) {
                        if(sstSaludTrabajDataPdn.getResult() != null){
                            Optional<CoreRecurso> coreRecurso = coreRecursoDao.findById(Integer.valueOf(sstSaludTrabajDataPdn.getResult()));
                            if(coreRecurso.isPresent()){
                                String result = coreRecurso.get().getNombreArchivo();
                                certMedIng.add(result);
                            }

                        }
                	}
                	
                	if (sstSaludTrabajDataPdn.getFidSstSaludTrabajField().getIdSstSaludTrabajField() == 4) {
                        if(sstSaludTrabajDataPdn.getResult() != null){
                            Optional<CoreRecurso> coreRecurso = coreRecursoDao.findById(Integer.valueOf(sstSaludTrabajDataPdn.getResult()));
                            if(coreRecurso.isPresent()){
                                String result = coreRecurso.get().getNombreArchivo();
                                certPedCon.add(result);
                            }

                        }
                	}
                	
                	if (sstSaludTrabajDataPdn.getFidSstSaludTrabajField().getIdSstSaludTrabajField() == 5) {
                        if(sstSaludTrabajDataPdn.getResult() != null){
                            Optional<CoreRecurso> coreRecurso = coreRecursoDao.findById(Integer.valueOf(sstSaludTrabajDataPdn.getResult()));
                            if(coreRecurso.isPresent()){
                                String result = coreRecurso.get().getNombreArchivo();
                                certMedRet.add(result);
                            }

                        }
                	}
                	
                	sstSaludTrabajDTO.setUser(String.valueOf(sstSaludTrabajDataPdn.getUser()));
                	
                	sstSaludTrabajDTO.setId(Long.valueOf(sstSaludTrabajDataPdn.getIdSstSaludTrabajData().toString()));
                	
                    sstSaludTrabajCertif.setId(Long.valueOf(sstSaludTrabajDataPdn.getIdSstSaludTrabajData().toString()));

                    sstSaludTrabajCertif.setChecked(sstSaludTrabajDataPdn.getChecked());
                    sstSaludTrabajCertif.setEnable(sstSaludTrabajDataPdn.getEnable());
                    sstSaludTrabajCertif.setModified(sstSaludTrabajDataPdn.getModified());
                    sstSaludTrabajCertif.setCreated(sstSaludTrabajDataPdn.getCreated());
                    
                    
                    
                });
                
                sstSaludTrabajDTO.setCerMedIng(certMedIng);
                sstSaludTrabajDTO.setCerPedCon(certPedCon);
                sstSaludTrabajDTO.setCerMedRet(certMedRet);
                sstSaludTrabajCertif.setSstSaludTrabajador(JsonUtil.convertObjectToJson(sstSaludTrabajDTO));
                
                sstSaludTrabajadorDaoCertif.save(sstSaludTrabajCertif);
                System.out.println("------Migrando-----" + sstSaludTrabajCertif.getId() + "---------" + sstSaludTrabajDTO.getSubdomain());
            });


        //});
        
        System.out.println("Migracion sstSaludTrabaj completada");
	}
	
	@Override
	public void migrateSstEpp() {
		//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();

       
        
        //coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstEppDataPdn> sstEppDataPdnList = sstEppDao.getSstEppDataBySubdomain(subd);
            sstEppDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstEppDataPdn::getModified)).forEach((date, sstEppDataPdns) -> {
                SstEppDTO sstEppDTO = new SstEppDTO();
                EppDTO eppDTO = new EppDTO();
                SstEppCertif sstEppCertif = new SstEppCertif();
                List<RisksDTO> protectoresCabeza = Collections.synchronizedList(new ArrayList<RisksDTO>());
                List<RisksDTO> protectoresOidos = Collections.synchronizedList(new ArrayList<RisksDTO>());
                List<RisksDTO> protectoresOjosCara = Collections.synchronizedList(new ArrayList<RisksDTO>());
                List<RisksDTO> protectoresViasResp = Collections.synchronizedList(new ArrayList<RisksDTO>());
                List<RisksDTO> protectoresManosBrazos = Collections.synchronizedList(new ArrayList<RisksDTO>());
                List<RisksDTO> protectoresPiesPiernas = Collections.synchronizedList(new ArrayList<RisksDTO>());
                List<RisksDTO> protectoresPiel = Collections.synchronizedList(new ArrayList<RisksDTO>());
                List<RisksDTO> protectoresCuerpo = Collections.synchronizedList(new ArrayList<RisksDTO>());
                List<RisksDTO> protectoresAltura = Collections.synchronizedList(new ArrayList<RisksDTO>());
                List<RisksDTO> protectoresOtros = Collections.synchronizedList(new ArrayList<RisksDTO>());
                
                sstEppDataPdns.parallelStream().forEach(sstEppDataPdn -> {

                	

                    
                    
                	if (sstEppDataPdn.getFidSstEppField().getIdSstEppField() == 3){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresCabeza.add(epp);
                	}
                	
                	if (sstEppDataPdn.getFidSstEppField().getIdSstEppField() == 5){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresOidos.add(epp);
                	}
                	

                	
                	if (sstEppDataPdn.getFidSstEppField().getIdSstEppField() == 8){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresOjosCara.add(epp);
                	}

                   
                	if (sstEppDataPdn.getFidSstEppField().getIdSstEppField() == 14){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresViasResp.add(epp);
                	}
                    
                	
                
                	if (sstEppDataPdn.getFidSstEppField().getIdSstEppField() == 19){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresManosBrazos.add(epp);
                	}
                	
                	if (sstEppDataPdn.getFidSstEppField().getIdSstEppField() == 21){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(      sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresPiesPiernas.add(epp);
                	}
                	
                	if (sstEppDataPdn.getFidSstEppField().getIdSstEppField() == 23){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresPiel.add(epp);
                	}
                    
                	if (sstEppDataPdn.getFidSstEppField().getIdSstEppField() == 25){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresCuerpo.add(epp);
                	}
                	

                	
                	if (sstEppDataPdn.getFidSstEppField().getIdSstEppField() == 32){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresAltura.add(epp);
                	}
                
                	if (sstEppDataPdn.getFidSstEppField().getIdSstEppField() == 34){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresOtros.add(epp);
                	}
                	
                	



                    
                    sstEppDTO.setUser(String.valueOf(sstEppDataPdn.getFidSstEppForm().getFidUser().getIdUser()));
                    sstEppDTO.setSubdomain(sstEppDataPdn.getFidCoreSubdomain().getIdCoreSubdomain());
                    sstEppDTO.setId(Long.valueOf(sstEppDataPdn.getIdSstEppData()));
                    
                    sstEppCertif.setId(Long.valueOf(sstEppDataPdn.getIdSstEppData().toString()));

                    sstEppCertif.setChecked(sstEppDataPdn.getChecked());
                    sstEppCertif.setEnable(sstEppDataPdn.getEnable());
                    sstEppCertif.setModified(sstEppDataPdn.getModified());
                    sstEppCertif.setCreated(sstEppDataPdn.getCreated());
                });
   
                eppDTO.setProtectoresAltura(protectoresAltura);
                eppDTO.setProtectoresCabeza(protectoresCabeza);
                eppDTO.setProtectoresCuerpo(protectoresCuerpo);
                eppDTO.setProtectoresManosBrazos(protectoresManosBrazos);
                eppDTO.setProtectoresOidos(protectoresOidos);
                eppDTO.setProtectoresOjosCara(protectoresOjosCara);
                eppDTO.setProtectoresOtros(protectoresOtros);
                eppDTO.setProtectoresPiel(protectoresPiel);
                eppDTO.setProtectoresPierPiernas(protectoresPiesPiernas);
                eppDTO.setProtectoresViasResp(protectoresViasResp);
                eppDTO.setProtectoresViasResp(protectoresViasResp);

                sstEppDTO.setEpps(eppDTO);
                
                sstEppCertif.setSstEpp(JsonUtil.convertObjectToJson(sstEppDTO));
               
                sstEppDaoCertif.save(sstEppCertif);
                System.out.println("------Migrando-----" + sstEppCertif.getId() + "---------" + sstEppDTO.getSubdomain());
            });


        //});
        
        System.out.println("Migracion sstEpp completada");
        
	}
	
	@Override
	public void migrateSstAtel() {
		//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();

        //coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstAtelDataPdn> sstAtelDataPdnList = sstAtelDao.getSstAtelDataBySubdomain(subd);
            sstAtelDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstAtelDataPdn::getModified)).forEach((date, sstAtelDataPdns) -> {
                SstAtelDTO sstAtelDTO = new SstAtelDTO();
                SstAtelCertif sstAtelCertif = new SstAtelCertif();


                sstAtelDataPdns.parallelStream().forEach(sstAtelDataPdn -> {

                	if (sstAtelDataPdn.getFidSstAtElField().getIdSstAtElField() == 1) {
                		if(Integer.valueOf(sstAtelDataPdn.getResult())== 3) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			sstAtelDTO.setRegistroAccidentesTrabajo(registro);
                		}
                		
                		if(Integer.valueOf(sstAtelDataPdn.getResult())== 4) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			sstAtelDTO.setRegistroAccidentesTrabajo(registro);
                		}
                		
                		if(Integer.valueOf(sstAtelDataPdn.getResult())== 5) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			sstAtelDTO.setRegistroAccidentesTrabajo(registro);
                		}
                	}
                	
                	if (sstAtelDataPdn.getFidSstAtElField().getIdSstAtElField() == 2) {
                		if(Integer.valueOf(sstAtelDataPdn.getResult())== 6) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			sstAtelDTO.setRegistroEnfermedadesLabor(registro); 
                		}
                		
                		if(Integer.valueOf(sstAtelDataPdn.getResult())== 7) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			sstAtelDTO.setRegistroEnfermedadesLabor(registro);
                		}
                		
                		if(Integer.valueOf(sstAtelDataPdn.getResult())== 8) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			sstAtelDTO.setRegistroEnfermedadesLabor(registro);
                		}
                	}
                	
                	if (sstAtelDataPdn.getFidSstAtElField().getIdSstAtElField() == 9) {
                		sstAtelDTO.setNumeroAccidentesAnio(sstAtelDataPdn.getResult());
                	}
                	
                	if (sstAtelDataPdn.getFidSstAtElField().getIdSstAtElField() == 10) {
                		sstAtelDTO.setNumeroNuevasAccionesIT(sstAtelDataPdn.getResult());
                	}
                	
                	if(sstAtelDataPdn.getFidSstAtElField().getIdSstAtElField() == 11) {
                		if(Integer.valueOf(sstAtelDataPdn.getResult())== 12) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			sstAtelDTO.setDifusionNuevasAccionesITEnfermedades(registro);
                			
                		}
                		
                		if(Integer.valueOf(sstAtelDataPdn.getResult())== 13) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			sstAtelDTO.setDifusionNuevasAccionesITEnfermedades(registro);
                		}
                		
                		if(Integer.valueOf(sstAtelDataPdn.getResult())== 14) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			sstAtelDTO.setDifusionNuevasAccionesITEnfermedades(registro);
                		}
                	}
                	
                	if(sstAtelDataPdn.getFidSstAtElField().getIdSstAtElField() == 15) {
                		sstAtelDTO.setNumeroAccidentesAnio(sstAtelDataPdn.getResult());
                	}
                	
                	if(sstAtelDataPdn.getFidSstAtElField().getIdSstAtElField() == 16) {
                		sstAtelDTO.setNumeroNuevasAccionesAT(sstAtelDataPdn.getResult());
                	}
                	
                	if(sstAtelDataPdn.getFidSstAtElField().getIdSstAtElField() == 17) {
                		if(Integer.valueOf(sstAtelDataPdn.getResult())== 18) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			sstAtelDTO.setDifusionNuevasAccionesAT(registro);
                		}
                		
                		if(Integer.valueOf(sstAtelDataPdn.getResult())== 19) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			sstAtelDTO.setDifusionNuevasAccionesAT(registro);
                		}
                		
                		if(Integer.valueOf(sstAtelDataPdn.getResult())== 20) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			sstAtelDTO.setDifusionNuevasAccionesAT(registro);
                		}
                	}
                	
                	if(sstAtelDataPdn.getFidSstAtElField().getIdSstAtElField() == 21) {
                		sstAtelDTO.setNumeroEnfermedadesAnio(sstAtelDataPdn.getResult());
                	}
                	
                	if(sstAtelDataPdn.getFidSstAtElField().getIdSstAtElField() == 22) {
                		sstAtelDTO.setNumeroNuevasAccionesEL(sstAtelDataPdn.getResult());
                	}
                	
                	if(sstAtelDataPdn.getFidSstAtElField().getIdSstAtElField() == 23) {
                		if(Integer.valueOf(sstAtelDataPdn.getResult())== 24) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			sstAtelDTO.setDifusionNuevasAccionesEL(registro);
                		}
                		
                		if(Integer.valueOf(sstAtelDataPdn.getResult())== 25) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			sstAtelDTO.setDifusionNuevasAccionesEL(registro);
                		}
                		
                		if(Integer.valueOf(sstAtelDataPdn.getResult())== 26) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			sstAtelDTO.setDifusionNuevasAccionesEL(registro);
                		}
                	}
                	
                	if(sstAtelDataPdn.getFidSstAtElField().getIdSstAtElField() == 27) {
                		if(Integer.valueOf(sstAtelDataPdn.getResult())== 31) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			sstAtelDTO.setRegistroIncidentesTrabajo(registro);
                		}
                		
                		if(Integer.valueOf(sstAtelDataPdn.getResult())== 32) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			sstAtelDTO.setRegistroIncidentesTrabajo(registro);
                		}
                		
                		if(Integer.valueOf(sstAtelDataPdn.getResult())== 33) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			sstAtelDTO.setRegistroIncidentesTrabajo(registro);
                		}
                	}
                	
                	if (sstAtelDataPdn.getFidSstAtElField().getIdSstAtElField() == 28) {
                		sstAtelDTO.setInvestigIncidentesTrabajo(sstAtelDataPdn.getResult());
                	}
                	
                	if (sstAtelDataPdn.getFidSstAtElField().getIdSstAtElField() == 29) {
                		sstAtelDTO.setInvestigAccidentesTrabajo(sstAtelDataPdn.getResult());
                	} 
                	
                	if (sstAtelDataPdn.getFidSstAtElField().getIdSstAtElField() == 30) {
                		sstAtelDTO.setInvestigEnfermedadesTrabajo(sstAtelDataPdn.getResult());
                	} 
                	
                	if (sstAtelDataPdn.getFidSstAtElField().getIdSstAtElField() == 38)
                		sstAtelDTO.setNumeroEnfermedadesTotalesAnio(sstAtelDataPdn.getResult());
                	

                    
                    sstAtelDTO.setSubdomain(sstAtelDataPdn.getFidCoreSubdomain());
                    sstAtelDTO.setId(Long.valueOf(sstAtelDataPdn.getIdSstAtElData()));

                    sstAtelCertif.setId(Long.valueOf(sstAtelDataPdn.getIdSstAtElData().toString()));

                    sstAtelCertif.setChecked(sstAtelDataPdn.getChecked());
                    sstAtelCertif.setEnable(sstAtelDataPdn.getEnable());
                    sstAtelCertif.setModified(sstAtelDataPdn.getModified());
                    sstAtelCertif.setCreated(sstAtelDataPdn.getCreated());
                });

                sstAtelCertif.setSstAtel(JsonUtil.convertObjectToJson(sstAtelDTO));

                sstAtelDaoCertif.save(sstAtelCertif);
                System.out.println("------Migrando-----" + sstAtelCertif.getId() + "---------" + sstAtelDTO.getSubdomain());
            });


        //});
        System.out.println("Migracion sstAtel completada");
		
		
	}
	
	@Override
	public void migrateSstAtelGestion() {
	//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
		

        //coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstAtelGestionPdn> sstAtelGestionPdnList = sstAtelGestionDao.getSstAtelGestionBySubdomain(subd);
            sstAtelGestionPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstAtelGestionPdn::getModified)).forEach((date, sstAtelGestionPdns) -> {
                SstAtelGestionDTO sstAtelGestionDTO = new SstAtelGestionDTO();
                SstAtelGestionCertif sstAtelGestionCertif = new SstAtelGestionCertif();
                List<IntegranteDTO> users = Collections.synchronizedList(new ArrayList<IntegranteDTO>());
                
                sstAtelGestionPdns.parallelStream().forEach(sstAtelGestionPdn -> {
                	sstAtelGestionDTO.setId(Long.valueOf(sstAtelGestionPdn.getIdSstAtElGestion().toString()));
                	
                	sstAtelGestionDTO.setEventoFec(sstAtelGestionPdn.getEventoFecha());
                	
                	IntegranteDTO user = new IntegranteDTO();
                	user.setId(sstAtelGestionPdn.getUser());
                	user.setUser(coreUsuarioDao.getFirstNameCoreUsuarioByIdUser(sstAtelGestionPdn.getUser())+  " " + coreUsuarioDao.getLastNameCoreUsuarioByIdUser(sstAtelGestionPdn.getUser()));
                	users.add(user);
                	
                	sstAtelGestionDTO.setIndisFin(sstAtelGestionPdn.getIndisponibInicio());
                	sstAtelGestionDTO.setIndisFin(sstAtelGestionPdn.getIndisponibFin());
                	sstAtelGestionDTO.setEventLugar(sstAtelGestionPdn.getEventoLugar());
                	sstAtelGestionDTO.setEventDescripcion(sstAtelGestionPdn.getEventoDescripcion());
                	sstAtelGestionDTO.setMedidasTomadas(sstAtelGestionPdn.getMedidasTomadas());
                	sstAtelGestionDTO.setDifuncionTrabajadores(sstAtelGestionPdn.getDifusionTrabajadores());
                	
                    sstAtelGestionCertif.setId(Long.valueOf(sstAtelGestionPdn.getIdSstAtElGestion().toString()));

                    sstAtelGestionCertif.setChecked(sstAtelGestionPdn.getChecked());
                    sstAtelGestionCertif.setEnable(sstAtelGestionPdn.getEnable());
                    sstAtelGestionCertif.setModified(sstAtelGestionPdn.getModified());
                    sstAtelGestionCertif.setCreated(sstAtelGestionPdn.getCreated());
                    
                    
                    
                });
                sstAtelGestionDTO.setUserAfectado(users);
                sstAtelGestionCertif.setAtelGestion(JsonUtil.convertObjectToJson(sstAtelGestionDTO));
                
                sstAtelGestionDaoCertif.save(sstAtelGestionCertif);
                System.out.println("------Migrando-----" + sstAtelGestionCertif.getId() + "---------" + sstAtelGestionDTO.getSubdomain());
            });


        //});
        System.out.println("Migracion sstAtelGestion completada");
		
	}
	
	
    public static String buildQueryToString(String key,String value){
        StringBuilder query = new StringBuilder();
        query
                .append("{")
                .append("\"")
                .append(key)
                .append("\"")
                .append(":")
                .append("\"")
                .append(value)
                .append("\"")
                .append("}");
        return query.toString();
    }



	@Override
	public void migrateSstMatrizLegal() {
	//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
		

      //  coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstMatrizLegalDataPdn> sstMatrizLegalDataPdnList = sstMatrizLegalDao.getSstMatrizLegalDataBySubdomain(subd);
            sstMatrizLegalDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstMatrizLegalDataPdn::getModified)).forEach((date, sstMatrizLegalDataPdns) -> {
                SstMatrizLegalDTO sstMatrizLegalDTO = new SstMatrizLegalDTO();
                SstMatrizLegalCertif sstMatrizLegalCertif = new SstMatrizLegalCertif();
                MatrizLegalDTO matriz = new MatrizLegalDTO();
                
                sstMatrizLegalDataPdns.parallelStream().forEach(sstMatrizLegalDataPdn -> {
                	
                	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 1) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 4) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1443del2014(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 5) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1443del2014(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 6) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1443del2014(registro);
                		}
                	}
                	
                	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 3) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 10) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1335del1987(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 11) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1335del1987(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 12) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1335del1987(registro);
                		}
                	}
                	
                	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 13) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 14) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica9del1979(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 15) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica9del1979(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 16) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica9del1979(registro);
                		}
                	}
                	
                	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 25) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 26) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica181del1995(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 27) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica181del1995(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 28) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica181del1995(registro);
                		}
                	}
              
                	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 21) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 22) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica55del1993(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 23) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica55del1993(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 24) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica55del1993(registro);
                		}
                	}
                	
                	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 29) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 30) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica336del1996(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 31) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica336del1996(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 32) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica336del1996(registro);
                		}
                	}
                	
                	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 33) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 34) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica361del1997(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 35) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica361del1997(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 36) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica361del1997(registro);
                		}
                	}
                	
                	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 37) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 38) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica685del2011(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 39) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica685del2011(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 40) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica685del2011(registro);
                		}
                	}
                	
                	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 41) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 42) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica789del2002(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 43) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica789del2002(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 44) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica789del2002(registro);
                		}
                	}
                	
                	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 45) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 46) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica797del2003(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 47) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica797del2003(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 48) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica797del2003(registro);
                		}
                	}
                	
                	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 53) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 54) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1010del2006(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 55) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1010del2006(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 56) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1010del2006(registro);
                		}
                	}
                	
                	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 65) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 66) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1221del2008(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 67) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1221del2008(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 68) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1221del2008(registro);
                		}
                	}
                	
                	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 69) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 70) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1335del2009(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 71) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1335del2009(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 72) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1335del2009(registro);
                		}
                	}
                	
                	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 73) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 74) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1382del2010(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 75) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1382del2010(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 76) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1382del2010(registro);
                		}
                	}
                	
                	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 77) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 78) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1503del2011(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 79) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1503del2011(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 80) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1503del2011(registro);
                		}
                	}
                	
                	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 81) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 82) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1562del2012(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 83) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1562del2012(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 84) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1562del2012(registro);
                		}
                	}
                	
                	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 85) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 86) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1616del2013(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 87) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1616del2013(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 88) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1616del2013(registro);
                		}
                	}
                	
                	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 89) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 90) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica776del2012(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 91) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica776del2012(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 92) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica776del2012(registro);
                		}
                	}
                
                	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 93) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 94) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1429del2010(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 95) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1429del2010(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 96) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1429del2010(registro);
                		}
                	}
                	
                	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 97) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 98) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1539del2012(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 99) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1539del2012(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 100) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1539del2012(registro);
                		}
                	}
                	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 109) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 110) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica919del1989(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 111) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica919del1989(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 112) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica919del1989(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 113) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 114) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica2222del1993(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 115) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica2222del1993(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 116) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica2222del1993(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 125) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 126) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1108del1994(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 127) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1108del1994(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 128) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1108del1994(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 149) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 150) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1607del2002(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 151) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1607del2002(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 152) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1607del2002(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 153) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 154) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1609del2002(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 155) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1609del2002(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 156) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1609del2002(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 157) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 158) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica2090del2003(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 159) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica2090del2003(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 160) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica2090del2003(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 161) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 162) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica3615del2005(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 163) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica3615del2005(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 164) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica3615del2005(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 169) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 170) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica231del2006(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 171) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica231del2006(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 172) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica231del2006(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 173) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 174) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica034del2009(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 175) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica034del2009(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 176) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica034del2009(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 189) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 190) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica0019del2012(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 191) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica0019del2012(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 192) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica0019del2012(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 193) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 194) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica738del2013(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 195) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica738del2013(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 196) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica738del2013(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 201) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 202) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica0723del2013(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 203) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica0723del2013(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 204) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica0723del2013(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 209) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 210) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1443del2014(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 211) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1443del2014(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 212) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1443del2014(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 217) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 218) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1072del2015(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 219) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1072del2015(registro);;
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 220) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1072del2015(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 221) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 222) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica055del2015(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 223) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica055del2015(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 224) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica055del2015(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 233) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 234) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica2413del1979(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 235) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica2413del1979(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 236) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica055del2015(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 249) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 250) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1792del1990(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 251) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1792del1990(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 252) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1792del1990(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 257) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 258) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1995del1999(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 259) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1995del1999(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 260) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1995del1999(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 261) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 262) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplicaCircularUnificadadel2004(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 263) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplicaCircularUnificadadel2004(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 264) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplicaCircularUnificadadel2004(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 265) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 266) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica256del2004(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 267) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica256del2004(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 268) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica256del2004(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 269) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 270) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica156del2005(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 271) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica156del2005(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 272) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica156del2005(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 277) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 278) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica2346del2007(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 279) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica2346del2007(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 280) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica2346del2007(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 281) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 282) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1401del2007(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 283) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1401del2007(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 284) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1401del2007(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 285) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 286) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica2844del2007(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 287) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica2844del2007(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 288) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica2844del2007(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 289) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 290) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica2646del2008(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 291) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica2646del2008(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 292) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica2646del2008(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 301) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 302) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1013del2008(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 303) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1013del2008(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 304) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1013del2008(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 305) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 306) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica3673del2008(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 307) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica3673del2008(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 308) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica3673del2008(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 313) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 314) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1918del2009(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 315) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1918del2009(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 316) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1918del2009(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 317) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 318) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1348del2009(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 319) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1348del2009(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 320) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1348del2009(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 325) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 326) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica038del2010(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 327) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica038del2010(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 328) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica038del2010(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 329) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 330) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1409del2012(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 331) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1409del2012(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 332) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1409del2012(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 333) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 334) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1356del2012(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 335) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1356del2012(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 336) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1356del2012(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 337) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 338) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica652del2012(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 339) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica652del2012(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 340) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica652del2012(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 345) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 346) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica90708del2013(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 347) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica90708del2013(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 348) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica90708del2013(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 349) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 350) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1903del2013(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 351) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1903del2013(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 352) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1903del2013(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 353) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 354) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica2087del2013(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 355) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica2087del2013(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 356) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica2087del2013(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 361) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 362) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica2851del2015(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 363) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica2851del2015(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 364) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica2851del2015(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 365) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 366) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica3368del2014(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 367) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica3368del2014(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 368) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica3368del2014(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 369) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 370) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1886del2015(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 371) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1886del2015(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 372) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1886del2015(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 377) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 378) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1655del2015(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 379) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1655del2015(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 380) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1655del2015(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 377) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 378) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1655del2015(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 379) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1655del2015(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 380) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1655del2015(registro);
                		}
                	}
                   	
                   	if (sstMatrizLegalDataPdn.getFidSstMatrizLegalField().getIdSstMatrizLegalField() == 383) {
                		GenericoDTO registro = new GenericoDTO();
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 384) {
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			matriz.setAplica1111del2017(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 385) {
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			matriz.setAplica1111del2017(registro);
                		}
                		
                		if (Integer.valueOf(sstMatrizLegalDataPdn.getResult()) == 386) {
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			matriz.setAplica1111del2017(registro);
                		}
                	}
                	
                	sstMatrizLegalDTO.setId(Long.valueOf(sstMatrizLegalDataPdn.getIdSstMatrizLegalData()));
                    sstMatrizLegalDTO.setQuantityFields(61);
                	sstMatrizLegalCertif.setId(Long.valueOf(sstMatrizLegalDataPdn.getIdSstMatrizLegalData().toString()));
                	sstMatrizLegalDTO.setSubdomain(sstMatrizLegalDataPdn.getFidCoreSubdomain().getIdCoreSubdomain());
                	
                    sstMatrizLegalCertif.setChecked(sstMatrizLegalDataPdn.getChecked());
                    sstMatrizLegalCertif.setEnable(sstMatrizLegalDataPdn.getEnable());
                    sstMatrizLegalCertif.setModified(sstMatrizLegalDataPdn.getModified());
                    sstMatrizLegalCertif.setCreated(sstMatrizLegalDataPdn.getCreated());
                    
                    
                    
                    
                });
                
                sstMatrizLegalDTO.setMatriz(matriz);
                sstMatrizLegalCertif.setSstMatrizRiesgos(JsonUtil.convertObjectToJson(sstMatrizLegalDTO));
                
                sstMatrizLegalDaoCertif.save(sstMatrizLegalCertif);
                System.out.println("------Migrando-----" + sstMatrizLegalCertif.getId() + "---------" + sstMatrizLegalDTO.getSubdomain());
            });


        //});
		System.out.println("Migracion sstMatrizLegal completada");
	}



	@Override
	public void migrateSstPlanTrabajo() {
		
		
		//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
		

        //coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstPlanTrabajoDataPdn> sstPlanTrabajoDataPdnList = sstPlanTrabajoDao.getSstPLanTrabajoDataBySubdomain(subd);
            sstPlanTrabajoDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstPlanTrabajoDataPdn::getModified)).forEach((date, sstPlanTrabajoDataPdns) -> {

                SstPlanTrabajoDTO sstPlanTrabajoDTO = new SstPlanTrabajoDTO();
                SstPlanTrabajoCertif sstPlanTrabajoCertif = new SstPlanTrabajoCertif();

                
                sstPlanTrabajoDataPdns.parallelStream().forEach(sstPlanTrabajoDataPdn -> {

                	if (sstPlanTrabajoDataPdn.getFidSstPlanTrabajoField().getIdSstPlanTrabajoField() == 1)
                		sstPlanTrabajoDTO.setMetaplan1(sstPlanTrabajoDataPdn.getResult());
                	
                	if (sstPlanTrabajoDataPdn.getFidSstPlanTrabajoField().getIdSstPlanTrabajoField() == 2)
                		sstPlanTrabajoDTO.setActividadPlan1(sstPlanTrabajoDataPdn.getResult());
                	
                	if (sstPlanTrabajoDataPdn.getFidSstPlanTrabajoField().getIdSstPlanTrabajoField() == 3) {
                		IntegranteDTO user = new IntegranteDTO();
                		user.setId(Integer.valueOf(sstPlanTrabajoDataPdn.getResult()));
                		user.setUser(coreUsuarioDao.getFirstNameCoreUsuarioByIdUser(Integer.valueOf(sstPlanTrabajoDataPdn.getResult()))
                				+" "+coreUsuarioDao.getLastNameCoreUsuarioByIdUser(Integer.valueOf(sstPlanTrabajoDataPdn.getResult())));
                		sstPlanTrabajoDTO.setResponsablePlan1(user);
                	}
                	
                	if (sstPlanTrabajoDataPdn.getFidSstPlanTrabajoField().getIdSstPlanTrabajoField() == 4)
                		sstPlanTrabajoDTO.setRecFinanPlan1(sstPlanTrabajoDataPdn.getResult());
                	
                	if (sstPlanTrabajoDataPdn.getFidSstPlanTrabajoField().getIdSstPlanTrabajoField() == 5)
                		sstPlanTrabajoDTO.setRecTecnPlan1(sstPlanTrabajoDataPdn.getResult());
                	
                	if (sstPlanTrabajoDataPdn.getFidSstPlanTrabajoField().getIdSstPlanTrabajoField() == 6)
                		sstPlanTrabajoDTO.setRecPersonPlan1(sstPlanTrabajoDataPdn.getResult());
                	
                	if (sstPlanTrabajoDataPdn.getFidSstPlanTrabajoField().getIdSstPlanTrabajoField() == 7 ) {
                			sstPlanTrabajoDTO.setFechaRealPlan1(sstPlanTrabajoDataPdn.getResult());            	
                	}

                	if (sstPlanTrabajoDataPdn.getFidSstPlanTrabajoField().getIdSstPlanTrabajoField() == 10) {
                		GenericoDTO registro = new GenericoDTO();
                		registro.set_id(Integer.valueOf(sstPlanTrabajoDataPdn.getResult()));
                		registro.setLabel(sstPlanTrabajoFieldsDao.getSstPLanTrabajoFieldsLabelById(Integer.valueOf(sstPlanTrabajoDataPdn.getResult())));
                		sstPlanTrabajoDTO.setEstadoPlanTrabajo(registro);
                	}
                	
                	
                	
                	sstPlanTrabajoDTO.setSubdomain(sstPlanTrabajoDataPdn.getFidCoreSubdomain().getIdCoreSubdomain());
                	sstPlanTrabajoDTO.setId(Long.valueOf(sstPlanTrabajoDataPdn.getIdSstPlanTrabajoData().toString()));
                    sstPlanTrabajoCertif.setId(Long.valueOf(sstPlanTrabajoDataPdn.getIdSstPlanTrabajoData().toString()));

                    sstPlanTrabajoCertif.setChecked(sstPlanTrabajoDataPdn.getChecked());
                    sstPlanTrabajoCertif.setEnable(sstPlanTrabajoDataPdn.getEnable());
                    sstPlanTrabajoCertif.setModified(sstPlanTrabajoDataPdn.getModified());
                    sstPlanTrabajoCertif.setCreated(sstPlanTrabajoDataPdn.getCreated());
                  
                    
                });
                
                sstPlanTrabajoCertif.setSstPlanTrabajo(JsonUtil.convertObjectToJson(sstPlanTrabajoDTO));
                sstPlanTrabajoDaoCertif.save(sstPlanTrabajoCertif);
                System.out.println("------Migrando-----" + sstPlanTrabajoCertif.getId() + "---------" + sstPlanTrabajoDTO.getSubdomain());
            });


        //});


		System.out.println("Migración sstPlanTrabajo completada");
		
	}



	@Override
	public void migrateSstCapacitacion() {
		
	//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
		

      //  coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstCapacitacionPlanDataPdn> sstCapacitacionPlanDataPdnList = sstCapacitacionDao.getSstCapacitacionPlanDataBySubdomain(subd);
            sstCapacitacionPlanDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstCapacitacionPlanDataPdn::getModified)).forEach((date, sstCapacitacionPlanDataPdns) -> {

                SstCapacitacionDTO sstCapacitacionDTO = new SstCapacitacionDTO();
                SstCapacitacionCertif sstCapacitacionCertif = new SstCapacitacionCertif();
                //IntegranteDTO user = new IntegranteDTO();
                List<IntegranteDTO> lista = Collections.synchronizedList(new ArrayList<IntegranteDTO>());
                
                sstCapacitacionPlanDataPdns.parallelStream().forEach(sstCapacitacionPlanDataPdn -> {

                	
                	if (sstCapacitacionPlanDataPdn.getFidSstCapacitacionPlanField().getIdSstCapacitacionPlanField() == 17)
                		sstCapacitacionDTO.setNombreCapacitacion(sstCapacitacionPlanDataPdn.getResult());
                	
                	if (sstCapacitacionPlanDataPdn.getFidSstCapacitacionPlanField().getIdSstCapacitacionPlanField() == 18) {
                		
                		try {
                    		IntegranteDTO user = new IntegranteDTO();
                    		user.setId(Integer.valueOf(sstCapacitacionPlanDataPdn.getResult()));
                    		user.setUser(coreUsuarioDao.getFirstNameCoreUsuarioByIdUser(Integer.valueOf(sstCapacitacionPlanDataPdn.getResult()))
                    				+" "+coreUsuarioDao.getLastNameCoreUsuarioByIdUser(Integer.valueOf(sstCapacitacionPlanDataPdn.getResult())));
                    		lista.add(user);
                		}catch(Exception e){
                	        e.printStackTrace();
                	    }
                	}
                	
                	if (sstCapacitacionPlanDataPdn.getFidSstCapacitacionPlanField().getIdSstCapacitacionPlanField() == 100) {
                		try {
                    		IntegranteDTO user = new IntegranteDTO();
                    		user.setId(Integer.valueOf(sstCapacitacionPlanDataPdn.getResult()));
                    		user.setUser(coreUsuarioDao.getFirstNameCoreUsuarioByIdUser(Integer.valueOf(sstCapacitacionPlanDataPdn.getResult()))
                    				+" "+coreUsuarioDao.getLastNameCoreUsuarioByIdUser(Integer.valueOf(sstCapacitacionPlanDataPdn.getResult())));
                    		lista.add(user);
                		}catch(Exception e){
                	        e.printStackTrace();
                	    }


                	}
                	
                	if (sstCapacitacionPlanDataPdn.getFidSstCapacitacionPlanField().getIdSstCapacitacionPlanField() == 101
                			|| sstCapacitacionPlanDataPdn.getFidSstCapacitacionPlanField().getIdSstCapacitacionPlanField() == 19)
                		sstCapacitacionDTO.setDateInicioCapacitacion(sstCapacitacionPlanDataPdn.getResult());
                	
                	if (sstCapacitacionPlanDataPdn.getFidSstCapacitacionPlanField().getIdSstCapacitacionPlanField() == 102
                			|| sstCapacitacionPlanDataPdn.getFidSstCapacitacionPlanField().getIdSstCapacitacionPlanField() == 20)
                		sstCapacitacionDTO.setDateCumpliCapacitacion(sstCapacitacionPlanDataPdn.getResult());
                	
                	if (sstCapacitacionPlanDataPdn.getFidSstCapacitacionPlanField().getIdSstCapacitacionPlanField() == 21
                			|| sstCapacitacionPlanDataPdn.getFidSstCapacitacionPlanField().getIdSstCapacitacionPlanField() == 103) {
                	
                		GenericoDTO registro = new GenericoDTO();
                		registro.set_id(Integer.valueOf(sstCapacitacionPlanDataPdn.getResult()));
                		registro.setLabel(sstCapacitacionFieldsDao.getSstCapacitacionFieldsLabelBySubdomain(Integer.valueOf(sstCapacitacionPlanDataPdn.getResult())));
                		sstCapacitacionDTO.setEstadoCapacitacion(registro);
                	}
                	
                	if (sstCapacitacionPlanDataPdn.getFidSstCapacitacionPlanField().getIdSstCapacitacionPlanField() == 27) {
                		GenericoDTO registro = new GenericoDTO();
                		registro.set_id(Integer.valueOf(sstCapacitacionPlanDataPdn.getResult()));
                		registro.setLabel(sstCapacitacionFieldsDao.getSstCapacitacionFieldsLabelBySubdomain(Integer.valueOf(sstCapacitacionPlanDataPdn.getResult())));
                		sstCapacitacionDTO.setEficaciaCapacitacion(registro);
                	}
                	
                	
                	
                	sstCapacitacionDTO.setSubdomain(sstCapacitacionPlanDataPdn.getFidCoreSubdomain().getIdCoreSubdomain());
                	sstCapacitacionDTO.setId(Long.valueOf(sstCapacitacionPlanDataPdn.getIdSstCapacitacionPlanData().toString()));
                    
                	sstCapacitacionCertif.setId(Long.valueOf(sstCapacitacionPlanDataPdn.getIdSstCapacitacionPlanData().toString()));
                    sstCapacitacionCertif.setChecked(sstCapacitacionPlanDataPdn.getChecked());
                    sstCapacitacionCertif.setEnable(sstCapacitacionPlanDataPdn.getEnable());
                    sstCapacitacionCertif.setModified(sstCapacitacionPlanDataPdn.getModified());
                    sstCapacitacionCertif.setCreated(sstCapacitacionPlanDataPdn.getCreated());
                  
                    
                });
                sstCapacitacionDTO.setListaUsuarios(lista);
                sstCapacitacionCertif.setSstCapacitacion(JsonUtil.convertObjectToJson(sstCapacitacionDTO));
                sstCapacitacionDaoCertif.save(sstCapacitacionCertif);
                System.out.println("------Migrando-----" + sstCapacitacionCertif.getId() + "---------" + sstCapacitacionDTO.getSubdomain());
            });


        //});
        
        System.out.println("Migracion sstCapacitacion completada");

	}



	@Override
	public void migrateSstAmenazas() {
	//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
		

      //  coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstAmenazasDataPdn> sstAmenazasDataPdnList = sstAmenazasDao.getSstSstAmenazasDataBySubdomain(subd);
            sstAmenazasDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstAmenazasDataPdn::getModified)).forEach((date, sstAmenazasDataPdns) -> {

            	//List<IntegranteDTO> lista = Collections.synchronizedList(new ArrayList<IntegranteDTO>());    	
                SstAmenazasDTO sstAmenazasDTO = new SstAmenazasDTO();
                SstAmenazasCertif sstAmenazasCertif = new SstAmenazasCertif();
                List<String> arreglo = Collections.synchronizedList(new ArrayList<String>());
                List<RisksDTO> amenazasNaturales = Collections.synchronizedList(new ArrayList<RisksDTO>());
                List<RisksDTO> amenazasTecnologicas1 = Collections.synchronizedList(new ArrayList<RisksDTO>());
                List<RisksDTO> amenazasSociales = Collections.synchronizedList(new ArrayList<RisksDTO>());
                List<RisksDTO> amenazasTecnologicas2 = Collections.synchronizedList(new ArrayList<RisksDTO>());
                AmenazasDTO amenazas = new AmenazasDTO();
                
                sstAmenazasDataPdns.parallelStream().forEach(sstAmenazasDataPdn -> {


                	if (sstAmenazasDataPdn.getFidSstAmenazasField().getIdSstAmenazasField() == 48) {
                		if (Integer.valueOf(sstAmenazasDataPdn.getResult()) == 49) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(1);
                			registro.setLabel("selYes");
                			sstAmenazasDTO.setExisteBrigadaAmenazas(registro);
                		}
                		
                		if (Integer.valueOf(sstAmenazasDataPdn.getResult()) == 50) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(2);
                			registro.setLabel("selNo");
                			sstAmenazasDTO.setExisteBrigadaAmenazas(registro);
                		}
                		
                		if (Integer.valueOf(sstAmenazasDataPdn.getResult()) == 51) {
                			GenericoDTO registro = new GenericoDTO();
                			registro.set_id(3);
                			registro.setLabel("selNoSe");
                			sstAmenazasDTO.setExisteBrigadaAmenazas(registro);
                		}
                	}
                	
                	if (sstAmenazasDataPdn.getFidSstAmenazasField().getIdSstAmenazasField() == 53) {
                        if(sstAmenazasDataPdn.getResult() != null){
                            Optional<CoreRecurso> coreRecurso = coreRecursoDao.findById(Integer.valueOf(sstAmenazasDataPdn.getResult()));
                            if(coreRecurso.isPresent()){
                                String result = coreRecurso.get().getNombreArchivo();
                                arreglo.add(result);
                            }

                        }
                	}
     	
                	if (sstAmenazasDataPdn.getFidSstAmenazasField().getIdSstAmenazasField() == 6) {

                			RisksDTO riesgo = new RisksDTO();
                			riesgo.setId(Integer.valueOf(sstAmenazasDataPdn.getResult()));
                			riesgo.setLabel(sstAmenazasFieldsDao.getSstSstAmenazasFieldsLabelBySubdomain(Integer.valueOf(sstAmenazasDataPdn.getResult())));
                			riesgo.setOrder(sstAmenazasFieldsDao.getSstSstAmenazasFieldsOrderBySubdomain(Integer.valueOf(sstAmenazasDataPdn.getResult())));
                			riesgo.setParent(sstAmenazasFieldsDao.getSstSstAmenazasFieldsParentBySubdomain(Integer.valueOf(sstAmenazasDataPdn.getResult())));
                			amenazasNaturales.add(riesgo);
                		
                	}
                	
                	if (sstAmenazasDataPdn.getFidSstAmenazasField().getIdSstAmenazasField() == 17) {

                			RisksDTO riesgo = new RisksDTO();
                			riesgo.setId(Integer.valueOf(sstAmenazasDataPdn.getResult()));
                			riesgo.setLabel(sstAmenazasFieldsDao.getSstSstAmenazasFieldsLabelBySubdomain(Integer.valueOf(sstAmenazasDataPdn.getResult())));
                			riesgo.setOrder(sstAmenazasFieldsDao.getSstSstAmenazasFieldsOrderBySubdomain(Integer.valueOf(sstAmenazasDataPdn.getResult())));
                			riesgo.setParent(sstAmenazasFieldsDao.getSstSstAmenazasFieldsParentBySubdomain(Integer.valueOf(sstAmenazasDataPdn.getResult())));
                			amenazasTecnologicas1.add(riesgo);
                		
                	}
                	
                	if (sstAmenazasDataPdn.getFidSstAmenazasField().getIdSstAmenazasField() == 37) {

                			RisksDTO riesgo = new RisksDTO();
                			riesgo.setId(Integer.valueOf(sstAmenazasDataPdn.getResult()));
                			riesgo.setLabel(sstAmenazasFieldsDao.getSstSstAmenazasFieldsLabelBySubdomain(Integer.valueOf(sstAmenazasDataPdn.getResult())));
                			riesgo.setOrder(sstAmenazasFieldsDao.getSstSstAmenazasFieldsOrderBySubdomain(Integer.valueOf(sstAmenazasDataPdn.getResult())));
                			riesgo.setParent(sstAmenazasFieldsDao.getSstSstAmenazasFieldsParentBySubdomain(Integer.valueOf(sstAmenazasDataPdn.getResult())));
                			amenazasSociales.add(riesgo);
                		
                	}
                	
                	if (sstAmenazasDataPdn.getFidSstAmenazasField().getIdSstAmenazasField() == 47) {

                			RisksDTO riesgo = new RisksDTO();
                			riesgo.setId(Integer.valueOf(sstAmenazasDataPdn.getResult()));
                			riesgo.setLabel(sstAmenazasFieldsDao.getSstSstAmenazasFieldsLabelBySubdomain(Integer.valueOf(sstAmenazasDataPdn.getResult())));
                			riesgo.setOrder(sstAmenazasFieldsDao.getSstSstAmenazasFieldsOrderBySubdomain(Integer.valueOf(sstAmenazasDataPdn.getResult())));
                			riesgo.setParent(sstAmenazasFieldsDao.getSstSstAmenazasFieldsParentBySubdomain(Integer.valueOf(sstAmenazasDataPdn.getResult())));
                			amenazasTecnologicas2.add(riesgo);
                		
                	}
                	
                	sstAmenazasDTO.setSubdomain(sstAmenazasDataPdn.getFidCoreSubdomain().getIdCoreSubdomain());
                	sstAmenazasDTO.setId(Long.valueOf(sstAmenazasDataPdn.getIdSstAmenazasData().toString()));
                    
                	sstAmenazasCertif.setId(Long.valueOf(sstAmenazasDataPdn.getIdSstAmenazasData().toString()));
                    sstAmenazasCertif.setChecked(sstAmenazasDataPdn.getChecked());
                    sstAmenazasCertif.setEnable(sstAmenazasDataPdn.getEnable());
                    sstAmenazasCertif.setModified(sstAmenazasDataPdn.getModified());
                    sstAmenazasCertif.setCreated(sstAmenazasDataPdn.getCreated());
                  
                    
                });

                amenazas.setAmenazasNaturales(amenazasNaturales);
                amenazas.setAmenazasTecnologicas1(amenazasTecnologicas1);
                amenazas.setAmenazasSociales(amenazasSociales);
                amenazas.setAmenazasTecnologicas2(amenazasTecnologicas2);
                sstAmenazasDTO.setAmenazas(amenazas);
                sstAmenazasDTO.setUploadPlanEmergencia(arreglo);
                sstAmenazasCertif.setSstAmenazas(JsonUtil.convertObjectToJson(sstAmenazasDTO));
                sstAmenazasDaoCertif.save(sstAmenazasCertif);
                System.out.println("------Migrando-----" + sstAmenazasCertif.getId() + "---------" + sstAmenazasDTO.getSubdomain());
            });


        //});
        System.out.println("Migracion sstAmenzas completada");
		
	}



	@Override
	public void migrateSstComitesDataReunionVigia() {
		
	//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
		

//        coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstComitesDataPdn> sstComitesDataPdnList = sstComitesDao.getSstComitesDataBySubdomain(subd);
            sstComitesDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstComitesDataPdn::getModified)).forEach((date, sstComitesDataPdns) -> {

                SstComitedDataReunionVigiaDTO sstComitesDTO = new SstComitedDataReunionVigiaDTO();
                SstComitesCertif sstComitesCertif = new SstComitesCertif();

                sstComitesDataPdns.parallelStream().forEach(sstComitesDataPdn -> {

                	if(sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 65)
                		sstComitesDTO.setFechaReunionVigia(sstComitesDataPdn.getResult());
                	
                	if(sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 66)
                		sstComitesDTO.setOtrosUsuariosReunionVigia(sstComitesDataPdn.getResult());
                	
                	if(sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 67)
                		sstComitesDTO.setRevisionPlanTrabajoReuVigia(sstComitesDataPdn.getResult());
                	
                	if(sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 68)
                		sstComitesDTO.setRevisionProgramaCapacitReuVigia(sstComitesDataPdn.getResult());
                	
                	if(sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 69)
                		sstComitesDTO.setRevisionInspeccionReuVigia(sstComitesDataPdn.getResult());
                	
                	if(sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 70)
                		sstComitesDTO.setOtrosPuntosReuVigia(sstComitesDataPdn.getResult());
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 71)
                		sstComitesDTO.setFechaProxReunionVigia(sstComitesDataPdn.getResult());
                	
                	sstComitesDTO.setTipComite(sstComitesDataPdn.getFidSstComitesField().getFidSstComitesTipo().getIdSstComitesTipo());
                	
                	sstComitesDTO.setSubdomain(sstComitesDataPdn.getFidCoreSubdomain().getIdCoreSubdomain());
                	sstComitesDTO.setId(Long.valueOf(sstComitesDataPdn.getIdSstComitesData().toString()));
                    
                	sstComitesCertif.setId(Long.valueOf(sstComitesDataPdn.getIdSstComitesData().toString()));
                    sstComitesCertif.setChecked(sstComitesDataPdn.getChecked());
                    sstComitesCertif.setEnable(sstComitesDataPdn.getEnable());
                    sstComitesCertif.setModified(sstComitesDataPdn.getModified());
                    sstComitesCertif.setCreated(sstComitesDataPdn.getCreated());
                  
                    
                });


                sstComitesCertif.setComitesData(JsonUtil.convertObjectToJson(sstComitesDTO));
                sstComitesDaoCertif.save(sstComitesCertif);
                System.out.println("------Migrando-----" + sstComitesCertif.getId() + "---------" + sstComitesDTO.getSubdomain());
            });


        //});
        System.out.println("Migracion comites reunion vigia completada");
		
	}



	@Override
	public void migrateSstComitesDataDesignacionVigia() {
		
	//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
		

        //coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstComitesDataPdn> sstComitesDataPdnList = sstComitesDao.getSstComitesDataBySubdomain(subd);
            sstComitesDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstComitesDataPdn::getModified)).forEach((date, sstComitesDataPdns) -> {

                SstComitedDataDesignacionVigiaDTO sstComitesDTO = new SstComitedDataDesignacionVigiaDTO();
                SstComitesCertif sstComitesCertif = new SstComitesCertif();
                List<IntegranteDTO> lista = Collections.synchronizedList(new ArrayList<IntegranteDTO>());
                
                sstComitesDataPdns.parallelStream().forEach(sstComitesDataPdn -> {
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 61)
                		sstComitesDTO.setFechaActaDesignacionVigia(Date.valueOf(sstComitesDataPdn.getResult()));
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 62) {
                		IntegranteDTO user = new IntegranteDTO();
                		user.setId(Integer.valueOf(sstComitesDataPdn.getResult()));
                		user.setUser(coreUsuarioDao.getFirstNameCoreUsuarioByIdUser(Integer.valueOf(sstComitesDataPdn.getResult()
                				+ " " + coreUsuarioDao.getLastNameCoreUsuarioByIdUser(Integer.valueOf(sstComitesDataPdn.getResult())))));
                		lista.add(user);
                		
                	}
                		
                	
                	sstComitesDTO.setTipComite(sstComitesDataPdn.getFidSstComitesField().getFidSstComitesTipo().getIdSstComitesTipo());

                	
                	sstComitesDTO.setSubdomain(sstComitesDataPdn.getFidCoreSubdomain().getIdCoreSubdomain());
                	sstComitesDTO.setId(Long.valueOf(sstComitesDataPdn.getIdSstComitesData().toString()));
                    
                	sstComitesCertif.setId(Long.valueOf(sstComitesDataPdn.getIdSstComitesData().toString()));
                    sstComitesCertif.setChecked(sstComitesDataPdn.getChecked());
                    sstComitesCertif.setEnable(sstComitesDataPdn.getEnable());
                    sstComitesCertif.setModified(sstComitesDataPdn.getModified());
                    sstComitesCertif.setCreated(sstComitesDataPdn.getCreated());
                  
                    
                });

                sstComitesDTO.setListadoUsuarios_Vigia(lista);
                sstComitesCertif.setComitesData(JsonUtil.convertObjectToJson(sstComitesDTO));
                sstComitesDaoCertif.save(sstComitesCertif);
                System.out.println("------Migrando-----" + sstComitesCertif.getId() + "---------" + sstComitesDTO.getSubdomain());
            });


       // });
        System.out.println("Migracion comites designacion vigia completada");
	}



	@Override
	public void migrateSstComitesDataReunionCopasst() {
	//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
		

        //coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstComitesDataPdn> sstComitesDataPdnList = sstComitesDao.getSstComitesDataBySubdomain(subd);
            sstComitesDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstComitesDataPdn::getModified)).forEach((date, sstComitesDataPdns) -> {

                SstComitedDataReunionCopasstDTO sstComitesDTO = new SstComitedDataReunionCopasstDTO();
                SstComitesCertif sstComitesCertif = new SstComitesCertif();
                List<IntegranteDTO> lista = Collections.synchronizedList(new ArrayList<IntegranteDTO>());
                List<IntegranteDTO> lista1 = Collections.synchronizedList(new ArrayList<IntegranteDTO>()) ;
                ReunionDTO temas = new ReunionDTO();

                sstComitesDataPdns.parallelStream().forEach(sstComitesDataPdn -> {

                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 21)
                		sstComitesDTO.setPersonasOtrosReuCopasst(sstComitesDataPdn.getResult());
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 20) {
                		IntegranteDTO user = new IntegranteDTO();
                		user.setId(Integer.valueOf(sstComitesDataPdn.getResult()));
                		user.setUser(coreUsuarioDao.getFirstNameCoreUsuarioByIdUser(Integer.valueOf(sstComitesDataPdn.getResult()
                				+ " " + coreUsuarioDao.getLastNameCoreUsuarioByIdUser(Integer.valueOf(sstComitesDataPdn.getResult())))));
                		lista.add(user);
                	}
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 26)
                		sstComitesDTO.setHoraProxReunionCopasst(sstComitesDataPdn.getResult());
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 19)
                		sstComitesDTO.setHoraInicioReunionCopasst(sstComitesDataPdn.getResult());
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 24)
                		sstComitesDTO.setHoraFinReunionCopasst(sstComitesDataPdn.getResult());
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 18)
                		sstComitesDTO.setFechaReunion_Copasst(Date.valueOf(sstComitesDataPdn.getResult()));
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 25)
                		sstComitesDTO.setFechaProxReunionCopasst(Date.valueOf(sstComitesDataPdn.getResult()));
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 30) 
                		temas.setTemaTratado(sstComitesDataPdn.getResult());
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 31)
                		temas.setPlanAccion(sstComitesDataPdn.getResult());
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 32) {
                		IntegranteDTO user = new IntegranteDTO();
                		user.setId(Integer.valueOf(sstComitesDataPdn.getResult()));
                		user.setUser(coreUsuarioDao.getFirstNameCoreUsuarioByIdUser(Integer.valueOf(sstComitesDataPdn.getResult()
                				+ " " + coreUsuarioDao.getLastNameCoreUsuarioByIdUser(Integer.valueOf(sstComitesDataPdn.getResult())))));
                		lista1.add(user);
                	}
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 33) 
                		temas.setFechaEjecucion(Date.valueOf(sstComitesDataPdn.getResult()));
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 34)
                		temas.setObservacion(sstComitesDataPdn.getResult());
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 23)
                		sstComitesDTO.setObservacionesReuCopasst(sstComitesDataPdn.getResult());

                	sstComitesDTO.setTipComite(sstComitesDataPdn.getFidSstComitesField().getFidSstComitesTipo().getIdSstComitesTipo());

                	sstComitesDTO.setSubdomain(sstComitesDataPdn.getFidCoreSubdomain().getIdCoreSubdomain());
                	sstComitesDTO.setId(Long.valueOf(sstComitesDataPdn.getIdSstComitesData().toString()));
                    
                	sstComitesCertif.setId(Long.valueOf(sstComitesDataPdn.getIdSstComitesData().toString()));
                    sstComitesCertif.setChecked(sstComitesDataPdn.getChecked());
                    sstComitesCertif.setEnable(sstComitesDataPdn.getEnable());
                    sstComitesCertif.setModified(sstComitesDataPdn.getModified());
                    sstComitesCertif.setCreated(sstComitesDataPdn.getCreated());
                  
                    
                });

                temas.setListadoUsuarios_responsable(lista1);
                sstComitesDTO.setTemasTratados(temas);
                sstComitesDTO.setListadoUsuarios_ReuCopasst(lista);
                sstComitesCertif.setComitesData(JsonUtil.convertObjectToJson(sstComitesDTO));
                sstComitesDaoCertif.save(sstComitesCertif);
                System.out.println("------Migrando-----" + sstComitesCertif.getId() + "---------" + sstComitesDTO.getSubdomain());
            });


        //});
        System.out.println("Migracion comites reunion copasst completada");
		
	}



	@Override
	public void migrateSstComitesDataConformacionCopasst() {
		
	//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
		

        //coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstComitesDataPdn> sstComitesDataPdnList = sstComitesDao.getSstComitesDataBySubdomain(subd);
            sstComitesDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstComitesDataPdn::getModified)).forEach((date, sstComitesDataPdns) -> {

                SstComitedDataDesignacionCopasstDTO sstComitesDTO = new SstComitedDataDesignacionCopasstDTO();
                SstComitesCertif sstComitesCertif = new SstComitesCertif();
                List<IntegranteDTO> lista = Collections.synchronizedList(new ArrayList<IntegranteDTO>()) ;
                List<IntegranteDTO> lista1 = Collections.synchronizedList(new ArrayList<IntegranteDTO>()) ;

                sstComitesDataPdns.parallelStream().forEach(sstComitesDataPdn -> {

                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 6)
                		sstComitesDTO.setFechaActa_Copasst(Date.valueOf(sstComitesDataPdn.getResult()));
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 13) {
                		IntegranteDTO user = new IntegranteDTO();
                		user.setId(Integer.valueOf(sstComitesDataPdn.getResult()));
                		user.setUser(coreUsuarioDao.getFirstNameCoreUsuarioByIdUser(Integer.valueOf(sstComitesDataPdn.getResult()
                				+ " " + coreUsuarioDao.getLastNameCoreUsuarioByIdUser(Integer.valueOf(sstComitesDataPdn.getResult())))));
                		lista.add(user);
                	}
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 15) {
                		IntegranteDTO user = new IntegranteDTO();
                		user.setId(Integer.valueOf(sstComitesDataPdn.getResult()));
                		user.setUser(coreUsuarioDao.getFirstNameCoreUsuarioByIdUser(Integer.valueOf(sstComitesDataPdn.getResult()
                				+ " " + coreUsuarioDao.getLastNameCoreUsuarioByIdUser(Integer.valueOf(sstComitesDataPdn.getResult())))));
                		lista1.add(user);
                	}
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 9)
                		sstComitesDTO.setModalidadRepresentTrabajCopasst(Integer.valueOf(sstComitesDataPdn.getResult()));
                	
                	

                	sstComitesDTO.setTipComite(sstComitesDataPdn.getFidSstComitesField().getFidSstComitesTipo().getIdSstComitesTipo());
                	sstComitesDTO.setSubdomain(sstComitesDataPdn.getFidCoreSubdomain().getIdCoreSubdomain());
                	sstComitesDTO.setId(Long.valueOf(sstComitesDataPdn.getIdSstComitesData().toString()));
                    
                	sstComitesCertif.setId(Long.valueOf(sstComitesDataPdn.getIdSstComitesData().toString()));
                    sstComitesCertif.setChecked(sstComitesDataPdn.getChecked());
                    sstComitesCertif.setEnable(sstComitesDataPdn.getEnable());
                    sstComitesCertif.setModified(sstComitesDataPdn.getModified());
                    sstComitesCertif.setCreated(sstComitesDataPdn.getCreated());
                  
                    
                });

                sstComitesDTO.setListadoUsuarios_Emplea(lista1);
                sstComitesDTO.setListadoUsuarios_Trabaj(lista);
                sstComitesCertif.setComitesData(JsonUtil.convertObjectToJson(sstComitesDTO));
                sstComitesDaoCertif.save(sstComitesCertif);
                System.out.println("------Migrando-----" + sstComitesCertif.getId() + "---------" + sstComitesDTO.getSubdomain());
            });


       // });
        System.out.println("Migracion comites conformacion copasst completada");
	}



	@Override
	public void migrateSstComitesDataConformacionComiteConvivencia() {
		
	//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
		

        //coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstComitesDataPdn> sstComitesDataPdnList = sstComitesDao.getSstComitesDataBySubdomain(subd);
            sstComitesDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstComitesDataPdn::getModified)).forEach((date, sstComitesDataPdns) -> {

                SstComitedDataConformacionComiteConvivenciaDTO sstComitesDTO = new SstComitedDataConformacionComiteConvivenciaDTO();
                SstComitesCertif sstComitesCertif = new SstComitesCertif();
                List<IntegranteDTO> lista = Collections.synchronizedList(new ArrayList<IntegranteDTO>());
                List<IntegranteDTO> lista1 = Collections.synchronizedList(new ArrayList<IntegranteDTO>());

                sstComitesDataPdns.parallelStream().forEach(sstComitesDataPdn -> {

                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 37)
                		sstComitesDTO.setFechaActa_ConvivenciaM(sstComitesDataPdn.getResult());
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 39) {
                		IntegranteDTO user = new IntegranteDTO();
                		user.setId(Integer.valueOf(sstComitesDataPdn.getResult()));
                		user.setUser(
                				coreUsuarioDao.getFirstNameCoreUsuarioByIdUser(Integer.valueOf(sstComitesDataPdn.getResult()))
                				+ " " + coreUsuarioDao.getLastNameCoreUsuarioByIdUser(Integer.valueOf(sstComitesDataPdn.getResult()))
                				);
                		lista.add(user);
                	}
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 40)
                		sstComitesDTO.setModalidadRepresentTrabajConviv(Integer.valueOf(sstComitesDataPdn.getResult()));
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 46) {
                		IntegranteDTO user = new IntegranteDTO();
                		user.setId(Integer.valueOf(sstComitesDataPdn.getResult()));
                		user.setUser(
                				coreUsuarioDao.getFirstNameCoreUsuarioByIdUser(Integer.valueOf(sstComitesDataPdn.getResult()))
                				+ " "
                				+ coreUsuarioDao.getLastNameCoreUsuarioByIdUser(Integer.valueOf(sstComitesDataPdn.getResult()))
                				);
                		lista1.add(user);
                	}

                	sstComitesDTO.setTipComite(sstComitesDataPdn.getFidSstComitesField().getFidSstComitesTipo().getIdSstComitesTipo());
                	sstComitesDTO.setSubdomain(sstComitesDataPdn.getFidCoreSubdomain().getIdCoreSubdomain());
                	sstComitesDTO.setId(Long.valueOf(sstComitesDataPdn.getIdSstComitesData().toString()));
                    
                	sstComitesCertif.setId(Long.valueOf(sstComitesDataPdn.getIdSstComitesData().toString()));
                    sstComitesCertif.setChecked(sstComitesDataPdn.getChecked());
                    sstComitesCertif.setEnable(sstComitesDataPdn.getEnable());
                    sstComitesCertif.setModified(sstComitesDataPdn.getModified());
                    sstComitesCertif.setCreated(sstComitesDataPdn.getCreated());
                  
                    
                });
                sstComitesDTO.setListadoUsuarios_EmpleaConviv(lista1);
                sstComitesDTO.setListadoUsuarios_ConvivTrabaj(lista);
                sstComitesCertif.setComitesData(JsonUtil.convertObjectToJson(sstComitesDTO));
                sstComitesDaoCertif.save(sstComitesCertif);
                System.out.println("------Migrando-----" + sstComitesCertif.getId() + "---------" + sstComitesDTO.getSubdomain());
            });


        //});
        System.out.println("Migracion comites conformacion comite convivencia completada");
	}



	@Override
	public void migrateSstComitesDataReunionComiteConvivencia() {
	//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
		

        //coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstComitesDataPdn> sstComitesDataPdnList = sstComitesDao.getSstComitesDataBySubdomain(subd);
            sstComitesDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstComitesDataPdn::getModified)).forEach((date, sstComitesDataPdns) -> {

                SstComitedDataReunionComiteConvivenciaDTO sstComitesDTO = new SstComitedDataReunionComiteConvivenciaDTO();
                SstComitesCertif sstComitesCertif = new SstComitesCertif();
                Collection<IntegranteDTO> lista = Collections.synchronizedList(new ArrayList<IntegranteDTO>());
                ReunionConvivenciaDTO temas = new ReunionConvivenciaDTO();

                sstComitesDataPdns.parallelStream().forEach(sstComitesDataPdn -> {

                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 50)
                		sstComitesDTO.setFechaReunion_Convivencia(sstComitesDataPdn.getResult());
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 53)
                		sstComitesDTO.setFechaProxReunionConvivencia(sstComitesDataPdn.getResult());
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 54)
                		sstComitesDTO.setHoraProxReunionConvivencia(sstComitesDataPdn.getResult());
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 56) 
                		temas.setTemaTratadoConviv(sstComitesDataPdn.getResult());
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 57)
                		temas.setMedidasRecomendConviv(sstComitesDataPdn.getResult());
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 58) {
                		IntegranteDTO user = new IntegranteDTO();
                		user.setId(Integer.valueOf(sstComitesDataPdn.getResult()));
                		user.setUser(coreUsuarioDao.getFirstNameCoreUsuarioByIdUser(Integer.valueOf(sstComitesDataPdn.getResult()))
                				+ " " + coreUsuarioDao.getLastNameCoreUsuarioByIdUser(Integer.valueOf(sstComitesDataPdn.getResult()))
                				);
                		lista.add(user);
                	}
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 59)
                		temas.setFechaEjecucionConviv(sstComitesDataPdn.getResult());
                	
                	if (sstComitesDataPdn.getFidSstComitesField().getIdSstComitesField() == 60)
                		temas.setObservacionConviv(sstComitesDataPdn.getResult());

                	sstComitesDTO.setTipComite(sstComitesDataPdn.getFidSstComitesField().getFidSstComitesTipo().getIdSstComitesTipo());
                	sstComitesDTO.setSubdomain(sstComitesDataPdn.getFidCoreSubdomain().getIdCoreSubdomain());
                	sstComitesDTO.setId(Long.valueOf(sstComitesDataPdn.getIdSstComitesData().toString()));
                    
                	sstComitesCertif.setId(Long.valueOf(sstComitesDataPdn.getIdSstComitesData().toString()));
                    sstComitesCertif.setChecked(sstComitesDataPdn.getChecked());
                    sstComitesCertif.setEnable(sstComitesDataPdn.getEnable());
                    sstComitesCertif.setModified(sstComitesDataPdn.getModified());
                    sstComitesCertif.setCreated(sstComitesDataPdn.getCreated());
                  
                    
                });

                temas.setListadoUsuarios_responsableConviv(lista);
                sstComitesDTO.setTemasTratados(temas);
                sstComitesCertif.setComitesData(JsonUtil.convertObjectToJson(sstComitesDTO));
                sstComitesDaoCertif.save(sstComitesCertif);
                System.out.println("------Migrando-----" + sstComitesCertif.getId() + "---------" + sstComitesDTO.getSubdomain());
            });


        //});
        System.out.println("Migracion comites reunion comite convivencia completada");
		
	}



	@Override
	public void migrateSstComitesForm() {
		
		//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
		

        //coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstComitesFormPdn> sstComitesFormPdnList = sstComitesFormDao.getSstComitesFormBySubdomain(subd); 
            sstComitesFormPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstComitesFormPdn::getModified)).forEach((date, sstComitesFormPdns) -> {

                
                SstComitesFormCertif sstComitesFormCertif = new SstComitesFormCertif();

                
                sstComitesFormPdns.parallelStream().forEach(sstComitesFormPdn -> {

                	
                	sstComitesFormCertif.setFidSstComitesTipo(Integer.valueOf(sstComitesFormPdn.getFidSstComitesTipo().getIdSstComitesTipo()));
                	
                    sstComitesFormCertif.setIdSstComitesForm(Long.valueOf(sstComitesFormPdn.getIdSstComitesForm().toString())); 

                    sstComitesFormCertif.setChecked(sstComitesFormPdn.getChecked());
                    sstComitesFormCertif.setEnable(sstComitesFormPdn.getEnable());
                    sstComitesFormCertif.setModified(sstComitesFormPdn.getModified());
                    sstComitesFormCertif.setCreated(sstComitesFormPdn.getCreated());
                    
                    sstComitesFormCertif.setFidCoreSubdomain(sstComitesFormPdn.getFidCoreSubdomain().getIdCoreSubdomain());

                    
                });
                

                sstComitesFormDaoCertif.save(sstComitesFormCertif);
                System.out.println("------Migrando-----" + sstComitesFormCertif.getIdSstComitesForm() + "---------" + sstComitesFormCertif.getFidCoreSubdomain());
            });


        //});

        System.out.println("Migracion sstComitesForm completada");
	}



	@Override
	public void migrateSstSociodemo() {
		
		//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
		

        //coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstSociodemoDataPdn> sstSociodemoDataPdnList = sstSociodemoDataPdnDao.getSstSociodemoDataBySubdomain(subd); 
            sstSociodemoDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstSociodemoDataPdn::getModified)).forEach((date, sstSociodemoDataPdns) -> {

                SstSociodemoDTO sstSociodemoDTO = new SstSociodemoDTO();
                SstSociodemoCertif sstSociodemoCertif = new SstSociodemoCertif();
                List<SociodemoDTO> sociodemo = Collections.synchronizedList( new ArrayList<SociodemoDTO>());

                
                sstSociodemoDataPdns.parallelStream().forEach(sstSociodemoDataPdn -> {

                	
                	SociodemoDTO socio = new SociodemoDTO();
                	socio.setId(Long.valueOf(sstSociodemoDataPdn.getFidSstSociodemoForm().getFidUser().getIdUser()));
                	socio.setUser(coreUsuarioDao.getFirstNameCoreUsuarioByIdUser(sstSociodemoDataPdn.getFidSstSociodemoForm().getFidUser().getIdUser())
                			+" " +coreUsuarioDao.getLastNameCoreUsuarioByIdUser(sstSociodemoDataPdn.getFidSstSociodemoForm().getFidUser().getIdUser()));
                	if (sstSociodemoDataPdn.getFidSstSociodemoField().getIdSstSociodemoField() == 1) {
                		GenericoDTO registro = new GenericoDTO();
                		registro.set_id(Integer.valueOf(sstSociodemoDataPdn.getResult()));
                		registro.setLabel(sstSociodemoFieldsDao.getSstSociodemoFieldsLabelBySubdomain
                				(Integer.valueOf(sstSociodemoDataPdn.getResult())));
                		socio.setEstadoCivil(registro);
                	}
                	if (sstSociodemoDataPdn.getFidSstSociodemoField().getIdSstSociodemoField() == 2)
                		socio.setNroHijos(sstSociodemoDataPdn.getResult());
                	if (sstSociodemoDataPdn.getFidSstSociodemoField().getIdSstSociodemoField() == 3) {
                		GenericoDTO registro = new GenericoDTO();
                		registro.set_id(Integer.valueOf(sstSociodemoDataPdn.getResult()));
                		registro.setLabel(sstSociodemoFieldsDao.getSstSociodemoFieldsLabelBySubdomain
                				(Integer.valueOf(sstSociodemoDataPdn.getResult())));
                		socio.setSexo(registro);
                	}
                	if(sstSociodemoDataPdn.getFidSstSociodemoField().getIdSstSociodemoField() == 4)
                		socio.setEdad(sstSociodemoDataPdn.getResult());
                	if (sstSociodemoDataPdn.getFidSstSociodemoField().getIdSstSociodemoField() == 5) {
                		GenericoDTO registro = new GenericoDTO();
                		registro.set_id(Integer.valueOf(sstSociodemoDataPdn.getResult()));
                		registro.setLabel(sstSociodemoFieldsDao.getSstSociodemoFieldsLabelBySubdomain
                				(Integer.valueOf(sstSociodemoDataPdn.getResult())));
                		socio.setEscolaridadCumplida(registro);
                	}
                	if (sstSociodemoDataPdn.getFidSstSociodemoField().getIdSstSociodemoField() == 6) {
                		GenericoDTO registro = new GenericoDTO();
                		registro.set_id(Integer.valueOf(sstSociodemoDataPdn.getResult()));
                		registro.setLabel(sstSociodemoFieldsDao.getSstSociodemoFieldsLabelBySubdomain
                				(Integer.valueOf(sstSociodemoDataPdn.getResult())));
                		socio.setEstrato(registro);
                	}
                	if (sstSociodemoDataPdn.getFidSstSociodemoField().getIdSstSociodemoField() == 26)
                		socio.setAntiguedadEmpresa(sstSociodemoDataPdn.getResult());
                	
                	sociodemo.add(socio);
                	
                	sstSociodemoDTO.setSubdomain(sstSociodemoDataPdn.getFidCoreSubdomain().getIdCoreSubdomain());
                	sstSociodemoDTO.setId(Long.valueOf(sstSociodemoDataPdn.getIdSstSociodemoData().toString()));
                	
                    sstSociodemoCertif.setId(Long.valueOf(sstSociodemoDataPdn.getIdSstSociodemoData().toString())); 

                    sstSociodemoCertif.setChecked(sstSociodemoDataPdn.getChecked());
                    sstSociodemoCertif.setEnable(sstSociodemoDataPdn.getEnable());
                    sstSociodemoCertif.setModified(sstSociodemoDataPdn.getModified());
                    sstSociodemoCertif.setCreated(sstSociodemoDataPdn.getCreated());
                    
               
                    
                });
                sstSociodemoDTO.setUsers(sociodemo);
                sstSociodemoCertif.setSstSociodemo(JsonUtil.convertObjectToJson(sstSociodemoDTO));
                sstSociodemoDaoCertif.save(sstSociodemoCertif);
                System.out.println("------Migrando-----" + sstSociodemoCertif.getId() + "---------" + sstSociodemoDTO.getSubdomain());
            });


        //});

        System.out.println("Migracion sstSociodemo completada");
	}



	@Override
	public void migrateSstProveedores() {
		
		//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
		

        //coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstProveedoresDataPdn> sstProveedoresDataPdnList = sstProveedoresDataPdnDao.getSstProveedoresDataBySubdomain(subd); 
            sstProveedoresDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstProveedoresDataPdn::getModified)).forEach((date, sstProveedoresDataPdns) -> {

                
                SstProveedoresCertif sstProveedoresCertif = new SstProveedoresCertif();
                SstProvedoresDTO sstProveedoresDTO = new SstProvedoresDTO();
                List<String> proveedores = Collections.synchronizedList(new ArrayList<String>());
                
                sstProveedoresDataPdns.parallelStream().forEach(sstProveedoresDataPdn -> {

                	if (sstProveedoresDataPdn.getFidSstProveedoresField().getIdSstProveedoresField() == 2) {
                        if(sstProveedoresDataPdn.getResult() != null){
                            Optional<CoreRecurso> coreRecurso = coreRecursoDao.findById(Integer.valueOf(sstProveedoresDataPdn.getResult()));
                            if(coreRecurso.isPresent()){
                                String result = coreRecurso.get().getNombreArchivo();
                                proveedores.add(result);
                            }

                        }
                	}
                	
                	sstProveedoresDTO.setSubdomain(sstProveedoresDataPdn.getFidCoreSubdomain().getIdCoreSubdomain());
                	sstProveedoresDTO.setId(Long.valueOf(sstProveedoresDataPdn.getIdSstProveedoresData().toString()));
                	
                    sstProveedoresCertif.setId(Long.valueOf(sstProveedoresDataPdn.getIdSstProveedoresData().toString()));
                	

                    sstProveedoresCertif.setChecked(sstProveedoresDataPdn.getChecked());
                    sstProveedoresCertif.setEnable(sstProveedoresDataPdn.getEnable());
                    sstProveedoresCertif.setModified(sstProveedoresDataPdn.getModified());
                    sstProveedoresCertif.setCreated(sstProveedoresDataPdn.getCreated());
                    
                                     
                });
                sstProveedoresDTO.setProveedorFile(proveedores);

                sstProveedoresCertif.setSstProveedores(JsonUtil.convertObjectToJson(sstProveedoresDTO));
                
                sstProveedoresDaoCertif.save(sstProveedoresCertif);
                System.out.println("------Migrando-----" + sstProveedoresCertif.getId()  + "---------" + sstProveedoresDTO.getSubdomain());
            });


        //});

        System.out.println("Migracion sstProveedores completada");
		
	}



	@Override
	public void migrateCoreUsuario() {
		//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
		

        //coreSubdomainsList.forEach(coreSubdomains -> {
            List<CoreUsuario> coreUsuarioPdnList = coreUsuarioDao.getCoreUsuarioBySubdomain(subd); 
            coreUsuarioPdnList.
                    parallelStream().collect(Collectors.groupingBy(CoreUsuario::getModified)).forEach((date, coreUsuarioPdns) -> {

                
                CoreUsuarioCertif coreUsuarioCertif = new CoreUsuarioCertif();
                UsuariosDTO coreUsuarioDTO = new UsuariosDTO();
                SubdomainsDTO subdomain = new SubdomainsDTO();
                List<SubdomainsDTO> subdomains = Collections.synchronizedList(new ArrayList<SubdomainsDTO>());
                
                coreUsuarioPdns.parallelStream().forEach(coreUsuarioPdn -> {
                	
                	
                	coreUsuarioDTO.set_checked(coreUsuarioPdn.getChecked());
                	coreUsuarioDTO.set_created(coreUsuarioPdn.getCreated().toString());
                	coreUsuarioDTO.set_enable(coreUsuarioPdn.getEnable());
                	coreUsuarioDTO.set_id_user_create(coreUsuarioPdn.getIdUserCreate().toString());
                	coreUsuarioDTO.set_modified(coreUsuarioPdn.getModified().toString());
                	coreUsuarioDTO.set_tags(coreUsuarioPdn.getTags());
                	coreUsuarioDTO.set_user(coreUsuarioPdn.getUser().toString());
                	coreUsuarioDTO.set_version(coreUsuarioPdn.getVersion().toString());
                	coreUsuarioDTO.setArea_trabajo(coreUsuarioPdn.getAreaTrabajo());
                	coreUsuarioDTO.setCliente(coreUsuarioPdn.getCliente().toString());
                	coreUsuarioDTO.setColumn_id_user_create(coreUsuarioPdn.getColumnIdUserCreate().toString());
                	coreUsuarioDTO.setCreated_on(coreUsuarioPdn.getCreateOn().toString());
                	coreUsuarioDTO.setEmail(coreUsuarioPdn.getEmail());
                	coreUsuarioDTO.setFecha_ingreso(coreUsuarioPdn.getFechaIngreso().toString());
                	coreUsuarioDTO.setFecha_nacimiento(coreUsuarioPdn.getFechaNacimiento().toString());
                	coreUsuarioDTO.setFecha_retiro(coreUsuarioPdn.getFechaRetiro().toString());
                	coreUsuarioDTO.setFid_core_subdomains(coreUsuarioPdn.getFidCoreSubdomains());
                	coreUsuarioDTO.setFid_groupuser(coreUsuarioPdn.getFidGroupuser().getIdGroupuser());
                	coreUsuarioDTO.setFirst_name(coreUsuarioPdn.getFirstName());
                	coreUsuarioDTO.setId_user(coreUsuarioPdn.getIdUser().toString());
                	coreUsuarioDTO.setLast_login(coreUsuarioPdn.getLastLogin().toString());
                	coreUsuarioDTO.setLast_name(coreUsuarioPdn.getLastName());
                	coreUsuarioDTO.setNumero_cedula(coreUsuarioPdn.getNumeroCedula());
                	coreUsuarioDTO.setPassword(coreUsuarioPdn.getPassword());
                	coreUsuarioDTO.setPhone(coreUsuarioPdn.getPhone());
                	coreUsuarioDTO.setPhone_cell(coreUsuarioPdn.getPhoneCell());
                	coreUsuarioDTO.setSession_client_id(coreUsuarioPdn.getSessionClientId());
                	coreUsuarioDTO.setSession_id(coreUsuarioPdn.getSessionId());
                	coreUsuarioDTO.setTurno_trabajo(coreUsuarioPdn.getTurnoTrabajo());
                	coreUsuarioDTO.setUsername(coreUsuarioPdn.getUsername());
                	
                	subdomain.set_enable(coreUsuarioPdn.getEnable());
                	subdomain.setGral_nombre_dominio(coreSubdomainsDao.getNombreDominioBySubdomain(coreUsuarioPdn.getFidCoreSubdomains()));
                	subdomain.setId_core_subdomain(coreUsuarioPdn.getFidCoreSubdomains());
                	
                	
                    coreUsuarioCertif.setId(Long.valueOf(coreUsuarioPdn.getIdUser().toString()));
                	

                    coreUsuarioCertif.setChecked(coreUsuarioPdn.getChecked());
                    coreUsuarioCertif.setEnable(coreUsuarioPdn.getEnable());
                    coreUsuarioCertif.setModified(coreUsuarioPdn.getModified());
                    coreUsuarioCertif.setCreated(coreUsuarioPdn.getCreated());
                    
                                     
                });
                subdomains.add(subdomain);
                coreUsuarioDTO.setSubdomains(subdomains);
                
                coreUsuarioCertif.setPerson(JsonUtil.convertObjectToJson(coreUsuarioDTO));

                coreUsuarioDaoCertif.save(coreUsuarioCertif);
                System.out.println("------Migrando-----" + coreUsuarioCertif.getId()  + "---------" + coreUsuarioDTO.getFid_core_subdomains());
            });


        //});

        System.out.println("Esto lo tenía que hacer JPT");
		
		
	}



	@Override
	public void migrateCoreRecurso() {
		
		//List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
		
        
        //coreSubdomainsList.forEach(coreSubdomains -> {
            List<CoreRecurso> coreRecursoPdnList = coreRecursoDao.findAll(); 
            coreRecursoPdnList.
                    parallelStream().collect(Collectors.groupingBy(CoreRecurso::getModified)).forEach((date, coreRecursoPdns) -> {

                
                CoreRecursoCertif coreRecursoCertif = new CoreRecursoCertif();
                CoreRecursoDTO coreRecursoDTO = new CoreRecursoDTO();

                
                coreRecursoPdns.parallelStream().forEach(coreRecursoPdn -> {
                	
                	
                	
                	coreRecursoDTO.set_modified(Long.valueOf(coreRecursoPdn.getModified().getTime()));
                	coreRecursoDTO.setFid_tipo_recurso(coreRecursoPdn.getFidTipoRecurso().getIdTipoRecurso());
                	coreRecursoDTO.setId(Long.valueOf(coreRecursoPdn.getIdCoreRecurso()));
                	coreRecursoDTO.setNombre_archivo(coreRecursoPdn.getNombreArchivo());
                	coreRecursoDTO.setDestacado(coreRecursoPdn.getDestacado());
                	coreRecursoDTO.setTitle(coreRecursoPdn.getTitle());
                	
                    coreRecursoCertif.setId(Long.valueOf(coreRecursoPdn.getIdCoreRecurso()));
                	

                    coreRecursoCertif.setChecked(coreRecursoPdn.getChecked());
                    coreRecursoCertif.setEnable(coreRecursoPdn.getEnable());
                    coreRecursoCertif.setModified(coreRecursoPdn.getModified());
                    coreRecursoCertif.setCreated(coreRecursoPdn.getCreated());
                    
                                     
                });
                
                coreRecursoCertif.setRecurso(JsonUtil.convertObjectToJson(coreRecursoDTO));

                coreRecursoCertifDao.save(coreRecursoCertif);
                System.out.println("------Migrando-----" + coreRecursoCertif.getId()  + "---------" + coreRecursoDTO.getId());
            });


        //});

        System.out.println("Esto lo tenía que hacer JPT");
		
	}




}
