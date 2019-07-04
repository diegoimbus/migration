package co.cuidamos.migracion.ds.api.pdn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.cuidamos.migracion.ds.api.model.pdn.SstPoliticaFields;

@Repository
public interface SstPoliticaFIeldsDao extends JpaRepository<SstPoliticaFields, Long> {

}
