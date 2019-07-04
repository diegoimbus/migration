package co.cuidamos.migracion.ds.api.pdn.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import co.cuidamos.migracion.ds.api.model.pdn.SstEmpresaEspecFields;

@Repository
public interface SstEmpresaEspecFieldsDao extends JpaRepository<SstEmpresaEspecFields, Long> {
	
    @Query(value = "SELECT label FROM sst_empresa_espec_fields WHERE id_sst_empresa_espec_field = :idLabel", nativeQuery = true)
    public String getSstLabelEmpresaEspecFields(@Param("idLabel") Integer idLabel);
}
