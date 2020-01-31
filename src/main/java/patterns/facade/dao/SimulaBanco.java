package patterns.facade.dao;

import patterns.facade.pojos.Cliente;
import patterns.facade.pojos.Produto;
import patterns.facade.pojos.Venda;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class SimulaBanco {

    public List<Cliente> entregaClientes(){
        Cliente c1 = new Cliente(1,"Thiago", 35);
        Cliente c2 = new Cliente(2,"Volmir", 41);
        Cliente c3 = new Cliente(3,"Jéssica", 30);
        Cliente c4 = new Cliente(4,"Patrícia", 23);

        return Arrays.asList(c1, c2, c3, c4);
    }

    public List<Produto> entregaProdutos(){
        Produto p1 = new Produto(1,new BigDecimal(350.99), "HD SSD");
        Produto p2 = new Produto(2,new BigDecimal(49.99), "Mouse Óptico");
        Produto p3 = new Produto(3,new BigDecimal(299.99), "Monitor HD");
        Produto p4 = new Produto(4,new BigDecimal(199.99), "Teclado");

        return Arrays.asList(p1, p2, p3, p4);
    }

    public List<Venda> entregaVendas(){
        List<Produto> p = this.entregaProdutos();
        Venda v1 = new Venda(1,this.entregaClientes().get(0), Arrays.asList(p.get(0), p.get(3)));
        Venda v2 = new Venda(2,this.entregaClientes().get(1), Arrays.asList(p.get(0)));
        Venda v3 = new Venda(3,this.entregaClientes().get(2), Arrays.asList(p.get(2)));
        Venda v4 = new Venda(4,this.entregaClientes().get(3), Arrays.asList(p.get(1)));

        return Arrays.asList(v1, v2, v3, v4);
    }
}
