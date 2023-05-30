package br.edu.fescfafic.cinema.Model;
public class Bilheteiro extends Funcionarios{
    public String cracha;
    public Bilheteiro(String nome, String _cpf, String _rg, String lista){
        super(nome, _cpf, _rg);
        this.cracha = lista;
    }
    @Override
    public String toString() {
        return "Bilheteiro{" +
                "cracha='" + cracha + '\'' +
                ", nome='" + nome + '\'' +
                ", _cpf='" + _cpf + '\'' +
                '}';
    }
}
