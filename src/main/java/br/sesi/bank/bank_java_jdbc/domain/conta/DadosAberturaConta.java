package br.sesi.bank.bank_java_jdbc.domain.conta;

import br.sesi.bank.bank_java_jdbc.domain.cliente.DadosCadastroCliente;

public class DadosAberturaConta {
    public Integer numero;
    public DadosCadastroCliente dadoscliente;

    public DadosAberturaConta(Integer numero, DadosCadastroCliente dadosCliente){
        this.numero = numero;
        this.dadoscliente = dadosCliente
    }
}
