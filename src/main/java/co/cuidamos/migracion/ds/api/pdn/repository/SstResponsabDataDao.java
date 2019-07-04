package co.cuidamos.migracion.ds.api.pdn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.cuidamos.migracion.ds.api.model.pdn.SstResponsabDataPdn;

@Repository
public interface SstResponsabDataDao extends JpaRepository<SstResponsabDataPdn, Long>{

    @Query(value = "SELECT * FROM sst_responsab_data WHERE fid_core_subdomain = :subdomain", nativeQuery = true)
    public List<SstResponsabDataPdn> getSstResponsabDataBySubdomain(@Param("subdomain") String subdomain);
}
