package GestiondePeliculas.GestiondePeliculas.Interfaces;

import GestiondePeliculas.GestiondePeliculas.Models.Dao.Actor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

@Component
@FeignClient(name="GestiondeActores")
public interface ActoresFeingClients {


    @PostMapping("/actor/guardar")
    Actor save(Actor actor);
}
