package gds.com.astroApp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.objenesis.strategy.PlatformDescription;

import java.util.List;

@Configuration
public class PlanetaConfig {
    @Bean
    CommandLineRunner commandLineRunner(PlanetaRepository repository){
        return args -> {Planeta marte = new Planeta(
                "Marte","Athenas","Deus Grego",14,10,1,0
        );
        repository.saveAll(List.of(marte));};
    }
}
