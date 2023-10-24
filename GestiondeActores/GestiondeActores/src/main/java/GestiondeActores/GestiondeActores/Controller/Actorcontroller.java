package GestiondeActores.GestiondeActores.Controller;

import GestiondeActores.GestiondeActores.Model.Dto.ActorDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actor")
public class Actorcontroller {

    @PostMapping(value="/guardar")
    @ResponseStatus(HttpStatus.CREATED)
    public void guardaActor(ActorDto actorDto){
      System.out.println(actorDto);
    }

}
