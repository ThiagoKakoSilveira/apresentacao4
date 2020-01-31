package patterns.facade.pojos;

import java.math.BigDecimal;

public class Produto {

    public Integer id;
    public BigDecimal valor;
    public String descricao;

    public Produto() {
    }

    public Produto(Integer id, BigDecimal valor, String descricao) {
        this.id = id;
        this.valor = valor;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
