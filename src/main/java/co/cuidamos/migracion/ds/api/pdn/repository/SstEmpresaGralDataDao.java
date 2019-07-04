package co.cuidamos.migracion.ds.api.pdn.repository;


import co.cuidamos.migracion.ds.api.model.pdn.SstEmpresaGralDataPdn;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SstEmpresaGralDataDao extends JpaRepository<SstEmpresaGralDataPdn, Long> {

    @Query(value = "SELECT * FROM sst_empresa_gral_data WHERE fid_core_subdomain = :subdomain", nativeQuery = true)
    public List<SstEmpresaGralDataPdn> getSstEmpresaGralDataBySubdomain(@Param("subdomain") String subdomain);

}
