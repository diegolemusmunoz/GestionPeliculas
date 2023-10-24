package GestiondePeliculas.GestiondePeliculas.Services;

import GestiondePeliculas.GestiondePeliculas.Interfaces.ActoresFeingClients;
import GestiondePeliculas.GestiondePeliculas.Interfaces.IPelicula;
import GestiondePeliculas.GestiondePeliculas.Models.Dao.PeliculaDao;
import GestiondePeliculas.GestiondePeliculas.Models.Dto.PeliculaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PeliculaService {

    @Autowired
    IPelicula iPelicula;

    @Autowired
    private ActoresFeingClients actoresFeingClients;


    public String guardarpelicula(PeliculaDTO peliculaDTO){
        PeliculaDao peliculaDao=new PeliculaDao();
        peliculaDao=peliculaDTO.fromDomain(peliculaDTO);
        for(int i=0;i<peliculaDTO.getActores().size();i++) {
            actoresFeingClients.save(peliculaDTO.getActores().get(i));
        }
        iPelicula.save(peliculaDao);
        return "Guardado";
    }
}
