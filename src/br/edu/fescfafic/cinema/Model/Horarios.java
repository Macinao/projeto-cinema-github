package br.edu.fescfafic.cinema.Model;
public class Horarios {
    public boolean horarioDeFuncionamento;
    public void fecharCinema(){
        this.horarioDeFuncionamento = false;
        System.out.println("O cinema esta fechado");
    }
    public void abrirCinema(){
        this.horarioDeFuncionamento = true;
        System.out.println("O cinema esta aberto");
    }
}