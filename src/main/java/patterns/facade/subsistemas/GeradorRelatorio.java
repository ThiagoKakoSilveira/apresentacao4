package patterns.facade.subsistemas;

import patterns.facade.facades.FacadeNegocio;
import patterns.facade.pojos.Venda;

import java.util.List;

public class GeradorRelatorio {

    private FacadeNegocio fachada = new FacadeNegocio();

    public List<Venda> gerarRelatorioVendasPorCliente(Integer idCliente){
        List<Venda> listaRelatorio = fachada.gerarRelatorioVendasPorCliente(idCliente);
        imprimeRelatorioVendasPorCliente(listaRelatorio);
        return listaRelatorio;
    }

    // TODO: 31/01/2020
    public List<Venda> gerarRelatorioProdutosMaisVendidos(){
        fachada.gerarRelatorioProdutoMaisVendidos(1);
        return null;
    }

    private void imprimeRelatorioVendasPorCliente(List<Venda> vendas){
        System.out.println("Para o Cliente " + vendas.get(0).getCliente().getNome()
        +" foram vendidos esses produtos:");
        vendas.forEach(venda -> venda.getProdutos()
                .forEach(produto -> System.out.printf("%s com valor %.2f \n", produto.getDescricao()
                , produto.valor)));

    }
}
