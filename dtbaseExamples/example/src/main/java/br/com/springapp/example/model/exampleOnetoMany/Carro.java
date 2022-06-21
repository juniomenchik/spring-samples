package br.com.springapp.example.model.exampleOnetoMany;

import lombok.*;

import javax.persistence.*;
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Carro")
@Table(name = "carro")
public class Carro {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(name = "nomeCarro")
    private String nomeCarro;

    @ManyToOne
    private Marca marcaDoCarro;

    public Carro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }
}
