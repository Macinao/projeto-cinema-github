package br.edu.fescfafic.cinema.Model;

import br.edu.fescfafic.cinema.Interface.Ingresso;

public class IngressoInteiro implements Ingresso {

    public final double preco;

    public IngressoInteiro(double preco){
        this.preco = preco;
    }

    @Override
    public double getPreco(){
        return preco;
    }
}
