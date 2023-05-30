package br.edu.fescfafic.cinema.Model;
public class Atendente extends Funcionarios{
    public String cracha;
    public Atendente(String nome, String cpf, String rg, String cracha){
        super(nome, cpf, rg);
        this.cracha = cracha;
    }
    @Override
    public String toString() {
        return "Atendente{" +
                "cracha='" + cracha + '\'' +
                ", nome='" + nome + '\'' +
                ", _cpf='" + _cpf + '\'' +
                '}';
    }
}
