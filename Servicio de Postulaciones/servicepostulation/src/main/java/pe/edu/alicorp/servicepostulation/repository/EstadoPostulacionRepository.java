package pe.edu.alicorp.servicepostulation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.alicorp.servicepostulation.model.EstadoPostulacion;

import java.util.List;

@Repository
public interface EstadoPostulacionRepository extends JpaRepository<EstadoPostulacion, Long> {
    List<EstadoPostulacion> findByEstado(boolean estado);
}
