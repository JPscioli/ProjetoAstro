package gds.com.astroApp.Entitys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "planetas")
public class Planeta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nome;
    @Column(length = 3000)
    private String informacoes;
    private String diametro;
    private String orbita;
    private String dias;
    private int luas;

    public Planeta() {
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
