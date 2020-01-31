package patterns.facade.app;

import patterns.facade.subsistemas.GeradorRelatorio;

public class RunSystem {
    public static void main(String[] args) {
        GeradorRelatorio geradorRelatorio = new GeradorRelatorio();
        geradorRelatorio.gerarRelatorioVendasPorCliente(1);
        geradorRelatorio.gerarRelatorioProdutosMaisVendidos();
    }
}
