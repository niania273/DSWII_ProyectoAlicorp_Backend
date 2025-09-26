package pe.edu.alicorp.servicepostulation.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table( name = "ESTADO_POSTULACION")
@Data
public class EstadoPostulacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codestado;
    private String nomestado;
    private LocalDateTime fechacreacion;
    private LocalDateTime fechaactualiza;
}
