package gds.com.astroApp.Configs;

import gds.com.astroApp.Entitys.Planeta;
import gds.com.astroApp.Repositorys.PlanetaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PlanetaConfig {
    @Bean
    CommandLineRunner commandLineRunner(PlanetaRepository repository){
        return args -> {
            Planeta mercurio = new Planeta(
                "Mercúrio",
                "Mercúrio",
                "4,878 km",
                "88 Dias da Terra",
                "58.6 Dias da Terra",
                0);
            Planeta venus = new Planeta(
                "Vênus",
                "Vênus",
                "12,104 km",
                "225 Dias da Terra",
                "241 Dias da Terra",
                0);
            Planeta terra = new Planeta(
                "Terra",
                "Terra",
                "12,760 km",
                "365.24 dias",
                "23 horas, 56 minutos",
                1);
            Planeta marte = new Planeta(
                "Marte",
                "Marte",
                "6,787 km",
                "686,971 dias",
                "24 hours, 37 minutes",
                2);
            Planeta jupiter = new Planeta(
                    "Jupiter",
                    "Jupiter",
                    "139,822 km",
                    "11.9 Dias da Terra",
                    "9.8 Dias da Terra",
                    79);
            Planeta saturno = new Planeta(
                    "Saturno",
                    "Saturno",
                    "120,500 km",
                    " 29.5 Dias da Terra",
                    "10.5 Horas da Terra",
                    82);
            Planeta urano = new Planeta(
                    "Urano",
                    "Urano",
                    "51,120 km",
                    " 84 Anos da Terra",
                    "18 Horas da Terra\n",
                    27);
            Planeta netuno = new Planeta(
                    "Netuno",
                    "Netuno",
                    "49,530 km",
                    "165 Anos da Terra",
                    "19 Horas da Terra",
                    14);
        repository.saveAll(List.of(mercurio,venus,terra,marte,jupiter,saturno,urano,netuno));};
    }
}
