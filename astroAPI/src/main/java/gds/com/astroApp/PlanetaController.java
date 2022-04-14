package gds.com.astroApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlanetaController {

    private final PlanetaService planetaService;
    @Autowired
    public PlanetaController(PlanetaService planetaService) {
        this.planetaService = planetaService;
    }

    @GetMapping(path = "api/planetas")
    public List<Planeta> getPlanetas(){return planetaService.getPlaneta();}
}
