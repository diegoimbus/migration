package co.cuidamos.migracion.ds.api.pdn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.cuidamos.migracion.ds.api.model.pdn.SstEppFields;

@Repository
public interface SstEppFieldsDao extends JpaRepository<SstEppFields, Long> {

    @Query(value = "SELECT label FROM sst_epp_fields WHERE id_sst_epp_field = :id", nativeQuery = true)
    public String getSstFieldsLabelById(@Param("id") Integer id);
    
    @Query(value = "SELECT _order FROM sst_epp_fields WHERE id_sst_epp_field = :id", nativeQuery = true)
    public Integer getSstFieldsOrderById(@Param("id") Integer id);
    
    @Query(value = "SELECT parent FROM sst_epp_fields WHERE id_sst_epp_field = :id", nativeQuery = true)
    public String getSstFieldsParentById(@Param("id") Integer id);
}
