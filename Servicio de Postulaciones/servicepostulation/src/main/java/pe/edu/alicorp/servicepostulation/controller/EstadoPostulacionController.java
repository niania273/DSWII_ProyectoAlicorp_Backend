package pe.edu.alicorp.servicepostulation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.alicorp.servicepostulation.model.EstadoPostulacion;
import pe.edu.alicorp.servicepostulation.service.EstadoPostulacionService;

import java.util.List;

@RestController
@RequestMapping("/estados")
public class EstadoPostulacionController {

    @Autowired
    private EstadoPostulacionService service;

    @GetMapping("/get")
    public List<EstadoPostulacion> getAllActive(){
        return service.findAllActive();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<EstadoPostulacion> getAllActive(Long id){
        return service.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(()-> ResponseEntity.notFound().build());
    }
}
