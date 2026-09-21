package br.com.fatec.ninjas.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "missao")
public class Missao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_missao;

    @Column(name = "titulo_missao", nullable = false)
    private String titulo;

    @Column(name = "descricao_missao")
    private String descricao;

    @Column(name = "rank_missao")
    private String rank;

    @Column(name = "status_missao")
    private String status;

    @Column(name = "recompensa_missao")
    private Double recompensa;
}
