package pe.edu.alicorp.servicecatalog.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "MARCA")
@Data
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODMARCA")
    private long codmarca;

    @Column(name = "IMGMARCA", length = 50, nullable = false)
    private String imgmarca;

    @Column(name = "NOMBREMARCA", length = 25, nullable = false)
    private String nombremarca;

    @Column(name = "ESTMARCA", nullable = false)
    private boolean estmarca;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    @Column(name = "FECHACREACION")
    private LocalDateTime fechacreacion;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    @Column(name = "FECHAACTUALIZA")
    private LocalDateTime fechaactualiza;

    public void actualizarMarca(Marca nuevaMarca) {
        this.imgmarca = nuevaMarca.getImgmarca();
        this.nombremarca = nuevaMarca.getNombremarca();
        this.estmarca = nuevaMarca.isEstmarca();
    }
}