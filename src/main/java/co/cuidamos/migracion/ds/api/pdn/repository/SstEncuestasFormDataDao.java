package co.cuidamos.migracion.ds.api.pdn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.cuidamos.migracion.ds.api.model.pdn.SstEncuestasFormPdn;

@Repository
public interface SstEncuestasFormDataDao extends JpaRepository<SstEncuestasFormPdn, Long> {

    @Query(value = "SELECT * FROM sst_encuestas_form WHERE fid_core_subdomain = :subdomain", nativeQuery = true)
    public List<SstEncuestasFormPdn> getSstEncuestasFormBySubdomain(@Param("subdomain") String subdomain);
}
