package co.cuidamos.migracion.ds.api.pdn.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.cuidamos.migracion.ds.api.model.pdn.SstSociodemoFields;

@Repository
public interface SstSociodemoFieldsDao extends JpaRepository<SstSociodemoFields, Long> {
	
    @Query(value = "SELECT label FROM sst_sociodemo_fields WHERE id_sst_sociodemo_field = :id", nativeQuery = true)
    public String getSstSociodemoFieldsLabelBySubdomain(@Param("id") Integer id);
    
}
