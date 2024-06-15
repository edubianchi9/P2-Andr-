package br.unigran.entidades;
import javax.persistence.*;

@Entity
public class Estoque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int estoqueAtual;
    private int estoqueAnterior;

    public int getEstoqueAtual() {
        return estoqueAtual;
    }

    public void setEstoqueAtual(int estoqueAtual) {
        this.estoqueAtual = estoqueAtual;
    }

    public int getEstoqueAnterior() {
        return estoqueAnterior;
    }

    public void setEstoqueAnterior(int estoqueAnterior) {
        this.estoqueAnterior = estoqueAnterior;
    }


}