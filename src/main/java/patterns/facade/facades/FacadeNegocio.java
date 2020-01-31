package patterns.facade.facades;

import patterns.facade.models.ClienteNegocio;
import patterns.facade.models.ProdutoNegocio;
import patterns.facade.models.VendaNegocio;
import patterns.facade.pojos.Cliente;
import patterns.facade.pojos.Produto;
import patterns.facade.pojos.Venda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FacadeNegocio {

    protected ClienteNegocio clienteNegocio = new ClienteNegocio();
    protected VendaNegocio vendaNegocio = new VendaNegocio();
    protected ProdutoNegocio produtoNegocio = new ProdutoNegocio();

    public List<Venda> gerarRelatorioVendasPorCliente(Integer idPesquisado){

        Cliente cliente = clienteNegocio.consultarPorIdentificador(idPesquisado);
        List<Venda> vendas = vendaNegocio.consultarVendaPorCliente(cliente);
        return vendas;
    }

    // TODO: 31/01/2020
    public List<Venda> gerarRelatorioProdutoMaisVendidos(Integer idPesquisado){
        List<Produto>produtosDasVendas = new ArrayList<>();
        List<Venda> vendas = vendaNegocio.entregaTodasVendas();
        vendas.forEach(venda -> {
            Produto prod = (Produto) venda.getProdutos()
                    .stream().filter(produto -> produto.id.intValue() == idPesquisado);
            produtosDasVendas.add(prod);
        });
        return null;
    }

}
