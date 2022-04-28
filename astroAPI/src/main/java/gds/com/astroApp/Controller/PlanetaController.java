package gds.com.astroApp.Controller;

import gds.com.astroApp.Entitys.Planeta;
import gds.com.astroApp.Services.PlanetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api")
public class PlanetaController {

    @Autowired
    PlanetaService planetaService;

    @GetMapping("/planetas")
    public List<Planeta> getPlaneta(){
        return planetaService.getPlanetas();
    }
    @GetMapping("/planeta/{nome}")
    public Planeta buscaNomePlaneta(@PathVariable String nome){
        return planetaService.getByNamePlaneta(nome);
    }

}
