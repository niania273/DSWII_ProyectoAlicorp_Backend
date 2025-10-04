package pe.edu.alicorp.servicecatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.alicorp.servicecatalog.model.Marca;

@Repository
public interface MarcaRepository extends JpaRepository<Marca, Long> {
}