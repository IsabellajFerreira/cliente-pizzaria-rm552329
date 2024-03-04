package br.com.fiap.clientepizzaria.entity;


import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TB_TELEFONE")
public class Telefone {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_TELEFONE")
    @SequenceGenerator(
            name =  "SQ_TELEFONE",
            sequenceName =  "SQ_TELEFONE",
            initialValue = 1,
            allocationSize = 1
    )
    @Column(name = "ID_TELEFONE")
    private Long id;

    private String ddi;

    private String ddd;

    private String numero;


    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(
            name = "DONO",
            referencedColumnName = "ID_CLIENTE",
            foreignKey = @ForeignKey(name = "FK_DONO_TELEFONE")
    )
    private Cliente dono;

}