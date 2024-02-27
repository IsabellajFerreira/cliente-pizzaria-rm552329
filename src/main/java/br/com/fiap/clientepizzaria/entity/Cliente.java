package br.com.fiap.clientepizzaria.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity
@Table(name = "TB_CLIENTE_PIZZARIA")
public class Cliente {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CLIENTE_PIZZARIA")
    @SequenceGenerator(
            name = "SQ_CLIENTE_PIZZARIA",
            sequenceName = "SQ_CLIENTE_PIZZARIA",
            initialValue = 1,
            allocationSize = 1
    )
    @Column(name = "ID_CLIENTE")
    private Long id;

    @Column(name = "NM_CLIENTE")
    private String nome;

}
