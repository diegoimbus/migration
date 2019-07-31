package co.cuidamos.migracion.ds.api.pdn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import co.cuidamos.migracion.ds.api.model.pdn.SstEmpresaEspecDataPdn;


public interface SstEmpresaEspecDataDao extends JpaRepository<SstEmpresaEspecDataPdn, Long> {

    @Query(value = "SELECT * FROM sst_empresa_espec_data WHERE fid_core_subdomain = :subdomain and _enable = TRUE and _checked = TRUE", nativeQuery = true)
    public List<SstEmpresaEspecDataPdn> getSstEmpresaEspecDataBySubdomain(@Param("subdomain") String subdomain);
}
