package gds.com.astroApp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;


@Entity
@Table
public class Planeta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    private String descoberta;
    private String historiaNome;
    private double diametro;
    private double orbita;
    private double dias;
    private int luas;
    //Getters & Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescoberta() {
        return descoberta;
    }

    public void setDescoberta(String descoberta) {
        this.descoberta = descoberta;
    }

    public String getHistoriaNome() {
        return historiaNome;
    }

    public void setHistoriaNome(String historiaNome) {
        this.historiaNome = historiaNome;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getOrbita() {
        return orbita;
    }

    public void setOrbita(double orbita) {
        this.orbita = orbita;
    }

    public double getDias() {
        return dias;
    }

    public void setDias(double dias) {
        this.dias = dias;
    }

    public int getLuas() {
        return luas;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }

    //Contructor
    public Planeta(Long id,
                   String nome,
                   String descoberta,
                   String historiaNome,
                   double diametro,
                   double orbita,
                   double dias,
                   int luas) {
        this.id = id;
        this.nome = nome;
        this.descoberta = descoberta;
        this.historiaNome = historiaNome;
        this.diametro = diametro;
        this.orbita = orbita;
        this.dias = dias;
        this.luas = luas;
    }

    public Planeta(String nome,
                   String descoberta,
                   String historiaNome,
                   double diametro,
                   double orbita,
                   double dias,
                   int luas) {
        this.nome = nome;
        this.descoberta = descoberta;
        this.historiaNome = historiaNome;
        this.diametro = diametro;
        this.orbita = orbita;
        this.dias = dias;
        this.luas = luas;
    }
}
