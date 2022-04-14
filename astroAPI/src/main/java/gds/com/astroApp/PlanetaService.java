package gds.com.astroApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanetaService {

    private final PlanetaRepository planetaRepository;

    @Autowired
    public PlanetaService(PlanetaRepository planetaRepository) {
        this.planetaRepository = planetaRepository;
    }

    public List<Planeta> getPlaneta(){return planetaRepository.findAll();}
}
