package br.edu.fescfafic.cinema.Model;

public abstract class Funcionarios {
    public String nome;
    protected String _cpf;
    private String _rg;
    Funcionarios(String cpf, String rg, String nome) {
        this._cpf = cpf;
        this._rg = rg;
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "Funcionarios{" +
                "nome='" + nome + '\'' +
                ", _cpf='" + _cpf + '\'' +
                ", _rg='" + _rg + '\'' +
                '}';
    }
}