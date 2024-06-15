package br.unigran.entidades;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigoProduto;
    private String marca;
    private String categoria;
    private String fornecedor;
    private double valorProduto;
    private double valorVenda;
    @Temporal(TemporalType.DATE)
    private Date validadeProduto;
    private int quantidadeRecebida;
    private int quantidadeMinEstoque;

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Date getValidadeProduto() {
        return validadeProduto;
    }

    public void setValidadeProduto(Date validadeProduto) {
        this.validadeProduto = validadeProduto;
    }

    public int getQuantidadeRecebida() {
        return quantidadeRecebida;
    }

    public void setQuantidadeRecebida(int quantidadeRecebida) {
        this.quantidadeRecebida = quantidadeRecebida;
    }

    public int getQuantidadeMinEstoque() {
        return quantidadeMinEstoque;
    }

    public void setQuantidadeMinEstoque(int quantidadeMinEstoque) {
        this.quantidadeMinEstoque = quantidadeMinEstoque;
    }

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = (Long) id;
    }
}
