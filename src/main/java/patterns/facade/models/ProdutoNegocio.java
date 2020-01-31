package patterns.facade.models;

import patterns.facade.dao.SimulaBanco;
import patterns.facade.pojos.Produto;
import patterns.facade.pojos.Venda;

import java.util.ArrayList;
import java.util.List;

public class ProdutoNegocio {

    SimulaBanco db = new SimulaBanco();

    List<Produto> produtos = db.entregaProdutos();

    public List<Produto> consultarProdutoPorVenda(List<Venda> vendasPesquisada){
        List<Produto>produtosDasVendas = new ArrayList<>();
        vendasPesquisada.stream().forEach(venda -> venda.getProdutos()
        .stream().forEach(produto -> produtosDasVendas.add(produto)));
        return produtosDasVendas;
    }

}
