package pe.edu.alicorp.servicepostulation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.alicorp.servicepostulation.service.PostulacionService;

@RestController
@RequestMapping("/postulaciones")
public class PostulacionController {

    @Autowired
    private PostulacionService postulacionService;
}
