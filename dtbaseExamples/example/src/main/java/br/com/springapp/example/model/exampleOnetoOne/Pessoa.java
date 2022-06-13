package br.com.springapp.example.model.exampleOnetoOne;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Pessoa")
@Table(name = "pessoa")
public class Pessoa {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private PessoaInfo pessoaInfo;

}













