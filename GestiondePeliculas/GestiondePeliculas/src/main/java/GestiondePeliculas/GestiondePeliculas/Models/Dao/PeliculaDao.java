package GestiondePeliculas.GestiondePeliculas.Models.Dao;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Data
@Entity
@Table(name="pelicula")
public class PeliculaDao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idPelicula;

    private String Nombre;
    private String Afiche;
    private Date FechaLanzamiento;
    private String Idioma;
    private Float Calificacion;

    @ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="peliculaactor",joinColumns =@JoinColumn(name="idPelicula"), inverseJoinColumns = @JoinColumn(name="idActor"), uniqueConstraints = {@UniqueConstraint(columnNames = {"idPelicula","idActor"})})
    private List<Actor> actores;


    private static final long serialVersionUID = 4012221612401133094L;
}
