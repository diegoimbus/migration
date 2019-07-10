package co.cuidamos.migracion.ds.api.pdn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.cuidamos.migracion.ds.api.model.pdn.SstPlanTrabajoDataPdn;


@Repository
public interface SstPlanTrabajoDataPdnDao extends JpaRepository<SstPlanTrabajoDataPdn, Long> {
    @Query(value = "SELECT * FROM sst_plan_trabajo_data WHERE fid_core_subdomain = :subdomain", nativeQuery = true)
    public List<SstPlanTrabajoDataPdn> getSstPLanTrabajoDataBySubdomain(@Param("subdomain") String subdomain);
}
