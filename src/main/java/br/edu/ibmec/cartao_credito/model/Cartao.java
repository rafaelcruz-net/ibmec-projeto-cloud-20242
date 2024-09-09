package br.edu.ibmec.cartao_credito.model;

import java.util.List;
import java.util.UUID;

import lombok.Data;

@Data
public class Cartao {
    public UUID id;
    public Boolean ativo;
    public double limite;
    public String numero;
    public List<Transacao> transacoes;
}

