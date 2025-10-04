package pe.edu.alicorp.servicecatalog.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.alicorp.servicecatalog.model.Marca;
import pe.edu.alicorp.servicecatalog.repository.MarcaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MarcaService {

    private final MarcaRepository marcaRepository;

    public List<Marca> obtenerMarcas() {
        return marcaRepository.findAll();
    }

    public Marca guardarMarca(Marca marca) {
        marca.setFechacreacion(LocalDateTime.now());
        marca.setFechaactualiza(LocalDateTime.now());
        marca.setEstmarca(true);
        return marcaRepository.save(marca);
    }

    public Marca buscarMarcaPorId(Long id) {
        return marcaRepository.findById(id).orElse(null);
    }

    public Marca actualizarMarca(Long id, Marca marca) {
        Optional<Marca> marcaExistente = marcaRepository.findById(id);
        return marcaExistente.map(m -> {
            m.actualizarMarca(marca);
            m.setFechaactualiza(LocalDateTime.now());
            return marcaRepository.save(m);
        }).orElse(null);
    }

    public boolean deshabilitarMarca(Long id) {
        return marcaRepository.findById(id).map(m -> {
            m.setEstmarca(false);
            m.setFechaactualiza(LocalDateTime.now());
            marcaRepository.save(m);
            return true;
        }).orElse(false);
    }
}