package br.unigran.entidades;
import javax.persistence.*;
import java.util.Date;

@Entity
public class Validade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date dataFabricacao;

    public Validade() {
    }

    public Validade(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
}