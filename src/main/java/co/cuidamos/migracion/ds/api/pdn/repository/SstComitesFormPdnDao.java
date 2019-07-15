package co.cuidamos.migracion.ds.api.pdn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import co.cuidamos.migracion.ds.api.model.pdn.SstComitesFormPdn;

@Repository
public interface SstComitesFormPdnDao extends JpaRepository<SstComitesFormPdn, Long> {
	
    @Query(value = "SELECT * FROM sst_comites_form WHERE fid_core_subdomain = :subdomain", nativeQuery = true)
    public List<SstComitesFormPdn> getSstComitesFormBySubdomain(@Param("subdomain") String subdomain);

}
