package com.ftunicamp.tcc.controllers.request;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ConvenioRequest implements Serializable {

    private String projeto;
    private String coordenador;
    private String instituicao;
    private int horaSemanal;
    private int horaMensal;
    private String descricao;
    private int prazo;
    private Double valorBruto;
}
