package co.cuidamos.migracion.ds.api.services;

import co.cuidamos.migracion.ds.api.pdn.repository.CoreSubdomainsDao;
import co.cuidamos.migracion.ds.api.pdn.repository.CoreUsuarioDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstAtelDataDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstAtelGestionPdnDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstControlesDataDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstEmpresaEspecDataDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstEmpresaEspecFieldsDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstEmpresaGralDataDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstEncuestasFormDataDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstEppDataDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstEppFieldsDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstObjetivosDataDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstPoliticaDataDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstResponsabDataDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstRiesgosTipoDataDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstRiesgosTipoFieldsDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstRiesgosValoracionDataDao;
import co.cuidamos.migracion.ds.api.pdn.repository.SstRiesgosValoracionFieldsDao;
import co.cuidamos.migracion.ds.api.dto.EppDTO;
import co.cuidamos.migracion.ds.api.dto.GenericoDTO;
import co.cuidamos.migracion.ds.api.dto.IntegranteDTO;
import co.cuidamos.migracion.ds.api.dto.RisksDTO;
import co.cuidamos.migracion.ds.api.dto.SstAtelDTO;
import co.cuidamos.migracion.ds.api.dto.SstAtelGestionDTO;
import co.cuidamos.migracion.ds.api.dto.SstControlesDTO;
import co.cuidamos.migracion.ds.api.dto.SstEmpresaEspecDTO;
import co.cuidamos.migracion.ds.api.dto.SstEmpresaGralDTO;
import co.cuidamos.migracion.ds.api.dto.SstEppDTO;
import co.cuidamos.migracion.ds.api.dto.SstObjetivosDTO;
import co.cuidamos.migracion.ds.api.dto.SstPoliticaDTO;
import co.cuidamos.migracion.ds.api.dto.SstResponsableDTO;
import co.cuidamos.migracion.ds.api.dto.SstRiesgosTipoDTO;
import co.cuidamos.migracion.ds.api.dto.SstRiesgosValoracionDTO;
import co.cuidamos.migracion.ds.api.util.JsonUtil;
import co.cuidamos.migracion.ds.api.pdn.repository.CoreRecursoDao;
import co.cuidamos.migracion.ds.api.model.pdn.CoreRecurso;
import co.cuidamos.migracion.ds.api.model.pdn.CoreSubdomains;
import co.cuidamos.migracion.ds.api.model.pdn.SstAtelDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstAtelGestionPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstControlesDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstEmpresaGralDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstEncuestasFormPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstEppDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstObjetivosDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstEmpresaEspecDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstPoliticaDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstResponsabDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstRiesgosTipoDataPdn;
import co.cuidamos.migracion.ds.api.model.pdn.SstRiesgosValoracionDataPdn;
import co.cuidamos.migracion.ds.api.model.certif.SstAtelCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstAtelGestionCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstControlesCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstEmpresaEspecDataCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstEmpresaGralDataCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstEncuestasFormCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstEppCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstObjetivosCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstPoliticaCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstResponsableCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstRiesgosTipoCertif;
import co.cuidamos.migracion.ds.api.model.certif.SstRiesgosValoracionCertif;
import co.cuidamos.migracion.ds.api.certif.repository.SstAtelDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstAtelGestionDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstControlesDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstEmpresaEspecDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstEmpresaGralDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstEncuestasFormDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstEppDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstObjetivosDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstPoliticaDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstResponsableDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstRiesgosTipoDao;
import co.cuidamos.migracion.ds.api.certif.repository.SstRiesgosValoracionDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MigrationServiceImpl implements MigrationService {

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
    
    
    @Override
    public void migrateSstEmpresaGral() {
        List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();

        
        coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstEmpresaGralDataPdn> sstEmpresaGralDataPdnList = sstEmpresaGralDao.getSstEmpresaGralDataBySubdomain(coreSubdomains.getIdCoreSubdomain());
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


        });
      
    }

    
 
	@Override
    public void migrateSstEmpresaEspec() {
    	List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
    	
    	coreSubdomainsList.forEach(coreSubdomains -> {
    		List<SstEmpresaEspecDataPdn> sstEmpresaEspecDataPdnList = sstEmpresaEspecDao.getSstEmpresaEspecDataBySubdomain(coreSubdomains.getIdCoreSubdomain());
    		sstEmpresaEspecDataPdnList.
    			parallelStream().collect(Collectors.groupingBy(SstEmpresaEspecDataPdn::getModified)).forEach((date, sstEmpresaEspecDataPdns) -> {
                    SstEmpresaEspecDTO sstEmpresaEspecDTO = new SstEmpresaEspecDTO();
                    SstEmpresaEspecDataCertif sstEmpresaEspecDataCertif = new SstEmpresaEspecDataCertif();
                    sstEmpresaEspecDataPdns.parallelStream().forEach(sstEmpresaEspecDataPdn -> {
                    	
                        if (sstEmpresaEspecDataPdn.getFidSstEmpresaEspecField().getIdSstEmpresaEspecField() == 2) {
                            sstEmpresaEspecDTO.setPersonaEncargadaSST(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()));
                        }
                    	
                        if (sstEmpresaEspecDataPdn.getFidSstEmpresaEspecField().getIdSstEmpresaEspecField() == 3) {
                            sstEmpresaEspecDTO.setCurso50horas(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()));
                  
                        }
                        
                        if (sstEmpresaEspecDataPdn.getFidSstEmpresaEspecField().getIdSstEmpresaEspecField() == 6) {
                            sstEmpresaEspecDTO.setFlotaDistribucion(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()));
                        }
                        
                        if (sstEmpresaEspecDataPdn.getFidSstEmpresaEspecField().getIdSstEmpresaEspecField() == 7) {
                            sstEmpresaEspecDTO.setPersonalContratista(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()));
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
                            sstEmpresaEspecDTO.setExisteSuministroAguaEtc(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()));
                        }
                        
                        if (sstEmpresaEspecDataPdn.getFidSstEmpresaEspecField().getIdSstEmpresaEspecField() == 90) {
                            sstEmpresaEspecDTO.setGarantizaResiduosElim(Integer.valueOf(sstEmpresaEspecDataPdn.getResult()));
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
    
    
    	});
    }
    
	@Override
	public void migrateSstPolitica() {
		List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
        coreSubdomainsList.forEach(coreSubdomains -> {
		
		List<SstPoliticaDataPdn> sstPoliticaDataPdnList = sstPoliticaDao.getSstPoliticaDataBySubdomain(coreSubdomains.getIdCoreSubdomain());
            
            sstPoliticaDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstPoliticaDataPdn::getModified)).forEach((date, sstPoliticaDataPdns) -> {
                SstPoliticaDTO sstPoliticaDTO = new SstPoliticaDTO();
                SstPoliticaCertif sstPoliticaCertif = new SstPoliticaCertif();
                
                sstPoliticaDataPdns.parallelStream().forEach(sstPoliticaDataPdn -> {

                    if (sstPoliticaDataPdn.getFidSstPoliticaField().getIdSstPoliticaField() == 1) {
                        sstPoliticaDTO.setDeAcuerdoPolitica(Integer.valueOf(sstPoliticaDataPdn.getResult()));  
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


       });
        
		
	}
	
	@Override
	public void migrateSstObjetivos() {
		List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
        
        coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstObjetivosDataPdn> sstObjetivosDataPdnList = sstObjetivosDao.getSstObjetivosDataBySubdomain(coreSubdomains.getIdCoreSubdomain());
            sstObjetivosDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstObjetivosDataPdn::getModified)).forEach((date, sstObjetivosDataPdns) -> {
                SstObjetivosDTO sstObjetivosDTO = new SstObjetivosDTO();
                SstObjetivosCertif sstObjetivosCertif = new SstObjetivosCertif();
                sstObjetivosDataPdns.parallelStream().forEach(sstObjetivosDataPdn -> {

                    if (sstObjetivosDataPdn.getFidSstObjetivosField().getIdSstObjetivosField() == 5) {
                        sstObjetivosDTO.setCrearOtrosObjetivos(sstObjetivosDataPdn.getResult());  
                    }
                                        
                    if (sstObjetivosDataPdn.getFidSstObjetivosField().getIdSstObjetivosField() == 7) {
                        sstObjetivosDTO.setDeAcuerdoObjetivos(Integer.valueOf(sstObjetivosDataPdn.getResult())); 
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


        });
        
		
	}
	
	@Override
	public void migrateSstReponsable() {
    	List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
    	
    	List<IntegranteDTO> integrantes = new ArrayList<IntegranteDTO>();
    	
    	coreSubdomainsList.forEach(coreSubdomains -> {
    		List<SstResponsabDataPdn> sstResponsableDataPdnList = sstResponsableDao.getSstResponsabDataBySubdomain(coreSubdomains.getIdCoreSubdomain());
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
            });
    
	}
	
	@Override
	public void migrateSstRiegosTipo() {
		List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
		List<RisksDTO> risks = new ArrayList<RisksDTO>();

        coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstRiesgosTipoDataPdn> sstRiesgosTipoDataPdnList = sstRiesgosTipoDao.getSstRiesgosTipoDataBySubdomain(coreSubdomains.getIdCoreSubdomain());
            sstRiesgosTipoDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstRiesgosTipoDataPdn::getModified)).forEach((date, sstRiesgosTipoDataPdns) -> {
                SstRiesgosTipoDTO sstRiesgosTipoDTO = new SstRiesgosTipoDTO();
                SstRiesgosTipoCertif sstRiesgosTipoCertif = new SstRiesgosTipoCertif();

                RisksDTO riegos = new RisksDTO();
                sstRiesgosTipoDataPdns.parallelStream().forEach(sstRiesgosTipoDataPdn -> {

                    sstRiesgosTipoDataPdn.getFidSstRiesgosTipoField().getIdSstRiesgosTipoField();
                    riegos.setId(sstRiesgosTipoDataPdn.getIdSstRiesgosTipoData());
                    riegos.setLabel(sstRiesgosFields.getSstRiesgosTipoDataLabelById(Integer.valueOf(sstRiesgosTipoDataPdn.getResult())));
                    riegos.setOrder(sstRiesgosFields.getSstRiesgosTipoDataOrderById(Integer.valueOf(sstRiesgosTipoDataPdn.getResult())));
                    riegos.setParent(sstRiesgosFields.getSstRiesgosTipoDataLabelById(sstRiesgosFields
                    		.getSstRiesgosTipoDataParentrById(Integer.valueOf(sstRiesgosTipoDataPdn.getResult()))));
                    risks.add(riegos);
                    

                    sstRiesgosTipoDTO.setSubdomain(sstRiesgosTipoDataPdn.getFidCoreSubdomain().getIdCoreSubdomain());
                    sstRiesgosTipoDTO.setId(Long.valueOf(sstRiesgosTipoDataPdn.getIdSstRiesgosTipoData()));
                    sstRiesgosTipoDTO.setQuantityFields(7);
                    sstRiesgosTipoCertif.setId(Long.valueOf(sstRiesgosTipoDataPdn.getIdSstRiesgosTipoData().toString()));

                    sstRiesgosTipoCertif.setChecked(sstRiesgosTipoDataPdn.getChecked());
                    sstRiesgosTipoCertif.setEnable(sstRiesgosTipoDataPdn.getEnable());
                    sstRiesgosTipoCertif.setModified(sstRiesgosTipoDataPdn.getModified());
                    sstRiesgosTipoCertif.setCreated(sstRiesgosTipoDataPdn.getCreated());
                });
                sstRiesgosTipoDTO.setRisks(risks);
                sstRiesgosTipoCertif.setSstRiesgosTipo(JsonUtil.convertObjectToJson(sstRiesgosTipoDTO));

                sstRiesgosTipoDaoCertif.save(sstRiesgosTipoCertif);
                System.out.println("------Migrando-----" + sstRiesgosTipoCertif.getId() + "---------" + sstRiesgosTipoDTO.getSubdomain());
            });


        });

		
	}
	
	
	public void migrateSstRiesgosValoracion() {
		List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
        coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstRiesgosValoracionDataPdn> sstRiesgosValoracionDataPdnList = sstRiesgosValoracionDao.getSstRiesgosValoracionDataBySubdomain(coreSubdomains.getIdCoreSubdomain());
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


        });
		
	}
	
	@Override
	public void migrateSstControles () {
		
		List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
    	
    	
    	coreSubdomainsList.forEach(coreSubdomains -> {
    		List<SstControlesDataPdn> sstControlesDataPdnList = sstControlesDao.getSstControlesDataBySubdomain(coreSubdomains.getIdCoreSubdomain());
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
            });

		
	}
	
	@Override
	public void migrateSstEncuestasForm() {
		
		List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
		

        coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstEncuestasFormPdn> sstEncuestasFormPdnList = sstEncuestasFormDao.getSstEncuestasFormBySubdomain(coreSubdomains.getIdCoreSubdomain());
            sstEncuestasFormPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstEncuestasFormPdn::getModified)).forEach((date, sstEncuestasFormPdns) -> {

                
                SstEncuestasFormCertif sstEncuestasFormCertif = new SstEncuestasFormCertif();

                
                sstEncuestasFormPdns.parallelStream().forEach(sstEncuestasFormPdn -> {

                	
                	
                    sstEncuestasFormCertif.setId(Long.valueOf(sstEncuestasFormPdn.getIdSstEncuestasForm().toString()));

                    sstEncuestasFormCertif.setChecked(sstEncuestasFormPdn.getChecked());
                    sstEncuestasFormCertif.setEnable(sstEncuestasFormPdn.getEnable());
                    sstEncuestasFormCertif.setModified(sstEncuestasFormPdn.getModified());
                    sstEncuestasFormCertif.setCreated(sstEncuestasFormPdn.getCreated());
                    
                    sstEncuestasFormCertif.setSubdomain(sstEncuestasFormPdn.getFidCoreSubdomain().getIdCoreSubdomain());
                    sstEncuestasFormCertif.setFidUser(sstEncuestasFormPdn.getFidUser().getIdUser());
                    sstEncuestasFormCertif.setFidSstEncuestasTipo(sstEncuestasFormPdn.getFidSstEncuestasTipo().getIdSstEncuestasTipo());
                    sstEncuestasFormCertif.setFidSstRecurso(sstEncuestasFormPdn.getFidRecurso().getIdCoreModuloRecurso());
                    
                });
                

                sstEncuestasFormDaoCertif.save(sstEncuestasFormCertif);
                System.out.println("------Migrando-----" + sstEncuestasFormCertif.getId() + "---------");
            });


        });


		
	}
	
	@Override
	public void migrateSstEncuestas() {
		
	}
	
	@Override
	public void migrateSstInstructivos() {
		
	}
	
	@Override
	public void migrateSstSaludTrabajador() {
		
	}
	
	@Override
	public void migrateSstEpp() {
		List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
		
       
        coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstEppDataPdn> sstEppDataPdnList = sstEppDao.getSstEppDataBySubdomain(coreSubdomains.getIdCoreSubdomain());
            sstEppDataPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstEppDataPdn::getModified)).forEach((date, sstEppDataPdns) -> {
                SstEppDTO sstEppDTO = new SstEppDTO();
                EppDTO eppDTO = new EppDTO();
                SstEppCertif sstEppCertif = new SstEppCertif();
                List<RisksDTO> protectoresCabeza = new ArrayList<RisksDTO>();
                List<RisksDTO> protectoresOidos = new ArrayList<RisksDTO>();
                List<RisksDTO> protectoresOjosCara = new ArrayList<RisksDTO>();
                List<RisksDTO> protectoresViasResp = new ArrayList<RisksDTO>();
                List<RisksDTO> protectoresManosBrazos = new ArrayList<RisksDTO>();
                List<RisksDTO> protectoresPiesPiernas = new ArrayList<RisksDTO>();
                List<RisksDTO> protectoresPiel = new ArrayList<RisksDTO>();
                List<RisksDTO> protectoresCuerpo = new ArrayList<RisksDTO>();
                List<RisksDTO> protectoresAltura = new ArrayList<RisksDTO>();
                List<RisksDTO> protectoresOtros = new ArrayList<RisksDTO>();
                
                sstEppDataPdns.parallelStream().forEach(sstEppDataPdn -> {

                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 4){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresCabeza.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 6){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresOidos.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 7){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresOidos.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 9){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresOjosCara.add(epp);
                	}
                    
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 10){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresOjosCara.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 11){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresOjosCara.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 12){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresOjosCara.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 13){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresOjosCara.add(epp);
                	}
                    
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 15){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresViasResp.add(epp);
                	}
                    
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 16){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresViasResp.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 17){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresViasResp.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 18){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresViasResp.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 20){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresManosBrazos.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 22){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresPiesPiernas.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 24){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresPiel.add(epp);
                	}
                    
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 26){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresCuerpo.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 27){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresCuerpo.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 28){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresCuerpo.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 29){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresCuerpo.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 30){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresCuerpo.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 31){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresCuerpo.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 33){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresAltura.add(epp);
                	}
                
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 35){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresOtros.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 36){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresOtros.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 37){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresOtros.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 38){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresOtros.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 39){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresOtros.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 40){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresOtros.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 41){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresOtros.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 42){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresOtros.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 43){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresOtros.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 44){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresOtros.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 45){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresOtros.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 46){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresOtros.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 47){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresOtros.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 48){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresOtros.add(epp);
                	}
                	
                	if (Integer.valueOf(sstEppDataPdn.getResult()) == 49){
                		RisksDTO epp = new RisksDTO();
                		epp.setId(Integer.valueOf(sstEppDataPdn.getResult()));
                		epp.setLabel(sstEppFieldsDao.getSstFieldsLabelById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setOrder(sstEppFieldsDao.getSstFieldsOrderById(Integer.valueOf(sstEppDataPdn.getResult())));
                		epp.setParent(sstEppFieldsDao.getSstFieldsParentById(Integer.valueOf(sstEppDataPdn.getResult())));
                		protectoresOtros.add(epp);
                	}

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


        });
        
	}
	
	@Override
	public void migrateSstAtel() {
		List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();

        coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstAtelDataPdn> sstAtelDataPdnList = sstAtelDao.getSstAtelDataBySubdomain(coreSubdomains.getIdCoreSubdomain());
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


        });

		
		
	}
	
	@Override
	public void migrateSstAtelGestion() {
	List<CoreSubdomains> coreSubdomainsList = coreSubdomainsDao.findAll();
		

        coreSubdomainsList.forEach(coreSubdomains -> {
            List<SstAtelGestionPdn> sstAtelGestionPdnList = sstAtelGestionDao.getSstAtelGestionBySubdomain(coreSubdomains.getIdCoreSubdomain());
            sstAtelGestionPdnList.
                    parallelStream().collect(Collectors.groupingBy(SstAtelGestionPdn::getModified)).forEach((date, sstAtelGestionPdns) -> {
                SstAtelGestionDTO sstAtelGestionDTO = new SstAtelGestionDTO();
                SstAtelGestionCertif sstAtelGestionCertif = new SstAtelGestionCertif();

                
                sstAtelGestionPdns.parallelStream().forEach(sstAtelGestionPdn -> {

                	
                	
                    sstAtelGestionCertif.setId(Long.valueOf(sstAtelGestionPdn.getIdSstAtElGestion().toString()));

                    sstAtelGestionCertif.setChecked(sstAtelGestionPdn.getChecked());
                    sstAtelGestionCertif.setEnable(sstAtelGestionPdn.getEnable());
                    sstAtelGestionCertif.setModified(sstAtelGestionPdn.getModified());
                    sstAtelGestionCertif.setCreated(sstAtelGestionPdn.getCreated());
                    
                    
                    
                });
                
                sstAtelGestionCertif.setAtelGestion(JsonUtil.convertObjectToJson(sstAtelGestionDTO));
                
                sstAtelGestionDaoCertif.save(sstAtelGestionCertif);
                System.out.println("------Migrando-----" + sstAtelGestionCertif.getId() + "---------");
            });


        });
        
		
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




}
