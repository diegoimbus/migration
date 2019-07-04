package co.cuidamos.migracion.ds.api.pdn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.cuidamos.migracion.ds.api.model.pdn.SstAtelGestionPdn;

@Repository
public interface SstAtelGestionPdnDao extends JpaRepository<SstAtelGestionPdn, Long> {

    @Query(value = "SELECT * FROM sst_at_el_gestion WHERE fid_core_subdomain = :subdomain", nativeQuery = true)
    public List<SstAtelGestionPdn> getSstAtelGestionBySubdomain(@Param("subdomain") String subdomain);
}
