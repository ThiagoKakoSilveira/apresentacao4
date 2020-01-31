package patterns.facade.models;

import patterns.facade.dao.SimulaBanco;
import patterns.facade.pojos.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ClienteNegocio {
    SimulaBanco db = new SimulaBanco();

    public Cliente consultarPorIdentificador(Integer idPesquisado){
        var clientes = db.entregaClientes();
//        clientes.stream().map(cliente -> ); Fiz uma Gambetinha mas só pq viria do banco na real
//        return (idPesquisado ) < clientes.size() ? null : clientes.get(idPesquisado-1);
        return clientes.get(idPesquisado-1);
    }





}
