package br.edu.fescfafic.cinema.Model;

public class Pipoca {
    public static final double PRECO = 3;
    public int quantidadePipoca;

    public Pipoca(int quantidadePipoca){
        this.quantidadePipoca = quantidadePipoca;
    }

    public double valorPipoca(){
       double valor = this.quantidadePipoca * PRECO;
       return valor;
    }
}
