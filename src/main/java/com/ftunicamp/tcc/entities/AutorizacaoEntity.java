package com.ftunicamp.tcc.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Autorizacao")
@Getter
@Setter
public class AutorizacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private StatusAutorizacao status;

    private LocalDate data;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Atividade atividade;

    private String docente;

}
