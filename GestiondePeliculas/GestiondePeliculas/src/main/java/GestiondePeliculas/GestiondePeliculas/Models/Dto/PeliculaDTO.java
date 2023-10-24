package GestiondePeliculas.GestiondePeliculas.Models.Dto;

import GestiondePeliculas.GestiondePeliculas.Models.Dao.Actor;
import GestiondePeliculas.GestiondePeliculas.Models.Dao.PeliculaDao;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@Component
public class PeliculaDTO implements Serializable {

    private String Nombre;
    private String Afiche;
    private Date FechaLanzamiento;
    private String Idioma;
    private Float Calificacion;

    private List<Actor> actores;


    public PeliculaDTO(String nombre, String afiche, Date fechaLanzamiento, String idioma, Float calificacion, List<Actor> actores) {
        Nombre = nombre;
        Afiche = afiche;
        FechaLanzamiento = fechaLanzamiento;
        Idioma = idioma;
        Calificacion = calificacion;
        this.actores = actores;
    }

    public PeliculaDTO() {
    }

    public PeliculaDao fromDomain (PeliculaDTO peliculaDto){
        PeliculaDao peliculaDao=new PeliculaDao();
        peliculaDao.setNombre(peliculaDto.getNombre());
        peliculaDao.setAfiche(peliculaDto.getAfiche());
        peliculaDao.setFechaLanzamiento(peliculaDto.getFechaLanzamiento());
        peliculaDao.setIdioma(peliculaDto.getIdioma());
        peliculaDao.setCalificacion(peliculaDto.getCalificacion());
        return peliculaDao;

    }
}
