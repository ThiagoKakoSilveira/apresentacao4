package patterns.facade.models;

import patterns.facade.dao.SimulaBanco;
import patterns.facade.pojos.Cliente;
import patterns.facade.pojos.Produto;
import patterns.facade.pojos.Venda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VendaNegocio {

    SimulaBanco db = new SimulaBanco();

    List<Venda> vendas = db.entregaVendas();

    public List<Venda> consultarVendaPorCliente(Cliente clientePesquisado){
        return this.vendas.stream()
                .filter(v -> v.getCliente().getId()
                .equals(clientePesquisado.getId()))
                .collect(Collectors.toList());
    }

    public List<Venda> entregaTodasVendas(){
        return db.entregaVendas();
    }
}
