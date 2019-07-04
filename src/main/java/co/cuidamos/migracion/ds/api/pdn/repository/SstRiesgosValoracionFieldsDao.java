package co.cuidamos.migracion.ds.api.pdn.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.cuidamos.migracion.ds.api.model.pdn.SstRiesgosValoracionFields;

@Repository
public interface SstRiesgosValoracionFieldsDao  extends JpaRepository<SstRiesgosValoracionFields, Long>{
	
	@Query(value = "SELECT label FROM sst_riesgos_valoracion_fields WHERE id_sst_riesgos_valoracion_field = :id", nativeQuery = true)
    public String getSstRiesgosValoracionDataLabelById(@Param("id") Integer id);

}
