package br.edu.ibmec.cartao_credito.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import lombok.Data;

@Data
public class Usuario {
    private UUID id;
    private String nome;
    private LocalDateTime dataNascimento;
    private String cpf; 
    private List<Cartao> cartoes;

    public void associarCartao(Cartao cartao) {
        this.cartoes.add(cartao);
    }
}
