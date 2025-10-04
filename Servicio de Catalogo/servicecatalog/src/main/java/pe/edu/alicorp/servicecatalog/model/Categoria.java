package pe.edu.alicorp.servicecatalog.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "CATEGORIA")
@Data
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODCATEGORIA")
    private long codcategoria;

    @Column(name = "IMGCATEGORIA", length = 50, nullable = false)
    private String imgcategoria;

    @Column(name = "NOMCATEGORIA", length = 25, nullable = false)
    private String nomcategoria;

    @Column(name = "ESTCATEGORIA", nullable = false)
    private boolean estcategoria;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    @Column(name = "FECHACREACION")
    private LocalDateTime fechacreacion;

    @JsonFormat(pattern = "dd-MM-yyyy HH:mm")
    @Column(name = "FECHAACTUALIZA")
    private LocalDateTime fechaactualiza;

    public void actualizarCategoria(Categoria nuevaCategoria) {
        this.imgcategoria = nuevaCategoria.getImgcategoria();
        this.nomcategoria = nuevaCategoria.getNomcategoria();
        this.estcategoria = nuevaCategoria.isEstcategoria();
    }
}