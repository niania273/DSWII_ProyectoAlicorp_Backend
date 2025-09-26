package pe.edu.alicorp.servicepostulation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.alicorp.servicepostulation.model.Postulacion;
import pe.edu.alicorp.servicepostulation.repository.PostulacionRepository;

import java.util.List;

@Service
public class PostulacionService {

    @Autowired
    private PostulacionRepository postulacionRepository;

    public List<Postulacion> getAllActive(){
        return postulacionRepository.findAll();
    }
}
