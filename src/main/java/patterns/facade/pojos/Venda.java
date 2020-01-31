package patterns.facade.pojos;

import java.util.List;

public class Venda {

    public Integer id;
    public Cliente cliente;
    public List<Produto> produtos;

    public Venda() {
    }

    public Venda(Integer id, Cliente cliente, List<Produto> produtos) {
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}
