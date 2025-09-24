package pe.edu.alicorp.servicepostulation.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table( name = "ESTADO_POSTULACION")
@Data
public class EstadoPostulacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codestado;
    private String nomestado;
    private boolean estado;
    private LocalDate fechacreacion;
    private LocalDate fechaactualiza;

}
