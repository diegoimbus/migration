package co.cuidamos.migracion.ds.api.pdn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.cuidamos.migracion.ds.api.model.pdn.SstAtelDataPdn;

@Repository
public interface SstAtelDataDao extends JpaRepository<SstAtelDataPdn, Long> {
	
    @Query(value = "SELECT * FROM sst_at_el_data WHERE fid_core_subdomain = :subdomain", nativeQuery = true)
    public List<SstAtelDataPdn> getSstAtelDataBySubdomain(@Param("subdomain") String subdomain);

}
