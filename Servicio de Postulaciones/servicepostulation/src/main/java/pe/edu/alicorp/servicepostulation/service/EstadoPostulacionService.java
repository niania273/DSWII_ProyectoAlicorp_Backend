package pe.edu.alicorp.servicepostulation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.alicorp.servicepostulation.model.EstadoPostulacion;
import pe.edu.alicorp.servicepostulation.repository.EstadoPostulacionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EstadoPostulacionService {

    @Autowired
    private EstadoPostulacionRepository estadoPostulacionRepository;

    public List<EstadoPostulacion> findAllActive(){
        return estadoPostulacionRepository.findByEstado(true);
    }

    public Optional<EstadoPostulacion> findById(Long id){
        return estadoPostulacionRepository.findById(id);
    }


}
