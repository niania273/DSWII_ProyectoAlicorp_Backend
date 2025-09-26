package dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record OfertaDTO(
        Long codOferta,
        String titulo,
        String descripcion,
        LocalDate fecInicio,
        LocalDate fecFin,
        boolean estado,
        String nomarea,
        String nommarca,
        LocalDateTime fechacreacion,
        LocalDateTime fechaactualiza
) {}
