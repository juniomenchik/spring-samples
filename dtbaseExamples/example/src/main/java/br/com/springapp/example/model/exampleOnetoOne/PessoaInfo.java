package br.com.springapp.example.model.exampleOnetoOne;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "PessoaInfo")
@Table(name = "pessoa_info")
public class PessoaInfo {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Pessoa pessoa;

}
















