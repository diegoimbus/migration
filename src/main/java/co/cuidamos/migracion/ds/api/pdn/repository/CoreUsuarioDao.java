package co.cuidamos.migracion.ds.api.pdn.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import co.cuidamos.migracion.ds.api.model.pdn.CoreUsuario;


@Repository
public interface CoreUsuarioDao  extends JpaRepository<CoreUsuario, Long>{
	
    @Query(value = "SELECT first_name FROM core_usuario WHERE id_user = :id", nativeQuery = true)
    public String getFirstNameCoreUsuarioByIdUser(@Param("id") Integer id);
    
    @Query(value = "SELECT last_name FROM core_usuario WHERE id_user = :id", nativeQuery = true)
    public String getLastNameCoreUsuarioByIdUser(@Param("id") Integer id);

}
