package pe.edu.alicorp.servicepostulation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.alicorp.servicepostulation.model.Postulacion;

@Repository
public interface PostulacionRepository extends JpaRepository<Postulacion, Long> {
}
