package co.cuidamos.migracion.ds.api.certif.repository;

import co.cuidamos.migracion.ds.api.model.certif.SstEmpresaGralDataCertif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SstEmpresaGralDao extends JpaRepository<SstEmpresaGralDataCertif, Long> {


}
