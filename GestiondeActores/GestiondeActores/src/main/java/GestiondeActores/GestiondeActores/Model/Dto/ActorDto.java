package GestiondeActores.GestiondeActores.Model.Dto;

import GestiondeActores.GestiondeActores.Model.Dao.ActorDao;
import lombok.Data;

import java.io.Serializable;

@Data
public class ActorDto implements Serializable {

    private Long idActor;
    private  String Nombre;
    private String Apellido;
    private String Foto;

    public ActorDto(Long idActor, String nombre, String apellido, String foto) {
        this.idActor = idActor;
        Nombre = nombre;
        Apellido = apellido;
        Foto = foto;
    }

    public ActorDto() {
    }

    @Override
    public String toString() {
        return "ActorDto{" +
                "idActor=" + idActor +
                ", Nombre='" + Nombre + '\'' +
                ", Apellido='" + Apellido + '\'' +
                ", Foto='" + Foto + '\'' +
                '}';
    }

    public ActorDao fromdomain(ActorDto actorDto){
        ActorDao actorDao= new ActorDao();
        actorDao.setNombre(actorDto.getNombre());
        actorDao.setApellido(actorDto.getApellido());
        actorDao.setFoto(actorDto.getFoto());
        return actorDao;
    }
}
