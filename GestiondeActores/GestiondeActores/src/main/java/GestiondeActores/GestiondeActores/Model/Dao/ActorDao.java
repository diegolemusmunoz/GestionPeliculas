package GestiondeActores.GestiondeActores.Model.Dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ActorDao {
    private Long idActor;
    private  String Nombre;
    private String Apellido;
    private String Foto;
}
