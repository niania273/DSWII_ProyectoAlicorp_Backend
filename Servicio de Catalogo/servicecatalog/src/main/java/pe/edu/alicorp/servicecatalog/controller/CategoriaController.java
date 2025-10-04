package pe.edu.alicorp.servicecatalog.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.alicorp.servicecatalog.model.Categoria;
import pe.edu.alicorp.servicecatalog.service.CategoriaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
@RequiredArgsConstructor
public class CategoriaController {

    private final CategoriaService categoriaService;

    // Listar todas las categorías
    @GetMapping("/listarCategorias")
    public ResponseEntity<List<Categoria>> obtenerCategorias() {
        return ResponseEntity.of(Optional.ofNullable(categoriaService.obtenerCategorias()));
    }

    // Guardar categoría nueva
    @PostMapping("/agregarCategoria")
    public ResponseEntity<Categoria> guardarCategoria(@RequestBody Categoria categoria) {
        return ResponseEntity.ok(categoriaService.guardarCategoria(categoria));
    }

    // Obtener una categoría por su Id
    @GetMapping("/obtenerCategoria/{id}")
    public ResponseEntity<Categoria> buscarCategoriaPorId(@PathVariable Long id) {
        Categoria categoria = categoriaService.buscarCategoriaPorId(id);
        return (categoria != null) ? ResponseEntity.ok(categoria) : ResponseEntity.notFound().build();
    }

    // Actualizar una categoría por su Id
    @PutMapping("/actualizarCategoria/{id}")
    public ResponseEntity<Categoria> actualizarCategoria(@PathVariable Long id, @RequestBody Categoria categoria) {
        Categoria categoriaActualizada = categoriaService.actualizarCategoria(id, categoria);
        return (categoriaActualizada != null) ? ResponseEntity.ok(categoriaActualizada) : ResponseEntity.notFound().build();
    }

    // Deshabilitar estado (Habilitado - Deshabilitado) de una categoría por su Id
    @DeleteMapping("/deshabilitarCategoria/{id}")
    public ResponseEntity<Void> deshabilitarCategoria(@PathVariable Long id) {
        boolean resultado = categoriaService.deshabilitarCategoria(id);
        return resultado ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}