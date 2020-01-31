package patterns.factorymethods.cliente.maladireta;

import patterns.factorymethods.cliente.maladireta.csv.MalaDiretaCSV;
import patterns.factorymethods.maladireta.lib.MalaDireta;

import javax.swing.JOptionPane;

public class RelacionamentoCliente {
    public static void main(String[] args) {
        MalaDireta malaDireta = new MalaDiretaCSV("contatos.csv");
        String mensagem = JOptionPane.showInputDialog(null, "Digite a mensagem do e-mail:");

        malaDireta.enviarEmail(mensagem);

    }
}
