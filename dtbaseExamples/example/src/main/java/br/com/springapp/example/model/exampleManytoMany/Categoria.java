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
@Entity(name = "Categoria")
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany
    List<Livro> livros = new ArrayList<>();

}
