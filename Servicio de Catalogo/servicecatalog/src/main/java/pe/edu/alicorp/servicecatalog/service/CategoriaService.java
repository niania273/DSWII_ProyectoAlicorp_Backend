package pe.edu.alicorp.servicecatalog.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.alicorp.servicecatalog.model.Categoria;
import pe.edu.alicorp.servicecatalog.repository.CategoriaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public List<Categoria> obtenerCategorias() {
        return categoriaRepository.findAll();
    }

    public Categoria guardarCategoria(Categoria categoria) {
        categoria.setFechacreacion(LocalDateTime.now());
        categoria.setFechaactualiza(LocalDateTime.now());
        categoria.setEstcategoria(true);
        return categoriaRepository.save(categoria);
    }

    public Categoria buscarCategoriaPorId(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    public Categoria actualizarCategoria(Long id, Categoria categoria) {
        Optional<Categoria> categoriaExistente = categoriaRepository.findById(id);
        return categoriaExistente.map(c -> {
            c.actualizarCategoria(categoria);
            c.setFechaactualiza(LocalDateTime.now());
            return categoriaRepository.save(c);
        }).orElse(null);
    }

    public boolean deshabilitarCategoria(Long id) {
        return categoriaRepository.findById(id).map(c -> {
            c.setEstcategoria(false);
            c.setFechaactualiza(LocalDateTime.now());
            categoriaRepository.save(c);
            return true;
        }).orElse(false);
    }
}