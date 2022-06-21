package br.com.springapp.example.model.exampleOnetoMany;

import br.com.springapp.example.model.exampleManytoMany.Livro;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Marca")
@Table(name = "marca")
public class Marca {
    @GeneratedValue
    @Id
    private Long id;

    @Column
    private String nomeMarca;

    @OneToMany
    List<Carro> carros = new ArrayList<>();

    public Marca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }
}
