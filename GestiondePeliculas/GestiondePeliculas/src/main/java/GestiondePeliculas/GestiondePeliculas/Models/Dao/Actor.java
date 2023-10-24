package GestiondePeliculas.GestiondePeliculas.Models.Dao;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="actor")
public class Actor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idActor;
    private  String Nombre;
    private String Apellido;
    private String Foto;
    private static final long serialVersionUID = 4012221612401133094L;
}
