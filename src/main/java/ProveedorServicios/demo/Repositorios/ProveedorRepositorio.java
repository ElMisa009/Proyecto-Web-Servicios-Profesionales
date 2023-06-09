
package ProveedorServicios.demo.Repositorios;

import ProveedorServicios.demo.Entidades.Proveedor;
import ProveedorServicios.demo.Enums.Profesion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface ProveedorRepositorio extends JpaRepository<Proveedor, String>{
    
    @Query("SELECT p FROM Proveedor p WHERE p.email = :email")
    Proveedor buscarPorEmail(@Param("email")String email);
    
    @Query("SELECT p FROM Proveedor p WHERE p.profesion = :profesion")
    public List<Proveedor> buscarPorProfesion(@Param("profesion")String profesion);

    @Query("SELECT p FROM Proveedor p WHERE p.nombre = :nombre")
    public Proveedor buscarPorNombre(@Param("nombre")String nombre);
    
    @Query("SELECT p FROM Proveedor p WHERE p.cuit = :cuit")
    public Proveedor buscarPorCuit(@Param("cuit")String cuit);
    
    @Query("SELECT p FROM Proveedor p WHERE p.id = :id")
    public Proveedor buscarPorId(@Param("id")String id);
}
