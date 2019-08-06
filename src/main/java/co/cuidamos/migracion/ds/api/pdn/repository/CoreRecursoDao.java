package co.cuidamos.migracion.ds.api.pdn.repository;

import co.cuidamos.migracion.ds.api.model.pdn.CoreRecurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CoreRecursoDao extends JpaRepository<CoreRecurso, Integer> {

    
}
