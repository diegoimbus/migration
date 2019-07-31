package co.cuidamos.migracion.ds.api.pdn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import co.cuidamos.migracion.ds.api.model.pdn.SstMatrizLegalDataPdn;

@Repository
public interface SstMatrizLegalDataPdnDao extends JpaRepository<SstMatrizLegalDataPdn, Long> {
	
    @Query(value = "SELECT * FROM sst_matriz_legal_data WHERE fid_core_subdomain = :subdomain and _checked = TRUE and _enable = TRUE", nativeQuery = true)
    public List<SstMatrizLegalDataPdn> getSstMatrizLegalDataBySubdomain(@Param("subdomain") String subdomain);
	

}
