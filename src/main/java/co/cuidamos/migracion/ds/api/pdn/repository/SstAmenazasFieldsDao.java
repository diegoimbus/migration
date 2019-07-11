package co.cuidamos.migracion.ds.api.pdn.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.cuidamos.migracion.ds.api.model.pdn.SstAmenazasFields;

@Repository
public interface SstAmenazasFieldsDao extends JpaRepository<SstAmenazasFields, Long>{
	
    @Query(value = "SELECT label FROM sst_amenazas_fields WHERE fid_core_subdomain = :id", nativeQuery = true)
    public String getSstSstAmenazasFieldsLabelBySubdomain(@Param("id") Integer id);
    
    @Query(value = "SELECT order FROM sst_amenazas_fields WHERE fid_core_subdomain = :id", nativeQuery = true)
    public Integer getSstSstAmenazasFieldsOrderBySubdomain(@Param("id") Integer id);
    
    @Query(value = "SELECT parent FROM sst_amenazas_fields WHERE fid_core_subdomain = :id", nativeQuery = true)
    public String getSstSstAmenazasFieldsParentBySubdomain(@Param("id") Integer id);

}
