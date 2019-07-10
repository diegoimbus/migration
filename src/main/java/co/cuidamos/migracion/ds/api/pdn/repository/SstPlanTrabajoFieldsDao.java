package co.cuidamos.migracion.ds.api.pdn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.cuidamos.migracion.ds.api.model.pdn.SstPlanTrabajoFields;

@Repository
public interface SstPlanTrabajoFieldsDao extends JpaRepository<SstPlanTrabajoFields, Long>{
    @Query(value = "SELECT label FROM sst_plan_trabajo_fields WHERE id_sst_plan_trabajo_field = :id", nativeQuery = true)
    public String getSstPLanTrabajoFieldsLabelById(@Param("id") Integer id);
}
