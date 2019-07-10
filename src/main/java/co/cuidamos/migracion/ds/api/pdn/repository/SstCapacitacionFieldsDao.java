package co.cuidamos.migracion.ds.api.pdn.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import co.cuidamos.migracion.ds.api.model.pdn.SstCapacitacionFields;

@Repository
public interface SstCapacitacionFieldsDao extends JpaRepository<SstCapacitacionFields, Long>{
    @Query(value = "SELECT label FROM sst_capacitacion_plan_fields WHERE id_sst_capacitacion_plan_field = :id", nativeQuery = true)
    public String getSstCapacitacionFieldsLabelBySubdomain(@Param("id") Integer id);
}
