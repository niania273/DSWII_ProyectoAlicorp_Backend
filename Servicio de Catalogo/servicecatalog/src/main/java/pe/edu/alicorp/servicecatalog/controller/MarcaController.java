package pe.edu.alicorp.servicecatalog.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.alicorp.servicecatalog.model.Marca;
import pe.edu.alicorp.servicecatalog.service.MarcaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/marcas")
@RequiredArgsConstructor
public class MarcaController {

    private final MarcaService marcaService;

    // Listar todas las marcas
    @GetMapping("/listarMarcas")
    public ResponseEntity<List<Marca>> obtenerMarcas() {
        return ResponseEntity.of(Optional.ofNullable(marcaService.obtenerMarcas()));
    }

    // Guardar marca nueva
    @PostMapping("/agregarMarca")
    public ResponseEntity<Marca> guardarMarca(@RequestBody Marca marca) {
        return ResponseEntity.ok(marcaService.guardarMarca(marca));
    }

    // Obtener una marca por su Id
    @GetMapping("/obtenerMarca/{id}")
    public ResponseEntity<Marca> buscarMarcaPorId(@PathVariable Long id) {
        Marca marca = marcaService.buscarMarcaPorId(id);
        return (marca != null) ? ResponseEntity.ok(marca) : ResponseEntity.notFound().build();
    }

    // Actualizar una marca por su Id
    @PutMapping("/actualizarMarca/{id}")
    public ResponseEntity<Marca> actualizarMarca(@PathVariable Long id, @RequestBody Marca marca) {
        Marca marcaActualizada = marcaService.actualizarMarca(id, marca);
        return (marcaActualizada != null) ? ResponseEntity.ok(marcaActualizada) : ResponseEntity.notFound().build();
    }

    // Deshabilitar estado (Habilitado - Deshabilitado) de una marca por su Id
    @DeleteMapping("/deshabilitarMarca/{id}")
    public ResponseEntity<Void> deshabilitarMarca(@PathVariable Long id) {
        boolean resultado = marcaService.deshabilitarMarca(id);
        return resultado ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}