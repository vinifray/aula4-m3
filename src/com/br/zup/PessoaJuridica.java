package com.br.zup;

public class PessoaJuridica extends Pessoa{
    private String CNPJ;
    private String nomeFantasia;

    public PessoaJuridica(String nome, String numeroDeTelefone, String CNPJ, String nomeFantasia) {
        super(nome, numeroDeTelefone);
        this.CNPJ = CNPJ;
        this.nomeFantasia = nomeFantasia;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
}
