package gds.com.astroApp.Repositorys;

import gds.com.astroApp.Entitys.Planeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlanetaRepository extends JpaRepository<Planeta,Long> {

    Planeta findByNome(String nome);
}
