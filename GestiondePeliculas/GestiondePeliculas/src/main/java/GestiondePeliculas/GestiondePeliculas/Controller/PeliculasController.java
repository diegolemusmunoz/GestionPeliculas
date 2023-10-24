package GestiondePeliculas.GestiondePeliculas.Controller;

import GestiondePeliculas.GestiondePeliculas.Models.Dto.PeliculaDTO;
import GestiondePeliculas.GestiondePeliculas.Services.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/pelicula")
@CrossOrigin(origins = "*/")
public class PeliculasController {

    @Autowired
    PeliculaService peliculaService;

    @PostMapping(value="/guardar")
    @ResponseStatus(HttpStatus.CREATED)
    public void Guardarpelicula(@RequestBody PeliculaDTO peliculaDTO){
        System.out.println("Viene del fornt"+peliculaDTO );
        peliculaService.guardarpelicula(peliculaDTO);

    }
}
