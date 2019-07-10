package co.cuidamos.migracion.ds.api.pdn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import co.cuidamos.migracion.ds.api.model.pdn.SstEncuestasFields;

@Repository
public interface SstEncuestasFieldsDao extends JpaRepository<SstEncuestasFields, Long>{

    @Query(value = "SELECT parent FROM sst_encuestas_fields WHERE id_sst_encuestas_fields = :id", nativeQuery = true)
    public Integer getSstEncuestasFieldsParentBySubdomain(@Param("id") Integer id);
    
    @Query(value = "SELECT label FROM sst_encuestas_fields WHERE id_sst_encuestas_fields = :id", nativeQuery = true)
    public String getSstEncuestasFieldsLabelBySubdomain(@Param("id") Integer id);
    
    @Query(value = "SELECT _order FROM sst_encuestas_fields WHERE id_sst_encuestas_fields = :id", nativeQuery = true)
    public Integer getSstEncuestasFieldsOrderBySubdomain(@Param("id") Integer id);
}
