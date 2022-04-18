package gds.com.astroApp;

import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table
public class Planeta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    private String informacoes;
    private String diametro;
    private String orbita;
    private String dias;
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

    public String getInformacoes() {
        return informacoes;
    }

    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }

    public String getDiametro() {
        return diametro;
    }

    public void setDiametro(String diametro) {
        this.diametro = diametro;
    }

    public String getOrbita() {
        return orbita;
    }

    public void setOrbita(String orbita) {
        this.orbita = orbita;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public int getLuas() {
        return luas;
    }

    public void setLuas(int luas) {
        this.luas = luas;
    }
    //Constructor
    public Planeta() {
    }

    public Planeta(Long id, String nome, String informacoes, String diametro, String orbita, String dias, int luas) {
        this.id = id;
        this.nome = nome;
        this.informacoes = informacoes;
        this.diametro = diametro;
        this.orbita = orbita;
        this.dias = dias;
        this.luas = luas;
    }

    public Planeta(String nome, String informacoes, String diametro, String orbita, String dias, int luas) {
        this.nome = nome;
        this.informacoes = informacoes;
        this.diametro = diametro;
        this.orbita = orbita;
        this.dias = dias;
        this.luas = luas;
    }
}
