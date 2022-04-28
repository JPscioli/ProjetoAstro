package gds.com.astroApp.Services;

import gds.com.astroApp.Entitys.Planeta;
import gds.com.astroApp.Repositorys.PlanetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanetaService {

    @Autowired
    PlanetaRepository planetaRepository;

   public List<Planeta> getPlanetas(){
        return planetaRepository.findAll();
   }
   public Planeta getByNamePlaneta(String nome){
       return planetaRepository.findByNome(nome);
   }

}
