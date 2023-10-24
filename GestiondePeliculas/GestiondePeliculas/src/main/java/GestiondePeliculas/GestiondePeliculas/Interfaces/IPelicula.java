package GestiondePeliculas.GestiondePeliculas.Interfaces;

import GestiondePeliculas.GestiondePeliculas.Models.Dao.PeliculaDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPelicula extends JpaRepository<PeliculaDao, Long> {
}
