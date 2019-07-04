package co.cuidamos.migracion.ds.api.pdn.repository;
import co.cuidamos.migracion.ds.api.model.pdn.SstEmpresaGralFields;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SstEmpresaGralFieldsDao extends JpaRepository<SstEmpresaGralFields, Long> {
}
