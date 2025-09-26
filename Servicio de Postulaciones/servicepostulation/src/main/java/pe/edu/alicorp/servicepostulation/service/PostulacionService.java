package pe.edu.alicorp.servicepostulation.service;

import dto.PostulacionResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.alicorp.servicepostulation.model.Postulacion;
import pe.edu.alicorp.servicepostulation.repository.PostulacionRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PostulacionService {

    @Autowired
    private PostulacionRepository postulacionRepository;

//    public List<dto.PostulacionResponseDTO> getAllActive(){
//        return postulacionRepository.findByEstado(true);
//    }
//
//    public Optional<Postulacion> getById(Long id){
//        return postulacionRepository.findById(id);
//    }
}
