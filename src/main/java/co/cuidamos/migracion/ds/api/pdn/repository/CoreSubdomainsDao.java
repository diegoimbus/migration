package co.cuidamos.migracion.ds.api.pdn.repository;

import co.cuidamos.migracion.ds.api.model.pdn.CoreSubdomains;
//import co.cuidamos.migracion.ds.api.model.pdn.SstEmpresaEspecDataPdn;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CoreSubdomainsDao extends JpaRepository<CoreSubdomains, Long> {
	
    @Query(value = "SELECT * FROM core_subdomains WHERE id_core_subdomain = :subdomain", nativeQuery = true)
    public String getSubdomainBySubdomain(@Param("subdomain") String subdomain);
}
