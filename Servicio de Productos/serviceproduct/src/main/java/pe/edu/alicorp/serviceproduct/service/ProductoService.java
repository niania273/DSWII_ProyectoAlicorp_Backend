package pe.edu.alicorp.serviceproduct.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.alicorp.serviceproduct.model.Producto;
import pe.edu.alicorp.serviceproduct.repository.ProductoRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductoService {

    private final ProductoRepository productoRepository;

    public List<Producto> obtenerProductos(){
        return productoRepository.findAll();
    }

    public Producto guardarProducto(Producto producto){
        return productoRepository.save(producto);
    }

    public Producto buscarProductoPorId(Long id){
        return productoRepository.findById(id).orElse(null);
    }

    public Producto actualizarProducto(Long id, Producto producto){
        return productoRepository.findById(id).map(producto1 -> {
            producto1.setCodcategoria(producto.getCodcategoria());
            producto1.setImgproducto(producto.getImgproducto());
            producto1.setNomproducto(producto.getNomproducto());
            producto1.setDescripcion(producto.getDescripcion());
            producto1.setPreuni(producto.getPreuni());
            producto1.setCodmarca(producto.getCodmarca());
            producto1.setStock(producto.getStock());
            producto1.setEstproducto(producto.isEstproducto());
            producto1.setFechaactualiza(LocalDateTime.now());
            return productoRepository.save(producto1);
        }).orElse(null);
    }

    public boolean deshabilitarProducto(Long id){
        return productoRepository.findById(id).map(producto -> {
            producto.setEstproducto(false);
            producto.setFechaactualiza(LocalDateTime.now());
            productoRepository.save(producto);
            return true;
        }).orElse(false);
    }
}
