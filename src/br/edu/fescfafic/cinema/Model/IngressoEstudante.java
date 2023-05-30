package br.edu.fescfafic.cinema.Model;
import br.edu.fescfafic.cinema.Interface.Estudante;
public class IngressoEstudante implements Estudante{
    public static final boolean ESTUDANTE = true;

    public final double preco;
    public final double desconto;
    public IngressoEstudante(double preco, double desconto) {
        this.preco = preco;
        this.desconto = desconto;
    }

    @Override
    public double getPreco(){
        return preco;
    }


    @Override
    public double getDesconto() {
        return preco - (preco * desconto);
    }

}
