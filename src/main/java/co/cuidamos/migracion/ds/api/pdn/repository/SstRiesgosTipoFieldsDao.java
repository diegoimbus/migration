package co.cuidamos.migracion.ds.api.pdn.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import co.cuidamos.migracion.ds.api.model.pdn.SstRiesgosTipoFields;

@Repository
public interface SstRiesgosTipoFieldsDao extends JpaRepository<SstRiesgosTipoFields, Long> {

    @Query(value = "SELECT label FROM sst_riesgos_tipo_fields WHERE id_sst_riesgos_tipo_field = :id", nativeQuery = true)
    public String getSstRiesgosTipoDataLabelById(@Param("id") Integer id);
    
    @Query(value = "SELECT _order FROM sst_riesgos_tipo_fields WHERE id_sst_riesgos_tipo_field = :id", nativeQuery = true)
    public Integer getSstRiesgosTipoDataOrderById(@Param("id") Integer id);
    
    @Query(value = "SELECT parent FROM sst_riesgos_tipo_fields WHERE id_sst_riesgos_tipo_field = :id", nativeQuery = true)
    public Integer getSstRiesgosTipoDataParentrById(@Param("id") Integer id);
}
