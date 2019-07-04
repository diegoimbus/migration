package co.cuidamos.migracion.ds.api.certif.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.cuidamos.migracion.ds.api.model.certif.SstEmpresaEspecDataCertif;

@Repository
public interface SstEmpresaEspecDao extends JpaRepository<SstEmpresaEspecDataCertif, Long> {

}
