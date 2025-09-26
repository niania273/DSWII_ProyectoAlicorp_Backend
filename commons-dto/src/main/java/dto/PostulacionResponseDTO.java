package dto;

import java.time.LocalDate;

public record PostulacionResponseDTO(
        Long codPostulacion,
        String tituloOferta,
        String nomareaOferta,
        String nommarcaOferta,
        LocalDate fecInicioOferta,
        LocalDate fecFinOferta,
        String estadoPostulacion,
        LocalDate fechaPostulacion
) {
}
