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
        return args -> {
            Planeta mercurio = new Planeta(
                "Mercúrio",
                " É o menor e mais interno planeta do Sistema Solar, orbitando o Sol a cada 87,969 dias terrestres.A sua aparência é brilhante quando observado da Terra, tendo uma magnitude aparente que varia de −2,6 a 5,7, embora não seja facilmente observado pois sua separação angular do Sol é de apenas 28,3º. Uma vez que Mercúrio normalmente se perde no intenso brilho solar, exceto em eclipses solares, só pode ser observado a olho nu durante o crepúsculo matutino ou vespertino.\n",
                "4,878 km",
                "88 Dias da Terra\n",
                "58.6 Dias da Terra",
                0);
            Planeta venus = new Planeta(
                "Mercúrio",
                " É o menor e mais interno planeta do Sistema Solar, orbitando o Sol a cada 87,969 dias terrestres.A sua aparência é brilhante quando observado da Terra, tendo uma magnitude aparente que varia de −2,6 a 5,7, embora não seja facilmente observado pois sua separação angular do Sol é de apenas 28,3º. Uma vez que Mercúrio normalmente se perde no intenso brilho solar, exceto em eclipses solares, só pode ser observado a olho nu durante o crepúsculo matutino ou vespertino.\n",
                "4,878 km",
                "88 Dias da Terra\n",
                "58.6 Dias da Terra",
                0);
            Planeta terra = new Planeta(
                    "Mercúrio",
                    " É o menor e mais interno planeta do Sistema Solar, orbitando o Sol a cada 87,969 dias terrestres.A sua aparência é brilhante quando observado da Terra, tendo uma magnitude aparente que varia de −2,6 a 5,7, embora não seja facilmente observado pois sua separação angular do Sol é de apenas 28,3º. Uma vez que Mercúrio normalmente se perde no intenso brilho solar, exceto em eclipses solares, só pode ser observado a olho nu durante o crepúsculo matutino ou vespertino.\n",
                    "4,878 km",
                    "88 Dias da Terra\n",
                    "58.6 Dias da Terra",
                    0);
            Planeta marte = new Planeta(
                    "Mercúrio",
                    " É o menor e mais interno planeta do Sistema Solar, orbitando o Sol a cada 87,969 dias terrestres.A sua aparência é brilhante quando observado da Terra, tendo uma magnitude aparente que varia de −2,6 a 5,7, embora não seja facilmente observado pois sua separação angular do Sol é de apenas 28,3º. Uma vez que Mercúrio normalmente se perde no intenso brilho solar, exceto em eclipses solares, só pode ser observado a olho nu durante o crepúsculo matutino ou vespertino.\n",
                    "4,878 km",
                    "88 Dias da Terra\n",
                    "58.6 Dias da Terra",
                    0);
            Planeta jupiter = new Planeta(
                    "Mercúrio",
                    " É o menor e mais interno planeta do Sistema Solar, orbitando o Sol a cada 87,969 dias terrestres.A sua aparência é brilhante quando observado da Terra, tendo uma magnitude aparente que varia de −2,6 a 5,7, embora não seja facilmente observado pois sua separação angular do Sol é de apenas 28,3º. Uma vez que Mercúrio normalmente se perde no intenso brilho solar, exceto em eclipses solares, só pode ser observado a olho nu durante o crepúsculo matutino ou vespertino.\n",
                    "4,878 km",
                    "88 Dias da Terra\n",
                    "58.6 Dias da Terra",
                    0);
            Planeta saturno = new Planeta(
                    "Mercúrio",
                    " É o menor e mais interno planeta do Sistema Solar, orbitando o Sol a cada 87,969 dias terrestres.A sua aparência é brilhante quando observado da Terra, tendo uma magnitude aparente que varia de −2,6 a 5,7, embora não seja facilmente observado pois sua separação angular do Sol é de apenas 28,3º. Uma vez que Mercúrio normalmente se perde no intenso brilho solar, exceto em eclipses solares, só pode ser observado a olho nu durante o crepúsculo matutino ou vespertino.\n",
                    "4,878 km",
                    "88 Dias da Terra\n",
                    "58.6 Dias da Terra",
                    0);
            Planeta urano = new Planeta(
                    "Mercúrio",
                    " É o menor e mais interno planeta do Sistema Solar, orbitando o Sol a cada 87,969 dias terrestres.A sua aparência é brilhante quando observado da Terra, tendo uma magnitude aparente que varia de −2,6 a 5,7, embora não seja facilmente observado pois sua separação angular do Sol é de apenas 28,3º. Uma vez que Mercúrio normalmente se perde no intenso brilho solar, exceto em eclipses solares, só pode ser observado a olho nu durante o crepúsculo matutino ou vespertino.\n",
                    "4,878 km",
                    "88 Dias da Terra\n",
                    "58.6 Dias da Terra",
                    0);
            Planeta netuno = new Planeta(
                    "Mercúrio",
                    " É o menor e mais interno planeta do Sistema Solar, orbitando o Sol a cada 87,969 dias terrestres.A sua aparência é brilhante quando observado da Terra, tendo uma magnitude aparente que varia de −2,6 a 5,7, embora não seja facilmente observado pois sua separação angular do Sol é de apenas 28,3º. Uma vez que Mercúrio normalmente se perde no intenso brilho solar, exceto em eclipses solares, só pode ser observado a olho nu durante o crepúsculo matutino ou vespertino.\n",
                    "4,878 km",
                    "88 Dias da Terra\n",
                    "58.6 Dias da Terra",
                    0);
        repository.saveAll(List.of(mercurio,venus,terra,marte,jupiter,saturno,urano,netuno));};
    }
}
