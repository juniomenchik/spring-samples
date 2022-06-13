package br.com.springapp.example.model.exampleManytoMany;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Livro")
@Table(name = "livro")
public class Livro {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nome")
    private String nome;

    @ManyToMany
    List<Categoria> categorias = new ArrayList<>();

}
