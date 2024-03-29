package co.cuidamos.migracion.ds.api.pdn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.cuidamos.migracion.ds.api.model.pdn.SstMatrizLegalFields;

@Repository
public interface SstMatrizLegalFieldsDao extends JpaRepository<SstMatrizLegalFields, Long>{

}
