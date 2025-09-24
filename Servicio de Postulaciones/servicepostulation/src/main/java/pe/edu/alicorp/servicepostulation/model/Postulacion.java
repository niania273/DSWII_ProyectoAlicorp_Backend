package pe.edu.alicorp.servicepostulation.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table( name = "POSTULACION")
@Data
public class Postulacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codpostulacion;
    private Long codoferta;
    private Long codusuario;
    private LocalDate fecha;
    private boolean estado;
    private Long codestado;
}
