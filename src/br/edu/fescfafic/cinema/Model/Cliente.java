package br.edu.fescfafic.cinema.Model;
public class Cliente{
    public String nome;

    public Cliente(String nome) {
        this.nome = nome;

    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                '}';
    }
}