package br.edu.fescfafic.cinema.Model;

public class Refrigerante {
    public static final double PRECO = 5.50;

    public int quantidadeRefrigerante;

    public Refrigerante (int quantidadeRefrigerante){
        this.quantidadeRefrigerante = quantidadeRefrigerante;
    }
    public double qntdRefrigerante(){
        double valor = PRECO * quantidadeRefrigerante;
        return valor;
    }
}

