package co.cuidamos.migracion.ds.api.certif.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.cuidamos.migracion.ds.api.model.certif.SstEppCertif;

@Repository
public interface SstEppDao extends JpaRepository<SstEppCertif, Long> {
	

}
